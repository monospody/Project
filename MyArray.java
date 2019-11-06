package sk.itsovy.podhajecka.Project;

import java.util.Random;

public class MyArray implements ArrayMethods{
    private int[]arr;
    private int size;

    public MyArray(int size) {
        this.size = size;
        arr = new int[size];
        resetArrayToZero();
        if (size <= 0){
            error("Incorrect size array");
        }
    }

    private void resetArrayToZero() {
        int i;
        for(i = 0; i < arr.length; i++){
            arr[i]=0;
        }
    }

    public MyArray(int[] input) {
        this.arr = input;
        this.size = input.length;
        if (size <= 0){
            error("Incorrect size array");
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public double getAverageValue() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        return (double) sum /size;
    }

    @Override
    public int min() {
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    @Override
    public int max() {
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    @Override
    public int min2() {
        System.out.println("Not imported method min2");
        System.exit(1);
        return 0;
    }

    @Override
    public int max2() {
        System.out.println("Not imported method max2");
        System.exit(1);
        return 0;
    }

    @Override
    public void generateValues(int a, int b) {
        if(a > b){
            System.exit(1);
        }else {
            Random rnd = new Random();
            for (int i = 0; i < size; i++) {
                int r = (rnd.nextInt(a+1) + b/2);
                arr[i] = r;
            }
        }
    }

    @Override
    public boolean contains(int value) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return true;
            }
        }
        return false;
    }

    @Override
    public int countOfValues(int value) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if(arr[i]==value){
                sum++;
            }
        }
        return sum;
    }

    @Override
    public int countOfEven() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if(arr[i]%2==0){
                sum++;
            }
            if(arr[i]==0 || arr[i]<0){
                sum++;
            }
        }
        return sum;
    }

    @Override
    public void incrementValues() {
        for (int i = 0; i < size; i++) {
            arr[i]++;
        }
    }

    @Override
    public void sort(boolean asc) {
        if (asc){
            for(int i=0;i < size-1;i++){
                for(int j= 0; j<(size-1-i); j++){
                    if(arr[j] > (arr[j+1])){
                        int temp= arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]= temp;
                    }
                }
            }
            for(int g = 0; g < size; g++){
                System.out.print(arr[g]+" ");
            }
        }
        else {
            for(int i=0;i < size-1;i++){
                for(int j= 0; j<(size-1-i); j++){
                    if(arr[j] < (arr[j+1])){
                        int temp= arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]= temp;
                    }
                }
            }
            for(int g = 0; g < size; g++){
                System.out.print(arr[g]+" ");
            }

        }
    }

    @Override
    public void addItem(int newValue) {
        int a = arr.length;
        int[] newarr = new int[arr.length+1];
        for(int g = 0; g < arr.length; g++) {
            newarr[g] = arr[g];
        }
        newarr[newarr.length-1] = newValue;
        arr = newarr;
        size = arr.length;
        for (int g = 0; g < a; g++) {
            System.out.print(newarr[g] + " ");

        }
    }

    @Override
    public void addItem(int newValue, int position) {

    }
    @Override
    public int[] copy() {
        int[] arr2;
        arr2 = arr.clone();
        System.arraycopy(arr,0,arr2,0,size);
        return arr2;
    }
    @Override
    public int getItem(int position) {
        return arr[position-1];
    }
    public void error(String message){
        System.out.println(message);
        System.exit(1);
    }
    @Override
    public String toString(){
        String toString = "";
        for(int i = 0; i < arr.length; i++){
            toString=toString + arr[i] + ", ";
        }
        return toString;
    }
}
