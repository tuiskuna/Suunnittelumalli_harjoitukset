public class MainTest {
    public static void main(String[] args) {
        int memorySize = 1000; // Muistin koko
        ComputerFacade computer = new ComputerFacade(memorySize);
        computer.start();
        computer.printMemoryContents();
    }
}