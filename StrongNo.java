import java.util.*;
public class StrongNo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int a = sc.nextInt();int temp=a;
        int sum=0;
        while(a>0){
            int last = a%10;
            int ans =1;
            for(int i=2;i<=last;i++){
                ans*=i;
            }
            sum+=ans;
            a/=10;
        }
        if(sum==temp)
        System.out.println("StrongNo");
        else
        System.out.println("Not a StrongNo");


    }
    
}
