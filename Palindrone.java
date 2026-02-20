public class Palindrone {
       public static void main(String[] args){
              int n = 121;
              int rev = 0;
              int x = n;
              while( n > 0){
                int r = n%10; // Find Remainder
                 rev = (rev*10) +r;
                 n = n/10;
              }
            //   System.out.println(rev);
              if(x == rev){
                System.out.println("Palindrone Number :");
              }
              else {
                  System.out.println("Not Palindrone");
              }

       }
}
