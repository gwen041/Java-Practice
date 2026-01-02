import java.util.Scanner;

public class Basic {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        /*String name = "Gwen Tabios";
        System.out.println("Hello");
        System.out.print(name);
        System.out.println("Hello\n" + name);*/

        //Addition of two nums
        /*int num1 = 74, num2 = 36;
        int sum = num1 + num2;
        System.out.println("Sum is " + sum);
        System.out.println("Sum is " + (num1 + num2));*/

        //Division of two nums
        /*int num1 = 50, num2 = 3;
        int div = num1 / num2;
        System.out.println(div);*/

        //ARITH OPERATIONS
        /*int a = -5, b = 8, c = 6;
        int d = 55, e = 9;
        int f = 20, g = -3, h = 5;
        int i = 15, j = 3, k = 2;
        int result1 =  (a + b * c);
        int result2 = ((d + e) % e);
        int result3 = (f + g * h / b);
        int result4 = (h + i / j * k - b % j);
        System.out.println(result1 + "\n" + result2 + "\n" + result3 + "\n" + result4);*/

        //PRODUCT OF TWO NUMS
        /*int num1, num2, prod;
    
        System.out.print("Input first number: ");
        num1 = input.nextInt();

        System.out.print("Input second number: ");
        num2 = input.nextInt();

        prod = num1 * num2;
        System.out.println(num1 + " x "  + num2 + " = " + prod);*/

        //BASIC ARITH OPERATIONS
        /*int num1, num2;
        int sum, diff, prod, quot, mod;
    
        System.out.print("Input first num: ");
        num1 = input.nextInt();
        
        System.out.print("Input second num: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        diff = num1 - num2;
        prod = num1 * num2;
        quot = num1 / num2;
        mod = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = "  + sum);
        System.out.println(num1 + " - " + num2 + " = "  + diff);
        System.out.println(num1 + " x " + num2 + " = "  + prod);
        System.out.println(num1 + " / " + num2 + " = "  + quot);
        System.out.println(num1 + " mod " + num2 + " = "  + mod);*/

        //MULTIPLICATION TABLE
        int num, i, prod;

        System.out.print("Input a number: ");
        num = input.nextInt();

        for ( i = 1; i <= 10; i++ ) {
            prod = num * i;
            System.out.println(num + " x " + i + " = " + prod);

        }
        




        



    }
}
