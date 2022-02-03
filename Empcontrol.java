package com.example.springbootdemo.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.springbootdemo.Models.Employee;
import com.example.springbootdemo.Response.response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/emp")
@RestController
public class Empcontrol {
    
    List<Employee> list = new ArrayList<>();
    //add employee
    @PostMapping("/insertemp")
    public response addemp(@RequestBody Employee emp){
        //if addition is success
        if(list.add(emp)){
            return new response(200, "Successfully Inserted in list", emp);
        }
        return new response(500, "Internal Servor Error", null);
    }

    //Get all employees data
    @GetMapping("/getallemp")

    public response getallemp(){

        if(list.size() > 0){

            return new response(200, "Successfully Fetched Employees", list);
        }
        return new response(200, "No employee in the list", null);
    }


    @GetMapping("/empdata")
    public void items(){

        for (Employee employee : list) {
            
             System.out.println(employee);
        }
    }

}
