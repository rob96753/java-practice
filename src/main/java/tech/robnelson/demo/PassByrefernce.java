package tech.robnelson.demo;

public class PassByrefernce {

    public static void  parameterTest(int[] numbers) {
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[3] = 99;

    }

    public static void main(String[] args) {
        int[] numbers1 = new int[5];   
            parameterTest(numbers1);
            for (int i = 0; i < numbers1.length; i++) 
                System.out.println("Element at index " + i +  
                                            " : "+ numbers1[i]); 
    }




}