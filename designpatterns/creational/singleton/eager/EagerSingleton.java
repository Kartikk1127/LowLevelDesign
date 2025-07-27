package designpatterns.creational.singleton.eager;

class EagerJudgeAnalytics {
    // this line executes during the class loading.
    // this is thread safe.
    private static final EagerJudgeAnalytics judgeAnalytics = new EagerJudgeAnalytics();

    private EagerJudgeAnalytics() {

    }

    public static EagerJudgeAnalytics getInstance() {
        return judgeAnalytics;
    }
}

public class EagerSingleton {
    public static void main(String[] args) {
        EagerJudgeAnalytics judgeAnalytics = EagerJudgeAnalytics.getInstance();
        EagerJudgeAnalytics judgeAnalytics1 = EagerJudgeAnalytics.getInstance();

        System.out.println(judgeAnalytics);
        System.out.println(judgeAnalytics1);
    }
}
