package sqlInjection;

public class User {

	private Integer id;

	private String first_name;

	private String last_name;

	public String getFirst_name() {
		return first_name;
	}

	public Integer getId() {
		return id;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

}
