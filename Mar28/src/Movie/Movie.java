package Movie;

import java.util.Scanner;

import Dog.Dog;

public class Movie {

	String name, genre;
	double rating;

	public Movie(String n, String g, double r){

		name=n;
		genre=g;
		rating=r;
		
	}
	public static void main(String[]args){
		
		
		Movie m1=new Movie("Black Panther", "Action",4.5);
		Movie m2=new Movie("Pacific Rim", "Action",3.5);
		Movie m3=new Movie("Incredibles 2", "Action, Comedy",5.0);
		Movie m4=new Movie("Infinity War", "Action",4.5);
		Movie m5=new Movie("I Feel Pretty", "Comedy",3.7);
		
		Movie[]movie=new Movie[5];
		
		movie[0]=new Movie(m1.name, m1.genre, m1.rating);
		movie[1]=new Movie(m2.name, m2.genre, m2.rating);
		movie[2]=new Movie(m3.name, m3.genre, m3.rating);
		movie[3]=new Movie(m4.name, m4.genre, m4.rating);
		movie[4]=new Movie(m5.name, m5.genre, m5.rating);
	
		
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter the name of the movie");
		
		String answer=scanner.nextLine();
		
		if(answer.equals(m1.name))
		
		{
			
			System.out.println(movie[0].name +", "+ movie[0].genre +", "+ movie[0].rating);
		}
		
		if(answer.equals(m2.name))
			
		{
			
			System.out.println(movie[1].name +", "+ movie[1].genre +", "+ movie[1].rating);
		}
		
		if(answer.equals(m3.name))
			
		{
			
			System.out.println(movie[2].name +", "+ movie[2].genre +", "+ movie[2].rating);
		}
		
		if(answer.equals(m4.name))
			
		{
			
			System.out.println(movie[3].name +", "+ movie[3].genre +", "+ movie[3].rating);
		}
		
		if(answer.equals(m5.name))
			
		{
			
			System.out.println(movie[4].name +", "+ movie[4].genre +", "+ movie[4].rating);
		}
		
	}
}

