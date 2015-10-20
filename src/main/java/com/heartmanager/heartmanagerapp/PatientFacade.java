/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heartmanager.heartmanagerapp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author valentin
 */
public class PatientFacade {   
    
    public static List<Patient> createDummyPatient() {
        List<Patient> patients = new ArrayList<>(5);
        
        for (int i = 0; i < 5; i++) {
            Patient patient = new Patient(new Long(i), "name" + i);
            patient.setAge(20 + i);
            if (i % 2 == 0) {
                patient.setSex(Sex.MEN);
            } else {
                patient.setSex(Sex.WOMEN);
            }
            Map<Integer, String> measurements = new HashMap<>();
            Random randomGenerator = new Random();
            SimpleDateFormat dt = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); 
            for (int j = 0; j < 20; j++) {
                int randomInt = randomGenerator.nextInt(30);
                measurements.put(50 + randomInt, dt.format(new Date()));
            }
            patient.setMeasurements(measurements);
            patients.add(patient);
        }
        return patients;
    }
}
