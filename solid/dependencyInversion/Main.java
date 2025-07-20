package solid.dependencyInversion;

interface RecommendationStrategy {
    void recommend();
}

class TrendingRecommendation implements RecommendationStrategy{
    public void recommend() {

    }
}

class GenreRecommendation implements RecommendationStrategy{
    public void recommend() {

    }
}

class RecentRecommendation implements RecommendationStrategy{
    public void recommend() {

    }
}

class RecommendationAlgorithm {
    private final RecommendationStrategy recommendationStrategy;
    public RecommendationAlgorithm(RecommendationStrategy recommendationStrategy) {
        this.recommendationStrategy = recommendationStrategy;
    }

    public void recommend() {
        recommendationStrategy.recommend();
    }
}

public class Main {
    public static void main(String[] args) {
        RecommendationAlgorithm algorithm = new RecommendationAlgorithm(new TrendingRecommendation());
        algorithm.recommend();
    }
}
