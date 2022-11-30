package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.InsurancePlan;
import com.lti.service.InsurancePlanService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/insurance")
public class InsurancePlanController {
	@Autowired
    private InsurancePlanService insservice;
    
    
    //http://localhost:8282/insurance/getAllInsurance
    @GetMapping(path="/getAllInsurance")
    public List<InsurancePlan> getAllInsurancePlans(){



       return insservice.getAllInsurancePlan();
    }
    
    //http://localhost:8282/insurance/findInsurance



   @GetMapping(path="/findInsurance/{Iid}")
    public InsurancePlan findById(int Iid) {
        return insservice.findById(Iid);



   }
    //http://localhost:8282/insurance/addins
    
    @PostMapping("/addins")
    public int addInsurance(@RequestBody InsurancePlan i)
    {
        return insservice.addInsurance(i);
    }
    
}

