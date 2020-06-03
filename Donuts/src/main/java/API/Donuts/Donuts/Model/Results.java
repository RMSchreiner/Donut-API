package API.Donuts.Donuts.Model;

public class Results {
	
	private int id;
	private String ref;
	private String name;
	
	public Results() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Results [id=" + id + ", ref=" + ref + ", name=" + name + "]";
	}

	
	
	
}
