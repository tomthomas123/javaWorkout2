import java.util.*;
class Mathdtype
{

void sum1(int a,int b)
{
int r = a + b;
System.out.println(r);
}
void sum2(double a,double b)
{
double r = a + b;
System.out.println(r);
}
void sum3(int a,double b)
{
double r = a + b;
System.out.println(r);
}
}
public class dtypes
{
public static void main(String[] args)
{
Mathdtype obj = new Mathdtype();
int x = 21;
int y = 22;
obj.sum1(10,23);
obj.sum2(21.2,23.1);
obj.sum3(21,45.2);

}
}
