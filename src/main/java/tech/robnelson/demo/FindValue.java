package tech.robnelson.demo;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.ArrayList;
import java.util.stream.Collectors;

// given an array of integers, find the max value in the array
public class FindValue {
    static int FIRST = 0;
    static int SECOND = 1;
    static int OFFSET = 1;
    static int DEFAULT = 0;

    private FindValue() {

    }
    
    public static int findMax(int[] values) throws NoSuchElementException {        
        return Arrays.stream(values)
                        .max().getAsInt();
    }

    public static int findMin(int[] values) throws NoSuchElementException {        
        return Arrays.stream(values)
                        .min().getAsInt();
    }

    /*
    Java a boxed stream is a stream of the wrapper class instances to simulate a stream of primitives.
    To convert a stream of primitives, we must first box the elements in their wrapper classes and 
    then collect the wrapped objects in a collection. This type of stream is called boxed stream.
    */
    public static Integer findMaxProduct(int[] values) { 
        Integer returnValue;

        if (values.length < SECOND + OFFSET) {
            returnValue = DEFAULT;
        } else if (values.length == SECOND + OFFSET) {
            returnValue = values[SECOND] * values[FIRST];
        } else {
            List<Integer> sorted = Arrays.stream(values)
            .sorted()
            .boxed()
            .collect(Collectors.toList());
            var index = sorted.size() - OFFSET;
            returnValue =  Integer.max(sorted.get(FIRST) * sorted.get(SECOND), sorted.get(index-OFFSET) * sorted.get(index));            
        }   

        return returnValue; 
    }


    public static ArrayList<Integer> twoSum(ArrayList<Integer> nums, int target) {

        ArrayList<Integer> returnValue = new ArrayList<>();

        for (var i=0; i < nums.size(); i++ ) {

            var result = target - nums.get(i);
            var index = nums.indexOf(result);
            if (index > 0) {
                returnValue.add(i);
                returnValue.add(index);
                break;

            }
        }
        return returnValue;
    }

    
    
    


}