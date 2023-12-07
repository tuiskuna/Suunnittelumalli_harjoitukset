public class FlipUpCommand implements Command {
    private Screen screen;
    public FlipUpCommand(Screen screen) {
        this.screen = screen;
    }
    @Override // Command
    public void execute() {
        screen.screenUp();
    }
}