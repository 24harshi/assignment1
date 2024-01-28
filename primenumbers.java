public class primenumbers
 {
   public static void main (String[]args)
   {

     // The line `int lower_num = 1, upper_num = 50;` is declaring and initializing two variables
     // `lower_num` and `upper_num` of type `int`.
     int lower_num = 1, upper_num = 50;

     // The code is iterating through a range of numbers from `lower_num` to `upper_num`. For each
     // number `i`, it checks if `i` is a prime number by calling the `isPrime` method. If `i` is a
     // prime number, it prints `i` to the console.
     for (int i = lower_num; i <= upper_num; i++)
       if (isPrime (i))
        System.out.println (i);
   }

   static boolean isPrime (int n)
   {
     // The line `int count = 0;` is declaring and initializing a variable `count` of type `int` with
     // an initial value of 0. However, in the given code, the variable `count` is not used anywhere,
     // so it does not serve any purpose and can be removed.
     int count = 0;
     // The code `if (n < 2) return false;` is checking if the number `n` is less than 2. If `n` is
     // less than 2, it means that `n` is not a prime number because prime numbers are defined as
     // numbers greater than 1 that are divisible only by 1 and themselves. Therefore, if `n` is less
     // than 2, the method immediately returns `false`, indicating that `n` is not a prime number.
     if (n < 2)
       return false;
    // The code `for (int i = 2; i < n; i++)` is a loop that iterates through all numbers from 2 to
    // `n-1`. For each number `i`, it checks if `n` is divisible by `i` using the condition `n % i ==
    // 0`. If `n` is divisible by any number `i`, it means that `n` is not a prime number because prime
    // numbers are defined as numbers that are divisible only by 1 and themselves. In that case, the
    // method immediately returns `false`, indicating that `n` is not a prime number. If the loop
    // completes without finding any divisors of `n`, it means that `n` is not divisible by any number
    // other than 1 and itself, so it is a prime number. In that case, the method returns `true`,
    // indicating that `n` is a prime number.
     for (int i = 2; i < n; i++)
       {
     if (n % i == 0)
        return false;
       }
     return true;
   }
 }
