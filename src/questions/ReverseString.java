class ReverseString{

    public static void main(String[] args) {
        
        String word = "mana";
        System.out.println("Opposite of " + word + " : " + reverseString2(word));
    }

    private static String reverseString1(String text){
        return new StringBuilder(text).reverse().toString();
    }

    private static String reverseString2(String text){

        char[] arr = text.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while(start < end){

            char temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
        return new String(arr);
    }
}