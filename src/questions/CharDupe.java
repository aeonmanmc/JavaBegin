import java.util.*;

class CharDupe{

    private static Map<String, Integer> charMap = new HashMap<>();
    
    public static void main(String[] args) {
        
        String text = "a@m@3g";
        countDupe(text);
        System.out.println(charMap.get("@"));
    }

    private static void countDupe(String text){

        char[] arr = text.toCharArray();
        for(char c: arr){
            if(charMap.containsKey(String.valueOf(c))){
                charMap.put(String.valueOf(c), charMap.get(String.valueOf(c))+1);
            }else{
                charMap.put(String.valueOf(c), 1);
            }
        }
    }

}