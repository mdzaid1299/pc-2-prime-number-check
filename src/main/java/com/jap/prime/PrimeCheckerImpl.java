package com.jap.prime;

public class PrimeCheckerImpl {
    public boolean primeNumberCheck(int number) {
        // write the logic here to check is a number is prime or not
        PrimeChecker p1 = n1 -> {
            int count = 0;
            for(int i=1;i<=n1;i++){
                if(n1 % i==0)
                    count++;
            }
            if(count==2){
                return true;

            }else{
                return  false;
            }
        };
        return p1.isprime(number);
    }
}