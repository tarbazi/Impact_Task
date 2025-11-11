package numberrangesummarizer;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NumberRangeMain implements NumberRangeSummarizer {
    
    public NumberRangeMain(){
    
    }
    
    @Override
    public Collection<Integer> collect(String input){
        
        String[] myTempArr = input.split(",");
        List<Integer> myTempCollection = new ArrayList<>();

        for (String tempStr: myTempArr){
            myTempCollection.add(Integer.parseInt(tempStr));
        }

        Collections.sort(myTempCollection);
        
        return myTempCollection;

    }

    @Override
    public String summarizeCollection(Collection<Integer> input){
        
        String finalStr = "";

        List<Integer> inputList = new ArrayList<>(input); 

        for (int i = 0; i < inputList.size(); i++ ){

            if (i != 0){
                finalStr += ", ";
            }   // comma seperating if-statement

            
            if ((i+1) == inputList.size()){
                finalStr += String.valueOf(inputList.get(i));
            }   // append non-ranged last value   
            
            else if (inputList.get(i) + 1 == inputList.get(i+1)){

                boolean check = false;  // checks if for loop is executed

                for (int j = i + 2; j < inputList.size(); j++){

                    check = true;
                    
                    if ((inputList.get(j-1) + 1 != inputList.get(j))){
                        finalStr += String.valueOf(inputList.get(i)) + "-" + String.valueOf(inputList.get(j-1));
                        i = j-1;
                        break;
                    }

                    else if (j+1 == inputList.size()){
                        finalStr += String.valueOf(inputList.get(i)) + "-" + String.valueOf(inputList.get(j)); 
                        i = j+1;  
                    }

                }   // loops  through a range numbers

                if (check == false){
                    finalStr += String.valueOf(inputList.get(i)) + "-" + String.valueOf(inputList.get(i+1));
                    i++;
                }   // if loop wasn't executed append existing 2 value range
            }

            else{
                finalStr += String.valueOf(inputList.get(i));
            }   // append non-ranged value
            
        }

        return finalStr;  
    }

}
