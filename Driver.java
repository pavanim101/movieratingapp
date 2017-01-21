
/**
 * @author malli2
 *
 */
public class Driver {
	

	public static void main(String [] args){

		
	System.out.println("Welcome to the Movie Rating App! Select an option below(1, 2, 3, 4, 5, 6, 7, or 8):\n"
			+ " 1) add an movie\n "
			+ "2) remove a movie\n"
			+ " 3) display movies alphabetically\n "
			+ "4) display movies >= a certain rating\n "
			+ "5) display movies in a specified genre\n "
			+ "6) list all movies with a specified actor/actress\n"
			+ " 7) list all movies the user has yet to see\n"
			+ " 8) quit\n");
	
		TextIO.getln();
		
		MoviesList head=new MoviesList(Movies.infoAdd(), null);
		
	System.out.print("You have addded a movie.");
	
	int result=0;
	
	while(result!=8){ //Keeps asking for what option the user wants after it completes each task
	result=welcome();
	
	if (result==1){
		Movies new3=Movies.infoAdd();
		head.add(new3);
	
	}
		
	
	if (result==2){
		System.out.print("What movie would you like to remove? ");
		String mov=TextIO.getln();
		head.remove(mov);
	}
	
	if (result==3) {
		String alpha=head.toStringg();
		System.out.println(alpha);
		System.out.println();
		
	}
	
	if(result==4){
		System.out.println("What rating would you like to see? ");
		int s=TextIO.getlnInt();
		head.ratingToString(s);
	}
	
	if (result==5){
		System.out.println("What genre would you like to see? ");
		String gen=TextIO.getln();
		String list1=head.genreToString(gen);
		System.out.println(list1);
	}
	
	if (result==6){
		System.out.println("What actor/actress do you want to see? ");
		String name4=TextIO.getln();
		String list3=head.actorsToString(name4);
		System.out.println(list3);
		
		
	}
	
	if (result==7){
		System.out.println("We recommend seeing: ");
		String need=head.seenToString();
		System.out.println(need);
		
	}
	
	if (result==8){ //When the user presses 8, the program will finally quit 
		System.out.println("(“Are you sure you want to quit? - all your data will be lost.");
		return;
		}
	}
}
		
//Method for calling options until the user wants to quit 
	public static int welcome(){
		System.out.println("Select an option below(1, 2, 3, 4, 5, 6, 7, or 8):\n"
			+ " 1) add an movie\n "
			+ "2) remove a movie\n"
			+ " 3) display movies alphabetically\n "
			+ "4) display movies >= a certain rating\n "
			+ "5) display movies in a specified genre\n "
			+ "6) list all movies with a specified actor/actress\n"
			+ " 7) list all movies the user has yet to see\n"
			+ " 8) quit\n");
		
		int choice=TextIO.getlnInt();
		return choice;
	}
}


