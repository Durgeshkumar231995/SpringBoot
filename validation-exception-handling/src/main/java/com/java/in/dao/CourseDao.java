package com.java.in.dao;

import org.springframework.data.repository.CrudRepository;

import com.java.in.entity.CourseEntity;

public interface CourseDao extends CrudRepository<CourseEntity,Integer> {
}
