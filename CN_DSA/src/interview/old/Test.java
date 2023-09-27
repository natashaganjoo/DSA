package interview.old;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		Movie m1 = new Movie(1997, "bo", 10);
		Movie m2 = new Movie(2000, "aai", 9.2 );
		Movie m3 = new Movie(1996, "hotma" , 8);
		Movie m4 = new Movie(1989, "mii" , 1);

		
		ArrayList<Movie> m  = new ArrayList<>();
		
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		
//		Collections.sort(m);
//		NameCompare name = new NameCompare();
		RatingCompare rating = new RatingCompare();
//		YearCompare year = new YearCompare();
		
		Collections.sort(m, rating);
		
		for(Movie i : m) {
			System.out.println(i);
		}
	}

	
}
