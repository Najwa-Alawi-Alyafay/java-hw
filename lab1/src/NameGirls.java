/**
 * Created by TOSHIBA on 15/01/22.
 */
import java.util.Scanner;

/**
 * Created by TOSHIBA on 15/01/22.
 */
public class NameGirls {
    public static void main(String[] args)
   {
          Girls[] team=new Girls[3];

                  // Girls s1=new Girls(1,"jojo");
                 //Girls s2=new Girls(2,"joj");
                //Girls s3=new Girls(3,"jo");
               //team[0]=s1;
              // team[2]=s2;
             // team[3]=s3;
       Scanner in=new Scanner(System.in);
                  System.out.println("enter id & name");
      for (int i = 0; i <team.length ; i++)
    {
        Girls x=new Girls(in.nextInt(),in.next());
            team[i]=x;
    }
       for (int i = 0; i <team.length ; i++)
    {
                 System.out.println(team[i].toString());
    }}}











}
