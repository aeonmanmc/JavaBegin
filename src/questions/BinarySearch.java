class BinarySearch{

    public static void main(String[] args) {
        
        String[] arr = {"apple", "ball", "cat", "teo", "zoo"};
        String word = "ball";
        System.out.println("Index of " + word + " : " + String.valueOf(binarySearch(arr, word)));
    }

    public static int binarySearch(String[] words, String value) {
        
        int start = 0;
        int end = words.length-1;
        int mid = (start + end) / 2;
        
        while(start <= end){

            System.out.println(words[mid] + " : " + value);
            System.out.println("Compare result : " + words[mid].compareTo(value));
            if (words[mid].equals(value)) {
                return mid;
            } else if(words[mid].compareTo(value) > 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
            System.out.println("Start : " + start + " End : " + end + " Mid: " + mid);
            System.out.println();
        }
        return -1;
    }
    
}