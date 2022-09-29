import java.io.*;
class employee
{
static int empNo;
static int totalSalary;
static int count;
int salary;
employee(int salary)
{
// System.out.println(salary)
count=count+1;
totalSalary = totalSalary + salary;
}
void total()
{
System.out.println(count);
System.out.println(totalSalary);
}
}
public class emp
{
public static void main(String[] args)
{
employee emp1 = new employee(12000);
employee emp2 = new employee(23000);
employee emp3 = new employee(21000);
emp3.total();
}
}
