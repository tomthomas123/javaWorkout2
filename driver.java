class Employee
{
String Name;
int Emp_ID;
int result;
int ass1,ass2,ass3;

Employee(int a,int b,int c)
{
int tot = a+b+c;
float perc = tot/3 ;
System.out.println(perc);
System.out.println(tot);
}

void sum_of_ass(int a,int b,int c)
{
int total = a + b + c;
if(total>75)
{
System.out.println("Promoted");
}
else
{
System.out.println("Demoted");
}
}


}

public class driver
{
public static void main(String[] args)
{
Employee E1 = new Employee(20,30,10);
E1.sum_of_ass(20,30,10);
//E1.percentage(20,30,10);
}
}