import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int arraySize = 3;
        String[] array = new String[arraySize];
        String element;
        int curPos = 0;
        Scanner scanner = new Scanner(System.in);
        element = scanner.nextLine();

        while (!element.equals("0")) {
            array[curPos] = element;
            if (curPos == array.length - 1) {
                arraySize += arraySize;
                String[] arrayNew = new String[arraySize];
                for (int i = 0; i < array.length; i++) {
                    arrayNew[i] = array[i];
                }
                array = arrayNew;
            }
            curPos++;
            element = scanner.nextLine();
        }

        System.out.println();
        for(int i = 0; i < curPos; i++){
            System.out.println(array[i]);
        }
    }
}
