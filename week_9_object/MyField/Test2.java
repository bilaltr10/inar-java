package week_9_object.MyField;

public class Test2 {

    int year ;
    int km;
    String model;
    String brand;


    Test2(String brand,String model,int year,int km){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.km = km;
    }

   String write(){
      return brand+" "+ model+" "+year+ " "+ km;
   }
}
