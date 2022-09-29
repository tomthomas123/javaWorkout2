import java.io.*;
import java.util.*;
class instance
{
static int count;
instance()
{
count+= 1;
}

public static void main(String[] args)
{


instance a1 = new instance();
instance a2 = new instance();
instance a3 = new instance();
instance a4 = new instance();

System.out.println(count);
}
}