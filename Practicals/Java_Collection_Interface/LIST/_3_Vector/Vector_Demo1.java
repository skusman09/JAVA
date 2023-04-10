package vectorExample;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		List<Double> vector=new Vector<>();
		
		@SuppressWarnings("unused")
		Object[] d=vector.toArray();
		System.out.println(vector.getClass());
		System.out.println(vector.hashCode());
		System.out.println(vector.size());
		

	}

}
