package designpatterns.structural.facade;

public class MovieBookingFacade {
    private PaymentService paymentService;
    private SeatReservationService seatReservationService;
    private NotificationService notificationService;
    private LoyaltyPointsService loyaltyPointsService;
    private TicketService ticketService;

    public MovieBookingFacade() {
        this.paymentService = new PaymentService();
        this.seatReservationService = new SeatReservationService();
        this.notificationService = new NotificationService();
        this.loyaltyPointsService = new LoyaltyPointsService();
        this.ticketService = new TicketService();
    }

    public void bookMovieTicket(String accountId, String movieId, String seatNumber, String userEmail, double amount) {
        paymentService.makePayment(accountId,amount);
        seatReservationService.reserveSeat(movieId,seatNumber);
        ticketService.generateTicket(movieId,seatNumber);
        loyaltyPointsService.addPoints(accountId,50);
        notificationService.sendNotification(userEmail);

        System.out.println("Movie ticket booking completed successfully");
    }
}
