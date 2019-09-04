package demo.api.entity;

public class CustomerMostSumAmount {
	private Long year;
	private String name;
	private String accNo;
	private Long sumAmt;
	
	public CustomerMostSumAmount() {}

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

	public Long getSumAmt() {
		return sumAmt;
	}

	public void setSumAmt(Long sumAmt) {
		this.sumAmt = sumAmt;
	}

	@Override
	public String toString() {
		return "CustomerMostSumAmount [year=" + year + ", name=" + name + ", accNo=" + accNo + ", sumAmt=" + sumAmt
				+ "]";
	}	
}
