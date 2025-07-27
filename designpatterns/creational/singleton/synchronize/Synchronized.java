package designpatterns.creational.singleton.synchronize;

class SynchronizedJudgeAnalytics {

    private static SynchronizedJudgeAnalytics judgeAnalytics;

    private SynchronizedJudgeAnalytics() {

    }

    // this is thread safe but not very efficient
    public static synchronized SynchronizedJudgeAnalytics getInstance() {
        if (judgeAnalytics==null) {
            judgeAnalytics = new SynchronizedJudgeAnalytics();
        }
        return judgeAnalytics;
    }
}

public class Synchronized {
    public static void main(String[] args) {
        SynchronizedJudgeAnalytics judgeAnalytics = SynchronizedJudgeAnalytics.getInstance();
        SynchronizedJudgeAnalytics judgeAnalytics1 = SynchronizedJudgeAnalytics.getInstance();
        System.out.println(judgeAnalytics);
        System.out.println(judgeAnalytics1);
    }
}
