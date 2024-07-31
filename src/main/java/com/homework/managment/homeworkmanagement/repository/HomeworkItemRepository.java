package com.homework.managment.homeworkmanagement.repository;

import com.homework.managment.homeworkmanagement.model.HomeworkItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeworkItemRepository extends JpaRepository<HomeworkItem, Long> {
}
