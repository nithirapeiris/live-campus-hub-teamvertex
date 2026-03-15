package com.campushub.campus_hub.Service.Impl;

import com.campushub.campus_hub.DTO.RewardDTO;
import com.campushub.campus_hub.Dao.RewardDao;
import com.campushub.campus_hub.Entity.RewardEntity;
import com.campushub.campus_hub.Exceptions.RewardNotFoundException;
import com.campushub.campus_hub.Service.RewardService;
import com.campushub.campus_hub.util.EntityDTOConversion;
import com.campushub.campus_hub.util.UtilityData;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class RewardServiceImpl implements RewardService {
    private final RewardDao rewardDao;
    private final EntityDTOConversion entityDTOConversion;
    @Override
    public void createReward(RewardDTO reward) {
        reward.setReward_id((UtilityData.generateReward_id()));
        rewardDao.save(entityDTOConversion.toRewardEntity(reward));

    }

    @Override
    public RewardDTO getRewardDetails(String reward_id) {
        return rewardDao.findById(reward_id)
                .map(entityDTOConversion::toRewardDTO)
                .orElseThrow(() -> new RewardNotFoundException("Reward Not Found"));
    }

    @Override
    public List<RewardDTO> getAllRewards() {
        List<RewardEntity> allRewards = rewardDao.findAll();
        return entityDTOConversion.toRewardDTOList(allRewards);
    }
}
