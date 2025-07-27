package designpatterns.creational.singleton.billpugh;

class JudgeAnalytics {

    private JudgeAnalytics() {

    }

    private static class Holder {
        private static volatile JudgeAnalytics judgeAnalytics = new JudgeAnalytics();
    }

    public static JudgeAnalytics getInstance() {
        return Holder.judgeAnalytics;
    }
}

public class Main {
    public static void main(String[] args) {
        JudgeAnalytics judgeAnalytics = JudgeAnalytics.getInstance();
        JudgeAnalytics judgeAnalytics1 = JudgeAnalytics.getInstance();

        System.out.println(judgeAnalytics);
        System.out.println(judgeAnalytics1);
    }
}

