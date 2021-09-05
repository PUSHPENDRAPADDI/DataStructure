import java.io.*;
import java.lang.Thread;
import java.util.Scanner;
import java.util.Random;

public class DataStructure {
    public void firstLast(int arr1[]) {
        System.out.println(arr1[0]);
        System.out.println(arr1[arr1.length - 1]);
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            DataStructure ob = new DataStructure();
            System.out.print('W');
            Thread.sleep(1000);
            System.out.print('e');
            Thread.sleep(1000);
            System.out.print('l');
            Thread.sleep(1000);
            System.out.print('c');
            Thread.sleep(1000);
            System.out.print('o');
            Thread.sleep(1000);
            System.out.print('m');
            Thread.sleep(1000);
            System.out.println('e');
            Thread.sleep(1000);
            System.out.print("Enter your Data Strcture :- ");
            String name = sc.nextLine();

            switch (name.toLowerCase()) {
                case "array":
                    int n;
                    System.out.print("Enter size of array :- ");
                    n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.print("Enter Elements of array to create Array :- ");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("Enter 1 to get the First and Last Element of an Array ");
                    System.out.println("Enter 2 to get a Random Value from an Array ");
                    System.out.println("Enter 3 to append a New Item to an Array ");
                    System.out.println("Enter 4 to Insert a Value Between Two Values ");
                    System.out.println("Enter 5 to Compare Two Arrays ");
                    System.out.println("Enter 6 to arrange alternative positve and negative elements  ");
                    System.out.println("Enter 7 to search element in given ");
                    System.out.println("Enter 8 to sort given array ");
                    System.out.println("Enter 9 to suffle given array ");
                    System.out.println("Enter 10 to rotate given array ");
                    System.out.println("Enter 11 to reverse given array ");
                    int operation = sc.nextInt();
                    switch (operation) {
                        case 1:
                            ob.firstLast(arr);
                            break;
                        case 2:
                            System.out.println(arr[rand.nextInt(n)]);
                            break;
                        case 3:
                            System.out.println(
                                    "The size of array is fixed but we can append new element by using new array ");
                            System.out.print("Enter Number of element you want to enter :- ");
                            int extraNum = sc.nextInt();
                            int arr2[] = new int[arr.length + extraNum];
                            System.out.println("Enter More Element :- ");
                            for (int i = 0; i < arr2.length; i++) {
                                if (i < arr.length) {
                                    arr2[i] = arr[i];
                                } else {
                                    arr2[i] = sc.nextInt();
                                }
                            }
                            System.out.println("The appended array is ");
                            for (int i = 0; i < arr2.length; i++) {
                                Thread.sleep(1000);
                                System.out.println(arr2[i]);
                            }
                            break;
                        case 4:
                            System.out.println(
                                    "The size of array is fixed but we can insert new element by using new array ");
                            System.out.println("Enter position between which you want to insert new value ");
                            int pos1 = sc.nextInt();
                            System.out.print("Enter Value :- ");
                            int val = sc.nextInt();
                            int arr3[] = new int[n + 1];
                            for (int i = 0; i < arr3.length; i++) {
                                if (i < pos1) {
                                    arr3[i] = arr[i];
                                } else if (i == pos1) {
                                    arr3[i] = val;
                                } else {
                                    arr3[i] = arr[i - 1];
                                }
                            }
                            System.out.println("The inserted array is ");
                            for (int i = 0; i < arr3.length; i++) {
                                Thread.sleep(1000);
                                System.out.println(arr3[i]);
                            }
                            break;
                        case 5:
                            System.out.println("To compare Array Create second array ");
                            System.out.print("Enter size of second array same as 1st array :- ");
                            int n2 = sc.nextInt();
                            int[] arr4 = new int[n2];
                            System.out.print("Enter Elements of array to create Array :- ");
                            for (int i = 0; i < n2; i++) {
                                arr4[i] = sc.nextInt();
                            }
                            if (n == n2) {
                                int count = 0;
                                for (int i = 0; i < arr4.length; i++) {
                                    if (arr[i] != arr4[i]) {
                                        count++;
                                        break;
                                    }
                                }
                                if (count != 0) {
                                    System.out.println("Arrays Not equal");
                                } else {
                                    System.out.println("Arrays are equal");
                                }
                            } else {
                                System.out.println("Size of array not equal");
                            }
                            break;
                        case 6:
                            System.out.println("For this same number of positive and negative recommended ");
                            int i = 0, j = arr.length - 1;
                            while (i <= j) {
                                if (arr[i] < 0 && arr[j] > 0) {
                                    int temp = arr[i];
                                    arr[i] = arr[j];
                                    arr[j] = temp;
                                } else if (arr[i] > 0 && arr[j] < 0) {
                                    i++;
                                    j--;
                                } else if (arr[i] > 0) {
                                    i++;
                                } else if (arr[j] < 0) {
                                    j--;
                                }
                            }
                            int k = 0;
                            while (k < arr.length && i < arr.length) {
                                int temp = arr[k];
                                arr[k] = arr[i];
                                arr[i] = temp;
                                k = k + 2;
                                i++;
                            }
                            for (int j2 = 0; j2 < arr.length; j2++) {
                                Thread.sleep(1000);
                                System.out.println(arr[j2]);
                            }
                            break;
                        case 7:
                            System.out.print("Enter Element you want to search :- ");
                            int ele = sc.nextInt();
                            int flag = 0;
                            for (int i7 = 0; i7 < arr.length; i7++) {
                                if (ele == arr[i7]) {
                                    flag = flag + 1;
                                }
                            }
                            if (flag > 0) {
                                System.out.println(ele + " is Exist " + flag + " times");
                            } else {
                                System.out.println("Not exist");
                            }
                            break;
                        case 8:
                            System.out.println("The Sorted Array is :- ");
                            for (int i8 = 0; i8 < arr.length; i8++) {
                                int temp = arr[i8];
                                for (int j8 = i8; j8 < arr.length; j8++) {
                                    if (temp > arr[j8]) {
                                        temp = arr[j8];
                                        arr[j8] = arr[i8];
                                        arr[i8] = temp;
                                    }
                                }
                            }
                            for (int i8 = 0; i8 < arr.length; i8++) {
                                Thread.sleep(1000);
                                System.out.println(arr[i8]);
                            }
                            break;
                        case 9:
                            System.out.println("Suffled array is");
                            int n9 = arr.length;
                            int d9 = rand.nextInt(6) % n9;
                            int j9, k9, temp9;
                            int g_c_d = gcd(d9, n9);
                            for (int i9 = 0; i9 < g_c_d; i9++) {
                                temp9 = arr[i9];
                                j9 = i9;
                                while (true) {
                                    k9 = j9 + d9;
                                    if (k9 >= n9)
                                        k9 = k9 - n9;
                                    if (k9 == i9)
                                        break;
                                    arr[j9] = arr[k9];
                                    j9 = k9;
                                }
                                arr[j9] = temp9;
                            }
                            for (int i9 = 0; i9 < n9; i9++) {
                                Thread.sleep(1000);
                                System.out.println(arr[i9] + " ");
                            }
                            break;
                        case 10:
                            System.out.print("Enter number of rotation ");
                            int n10 = arr.length;
                            int d10 = sc.nextInt() % n10;
                            int j10, k10, temp10;
                            int g_c_d10 = gcd(d10, n10);
                            for (int i10 = 0; i10 < g_c_d10; i10++) {
                                temp10 = arr[i10];
                                j10 = i10;
                                while (true) {
                                    k10 = j10 + d10;
                                    if (k10 >= n10)
                                        k10 = k10 - n10;
                                    if (k10 == i10)
                                        break;
                                    arr[j10] = arr[k10];
                                    j10 = k10;
                                }
                                arr[j10] = temp10;
                            }
                            for (int i10 = 0; i10 < n10; i10++) {
                                Thread.sleep(1000);
                                System.out.println(arr[i10] + " ");
                            }
                            break;
                        case 11:
                            int n11 = arr.length;
                            for (int i11 = 0; i11 < n11 / 2; i11++) {
                                int temp11 = arr[i11];
                                arr[i11] = arr[(n11 - 1) - i11];
                                arr[(n11 - 1) - i11] = temp11;
                            }
                            System.out.println("The Reverse Array is :- ");
                            for (int i11 = 0; i11 < n11; i11++) {
                                Thread.sleep(1000);
                                System.out.println(arr[i11]);
                            }
                        default:
                            break;
                    }
                    break;

                default:
                    System.out.println("Its no");
                    break;
            }

        } catch (Exception e) {
            System.out.println(e);
            // sc.close();
        }
    }
}