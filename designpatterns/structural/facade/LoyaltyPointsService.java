package designpatterns.structural.facade;

public class LoyaltyPointsService {
    public void addPoints(String accountId, int points) {
        System.out.println(points + " loyalty points added to account" + accountId);
    }
}
