package com.syhwang.springquartz.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.syhwang.springquartz.entity.SchedulerJobInfo;

@Repository
public interface SchedulerRepository extends JpaRepository<SchedulerJobInfo, Long> {
	SchedulerJobInfo findByJobName(String jobName);
}
