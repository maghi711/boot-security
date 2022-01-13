package com.maghi711.bootsecuritydemo.timeofday.service;

import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class TimeofDayService {

    public String timeOfDay() {
        return LocalTime.now().toString();
    }
}
