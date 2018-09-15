package BigONotation;

public class LogExample {
	public static void main(String[] args) {
		 var stopWatch = new Stopwatch();
         stopWatch.Start();
         Console.WriteLine("Starting...");
         LogExample logExample = new LogExample();
         Console.WriteLine("Step 1: Reading Log Items...");
         var lineCount = logExample.ReadAllLogs();
         Console.WriteLine("{0:n0} Log Items Read", lineCount);
         Console.WriteLine("Step 2: Counting Unique IPs...");
         var ipCount = logExample.CountUniqueIPs();
         Console.WriteLine("Number of unique IPs: " + ipCount);
         Console.WriteLine("Time elapsed: {0:0.0} seconds", Math.Round(stopWatch.ElapsedMilliseconds / 1000.0, 2));
         Console.ReadLine();
	}
}
