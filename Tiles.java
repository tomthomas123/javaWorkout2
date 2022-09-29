import java.util.*;
class Tile
{

Scanner one = new Scanner(System.in);

int edge_lenght = one.nextInt();

//void num()
//{
//System.out.println(edge_lenght);
//}
}
class Floor
{
Scanner two = new Scanner(System.in);

int lenght = two.nextInt();

int width = two.nextInt();

void totalTiles(Tile t)
{
int sum = t.edge_lenght + lenght + width ;
System.out.println(sum);
}

}

public class Tiles
{
public static void main(String[] args)
{
Tile t = new Tile();
Floor flo = new Floor();
flo.totalTiles(t);
}
}