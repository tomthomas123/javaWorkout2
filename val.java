import java.io.*;
class values
{
int temp,a=10,b=20;
void call_by_value(int a,int b)
{
temp = a;
a = b;
b = temp;
System.out.println(a);
System.out.println(b);
}
void call_by_reference(values v)
{
v.temp = v.a;
v.a = v.b;
v.b = v.temp;
System.out.println(a);
System.out.println(b);
}
}
public class val
{
public static void main(String[] args)
{
values v = new values();
v.call_by_value(10,20);
v.call_by_reference(v);
}
}