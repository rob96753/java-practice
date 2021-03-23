package tech.robnelson.demo;

import java.util.ArrayList;

public class FindPairs {

    private int groupLength;
    public static int GROUP_LENGTH = 3;

    public FindPairs() {
        this.groupLength = GROUP_LENGTH;
    }

    public FindPairs(int groupLength) {
        this.groupLength = groupLength;
    }

    private ArrayList<String> getGroupPermutations(String input, int groupLength) {
        ArrayList<String> returnValue = new ArrayList<String>();

        for (var i = 0; i < input.length() - (groupLength - 1); i++) {
            returnValue.add(input.substring(i, i+groupLength));
        }


        return returnValue;
    }
    
    // private Boolean checkMatch(String value) {
    //     int midpoint = value.length() / 2;
    //     StringBuilder lastHalf = new StringBuilder();
    //     lastHalf.append(value.substring(midpoint + 1));
    //     return value.substring(0, midpoint).equals(lastHalf.reverse().toString());

    // }

    private Boolean checkMatch(String value) {
        int midpoint = value.length() / 2;        
        return value.substring(0, midpoint).equals(value.substring(midpoint + 1)) 
                    && (value.length() > 3 || value.substring(0, 1)  != value.substring(midpoint -1, midpoint));
    }

    public ArrayList<String> findPairs(String input) {
        ArrayList<String> returnValue = new ArrayList();
        

        return returnValue;
    }

    public int countPairs(String input) {
        int returnValue = 0;
        ArrayList<String> permutations = getGroupPermutations(input, this.groupLength);
        for (String string : permutations) {
            if (this.checkMatch(string)) {
                returnValue += 1;
            }
            
        }

        return returnValue;
    }


    
}
