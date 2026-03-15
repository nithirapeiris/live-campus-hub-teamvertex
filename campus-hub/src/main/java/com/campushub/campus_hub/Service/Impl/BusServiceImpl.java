package com.campushub.campus_hub.Service.Impl;

import com.campushub.campus_hub.DTO.BusDTO;
import com.campushub.campus_hub.Dao.BusDao;
import com.campushub.campus_hub.Exceptions.BusNotFoundException;
import com.campushub.campus_hub.util.UtilityData;
import com.campushub.campus_hub.Entity.BusEntity;
import com.campushub.campus_hub.Service.BusService;
import com.campushub.campus_hub.util.EntityDTOConversion;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class BusServiceImpl implements BusService {
    private final BusDao busDao;
    private final EntityDTOConversion entityDTOConversion;
    @Override
    public void saveBus(BusDTO bus) {
        bus.setBus_id(UtilityData.generateBus_id());
        busDao.save(entityDTOConversion.toBusEntity(bus));
    }

    @Override
    public void updateBus(String busId, BusDTO bus) {
        Optional<BusEntity> foundBus = busDao.findById(busId);
        if (!foundBus.isPresent()) {
            throw new BusNotFoundException("Bus not found");
        }

        foundBus.get().setBus_id(bus.getBus_id());
        foundBus.get().setBus_number(bus.getBus_number());
        foundBus.get().setStatus(bus.getStatus());
        foundBus.get().setDeparture(bus.getDeparture());
        foundBus.get().setArrival(bus.getArrival());
        foundBus.get().setDeparture_time(bus.getDeparture_time());
        foundBus.get().setArrival_time(bus.getArrival_time());


    }

    @Override
    public void deleteBus(String busId) {
        Optional<BusEntity> foundBus = busDao.findById(busId);
        if(!foundBus.isPresent()) {
            throw new BusNotFoundException("Bus not found");
        }
        busDao.deleteById(busId);

    }

    @Override
    public List<BusDTO> getAllBuses() {
        List<BusEntity> allBuses = busDao.findAll();
        return entityDTOConversion.toBusDTOList(allBuses);
    }
}
