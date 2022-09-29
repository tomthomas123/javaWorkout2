import java.util.*;
class Rectangle
{
int length,breath;
//static int breath=21;
Rectangle(int lenght)
{
int sum = lenght + breath ; 
System.out.println(sum);
}
Rectangle(int lenght,int breath)
{
// int sum = 2 * breath;
System.out.println(lenght);
System.out.println(breath);
}
void getArea(int length,int breath)
{
int Area = length * breath ;
System.out.println(Area); 
}
void getPerimeter(int length,int breath)
{
int su = length + breath ;
int perimeter = 2 * su;
// int perimeter = 2(length + breath);
System.out.println(perimeter);
}
}
public class Rect
{
public static void main(String[] args)
{
Rectangle obj = new Rectangle(21);
Rectangle obj1 = new Rectangle(21 , 10);
obj.getArea(21,32);
obj.getPerimeter(21,32);
}
}