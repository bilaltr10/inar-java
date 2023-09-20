package week_5._my_field;

import java.util.*;

public class closed_colons {
    //Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
//For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String x = input.nextLine();

int a =0 ;
int b =0 ;
int c =0 ;
int d =0 ;
int e =0 ;
int f =0 ;


     if((x.contains("[") && x.contains("]"))||(x.contains("{") && x.contains("}"))||(x.contains("(")&& x.contains(")"))){
           a = x.indexOf("]");
            b = x.indexOf("[");
            c = x.indexOf(")");
            d = x.indexOf("(");
            e = x.indexOf("}");
            f = x.indexOf("{");

            if ((a>b) && c>d && e>f ) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }

        }else if((x.contains("[") && !x.contains("]"))||(x.contains("{") && !x.contains("}"))||(x.contains("(")&& !x.contains(")"))){
            System.out.println("False ");
        }




    }

}


