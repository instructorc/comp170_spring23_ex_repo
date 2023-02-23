public class Program {
    public static void main(String[] args) throws Exception {
       
        Car aCar = new Car();  //Instantiating an Object
        aCar.setMake("Honda");
        aCar.setModel("Civic");
        aCar.setMileage(123400);
        aCar.setYear(2000);

        /*Car anotherCar = new Car();
        anotherCar.setMake("Toyota");
        anotherCar.setModel("Rav4");
        anotherCar.setMileage(23);
        anotherCar.setYear(2023);*/


        System.out.println("My car mileage is: " + aCar.getMileage());
        System.out.println("My next oil change mileage is: " + aCar.getOilChangeMileage());

    }
}
