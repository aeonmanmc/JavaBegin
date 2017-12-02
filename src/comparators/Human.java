package comparators;

public class Human implements Comparable<Human> {

	private int id;
	private String hometown;
	private String name;

	public Human(int id, String hometown, String name) {
		this.id = id;
		this.hometown = hometown;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getHometown() {
		return hometown;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Human h) {

		// ascending order
		return this.getName().compareTo(h.getName());
		// return this.getId() - h.getId();

		// desscending order
		// return h.getName().compareTo(this.getName());
		// return h.getId() - this.getId();
	}
}
