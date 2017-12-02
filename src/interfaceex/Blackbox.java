package interfaceex;

public class Blackbox {

	private Fish fish;

	public Fish getFish() {
		return fish;
	}

	public void setFish(Fish fish) {
		this.fish = fish;
	}

	public void showFishProperties() {
		fish.stateName();
	}
}
