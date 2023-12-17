package mysandbox.chatgpt;

import java.util.Scanner;

class Movie {
    private String title;
    private String time;

    public Movie(String title, String time) {
        this.title = title;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }
}

class Cinema {
    private Movie[] movies;
    private boolean[][] seats;

    public Cinema(Movie[] movies, int numRows, int numSeatsPerRow) {
        this.movies = movies;
        this.seats = new boolean[numRows][numSeatsPerRow];
    }

    public void displayMovies() {
        System.out.println("Available Movies:");
        for (int i = 0; i < movies.length; i++) {
            System.out.println(i + 1 + ". " + movies[i].getTitle() + " - " + movies[i].getTime());
        }
    }

    public void displaySeats() {
        System.out.println("Cinema Layout:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j]) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }

    public void reserveSeat(int movieIndex, int row, int seat) {
        if (movieIndex < 0 || movieIndex >= movies.length || row < 1 || row > seats.length || seat < 1 || seat > seats[0].length) {
            System.out.println("Invalid selection. Try again.");
            return;
        }

        if (seats[row - 1][seat - 1]) {
            System.out.println("Seat already reserved. Try another seat.");
        } else {
            seats[row - 1][seat - 1] = true;
            System.out.println("Seat reserved successfully for " + movies[movieIndex].getTitle() +
                    " at " + movies[movieIndex].getTime() +
                    " - Row " + row + ", Seat " + seat);
        }
    }
}

public class CinemaReservationApp {

    public static void main(String[] args) {
        Movie[] movies = {
                new Movie("Inception", "12:00 PM"),
                new Movie("The Dark Knight", "3:00 PM"),
                new Movie("Interstellar", "6:00 PM")
        };

        Cinema cinema = new Cinema(movies, 5, 8);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCinema Reservation System");
            System.out.println("1. Display Movies");
            System.out.println("2. Display Cinema Layout");
            System.out.println("3. Reserve Seat");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cinema.displayMovies();
                    break;
                case 2:
                    cinema.displaySeats();
                    break;
                case 3:
                    System.out.print("Enter movie index (1-" + movies.length + "): ");
                    int movieIndex = scanner.nextInt() - 1;

                    System.out.print("Enter row number: ");
                    int row = scanner.nextInt();

                    System.out.print("Enter seat number: ");
                    int seat = scanner.nextInt();

                    cinema.reserveSeat(movieIndex, row, seat);
                    break;
                case 4:
                    System.out.println("Exiting. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

