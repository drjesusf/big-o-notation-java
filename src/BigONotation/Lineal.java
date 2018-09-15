package BigONotation;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Lineal {
	long[] fibonacciCache = null;
	public static void main(String[] args) {
		//var stopWatch = new Stopwatch();
        //stopWatch.Start();
		try {
			Instant starts = Instant.now();
	        Lineal lineal = new Lineal();
	        LinealExampleType linealExampleType = LinealExampleType.Fibonacci;
	        int nFibonacciCache = 8; //8 40 80
	        lineal.fibonacciCache = new long[nFibonacciCache + 1];
	        switch (linealExampleType)
	        {
	            case Loop:
	                int n = 50;
	                lineal.Loop(n);
	                break;
	            case ContainsNeedle:
	                List<Integer> numberList = new ArrayList<Integer>();// { 10, 18, 29, 1, 0, 75, 79 };
	                int needle = 76;
	                boolean found = lineal.ContainsNeedle(needle, numberList);
	                Formatter formatter = new Formatter().format("Number %s %s", needle, found);
	                System.out.println(formatter.toString());
	                //Console.WriteLine("Number {0} found? {1}", needle, found);
	                break;
	            case Factorial:
	                int nFactorial = 10;
	                long factorial = lineal.Factorial(nFactorial);
	                //Console.WriteLine("Factorial of {0} equal to {1}", nFactorial, factorial);
	                formatter = new Formatter().format("Factorial of %s equal to %s", nFactorial, factorial);
	                System.out.println(formatter.toString());
	                break;
	            case Fibonacci:
	                int nFibonacci = 80; //8 40 80
	                for (int i = 1; i <= nFibonacci; i++)
	                {
	                    long fibonacci = lineal.Fibonacci(i);
	                    //Console.WriteLine("fibonacci {0} = {1}", i, fibonacci);
	                    formatter = new Formatter().format("fibonacci %s = %s", i, fibonacci);
	                    System.out.println(formatter.toString());
	                }
	                break;
	            case FibonacciCache:
	                for (int i = 1; i <= nFibonacciCache; i++)
	                {
	                    long fibonacci = lineal.FibonacciCache(i);
	                    //Console.WriteLine("fibonacci {0} = {1}", i, fibonacci);
	                    formatter = new Formatter().format("fibonacci %s = %s", i, fibonacci);
	                    System.out.println(formatter.toString());
	                }
	                break;
	        }
	        //Console.WriteLine("Time elapsed: {0:0.00} seconds", Math.Round(stopWatch.ElapsedMilliseconds / 1000.0, 2));
	        //Console.ReadLine();
	        Instant ends = Instant.now();
	        //System.out.println("Time elapsed: {0:0.00} seconds");
	        System.out.println("Time elapsed:" + Duration.between(starts, ends).toMillis()/1000.0);
		} catch (Exception e) {
			
		}
		
	}
	
	public void Loop(long n)
    {
        int counter = 1;
        while (counter <= n)
        {
            //Console.WriteLine(counter);
        	System.out.println(counter);
            counter++;
        }
    }

    /// Complexity: O(N)
	public boolean ContainsNeedle(int needle, List<Integer> numberList)
    {
        /*foreach (var item in numberList)
        {
            if (item == needle)
            {
                return true;
            }
        }*/
        for(Integer item : numberList) {
        	if(item == needle) {
        		return true;
        	}
        }
        return false;
    }

    /// Complexity: O(N)
    public long Factorial(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        return n * Factorial(n - 1);
    }

    /// Complexity: O(N)
    public long Fibonacci(long n) throws Exception
    {
        if (n < 0)
        {
            throw new Exception("n can not be less than zero");
        }
        if (n <= 2)
        {
            return 1;
        }
        long fibonacci = 0;
        long previous = 1;
        long penultimate = 0;
        for (int i = 1; i <= n; i++)
        {
            penultimate = fibonacci;
            fibonacci = previous + fibonacci;
            previous = penultimate;
        }
        return fibonacci;
    }

    /// Complexity: O(N)
    public long FibonacciCache(long n) throws Exception
    {
        if (n < 0)
        {
            throw new Exception("n can not be less than zero");
        }
        if (n <= 2)
        {
            fibonacciCache[(int) n] = 1;
        }
        if (fibonacciCache[(int) n] == 0)
        {
            fibonacciCache[(int) n] = FibonacciCache(n - 1) + FibonacciCache(n - 2);
        }
        return fibonacciCache[(int) n];
    }
}
