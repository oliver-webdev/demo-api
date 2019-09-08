package demo.api.entity;

public class CustomerNoDealing {
	private String year;
	private String name;
	private String acctNum;

	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcctNum() {
		return acctNum;
	}
	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum;
	}

	@Override
	public String toString() {
		return "CustomerNoDealing [year=" + year + ", name=" + name + ", acctNum=" + acctNum + "]";
	}
}