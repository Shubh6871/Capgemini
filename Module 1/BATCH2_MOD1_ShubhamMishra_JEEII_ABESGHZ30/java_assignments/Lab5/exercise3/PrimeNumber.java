package Lab5.exercise3;

public class PrimeNumber {
	static boolean isPrime(int n) 
	{ 
	if (n <= 1) 
	    return false; 

	for (int i = 2; i < n; i++) 
	    if (n % i == 0) 
	        return false; 
	  
	return true; 
	} 
	static void printPrime(int n) 
	{ 
	for (int i = 2; i <= n; i++)  
	{ 
	    if (isPrime(i)) 
	        System.out.print(i + " "); 
	} 
	} 
}
