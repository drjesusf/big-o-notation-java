package BigONotation;

import java.util.Formatter;

public class Quadratic {

	public static void main(String[] args) {
		Quadratic quadratic = new Quadratic();
        QuadraticExampleType quadraticExampleType = QuadraticExampleType.CreateAllPairs;
        switch (quadraticExampleType)
        {
            case CreateAllPairs:
                int n = 5;
                quadratic.CreateAllPairs(n);
                break;
        }
        //Console.ReadLine();
	}
	public void CreateAllPairs(int n)
    {
        int x = 1;            
        while (x <= n)
        {
            int y = 1;
            while (y <= n)
            {
                //Console.WriteLine("{0}, {1}", x, y);
            	Formatter formatter = new Formatter().format("%s, %s", x, y);
                System.out.println(formatter.toString());
                y++;
            }
            x++;
        }
    }

}
