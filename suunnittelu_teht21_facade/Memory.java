public class Memory {
    private char[][] memoryArray;

    public Memory(int size) {
        memoryArray = new char[size][];
    }

    public void load(long position, char[] data) {
        // Tämä on vain simulaatio datan lataamisesta muistiin
        System.out.println("Loading data to memory at position " + position);
        System.out.println("Loaded data: " + new String(data));
        memoryArray[(int) position] = data;
    }

    public void printMemoryContents() {
        System.out.println("\nMemory contents:");
        for (int i = 0; i < memoryArray.length; i++) {
            if (memoryArray[i] != null) {
                System.out.println("Address " + i + ": " + new String(memoryArray[i]));
            } else {
                System.out.println("Address " + i + ": Empty");
            }
        }
    }
    
}
