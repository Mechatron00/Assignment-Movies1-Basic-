package com.ProjectAssignment.Movies1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class HorrorMovies implements Movies
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
		return "HorrorMovies [srno=" + srno + ", year=" + year + ", name=" + name + ", type=" + type + ", rating="
				+ rating + "]\n";
	}
	public void Genre() 
	{
		System.out.println("Horror Movies:\n"
				+ "Horror films often explore dark subject matter "
				+ "and may deal with transgressive topics or themes. "
				+ "Broad elements include monsters, apocalyptic events, "
				+ "and religious or folk beliefs. Cinematic techniques used "
				+ "in horror films have been shown to provoke psychological "
				+ "reactions in an audience.");
		
		
		
	}
	public void Top5()
	{
		System.out.println("Top 5 Horror Movies:");
		System.out.println("1.The Conjuring(Year:2013,IMDB:7.5/10)");
		System.out.println("2.Annabelle Creation(Year:2017,IMDB:6.5/10)");
		System.out.println("3.IT(Year:2017,IMDB:7.3/10)");
		System.out.println("4.Evil Dead(Year:2013,IMDB:7.5/10)");
		System.out.println("5.The Nun(Year:2018,IMDB:5.3/10)");
		
	}
	
	

}
