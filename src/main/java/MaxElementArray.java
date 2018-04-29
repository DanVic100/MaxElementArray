import java.util.Scanner;

public class MaxElementArray {

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number array: ");
        int n = scanner.nextInt();
        String[] arrayString = new String[n];

        for (int i =0 ;i < n;i++)
        {
            System.out.println("Enter " + i +" element of array: ");
            arrayString[i] = scanner.next();
        }

        int min = arrayString[0].length();
        int indexMax = 0;
        int index =0;
        while (index < n){
            if (arrayString[index].length() > min) {
                min = arrayString[index].length();
                indexMax = index;
            }
            index++;
        }

        System.out.println("Max element of array: " + arrayString[indexMax] + " Index max element: " + indexMax +  " Length: " + min);
    }
}
