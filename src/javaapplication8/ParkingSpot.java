/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author krazybee
 */
public class ParkingSpot 
{
    Vector<ParkingSpace> vacantParkingSpaces = new Vector();
    Vector<ParkingSpace> fullParkingSpaces = new Vector();
     
    int parkingSpaceCount = 0;
    boolean isFull;
    boolean isEmpty;
    
    public void setParkingSpot(int count, ParkingType type){
        for (int i=1;i<=count;i++){
            ParkingSpace space = new ParkingSpace();
            space.distance = parkingSpaceCount+i;
            space.parkingType = type;
            try {
                    vacantParkingSpaces.add(space);
                }
                catch(Exception e) {
                       System.out.println("error"+ e);
            }
            
        }
        
        System.out.println("Created a Parking Lot With "+count+" Slots");
        System.out.println("\n");
        parkingSpaceCount= parkingSpaceCount+count;
        
        
    }
    
    
    public  ParkingSpace findNearestVacant(ParkingType type)
    {
        try{
            Iterator<ParkingSpace> itr = vacantParkingSpaces.iterator();

            while(itr.hasNext())
            {
                ParkingSpace parkingSpace = itr.next();

                if(parkingSpace.parkingType == type)
                {
                    return parkingSpace;
                }
            }
        } catch(Exception e) {
                       System.out.println("error"+ e);
        }
        
        return null;
    }
        

   public void parkVehicle(ParkingType type, Vehicle vehicle)
    {
        if(!isFull())
        {
          
            ParkingSpace parkingSpace = findNearestVacant(type);
            
            if(parkingSpace != null)
            {
                parkingSpace.vehicle = vehicle;
                parkingSpace.isVacant = false;

                vacantParkingSpaces.remove(parkingSpace);
                fullParkingSpaces.add(parkingSpace);
                
                System.out.println("Allocated Slot Number: "+ parkingSpace.distance);
                System.out.println("\n");
                if(fullParkingSpaces.size() == parkingSpaceCount){
                   
                    isFull = true;
                
                }
                isEmpty = false;
                
                
                
            }
        }
        else{
            System.out.println("Sorry, Parking Lot Is Full");
            System.out.println("\n");
        }
        
    }

    public void releaseVehicle(Vehicle vehicle)
    {
        if(!isEmpty())
        {
            Iterator<ParkingSpace> itr = fullParkingSpaces.iterator();

            while(itr.hasNext())
            {
                ParkingSpace parkingSpace = itr.next();

                if(parkingSpace.vehicle.equals(vehicle))
                {
                    fullParkingSpaces.remove(parkingSpace);
                    vacantParkingSpaces.add(parkingSpace);
                    
                    parkingSpace.isVacant = true;
                    parkingSpace.vehicle = null;
                    System.out.println("Slot Number: "+ parkingSpace.distance+" Is Freed");
                    System.out.println("\n");
                    if(vacantParkingSpaces.size() == parkingSpaceCount)
                        isEmpty = true;

                    isFull = false;
                }
            }
        }
    }
    
    public void  SpotStatus(){
        Iterator<ParkingSpace> itr = fullParkingSpaces.iterator();
        System.out.println("SLot NO Registration Colour");
          while(itr.hasNext())
            {
               ParkingSpace parkingSpace = itr.next();
                System.out.println(parkingSpace.distance +" "+parkingSpace.vehicle.licensePlate +" "+ parkingSpace.vehicle.colour);
            }
          System.out.println("\n");
    }

    boolean isFull()
    {
        return isFull;
    }

    boolean isEmpty()
    {
        return isEmpty;
    }
}



