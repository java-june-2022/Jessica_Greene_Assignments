
public class Mammal {
	private int energyLevel;
	public Mammal() {
		energyLevel = 100;
	}
	public int displayEnergy() {
		System.out.println();
		return energyLevel;
	}
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}