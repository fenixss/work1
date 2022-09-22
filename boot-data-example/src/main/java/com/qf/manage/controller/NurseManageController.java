package com.qf.manage.controller;
import com.qf.manage.entity.Dispensary;
import com.qf.manage.service.DispensaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/manage")
public class NurseManageController {

    @Autowired
    private DispensaryService dispensaryService;

    @GetMapping("/select")
    public List<Dispensary> selectDispensary(@RequestParam Integer nurseId){
        return dispensaryService.selectDispensary(nurseId);
    }

}
