package com.example.reportingmicroservice.repository;

import com.example.reportingmicroservice.entity.TaskExecutionReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// Interface extending JpaRepository
public interface TaskExecutionReportRepository
        extends JpaRepository<TaskExecutionReport, Long> {

    List<TaskExecutionReport>  findAllByOrderByExecutionTimeSecondsAsc();

    TaskExecutionReport findByTaskId(String taskId);


}