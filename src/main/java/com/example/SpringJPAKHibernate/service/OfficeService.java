package com.example.SpringJPAKHibernate.service;

import com.example.SpringJPAKHibernate.model.Office;
import com.example.SpringJPAKHibernate.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;

@Service
public class OfficeService {

    @Autowired
    OfficeRepository officeRepository;

    public Office saveService(Office officeObj){
        return officeRepository.save(officeObj);

    }


    public void deleteAllService(){
        officeRepository.deleteAll();
    }

    public String deleteByIdService(int id){
        Optional<Office> res = officeRepository.findById(id);
        if(res.isEmpty()) return "no object with this Id found";
        officeRepository.deleteById(id);
        return "deleted successfully";
    }


    public String updateOfficeByIDService(int id, Office officeObj){
        Optional<Office> res = officeRepository.findById(id);
        if(res.isEmpty()) return "no object with this Id found";

        deleteByIdService(id);
        officeRepository.save(officeObj);
        return "updated successfully";
    }
}
