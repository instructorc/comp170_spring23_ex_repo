/*Instructor's Notes: Ideas for inheritance - Electric Car, Hybrid
    Constructors, ToString(), Abstract Classes, Interfaces, Polymorphism
    Reading from Files, Try/Catch 
*/

//Blueprint
public class Car {

    //Define three properties
    private String make;
    private String model;
    private int year;
    private int mileage;
    private int oilChangeMileage;
    static final  int OIL_MILEAGE_INCREMENT = 5000;
    

    //setters methods
    public void setMake(String aMake){
        make = aMake;
    }
    public void setModel(String aModel){
        model = aModel;

    }
    public void setYear(int aYear){
        year = aYear;
    }
    public void setMileage(int mileage){
        this.mileage = mileage;
        setOilChangeMileage();
    }

    //getter methods
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public int getMileage(){
        return mileage;
    }
    public int getOilChangeMileage(){
        return oilChangeMileage;
    }

    //Working method that calculates the mileage for next oil change
    private void setOilChangeMileage(){
        oilChangeMileage = mileage + OIL_MILEAGE_INCREMENT;
    }


}
