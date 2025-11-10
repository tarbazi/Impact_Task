package numberrangesummarizer;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class NumberRangeMain implements NumberRangeSummarizer {
    
    public NumberRangeMain(){
    
    }
    
    public Collection<Integer> collect(String input){
        
        String[] myTempArr = input.split(",");
        Collection<Integer> myTempCollection = new ArrayList<>();

        for (String tempStr: myTempArr){
            myTempCollection.add(Integer.parseInt(tempStr));
        }
        
        return myTempCollection;

    }

    public String summarizeCollection(Collection<Integer> input){
        
        String finalStr = "";

        List<Integer> inputList = new ArrayList<>(input); 

        for (int i = 1; i < input.size() - 1; i++ ){

            /*if (inputList.get(i - 1) != inputList.get(i) - 1){
                finalStr += String.valueOf(inputList.get(i));
            }*/

        }
        
        return finalStr;

    }

}
