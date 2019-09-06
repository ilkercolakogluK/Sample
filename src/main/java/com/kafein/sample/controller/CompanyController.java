package com.kafein.sample.controller;

import com.kafein.sample.dto.CompanyDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "CompanyController", description = "RESTful API to interact with CompanyController.")
@RestController
@RequestMapping("company")
public class CompanyController {




    @ApiOperation(value = "getAnyCompany", notes = "getAnyCompany via json request.", responseContainer = "getAnyCompany", response = CompanyDTO.class)
    @GetMapping("/getAnyCompany")
    public CompanyDTO getAnyCompany() {
        CompanyDTO companyDTO=new CompanyDTO();
        companyDTO.setId(1);
        companyDTO.setName("Amazon");
        companyDTO.setFoundedYear("1999");

        companyDTO.setId(2);
        companyDTO.setName("Google");
        companyDTO.setFoundedYear("1998");

        companyDTO.setId(3);
        companyDTO.setName("Apple");
        companyDTO.setFoundedYear("2018");
        return companyDTO;
    }

}

