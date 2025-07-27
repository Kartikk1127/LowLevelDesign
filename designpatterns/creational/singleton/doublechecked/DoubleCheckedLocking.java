package designpatterns.creational.singleton.doublechecked;

class JudgeAnalytics {

    private static volatile JudgeAnalytics judgeAnalytics;

    private JudgeAnalytics() {

    }

    // this is thread safe but not very efficient
    public static JudgeAnalytics getInstance() {
        if (judgeAnalytics==null) {
            synchronized (JudgeAnalytics.class) {
                if (judgeAnalytics == null) {
                    judgeAnalytics = new JudgeAnalytics();
                }
            }
        }
        return judgeAnalytics;
    }
}

public class DoubleCheckedLocking {
    public static void main(String[] args) {
        JudgeAnalytics judgeAnalytics = JudgeAnalytics.getInstance();
        JudgeAnalytics judgeAnalytics1 = JudgeAnalytics.getInstance();

        System.out.println(judgeAnalytics);
        System.out.println(judgeAnalytics1);
    }
}
