package com.campushub.campus_hub.Service.Impl;

import com.campushub.campus_hub.DTO.DepartmentDTO;
import com.campushub.campus_hub.Dao.DepartmentDao;
import com.campushub.campus_hub.Entity.DepartmentEntity;
import com.campushub.campus_hub.Exceptions.DepartmentNotFoundException;
import com.campushub.campus_hub.Service.DepartmentService;
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
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentDao departmentDao;
    private final EntityDTOConversion entityDTOConversion;

    @Override
    public void saveDepartment(DepartmentDTO department) {
        department.setDepartment_id(UtilityData.generateDepartment_id());
        departmentDao.save(entityDTOConversion.toDepartmentEntity(department));

    }

    @Override
    public void updateDepartment(String department_id, DepartmentDTO department) {
        Optional<DepartmentEntity> dep = departmentDao.findById(department_id);
        if(!dep.isPresent()){
            throw new DepartmentNotFoundException("Department not found.");
        }
        dep.get().setDepartment_Name(department.getDepartment_Name());

    }

    @Override
    public void deleteDepartment(String department_id) {
       Optional<DepartmentEntity> dep = departmentDao.findById(department_id);
       if(!dep.isPresent()){
           throw new DepartmentNotFoundException("Department not found");
       }
       departmentDao.deleteById(department_id);


    }

    @Override
    public DepartmentDTO getDepartment(String department_id) {
        Optional<DepartmentEntity> dep = departmentDao.findById(department_id);
        if(!dep.isPresent()){
            throw new DepartmentNotFoundException("Department Not Found");
        }
        return entityDTOConversion.toDepartmentDTO(departmentDao.getReferenceById(department_id));
    }

    @Override
    public List<DepartmentDTO> getAllDepartment() {
        List<DepartmentEntity> Alldep = departmentDao.findAll();
        return entityDTOConversion.toDepartmentDTOList(Alldep);
    }
}
