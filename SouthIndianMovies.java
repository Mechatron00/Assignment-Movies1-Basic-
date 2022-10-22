package com.ProjectAssignment.Movies1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SouthIndianMovies implements Movies
{@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int srno;
	int year;
	String name;
	String type;
	double rating;
	
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "SouthIndianMovies [srno=" + srno + ", year=" + year + ", name=" + name + ", type=" + type + ", rating="
				+ rating + "]";
	}
	public void Genre() {
		System.out.println("South Indian Movies:\n"
				+ "Cinema of South India, refers to the cinema of the four major "
				+ "film industries in South India; primarily engaged in making "
				+ "feature films in the four major languages of the region, "
				+ "namely — Malayalam, Telugu, Kannada, and Tamil. Based out of "
				+ "the cities of Kochi, Hyderabad, Bengaluru, and Chennai, they are"
				+ " often colloquially referred to as Mollywood, Tollywood, Sandalwood,"
				+ " and Kollywood.");
		
	}
	public void Top5() 
	{
		System.out.println("Top 5 Action Movies:");
		System.out.println("1.RRR(Year:2022,IMDB:8.0/10)");
		System.out.println("2.KGF(Year:2018,IMDB:8.2/10)");
		System.out.println("3.Kaithi(Year:2019,IMDB:8.5/10)");
		System.out.println("4.Asuran(Year:2019,IMDB:8.5/10)");
		System.out.println("5.Vikram(Year:2022,IMDB:8.4/10)");
		
	}
	
	
}
