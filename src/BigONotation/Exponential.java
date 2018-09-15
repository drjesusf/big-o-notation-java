package BigONotation;

import java.time.Duration;
import java.time.Instant;
import java.util.Formatter;

public class Exponential {

	public static void main(String[] args) {
		//var stopWatch = new Stopwatch();
        //stopWatch.Start();
		Instant starts = Instant.now();
		try {
			Exponential exponential = new Exponential();
	        ExponentialExampleType exponentialExampleType = ExponentialExampleType.Fibonacci;
	        switch (exponentialExampleType)
	        {
	            case Fibonacci:
	                int n = 43; //8 40 80
	                for (int i = 1; i <= n; i++)
	                {
	                    long fibonacci = exponential.Fibonacci(i);
	                    Formatter formatter = new Formatter().format("fibonacci %s %d", i, fibonacci);
	                    System.out.println(formatter.toString());
	                    //System.out.println("fibonacci {0} = {1}", i, fibonacci);
	                    //Console.WriteLine("fibonacci {0} = {1}", i, fibonacci);
	                }
	                break;
	        }
	        Instant ends = Instant.now();
	        //System.out.println("Time elapsed: {0:0.00} seconds");
	        System.out.println("Time elapsed:" + Duration.between(starts, ends).toMillis()/1000.0);
	        //Console.WriteLine("Time elapsed: {0:0.00} seconds", Math.Round(stopWatch.ElapsedMilliseconds / 1000.0, 2));
	        //Console.ReadLine();	
		             
		} catch (Exception e) {
			// TODO: handle exception
		}        
	}
	
	public int Fibonacci(long n) throws Exception
    {
        if (n < 0)
        {
            throw new Exception("n can not be less than zero");
        }
        if (n <= 2)
        {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
