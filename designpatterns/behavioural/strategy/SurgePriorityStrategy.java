package designpatterns.behavioural.strategy;

public class SurgePriorityStrategy implements MatchingStrategy{
    @Override
    public void match(String riderLocation) {
        System.out.println("Matching rider using surge pricing priority near " + riderLocation);
    }
}
