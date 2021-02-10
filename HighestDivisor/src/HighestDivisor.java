import java.util.*;
public class HighestDivisor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(num<=10)
            System.out.println(num);
        else{
            int ans=0;
            for(int i=10;i>0;i--){
                if(num%i==0){
                    ans=i;
                    break;
                }
            }
            System.out.print(ans);
        }
    }
}
