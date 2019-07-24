import java.io.*;
import java.util.*;
class rently
{
    public static void main(String args[])
    {
        Scanner z=new Scanner(System.in);
        String s=z.nextLine();
        int n=z.nextInt();
        int n1=n/10;
        int n2=n%10;
        String[] str=s.split(" ");
        String a1=str[n1-1];
        String a2=str[n2-1];
        int l1=a1.length();
        int l2=a2.length();
        String b1="",b2="",c1="",c2="";
        if(l1%2==0)
        {
            b1+=a1.substring(0,l1/2);
            c1+=a1.substring(l1/2,l1);
        }
        else
        {
            b1+=a1.substring(0,(l1/2)+1);
            c1+=a1.substring(l1/2,l1);
        }
        if(l2%2==0)
        {
            b2+=a2.substring(0,l2/2);
            c2+=a2.substring(l2/2,l2);
        }
        else
        {
            b2+=a2.substring(0,(l2/2)+1);
            c2+=a2.substring(l2/2,l2);
        }
        String rev1="",rev2="";
        int ll1=b1.length();
        int ll2=b2.length();
        for(int i=ll1;i>0;i--)
        {
            rev1+=b1.substring(i-1,i);
        }
        for(int i=ll2;i>0;i--)
        {
            rev2+=b2.substring(i-1,i);
        }
        String fin1=rev1+c1;
        String fin2=rev2+c2;
        String fin=fin1+" "+fin2;
        System.out.println(fin);
    }
}
/*INPUT:
Today is a Nice Day
41
OUTPUT:
iNce doTday
INPUT:
Hello Sam Have a Nice Day
35
OUTPUT:
aHve iNce
*/

