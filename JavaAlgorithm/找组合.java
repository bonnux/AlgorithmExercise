import java.util.Scanner;
 
public class Test12 { 
	public static void main(String[] args) {
     	Scanner sc =new Scanner(System.in);  
		int n = sc.nextInt();  
		int res,yushu,res6=0,m;  
		while (n>0){ 
			if (n%8==0){
                res=n/8;  
				System.out.println(res);  
				return;  
	     } else {
              yushu = n % 8;  res = n / 8;  
			  if(yushu % 6 == 0){
              res6 =yushu/6;  
			   } else {
					while (yushu % 6 != 0){
                        m=n-(res-1)*8;  
						yushu = m % 6;  
						res=res-1; 
						if(res<1){
                            System.out.println(-1);  
							return ;  
						}
                        res6=m/6; 
               }
          }
           System.out.println(res+res6);  
              return;  
          }
       }
   }
}