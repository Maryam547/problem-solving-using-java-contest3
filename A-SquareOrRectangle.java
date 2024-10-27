import java.util.Scanner;
public class SquareOrRectangle {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long N = myObj.nextLong();
        long sum =0;
        for(int i=1;i<=N;i++){
            long w = myObj.nextLong();
            long h = myObj.nextLong();
            if(w==h){
                System.out.println("Square");
            }else{
                System.out.println("Rectangle");
            }
        }
    }
}
