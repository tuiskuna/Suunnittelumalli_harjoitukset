public class FlipDownCommand implements Command {
    private Screen screen;

    public FlipDownCommand(Screen screen) {
        this.screen = screen;
    }

    @Override // Command
    public void execute() {
        screen.screenDown();
    }
}