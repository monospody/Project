package sk.itsovy.podhajecka.Project;

public class Main {
    public static void main(String[] args) {
        MyArray MyArray = new MyArray(new int[]{1,2,3,4,5});
        //MyArray.min2();
        MyArray.generateValues(5,10);
        MyArray.incrementValues();
        System.out.println(MyArray.getAverageValue());
        System.out.println(MyArray.min());
        System.out.println(MyArray.max());
        System.out.println(MyArray.contains(6));
        System.out.println(MyArray.countOfValues(6));
        System.out.println(MyArray.countOfEven());
        MyArray.addItem(80);
        System.out.println(" ");
        MyArray.sort(true);
        System.out.println(" ");
        int[] copy = MyArray.copy();
        System.out.println(" ");
        for(int i = 0; i < copy.length; i++){
            System.out.print(copy[i] + " ");
        }
        System.out.println(" ");
        System.out.println(MyArray.getItem(2));
        System.out.println(MyArray.max2());


    }

}
