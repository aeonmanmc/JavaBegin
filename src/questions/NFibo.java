class NFibo{
    
    public static void main(String[] args) {
        
        printFibo(10);
        System.out.println(fibNth(5));
    }

    private static int fibNth(int n){
    
        if (n <= 1){
            return n;
        }        
        return fibNth(n-1) + fibNth(n-2);
    }

    private static void printFibo(int n){

        if (n < 1)
            return;

        int f1 = 0;
        int f2 = 1;

        for (int i = 0; i < n; i++){
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        System.out.println();
    }

}