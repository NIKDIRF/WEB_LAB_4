package com.application.services;

import com.application.repositories.PointRepository;
import com.application.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class AreaChecker {

    public boolean hitCheck(double x,double y,double r){
        return quarterCheck(x, y, r);
    }
    public String checkValid(Map<String, String> request,double x,double y,double r){

        String stringForReturn="";
        if (request.get("userName") == null){
            stringForReturn="Запрос от безымянного пользователя";
        }
        if (x < -5 || x > 3){
            stringForReturn="x выходит за рамки дозволеного значения X ∈ {'-5','-4','-3','-2','-1','0','1','2','3'}";
        }
        if(y <= -5 || y >= 3){
            stringForReturn="Y выходит за рамки дозволеного значения Y ∈ (-5;3)";
        }
        if(r < -5 || r > 3){
            stringForReturn="R выходит за рамки дозволеного значения R ∈ {'-5','-4','-3','-2','-1','0','1','2','3'}";
        }
        return stringForReturn;

    }

    private boolean quarterCheck(double x,double y,double r){
        if(x>0){
            if(y>0){
                return checkToHit1Quarter(x, y, r);
            }else{
                return checkToHit4Quarter(x, y, r);
            }
        }else {
            if(y>0){
                return checkToHit2Quarter(x, y, r);
            }else {
                return checkToHit3Quarter(x, y, r);
            }
        }
    }
    private boolean checkToHit1Quarter(double x,double y,double r){
        return false;
    }
    private boolean checkToHit2Quarter(double x,double y,double r){
        if(x*x + y*y <= r*r){
            return true;
        }else {
            return false;
        }
    }
    private boolean checkToHit3Quarter(double x,double y,double r){
        if(x + y >= -r){
            return true;
        }else {
            return false;
        }
    }
    private boolean checkToHit4Quarter(double x,double y,double r){
        if(y >= -r / 2 && x <= r){
            return true;
        }else {
            return false;
        }
    }
}