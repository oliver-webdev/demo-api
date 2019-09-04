package demo.api.entity;

public class CustomerNoDealing {
	private Long year;
	private String name;
	private String accNo;

	public Long getYear() {
		return year;
	}
	public void setYear(Long year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	@Override
	public String toString() {
		return "CustomerNoDealing [year=" + year + ", name=" + name + ", accNo=" + accNo + "]";
	}
}
