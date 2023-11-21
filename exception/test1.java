package exception;

public class test1  extends test2{
    public static void main(String[] args) {
        new test1();

    }
    public test1(){
        System.out.println("test1");
    }


}
 class test2 extends  test3{

    test2(){
        System.out.println("test2 ");
    }

}

class test3{

}
