import java.io.*;
import java.util.*;
class employee
{
String name;
int emp_id,result;
Scanner sc = new Scanner(System.in);
int ass1 = sc.nextInt();
int ass2 = sc.nextInt();
int ass3 = sc.nextInt();
employee()
{
}
void update()
{
result = ass1+ass2+ass3;
if(result>70)
{
System.out.println("Promoted");
}
else
{
System.out.println("Demoted");
}
}
int total(int ass1,int ass2,int ass3)
{
result = ass1+ass2+ass3;
// System.out.println(result);
return result;
}
void perc(int ass1 ,int ass2,int ass3)
{
result = ass1+ass2+ass3;
float percen = (result/3);
System.out.println(percen);
}
}
public class driv
{
public static void main(String[] args)
{
employee e1 = new employee();
// int ass1 = 30;
// int ass2 = 12;
// int ass3 = 23;
e1.update();
e1.total(30 ,40,20);
e1.perc(30,12,23);
}
}