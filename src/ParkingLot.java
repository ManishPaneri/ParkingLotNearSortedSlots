
import javaapplication8.Car;
import javaapplication8.ParkingSpot;
import javaapplication8.ParkingType;
import javaapplication8.Vehicle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krazybee
 */
public class ParkingLot {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
     public static void main(String[] args) {
        // TODO code application logic here
        ParkingSpot spot =new ParkingSpot();
        spot.setParkingSpot(5,ParkingType.COMPACT);
        
        Vehicle car1 = new Car(); 
        car1.ParkSpot("KA-01-HH-1234", "White");
        spot.parkVehicle(car1.size, car1);
        
        Vehicle car2 = new Car(); 
        car2.ParkSpot("KA-01-HH-9999", "White");
        spot.parkVehicle(car2.size, car2);
        
        Vehicle car3 = new Car(); 
        car3.ParkSpot("KA-01-BB-0001", "Black");
        spot.parkVehicle(car3.size, car3);
         
        Vehicle car4 = new Car(); 
        car4.ParkSpot("KA-01-BB-7777", "Red");
        spot.parkVehicle(car4.size, car4);
        
        Vehicle car5 = new Car(); 
        car5.ParkSpot("KA-01-HH-2701", "Blue");
        spot.parkVehicle(car5.size, car5);
        
        System.out.println("Leave 4");
        spot.releaseVehicle(car4);
        
       spot.SpotStatus();
       
        Vehicle car7 = new Car(); 
        car7.ParkSpot(" KA-01-P-333", "White");
        spot.parkVehicle(car7.size, car7);
        
        Vehicle car8 = new Car(); 
        car8.ParkSpot(" KA-01-P-9999", "White");
        spot.parkVehicle(car8.size, car8);
     }
    


}
