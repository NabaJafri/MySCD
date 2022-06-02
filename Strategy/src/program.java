interface RightHand{
	void gun();
}
interface LeftHand{
	void shield();
}
class Rifle implements RightHand{

	@Override
	public void gun() {
		System.out.println("This is a rifle");
		
	}
	
}
class Shotgun implements RightHand{
	public void gun()
	{
		System.out.println("This is a shotgun");
	}
}
class WoodenShield implements LeftHand{
	public void shield()
	{
		 System.out.println("This is a wooden shield");
	}
}
class MetalShield implements LeftHand{
	public void shield()
	{
		System.out.println("This is a metal shield");
	}
}
class Weapon{
	RightHand rh;
	LeftHand lh;
	public void UseRightHand()
	{
		rh.gun();
	}
	public void UseLeftHand()
	{
		lh.shield();
	}
}
class PersonA extends Weapon
{
	PersonA()
	{
		rh= new Shotgun();
		lh = new MetalShield();
	}
}
class PersonB extends Weapon{
	PersonB()
	{
		rh = new Rifle();
		lh = new WoodenShield();
	}
}


public class program {

	public static void main(String[] args) {
		Weapon w1 = new PersonA();
		w1.UseLeftHand();
		w1.UseRightHand();
		
		Weapon w2= new PersonB();
		w2.UseRightHand();
		w2.UseLeftHand();

	}

}
