package demo.api.entity;

public class BranchInfo {
	private String brName;
	private String brCode;
	private Long sumAmt;

	public String getBrName() {
		return brName;
	}
	public void setBrName(String brName) {
		this.brName = brName;
	}
	public String getBrCode() {
		return brCode;
	}
	public void setBrCode(String brCode) {
		this.brCode = brCode;
	}
	public Long getSumAmt() {
		return sumAmt;
	}
	public void setSumAmt(Long sumAmt) {
		this.sumAmt = sumAmt;
	}

	@Override
	public String toString() {
		return "BranchInfo [brName=" + brName + ", brCode=" + brCode + ", sumAmt=" + sumAmt + "]";
	}
}
