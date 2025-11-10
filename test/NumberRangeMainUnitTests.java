package test;

import java.util.Collection;

import numberrangesummarizer.NumberRangeMain;

public class NumberRangeMainUnitTests {
    
    public static void main(String[] args){
        NumberRangeMain myObj = new NumberRangeMain();

        Collection<Integer> myVals = myObj.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");
        System.out.println(myVals);

        System.out.println(myObj.summarizeCollection(myVals));
    }
    
}
