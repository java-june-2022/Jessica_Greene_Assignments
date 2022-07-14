
public class BatTest {
	public static void main(String[] args) {
		Bat b = new Bat();
		System.out.println(b.getEnergyLevel());
		b.attackTown();
		System.out.println(b.getEnergyLevel());
		b.attackTown();
		System.out.println(b.getEnergyLevel());
		b.attackTown();
		System.out.println(b.getEnergyLevel());
		b.eatHumans();
		System.out.println(b.getEnergyLevel());
		b.eatHumans();
		System.out.println(b.getEnergyLevel());
		b.fly();
		System.out.println(b.getEnergyLevel());
		b.fly();
		System.out.println(b.getEnergyLevel());
	}
}
