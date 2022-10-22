package com.ProjectAssignment.Movies1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class MarathiMovies implements Movies
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
		return "MarathiMovies [srno=" + srno + ", year=" + year + ", name=" + name + ", type=" + type + ", rating="
				+ rating + "]";
	}
	public void Genre()
	{
		System.out.println("Marathi Movies:\n"
				+ "Marathi cinema is an Indian film industry of Marathi-language "
				+ "motion pictures. It is based in Mumbai, Maharashtra. "
				+ "Based in old Mumbai, it is the oldest film industry of Indian cinema."
				+ " The first Marathi film to be released in India was Shree Pundalik by "
				+ "Dadasaheb Torne on 18 May 1912 at Coronation Cinematograph, Mumbai."
				+ " and a Marathi crew who were performing Marathi and Sanskrit Sangeet natikas (musicals) "
				+ "and plays in Marathi at that period.");
		
		
	}
	public void Top5() 
	{
		System.out.println("Top 5 Marathi Movies:");
		System.out.println("1.Pak Pak Pakaak(Year:2005,IMDB:7.3/10)");
		System.out.println("2.Kaksparsh(Year:2012,IMDB:8/10)");
		System.out.println("3.Tukaram(Year:2012,IMDB:8.1/10)");
		System.out.println("4.Natsamrat(Year:2016,IMDB:8.8/10)");
		System.out.println("5.Dharmveer(Year:2022,IMDB:8.2/10)");
		
		
	}
	
	

}
