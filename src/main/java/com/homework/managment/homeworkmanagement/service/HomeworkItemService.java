package com.homework.managment.homeworkmanagement.service;

import com.homework.managment.homeworkmanagement.model.HomeworkItem;

import java.util.List;

/**
 * Interface for operations on HomeworkItem table
 */
public interface HomeworkItemService {

    String createHomeworkItem(HomeworkItem homeworkItem);

    List<HomeworkItem> getAllHomeworkItem();
}
