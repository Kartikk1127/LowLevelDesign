package designpatterns.creational.singleton.lazy;

class LazyJudgeAnalytics {

    // this isn't thread safe
    private static LazyJudgeAnalytics judgeAnalytics;

    private LazyJudgeAnalytics() {

    }

    public static LazyJudgeAnalytics getInstance() {
        if (judgeAnalytics==null) {
            judgeAnalytics = new LazyJudgeAnalytics();
        }
        return judgeAnalytics;
    }
}

public class LazySingleton {
    public static void main(String[] args) {
        LazyJudgeAnalytics judgeAnalytics = LazyJudgeAnalytics.getInstance();
        LazyJudgeAnalytics judgeAnalytics1 = LazyJudgeAnalytics.getInstance();
        System.out.println(judgeAnalytics);
        System.out.println(judgeAnalytics1);
    }
}
