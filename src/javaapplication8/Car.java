/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author krazybee
 */
public class Car extends Vehicle 
{ 
    public Car() 
    { 
        size = ParkingType.COMPACT;
        
    } 

    public Vehicle ParkSpot(String vehicleNumber, String Colour ) {
            this.licensePlate =  vehicleNumber;
            this.colour = Colour;
            this.size = size;  
            System.out.println("Park "+vehicleNumber+" "+Colour);
            return this;
           
    }
  
   
} 