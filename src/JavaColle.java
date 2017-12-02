import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class JavaColle {

	public static void main(String args[]) {

		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(10);
		aList.add(11);
		aList.add(12);
		aList.add(13);

		Iterator<Integer> iter = aList.iterator();
		while (iter.hasNext())
			System.out.print(iter.next() + "\t");
		System.out.println();

		Vector<String> v = new Vector<String>();
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("d");

		for (String s : v)
			System.out.print(s + "\t");
		System.out.println();

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("c");
		ll.add("a");
		ll.add("b");
		for (String s : ll)
			System.out.print(s + "\t");
		System.out.print("\n");

		HashSet<String> hs = new HashSet<String>();
		hs.add("z");
		hs.add("c");
		hs.add("a");
		hs.add("b");
		for (String s : hs)
			System.out.print(s + "\t");
		System.out.print("\n");

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("c");
		ts.add("a");
		ts.add("b");
		for (String s : ts)
			System.out.print(s + "\t");
		System.out.print("\n");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("c", 3);
		hm.put("a", 1);
		hm.put("b", 2);
		for (String s : hm.keySet())
			System.out.print(hm.get(s) + "\t");
		System.out.print("\n");

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("c", 3);
		tm.put("a", 1);
		tm.put("b", 2);

		// printing keys
		for (String s : tm.keySet())
			System.out.print(s + "\t");
		System.out.print("\n");

		// printing values -- also possible with tm.get(s)
		for (Integer i : tm.values())
			System.out.print(i + "\t");
		System.out.print("\n");
	}

}
