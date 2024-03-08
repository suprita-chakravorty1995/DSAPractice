public class Solution {
    public static int calcGCD(int n, int m){
        if(m == 0)
          return n;

        else
           return calcGCD(m,n%m);
    }

    //A = 30, B = 20
    //gcd(30, 20) -> gcd(A, B)
    //gcd(20, 30 % 20) = gcd(20, 10) -> gcd(B, A % B)
    //gcd(10, 20 % 10) = gcd(10, 10) -> gcd(A % B, B % (A % B))
    //gcd(10, 10 % 10) = gcd(10, 0)
    //here, the modulus became 0
    //So, stop the procedure. And 10 is the GCD of 30 and 20
}
