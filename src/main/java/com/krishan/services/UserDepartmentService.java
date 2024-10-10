package com.krishan.services;

import org.springframework.stereotype.Component;

@Component
public class UserDepartmentService {
    public String getUserDepartment(){
        System.out.println("Comming from getUserDepartment method of userDepartmentService");
        return "Accounts";
    }
}
