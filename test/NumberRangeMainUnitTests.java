package test;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;

import numberrangesummarizer.NumberRangeMain;

public class NumberRangeMainUnitTests {
    
    public static void main(String[] args){
        NumberRangeMain myObj = new NumberRangeMain();

        runCollectTests(myObj);
    }

    public static void runCollectTests(NumberRangeMain myObj){

        int count = 0;
        int passed = 0;

        List<String> inputs = new ArrayList<String>(Arrays.asList(
            "1,3,6,7,8,12,13,14,15,21,22,23,24,31",
            "2,3,20,9,29,18,12,4,7",
            "100,90,80,70,60,50,40,30,20,10,95",
            "2001",
            "9,8,7,5,4,3,1"
            )
        );

        List<List<Integer>> outputs = new ArrayList<List<Integer>>(Arrays.asList(
            new ArrayList<Integer>(Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31)),
            new ArrayList<Integer>(Arrays.asList(2,3,4,7,9,12,18,20,29)),
            new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,60,70,80,90,95,100)),
            new ArrayList<Integer>(Arrays.asList(2001)),
            new ArrayList<Integer>(Arrays.asList(1,3,4,5,7,8,9))
            )
        );

        for (int i = 0; i < inputs.size(); i++){
            if (myObj.collect(inputs.get(i)).equals(outputs.get(i))){
                System.out.println("Test case passed: " + myObj.collect(inputs.get(i)) + " matches expected output " + outputs.get(i));
                passed++;
            }
            else{
                System.out.println("Test case failed: " + myObj.collect(inputs.get(i)) + " matches expected output " + outputs.get(i));
            }
            count++;
        }

        System.out.println(100*(passed/count) + "% test cases passed.");
    }

    public void runSummarizeCollection(){
        
    }
    
}
