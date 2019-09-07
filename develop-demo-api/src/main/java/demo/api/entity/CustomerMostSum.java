package demo.api.entity;

public class CustomerMostSum {
	private String year;
	private String name;
	private String acctNum;
	private Long sumAmt;

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
	public Long getSumAmt() {
		return sumAmt;
	}
	public void setSumAmt(Long sumAmt) {
		this.sumAmt = sumAmt;
	}

	@Override
	public String toString() {
		return "CustomerMostSum [year=" + year + ", name=" + name + ", acctNum=" + acctNum + ", sumAmt=" + sumAmt + "]";
	}
}
