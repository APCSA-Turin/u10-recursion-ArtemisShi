public class main{
    private static int counter=0;
public static void main(String[] args) {
    int n=40;
        long startTime = System.nanoTime();
    int fibRec = fibonacci(n);
    long endTime = System.nanoTime();
    long recursiveTime = endTime - startTime;


    startTime = System.nanoTime();
    int fibIter = iterativeFib(n);
    endTime = System.nanoTime();
    long iterativeTime = endTime - startTime;
    System.out.println("Fibonacci(" + n + ")");

    System.out.println("Recursive: " + fibonacci(n)+ " | Time: " + recursiveTime / 1e6 + " ms");
    System.out.println("Iterative: " + iterativeFib(n) + " | Time: " + iterativeTime / 1e6 + " ms");
}



private static int fibonacci(int x) {
//     counter++;
// System.out.println("method called: "+counter);

    if (x == 1) {
        return 0;
    }
    if (x == 2) {
        return 1;
    }
    // double recursive method call

    return fibonacci(x - 1) + fibonacci(x - 2);
}
public static int iterativeFib(int n){
    int count=0;
    int fib=1;
    int prev=0;
    int place=0;
    
    for(int i=1; i<n;i++){
        
    place=fib;
    fib+=prev;
    prev=place;
    }
    return prev;
    }
    

}