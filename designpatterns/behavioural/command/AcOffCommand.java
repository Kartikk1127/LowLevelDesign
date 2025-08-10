package designpatterns.behavioural.command;

public class AcOffCommand implements Command{

    private AC ac;

    public AcOffCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.off();
    }

    @Override
    public void undo() {
        ac.on();
    }
}
