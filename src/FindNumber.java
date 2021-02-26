public class FindNumber {
    private static int getNumberIndex(int number, int[] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] == number) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbersArray = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        int number = 5;

        System.out.println("Value " + number + " located in the cell: " + getNumberIndex(number, numbersArray));
    }
}
