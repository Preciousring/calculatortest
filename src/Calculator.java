import org.junit.Test;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
        System.out.println("Entrez premier et second nombre :");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        System.out.println("1 pour addition, 2 pour soustraction :");
        int choose;
        choose = inp.nextInt();
        switch (choose){
            case 1:
                System.out.println(add( num1,num2));
                break;
            case 2:
                System.out.println(sub( num1,num2));
                break;
            default:
                System.out.println("opérateur illégal");


        }



    }
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }


}
