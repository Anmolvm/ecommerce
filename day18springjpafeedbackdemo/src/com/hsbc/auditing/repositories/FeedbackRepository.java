package com.hsbc.auditing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsbc.auditing.models.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback,Long>{

}
