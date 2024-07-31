package com.homework.managment.homeworkmanagement.service;

import com.homework.managment.homeworkmanagement.model.HomeworkItem;
import com.homework.managment.homeworkmanagement.repository.HomeworkItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeworkItemServiceImpl implements HomeworkItemService {

    HomeworkItemRepository homeworkItemRepository;

    public HomeworkItemServiceImpl(HomeworkItemRepository homeworkItemRepository) {
        this.homeworkItemRepository = homeworkItemRepository;
    }

    @Override
    public String createHomeworkItem(HomeworkItem homeworkItem) {

        homeworkItemRepository.save(homeworkItem);
        return "Homework Successfully created";
    }

    @Override
    public List<HomeworkItem> getAllHomeworkItem() {
        return homeworkItemRepository.findAll();
    }
}
