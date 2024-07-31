package com.homework.managment.homeworkmanagement.controller;


import com.homework.managment.homeworkmanagement.model.HomeworkItem;
import com.homework.managment.homeworkmanagement.service.HomeworkItemServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class for Homework calls
 */

@RestController
@RequestMapping("/homeworkmanagement")
public class HomeworkController {

    HomeworkItemServiceImpl homeworkItemService;

    public HomeworkController(HomeworkItemServiceImpl homeworkItemService) {
        this.homeworkItemService = homeworkItemService;
    }

    @GetMapping("/getHomework")
    public List<HomeworkItem> getAllHomeworkItems(){
        return homeworkItemService.getAllHomeworkItem();
    }

    @PostMapping("/addHomeworkItem")
    public String addHomeworkItem(@RequestBody HomeworkItem homeworkItem) {
        return homeworkItemService.createHomeworkItem(homeworkItem);
    }
}
