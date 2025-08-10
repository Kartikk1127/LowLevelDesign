package designpatterns.behavioural.command;

public class AcOnCommand implements Command {
    private AC ac;

    public AcOnCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.on();
    }

    @Override
    public void undo() {
        ac.off();
    }
}
