class Ground
{
int players;
Ground()
{}
Ground(int players)
{
this.players=players;
}
public static void main(String[] args)
{
Ground g1= new Ground()// Object Declaration g1 is the referecen, instantiation with new constructor where JVM allocates memory to the 
//object and empty initialization;

Ground g2= new Ground(6)// Object Declaration g2 is the referecen, instantiation with new constructor where JVM allocates memory to the 
//object and 6 players initialized initialization;
}
}
