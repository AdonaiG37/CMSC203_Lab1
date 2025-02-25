import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		    while(true) {
		        Movie movie = new Movie();
		        
		        // Getting user input for movie details
		        System.out.print("Enter the movie title: ");
		        String title = scanner.nextLine();
		        movie.setTitle(title);

		        System.out.print("Enter the movie rating: ");
		        String rating = scanner.nextLine();
		        movie.setRating(rating);

		        System.out.print("Enter the number of tickets sold: ");
		        int ticketsSold = scanner.nextInt();
		        movie.setSoldTickets(ticketsSold);
		        scanner.nextLine();
		        // Display movie information
		        System.out.println("\nMovie Details:\n" + movie);
		        
		        System.out.print("Do you want to enter another movie? (yes/no): ");
	            String response = scanner.nextLine().trim().toLowerCase();
	            if (!response.equals("yes")) {
	                break;
	            }
		    }
		        // Close scanner
		        scanner.close();
		    }
		}
// TODO Auto-generated method stub

