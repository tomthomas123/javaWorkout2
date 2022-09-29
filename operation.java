import java.util.*;
import java.lang.Math;
class mathOperation
{
// Scanner obj1 = new Scanner(System.in);
// int x = obj1.nextInt();
// int y = obj1.nextInt();
int R;
void sum(int a , int b)
{
R = a + b;
// return R;
System.out.println(R);
}
void mul(int a,int b)
{
R = a * b;
// return R;
System.out.println(R);
}
void sub(int a ,int b)
{
R = a - b;
// return R;
System.out.println(R);
}
void pow(int a,int b)
{

double R = Math.pow(a, b);
System.out.println(R);
}
}
public class operation
{
public static void main(String[] args)
{
mathOperation abc = new mathOperation();
Scanner obj1 = new Scanner(System.in);
int x = obj1.nextInt();
int y = obj1.nextInt();
abc.sum(x,y);
abc.mul(x,y);
abc.sub(x,y);
abc.pow(x,y);
}
}