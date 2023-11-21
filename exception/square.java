package exception;

public class square extends Shapes{

    int a ;

   public square(){
        this(1);
    }
    public square(int a ){
       this.a = a;
    }

    public int getArea(){
       return 4*a;
    }

}
