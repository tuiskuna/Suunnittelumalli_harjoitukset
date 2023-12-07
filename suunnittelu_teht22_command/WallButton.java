public class WallButton  {
    Command cmd;
    public WallButton(Command command){
    cmd = command;
    }
    public void push() {
    cmd.execute();
    }
}