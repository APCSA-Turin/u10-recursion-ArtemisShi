public class Summing {  
    public static void main(String[] args) {      
      System.out.println(sum(6));  // should print 21
      System.out.println(sum(10)); // should print 55
      System.out.println(sum(100)); // should print 5050
    }
  
    public static int sum(int n) {
      if(n==0){
        return n;
      }
      else{
        return sum(n-1)+n;
      }
    }
  }
  