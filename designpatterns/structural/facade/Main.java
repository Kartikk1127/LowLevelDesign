package designpatterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        MovieBookingFacade movieBookingFacade = new MovieBookingFacade();
        movieBookingFacade.bookMovieTicket("acc_123","Narsimha1","10F","kartikey@gmail.com",250.0);
    }
}
