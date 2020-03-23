import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class deleteArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input array length : ");
        int length = scn.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Input " + (i + 1) + " element: ");
            arr[i] = scn.nextInt();
        }
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Input X : ");
        float x = scn.nextInt();
        boolean xInArray = false;
        for (int i = 0; i < length; i++) {
            if (arr[i] == x) {
                for (int j = i; j < length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                i--;
                length--;
                xInArray = true;
            }
        }
        if (!xInArray) {
            System.out.println("X is not in array !");
        } else {
            System.out.print("New array : ");
            for (int i = 0; i < length; i++) {
                System.out.print(arr[i]+" ");
            }

        }
    }
}
