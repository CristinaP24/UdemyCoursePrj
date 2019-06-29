import java.util.Scanner;

public class ArraysLists {
    private Scanner scanner = new Scanner(System.in);

    public void arrayGetEx() {
        int[] myInts = getInts(5); //spun cati ints sa primeasca
        int[] sorted = sortInts(myInts);
        printArray(sorted);
    }

    public int[] getInts(int capacity) {
        //metoda in care returnez arrayul mai sus declarat si met. primeste ca
        //param. capacitatea arrayului - gets the array values
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + "ints: \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + "contents " + array[i]);
        }

    }

    public int[] sortInts(int[] array) {//pass array of unsorted nos
        int[] sortedArray = new int[array.length]; //are ca elemente in array  lungimea arrayului pus ca parametru in metoda
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;//cont the loop until while flag = true
            for (int i = 0; i < sortedArray.length - 1; i++) {//go through array, ending elem is always one less than total
                if (sortedArray[i] < sortedArray[i + 1]) { //if sorted array at element i (iterates all array - 1) is < than
                    //followint 3 lines - swap elements
                    //sorted array at element i +1 (itterates all array + 1) store i in var temp, attribute i from sorted array the value of i +1
                    //attribute i+1 to temp
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }

            }
        }
        return sortedArray;
    }

    //056 Resize an array
    //public void resizeArrayEx() {
//        int[] baseData = new int[10];
//        System.out.println("Enter 5 ints here: ");
//        getInput();
//        printArray2(baseData);
//        resizeArray();
//        System.out.println("Enter 7 ints here: ");
//        getInput();
//        printArray2(baseData);

        // }

//    public void getInput() {
//
//        for (int i = 0; i < baseData.length; i++)
//            baseData[i] = nextInt();
//    }
//    public void printArray2(int []arr){
//        for (int i = 0; i<arr.length; i++){
//            System.out.println(arr[i]+ " ");
//            System.out.println();
//        }
//    }
//
//    public void resizeArray (){
//        int [] original = baseData;
//        baseData = new int[7];
//        for(int i = 0; i<original.length; i++)
//            baseData[i]= origina[i];
//    }





    }



