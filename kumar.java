import java.util.Scanner;
public class Ravi {
    public static void main(String[] args) {
      
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      int x=0,y=0;
      int r=n%4;
      int q=n/4;
      switch(r)
      {
        case 1:
          x=10;
          y=0;
          while(q>0)
          {
            x+=20;
            y+=20;
            q--;
          }
          y*=(-1);
          break;
          case 2:
          x=10;
          y=20;
          while(q>0)
          {
            x+=20;
            y+=20;
            q--;
          }
         break;
          case 3:
          x=20;
          y=20;
          while(q>0)
          {
            x+=20;
            y+=20;
            q--;
          }
          x*=(-1);
          case 0:
          x=20;
          y=20;
          while(q>0)
          {
            x+=20;
            y+=20;
            q--;
          }
          y*=(-1);
          x*=(-1);
      }
      
      System.out.println(x+" "+y);
      

    }
}
