import java.io.*;
import java.util.*;
public class MyClass {

    public static Boolean  checkCircularSorted(int arr[])
    {
        int count = 0 ; 
        for (int i = 1 ; i<arr.length ; i++)
        {
            if (arr[i-1] > arr[i])
            {
                count ++ ; 
            }
        }

        if (count == 1) 
        {
            return arr[0] > arr[arr.length -1 ]; 
        }
        else 
        {
            return false ; 
        }
    }

    public static void main(String args[]) {

        int arr[] = { 23, 34, 45, 12, 17, 19 };
        if (checkCircularSorted(arr))
        {
            System.out.println("Yes") ; 
        }else 
        {
            System.out.println("No") ; 
        }
    }
} 