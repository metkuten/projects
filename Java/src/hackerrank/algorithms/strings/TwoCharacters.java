package hackerrank.algorithms.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TwoCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String inputString = scanner.next();
        String tempStr = inputString;
        int counter = 0;

        List<Character> charMap = new ArrayList<>();
        for(int i =0; i <input ; i ++){
            char charVal = inputString.charAt(i);
            if(!charMap.contains(charVal)){
                charMap.add(charVal);
            }
        }

        for(int i = 0 ; i<charMap.size();i++){
            if(i == 0){
                tempStr = inputString;
            } else {
                tempStr = tempStr.replaceAll(charMap.get(i).toString(),"");
            }


            String twoString = tempStr.substring(0,2);
            String [] tempArray = tempStr.split("(?<=\\G.{2})");
            for(int j=0; j<tempArray.length-1;j++){

                if(tempArray[j].length() ==1){
                    if(!tempArray[j].equals(twoString.indexOf(0))){
                        break;
                    }
                } else if(!tempArray[j].equals(twoString) && j!= 0 ){
                    break;
                } else if(j!= 0){
                    counter++;
                }
            }
            tempStr = inputString;
        }

        System.out.println(counter);

    }
}
