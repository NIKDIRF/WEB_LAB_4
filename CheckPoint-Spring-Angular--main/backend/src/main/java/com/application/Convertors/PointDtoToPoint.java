package com.application.Convertors;

import com.application.DTO.*;
import com.application.entities.Point;
import org.springframework.stereotype.Component;

@Component
public class PointDtoToPoint {

   public Point PointDtoToPoint(PointDTO pointDTO){
       Point point=new Point();
       point.setX(pointDTO.getX());
       point.setY(pointDTO.getY());
       point.setR(pointDTO.getR());
       point.setIncome(pointDTO.getIncome());
       point.setUserName(pointDTO.getUserName());
       return point;
   }
}
