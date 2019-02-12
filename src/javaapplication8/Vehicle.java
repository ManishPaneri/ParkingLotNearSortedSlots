/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.ArrayList;

/**
 *
 * @author krazybee
 */
public abstract class Vehicle 
{ 
      protected String licensePlate; 
      public ParkingType size; 
      protected String colour;
  
      
      public ParkingType getSize() 
      { 
          return size; 
      } 
  
     
      public abstract Vehicle ParkSpot(String vehicleNumber, String Colour); 
} 
  

    