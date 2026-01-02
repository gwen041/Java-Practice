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

        int num1, num2, prod;
    
        System.out.print("Input first number: ");
        num1 = input.nextInt();

        System.out.print("Input second number: ");
        num2 = input.nextInt();

        prod = num1 * num2;
        
        System.out.println(num1 + " x "  + num2 + " = " + prod);




        



    }
}
