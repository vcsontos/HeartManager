/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heartmanager.heartmanagerapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author valentin
 */
public class PatientFacade implements PatientFacadeLocal {   
    
    public static List<Patient> createDummyPatient() throws ParseException {
       
        List<Patient> patients = new ArrayList<>(5);
        
        for (int i = 1; i <= 5; i++) {
            
            String birthOfDate = "1990100" + i;
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            
            Patient patient = new Patient("12345" + i, "name" + i, format.parse(birthOfDate));
            
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

    @Override
    public Collection<Patient> getAllPatient() {
        
        List<Patient> patients = null;
        
        try {
            patients = createDummyPatient();
        } catch (ParseException ex) {
            Logger.getLogger(PatientFacade.class.getName()).log(Level.SEVERE, null, ex);    
        }
        
        return patients;
    }
}
