import java.util.*;

class SumTwo{

    public static void main(String[] args) {
        
        int[] arr = {10,5,-5,-10};
        List<Tuple> tuples = findTuples(arr, 0);
        printTuple(tuples);
    }

    private static List<Tuple> findTuples(int[] arr, int n){

        List<Tuple> tuples = new ArrayList<>();

        for(int i = 0; i < arr.length;i++){
            for(int j = i+1; j < arr.length;j++){
                
                if(n == (arr[i]+arr[j])){
                    tuples.add(new Tuple(arr[i],arr[j]));
                }
            }
        }

        return tuples;
    }

    private static void printTuple(List<Tuple> tuples){

        for(Tuple t: tuples){
            System.out.println("(" + t.x + "," + t.y + ")");
        }
    }

    private static class Tuple{

        private int x, y;

        public Tuple(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}