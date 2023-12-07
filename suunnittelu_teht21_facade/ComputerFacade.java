public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade(int memorySize) {
        cpu = new CPU();
        memory = new Memory(memorySize);
        hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        char[] bootData = hardDrive.read(kBootSector, kSectorSize);
        memory.load(kBootAddress, bootData);
        cpu.jump(kBootAddress);
        cpu.execute();
    }

    private static final long kBootAddress = 100; // Vaihda oikea käynnistysosoite
    private static final long kBootSector = 0; // Vaihda oikea käynnistyssektori
    private static final int kSectorSize = 512; // Vaihda oikea sektorin koko

    public void printMemoryContents() {
        memory.printMemoryContents();
    }
}