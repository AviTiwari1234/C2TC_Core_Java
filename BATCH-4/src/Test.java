class Animal
{
	public void m (Animal a)
{
	System.out.println("Animal");
}

}

class Monkey extends Animal
{
	public void m (Monkey m1)
	{
		System.out.println("Moneky");
	}
}
class Test
{

	public static void main(String[] args) {
		

Animal a=new Animal();
a.m(a);

Monkey m1= new Monkey();
m1.m(m1);

Animal a1=new Monkey();
a1.m(a1);
	}

}
