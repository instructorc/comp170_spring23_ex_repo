import java.util.*;
public class Program {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        Car [] cars = new Car[2]; //Declaring an array that will hold two object instances
        String make, model;
        int mileage, year;

        //Call the constructor that defines two parameters
        Car aCar = new Car(2024);
        System.out.println( aCar);

        //Looping structure that will populate the two object instances
        /*for(int i = 0; i < cars.length; i++){
            cars[i] = new Car();
            
            System.out.println("\nCar #" + (i+1));
            System.out.println("Enter Make: ");
            make = input.nextLine();
            cars[i].setMake(make);

            System.out.println("Enter Model: ");
            model = input.nextLine();
            cars[i].setModel(model);

            System.out.println("Enter Mileage: ");
            mileage = Integer.parseInt(input.nextLine());
            cars[i].setMileage(mileage);

            System.out.println("Enter Year: ");
            year = Integer.parseInt(input.nextLine());
            cars[i].setYear(year);
           
        }*/
        
        //Looping structure that will output the two objects
       /*for(var x = 0; x < cars.length; x++){
            System.out.println(cars[x]);
       }*/
        /*Car aCar = new Car();  //Instantiating an Object
        aCar.setMake("Honda");
        aCar.setModel("Civic");
        aCar.setMileage(123400);
        aCar.setYear(2000);

        Car anotherCar = new Car();
        anotherCar.setMake("Toyota");
        anotherCar.setModel("Rav4");
        anotherCar.setMileage(23);
        anotherCar.setYear(2023);

        System.out.println("Car 1: ");
        System.out.println("My car mileage is: " + aCar.getMileage());
        System.out.println("My next oil change mileage is: " + aCar.getOilChangeMileage());

        System.out.println("Car 2: ");
        System.out.println("My car mileage is: " + anotherCar.getMileage());
        System.out.println("My next oil change mileage is: " + anotherCar.getOilChangeMileage());*/

    }
}
