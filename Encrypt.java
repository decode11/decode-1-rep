import java.io.*;
import java.util.*;
class Encrypt
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the word");
String s = sc.nextLine();
System.out.println("Enter the key for encryption");
int ek = sc.nextInt();
String ss = "",sp = "";
for(int i=0;i<s.length();i++)
{
char d = s.charAt(i);
int p =(int)d;
p = p + ek;
d = (char)p;
ss = ss+d;
}
System.out.println("Encrypted word  ="+ss);
System.out.println("Enter the key of decryption");
int dk = sc.nextInt();				
if(ek==dk)
{
for(int j = 0;j<ss.length();j++)
{
char e = ss.charAt(j);
int u = (int)e;
u = u - dk;
e = (char)u;
sp = sp+e;
}
System.out.println("Decrypted word   ="+sp);
}
else
System.out.println("Wrong input");
}
}
