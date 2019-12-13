package codilla.com.testing;

import codilla.com.testing.calculator.Calculator;
import codilla.com.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");


        if (Calculator.add(5,4)==9){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (Calculator.subtract(5,4)==1){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }







    }

}