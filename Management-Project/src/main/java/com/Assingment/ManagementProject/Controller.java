package com.Assingment.ManagementProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    List<Manage> manageList;

    @PostMapping("PostManage") /// register one user
    public String addManage(@RequestBody Manage myManage){
        manageList.add(myManage);
        return "manageAdded!!!!";
    }

    @GetMapping("GetManage") // getting all user
    public List<Manage> getAllManages(){
        return manageList;
    }

    @PutMapping("PutManage/{id}")  /// updating one user
    public String  setManages(@PathVariable Integer id, @RequestParam boolean flag){

        for( Manage manage: manageList){

            if(manage.getUserId().equals(id)){
                manage.setMangeStatus(flag);
                return "manage"+id + "updated to" + flag;
            }
        }
        return "Invalid user id";
    }
@DeleteMapping("delete/{id}") /// deleting one user
    public  String removeManages(@PathVariable Integer id){

        for(Manage manage : manageList){

            if(manage.getUserId().equals(id)){
                manageList.remove(manage);
                return "manage :"+ id + "remove";
            }
        }
        return "Invalid user id";
    }



    @PostMapping("saveAllUser")
    public String registerAllUser(@RequestBody List<Manage> manageList2){

//
        manageList.addAll(manageList2);

        return "all user saved";
    }





}
