public class Main {
    public static void main(String[] args) {
        int dataSize = 10000; 

        int[] data = generateRandomData(dataSize); // generate data

        Sorter sorter = new Sorter(new QuickSort()); // quick sort

        long startTime = System.currentTimeMillis();
        int[] sortedData = sorter.performSort(data);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("quick sort excecution time: " + executionTime + " ms");

        
        sorter.setStrategy(new BubbleSort()); // switch to bubble sort

        startTime = System.currentTimeMillis();
        sortedData = sorter.performSort(data);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;

        System.out.println("bubble sort execution time: " + executionTime + " ms");

        sorter.setStrategy(new InsertionSort()); // switch to insertion sort

        startTime = System.currentTimeMillis();
        sortedData = sorter.performSort(data);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;

        System.out.println("insertion sort execution time: " + executionTime + " ms");
    }

    // generate random data
    private static int[] generateRandomData(int size) {
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = (int) (Math.random() * 1000);
        }
        return data;
    }
}