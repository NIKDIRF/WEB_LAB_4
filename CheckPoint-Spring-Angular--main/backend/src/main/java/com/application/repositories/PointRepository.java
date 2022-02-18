package com.application.repositories;

import com.application.entities.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PointRepository extends JpaRepository<Point, Integer> {
    List<Point> findByUserName(String userName);
    void deleteByUserName(String userName);
}
