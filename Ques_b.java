import java.util.*;
class Ques_b 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int res=solve(str1,str2);
        System.out.println(res);
        sc.close();
    }
    public static int solve(String s1,String s2)
    {
        char ch=s2.charAt(s2.length()-1);
        int add=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==ch)
              add+=1;
        }
        return add;
    }
}
