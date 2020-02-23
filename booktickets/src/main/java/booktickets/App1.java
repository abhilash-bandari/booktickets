package booktickets;
import java.util.Scanner;

class BookMyshow {

    void movies() {
     
        System.out.println("the movies available are");
        System.out.println(" 1.shreak -------- Rs.40 \n 2.stuart little - Rs.50 \n 3.game movie ---- Rs.60 \n 4.fun movie ----- Rs.70 ");
     
     
    }

}

class thea extends BookMyshow {
private int no_f_tickets;
    void th() {
        System.out.println("*******the theaters available are******* \n 1.karunya th \n 2.anna th");
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("*******karunya theater*******");
            System.out.println("*******select a movie*******");
            System.out.println("movie available are \n 1.shreak \n 2.stuart little ");
            @SuppressWarnings("resource")
			Scanner a = new Scanner(System.in);
            int o = a.nextInt();
            if (o == 1) {
                System.out.println("shreak movie @ kaurnya theater");
                System.out.println("enter the number of tickets to be booked");
                @SuppressWarnings("resource")
				Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int amount=40*r;
                System.out.println("to continue to book for this movie prees 1");
                @SuppressWarnings("resource")
				Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                    System.out.println("******************************************************");
                    System.out.println("theater ------------------- karunya theater");
                    System.out.println("movie --------------------- shreak");
                    System.out.println("cost ---------------------- Rs."+amount);
                    System.out.println("******************************************************");
                }

            }
            if (o == 2) {
                System.out.println("stuart little @karunya theater");
                 System.out.println("enter the number of tickets to be booked");
                @SuppressWarnings("resource")
				Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int amount=50*r;
                System.out.println("to continue to book for this movie prees 1");
                @SuppressWarnings("resource")
				Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                    System.out.println("******************************************************");
                    System.out.println("theater ------------------- karunya theater");
                    System.out.println("movie --------------------- staurt little");
                    System.out.println("cost ---------------------- Rs"+amount);
                    System.out.println("******************************************************");
                }

            }

        }
        if (n == 2) {
            System.out.println("*******anna theater*******");
            System.out.println("*******select a movie*******");
            System.out.println("movie available are \n 3.game movie \n 4.fun movie");
            @SuppressWarnings("resource")
			Scanner b = new Scanner(System.in);
            b.nextInt();
            @SuppressWarnings("resource")
			Scanner a = new Scanner(System.in);
            int o = a.nextInt();
            if (o == 1) {
                System.out.println("game movie @ anna theater");
                 System.out.println("enter the number of tickets to be booked");
                @SuppressWarnings("resource")
				Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int amount=60*r;
                System.out.println("to continue to book for this movie prees 1");
                @SuppressWarnings("resource")
				Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                    System.out.println("******************************************************");
                    System.out.println("theater ------------------- anna theater");
                    System.out.println("movie --------------------- game movie");
                    System.out.println("cost ---------------------- Rs."+amount);
                    System.out.println("******************************************************");
                }

            }
            if (o == 2) {
                System.out.println("fun little @anna theater");
                 System.out.println("enter the number of tickets to be booked");
                @SuppressWarnings("resource")
				Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int amount=70*r;
                System.out.println("to continue to book for this movie prees 1");
                @SuppressWarnings("resource")
				Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                    System.out.println("******************************************************");
                    System.out.println("theater ------------------- anna theater");
                    System.out.println("movie --------------------- fun movie");
                    System.out.println("cost ---------------------- Rs."+amount);
                    System.out.println("******************************************************");
                }

            }
        }

    }
}

public class App1 {

    public static void main(String[] args) {
        BookMyshow ob = new BookMyshow();

        BookMyshow[] moviename = new BookMyshow[2];
        moviename[0] = ob;
        thea a = new thea();
        moviename[1] = a;

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        System.out.println("---------1.list of movies and their prices--------- \n-------2.acces and book tickets through theaters---");

        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        @SuppressWarnings("resource")
		Scanner d = new Scanner(System.in);
        int h = d.nextInt();
        switch (h) {
            case 1: {
                ob.movies();
                break;
            }
            case 2: {
             
                a.th();
            }
        }

    }

}