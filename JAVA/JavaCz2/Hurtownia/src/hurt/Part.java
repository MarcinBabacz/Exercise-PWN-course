package hurt;

public class Part {
	private String idNumber;
	private String producent;
	private String model;
	private String seria;
	
	public String getProducent() {
		return producent;
	}

	public void setProducent(String producent) {
		this.producent = producent;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSeria() {
		return seria;
	}

	public void setSeria(String seria) {
		this.seria = seria;
	}

	public String getIdNumber() {
		return idNumber;
	}

	protected void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	Part(){
		
	}
}
