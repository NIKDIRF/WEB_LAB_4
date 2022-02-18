package com.application.controllers;


import com.application.entities.Point;
import com.application.services.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;


@RestController
public class PointController {

    private final PointService pointService;

    public PointController(PointService pointService) {
        this.pointService=pointService;
    }
    @CrossOrigin
    @PostMapping("/checkPoint")
    public ResponseEntity<String> check(@RequestBody Map<String, String> request){
        return pointService.check(request);
    }
    @CrossOrigin
    @GetMapping("/Points/{userName}")
    public List<Point> getAllPoints(@PathVariable String userName) {
       return pointService.getPoint(userName);
    }
    @CrossOrigin
    @Transactional
    @DeleteMapping("/Table/{userName}")
    public void dropTable (@PathVariable String userName) {
        pointService.dellPoint(userName);
    }

}
