package com.campushub.campus_hub.Service.Impl;

import com.campushub.campus_hub.DTO.StaffDTO;
import com.campushub.campus_hub.Dao.StaffDao;
import com.campushub.campus_hub.Entity.StaffEntity;
import com.campushub.campus_hub.Exceptions.StaffMemberNotFoundException;
import com.campushub.campus_hub.Service.StaffService;
import com.campushub.campus_hub.util.EntityDTOConversion;
import com.campushub.campus_hub.util.UtilityData;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class StaffServiceImpl implements StaffService {
    private final StaffDao staffDao;
    private final EntityDTOConversion entityDTOConversion;
    @Override
    public void saveStaffMember(StaffDTO staffMember) {
        staffDao.save(entityDTOConversion.toStaffEntity(staffMember));

    }

    @Override
    public void updateStaffMember(StaffDTO staffMember) {
        Optional<StaffEntity> staff = staffDao.findById(staffMember.getStaff_id());
        if(!staff.isPresent()) {
            throw new StaffMemberNotFoundException("The staff member is not found.");
        }
        staff.get().setStaff_id(staffMember.getStaff_id());
        staff.get().setStaff_pwd(staffMember.getStaff_pwd());
        staff.get().setFirst_name(staffMember.getFirst_name());
        staff.get().setLast_name(staffMember.getLast_name());
        staff.get().setEmail(staffMember.getEmail());

    }

    @Override
    public void deleteStaffMember(String staff_Id) {
        Optional<StaffEntity> staff = staffDao.findById(staff_Id);
        if(!staff.isPresent()) {
            throw new StaffMemberNotFoundException("The staff member is not found.");
        }
        staffDao.delete(staff.get());

    }

    @Override
    public StaffDTO getStaffById(String staff_Id) {
        Optional<StaffEntity> staff = staffDao.findById(staff_Id);
        if(!staff.isPresent()) {
            throw new StaffMemberNotFoundException("The staff member is not found.");
        }
        return entityDTOConversion.toStaffDTO(staffDao.getReferenceById(staff.get().getStaff_id()));
    }


    @Override
    public List<StaffDTO> getAllStaffs() {
        List<StaffEntity> allStaff = staffDao.findAll();
        return entityDTOConversion.toStaffDTOList(allStaff);
    }
}
