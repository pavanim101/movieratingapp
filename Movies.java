/**
 * @author malli2
 *
 */
public class Movies {
	//Creates each movie object 
	private String title;
	private int rating;
	private String des;
	private enum Genre {ACTION, ROMANCE, COMEDY, DRAMA, DOCUMENTARY,ANIME};
	private Genre genre;
	private boolean haveSeen;
	private String[] actors;
	int count=0;
	
	
	public String getTitle(){
		return this.title;
	}
	
	public void setTitle(String name){
		this.title=name;
	}
	
	public String getGenre(){
		return this.genre.toString();
	}
	
	public int getRating(){
		return this.rating;
	}
	
	public boolean getBool(){
		return this.haveSeen;
	}
	
	public String getActors(){
		String result="";
		for (int i=0; i<this.actors.length;i++){
			result=actors[i]+result;
		}
		
		return result;
	}
	
//Constructor
public Movies(String title, int rating, String des, boolean haveSeen, String[] actors,String genre){
		this.title=title;
		this.rating=rating;
		this.des=des;
		this.haveSeen=haveSeen;
		this.actors=actors;
		this.genre=Genre.valueOf(genre);
	}

//Method for adding data into each movie objects instance variable
public static Movies infoAdd(){
	System.out.print("What is the title of your movie?  "); 
	String title=TextIO.getln();
	System.out.print("What is the rating:1-5?  ");
	int rating=TextIO.getInt();
	System.out.print("What is the description? ");
	String des=TextIO.getln();
	des=TextIO.getln();
	System.out.print("What is the genre: ACTION, ROMANCE, COMEDY, DRAMA,DOCUMENTARY, ANIME");
	String genre=TextIO.getln();
	System.out.print("Have you seen this movie? Y or N ");
	char seen=TextIO.getChar();
	boolean haveSeen=false;
	if (seen=='Y')  haveSeen=true;
	else if (seen=='N') haveSeen=false;
	System.out.print("How many actors?");
	int size=TextIO.getInt();
	String[] actors= new String[size];
	if (size>0){
	System.out.print("What is Actors/Actress name? One at a time ");}
	String name=TextIO.getln();
	for(int i=0; i<size; i++){
		actors[i]=name;
		name=TextIO.getln();
	}
	
	Movies new2=new Movies(title, rating, des, haveSeen, actors, genre);
	return new2;
}

}





