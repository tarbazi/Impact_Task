package numberrangesummarizer;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NumberRangeMain implements NumberRangeSummarizer {
    
    public NumberRangeMain(){
    
    }
    
    public Collection<Integer> collect(String input){
        
        String[] myTempArr = input.split(",");
        List<Integer> myTempCollection = new ArrayList<>();

        for (String tempStr: myTempArr){
            myTempCollection.add(Integer.parseInt(tempStr));
        }

        Collections.sort(myTempCollection);
        
        return myTempCollection;

    }

    public String summarizeCollection(Collection<Integer> input){
        
        String finalStr = "";

        List<Integer> inputList = new ArrayList<>(input); 

        for (int i = 0; i < input.size() - 1; i++ ){

            if (i != 0){
                finalStr += ", ";
            }

            if (inputList.get(i) + 1 == inputList.get(i+1)){
                for (int j = i + 2; j < input.size(); j++){

                    if (inputList.get(j-1) + 1 != inputList.get(j)){
                        finalStr += String.valueOf(inputList.get(i)) +"-"+ String.valueOf(inputList.get(j-1));
                        i = j;
                        break;
                    }

                }
            }

            else{
                finalStr += String.valueOf(inputList.get(i));
            }
            
        }

        return finalStr;  
    }

}
