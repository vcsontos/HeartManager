/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heartmanager.heartmanagerapp;

import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author valentin
 */
@Local
public interface PatientFacadeLocal {
    
    Collection<Patient> getAllPatient();
}
