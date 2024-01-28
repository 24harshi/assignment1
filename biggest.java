import java.util.Scanner;
public class biggest 
{
    public static void main(String[] args) 
    {
        int a, b, c;
        // The line `Scanner sc = new Scanner(System.in);` creates a new Scanner object named `sc` that
        // is used to read input from the user. The `System.in` parameter specifies that the input
        // should be read from the standard input stream, which is typically the keyboard.
        Scanner sc = new Scanner(System.in);
       // The code `System.out.print("Enter the first number:");` is displaying a message asking the
       // user to enter the first number. After displaying the message, the program waits for the user
       // to input a number, which is then stored in the variable `a` using the `sc.nextInt()` method.
        System.out.print("Enter the first number:");
        a = sc.nextInt();
        // The code `System.out.print("Enter the second number:");` is displaying a message asking the
        // user to enter the second number. After displaying the message, the program waits for the
        // user to input a number, which is then stored in the variable `b` using the `sc.nextInt()`
        // method.
        System.out.print("Enter the second number:");
        b = sc.nextInt();
        // The code `System.out.print("Enter the third number:");` is displaying a message asking the
        // user to enter the third number. After displaying the message, the program waits for the user
        // to input a number, which is then stored in the variable `c` using the `sc.nextInt()` method.
        System.out.print("Enter the third number:");
        c= sc.nextInt();
       // The code `if(a > b && a > c)` is checking if the value of `a` is greater than both `b` and
       // `c`. If this condition is true, it means that `a` is the largest number among the three. In
       // that case, the program will execute the code inside the curly braces `{}` which is
       // `System.out.println("Largest number is:"+a);`. This code will print the message "Largest
       // number is:" followed by the value of `a`.
        if(a > b && a > c)
        {
            System.out.println("Largest number is:"+a);
        }
        // The code `else if(b > c && b > a)` is checking if the value of `b` is greater than both `c`
        // and `a`. If this condition is true, it means that `b` is the largest number among the three.
        // In that case, the program will execute the code inside the curly braces `{}` which is
        // `System.out.println("Largest number is:"+b);`. This code will print the message "Largest
        // number is:" followed by the value of `b`.
        else if(b > c && b > a)
        {
            System.out.println("Largest number is:"+b);
        }
        // The code `else` is used as part of an if-else statement. In this specific code, it is used
        // to handle the case where neither `a` nor `b` is the largest number. If both `a` and `b` are
        // not greater than `c`, then `c` must be the largest number among the three.
        else
        {
            System.out.println("Largest number is:"+c);
        }
 
    }
}