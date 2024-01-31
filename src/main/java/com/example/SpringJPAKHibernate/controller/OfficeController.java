package com.example.SpringJPAKHibernate.controller;


import com.example.SpringJPAKHibernate.model.Office;
import com.example.SpringJPAKHibernate.repository.OfficeRepository;
import com.example.SpringJPAKHibernate.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/office")
public class OfficeController {

    @Autowired
    OfficeService officeService;

    @PostMapping("/signup")
    public Office saveOffice(@RequestBody Office officeObj){
        return officeService.saveService(officeObj);

    }

    @DeleteMapping("/delete")
    public void deleteAllOffice(){
        officeService.deleteAllService();
    }


    @DeleteMapping("/deletebyid/{id}")
    public String deleteOffice(@PathVariable int id){
        return officeService.deleteByIdService(id);
    }

    @PutMapping("/updatebyid/{id}")
    public String updateById(@PathVariable int id, @RequestBody Office officeObj){
        return officeService.updateOfficeByIDService(id, officeObj);
    }
}
