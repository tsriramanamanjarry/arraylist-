import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class array {
	public static void main(String[]args) {
		List c = new ArrayList<>();
		System.out.println(c.size());
		c.add(18);
		c.add(7);
		c.add(2003);
		c.add("HAPPY");
		c.add("birthday");
		System.out.println(c);
		c.remove(2);
		c.add(2,12);
		System.out.println(c);
		int d =(int) c.get(1);
		System.out.println(d);
		int e  = (int)c.indexOf(18);
		System.out.println(e);
		
	}

}
