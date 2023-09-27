package interview.old;

public class Movie {

	private int year;
	private String name;
	private double rating;
	
	public Movie() {
		
	}

	public Movie(int year, String name, double rating) {
		super();
		this.year = year;
		this.name = name;
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [year=" + year + ", name=" + name + ", rating=" + rating + "]";
	}

//	@Override
//	public int compareTo(Movie o) {
//		return this.name.compareTo(o.getName());
//	}

//	public int compareTo(Movie m)
//    {
//        return this.year - m.year;
//    }
	
//	@Override
//	public int compareTo(Movie o) {
//		return  (int) (this.rating - o.getRating());
//	}
	
}
