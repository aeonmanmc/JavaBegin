class LetterToNum{

    public static void main(String[] args) {
        
        String text = "dog";
        System.out.println(text + " : " + changeToNum(text));
    }

    // a = 97 in ASCII
    private static String changeToNum(String text){

        char[] arr = text.toCharArray();
        String retText = "";
        for(char ch:arr){
            retText += " " + String.valueOf(ch - 'a' + 1);
        }
        return retText;
    }
}