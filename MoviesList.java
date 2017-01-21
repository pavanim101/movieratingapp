/**
 * @author malli2
 *
 */
//Creates the linked list data structure of movie objects
public class MoviesList {
	private Movies movie;
	private MoviesList next;
	
	public MoviesList(Movies movie, MoviesList next){
		this.movie=movie;
		this.next=next;
		
	}
	
	
	//Count method
	public int count() {
		if (this.movie==null)
			return 0;
		
		if (next == null)
			return 1; // BASE CASE; no more recursion required!
		
		// Recursive case:
		return 1 + next.count();
	}
	
	//Adds each movie in alphabetically
	public MoviesList add(Movies new1){
		
		if (count()==0)
		return new MoviesList(new1, null);
		
		if (new1.getTitle().charAt(0)<this.movie.getTitle().charAt(0))
			return new MoviesList(new1,this);  //if A<B insert it in the begging and make a ref to it after
		
		if (next!=null) //if it not the last link, insert it right after
			next=next.add(new1);
		
		else  //if it is the last link, then make a new one with the reference as null
			next=new MoviesList(new1, null); 
		
		return this;
		}
	
	//Prints the list alphabetically
	public String toStringg() {
		if (next == null)
			return this.movie.getTitle();// BASE CASE; no more recursion required

		// Recursive case:
		String restOfString = next.toStringg(); // Forward Recursion
		return this.movie.getTitle() + ", " + restOfString;
	}
	
	//Prints the list based on what rating the user wants
	public String ratingToString(int x){
		String y;
		if (next == null&&this.movie.getRating()>=x)
			return this.movie.getTitle();// BASE CASE; no more recursion required

		if (next == null&&this.movie.getRating()<x)
			return "";// BASE CASE; no more recursion required

		// Recursive case:
		
		String restOfString = next.ratingToString(x); // Forward Recursion
		
		if (this.movie.getRating()>=x)
			y=this.movie.getTitle();
		
		else y="";
				
				
		return  y+ ", " + restOfString;
	}
	
	//Prints the list based on what genre the user wants
	public String genreToString(String gen){
		String y;
		if (next == null&&this.movie.getGenre().equalsIgnoreCase(gen))
			return this.movie.getTitle();// BASE CASE; no more recursion required
		
		if (next == null&&!this.movie.getGenre().equalsIgnoreCase(gen))
			return "";

		// Recursive case:
		
		String restOfString = next.genreToString(gen); // Forward Recursion
		
		if (this.movie.getGenre()==gen)
			y=this.movie.getTitle();
		
		else y="";
				
				
		return  y+ ", " + restOfString;
	}
	
	//Prints a list of movies the user still needs to see
	public String seenToString(){
		String y;
		if (next == null&&this.movie.getBool()==false)
			return this.movie.getTitle();// BASE CASE; no more recursion required
		
		if (next==null&&this.movie.getBool()==true)
			return "";

		// Recursive case:
		
		String restOfString = next.seenToString(); // Forward Recursion
		
		if (this.movie.getBool()==false)
			y=this.movie.getTitle();
		
		else y="";
				
				
		return  y+ ", " + restOfString;
	}
	
	//Removes the movie from list
	public void remove(String name){
		if (this.movie.getTitle().equalsIgnoreCase(name))
			this.movie.setTitle("");
		if (next!=null)
			next.remove(name);
		return;
	}
	
	//Prints a list of movies with the specified actors
	public String actorsToString(String name){
		String y;
		
		if (next == null&&this.movie.getActors().contains(name))
			return this.movie.getTitle();// BASE CASE; no more recursion required
		if (next == null&&!this.movie.getActors().contains(name))
			return "";
		
		String restOfString = next.seenToString(); // Forward Recursion
		
		if (this.movie.getActors().contains(name)&&this.movie.getBool()==false)
			y=this.movie.getTitle();
		
		else y="";
				
				
		return  y+ ", " + restOfString;
	}
	
}


