package BigONotation;

import java.util.ArrayList;
import java.util.Iterator;

public class LogReader implements Iterator{
	int counter = 0;

    public Iterator<LogLine> GetEnumerator()
    {
        int N = 100000;
        int uniqueIPs = 90001;
        ArrayList<LogLine> multiples = new ArrayList<LogLine>();
        
        /*while (counter < N)
        {
            yield return new LogLine(counter % uniqueIPs);
            counter++;
        }*/
        for(counter=0;counter<N;counter++) {
        	multiples.add(new LogLine(counter%uniqueIPs));
        }
        return multiples
    }

    IEnumerator IEnumerable.GetEnumerator()
    {
        return this.GetEnumerator();
    }
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}
}
