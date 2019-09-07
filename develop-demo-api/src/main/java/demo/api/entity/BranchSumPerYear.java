package demo.api.entity;

import java.util.List;

public class BranchSumPerYear {
	private Long year;
	private List<BranchInfo> branchInfoList;

	public Long getYear() {
		return year;
	}
	public void setYear(Long year) {
		this.year = year;
	}
	public List<BranchInfo> getBranchInfoList() {
		return branchInfoList;
	}
	public void setBranchInfoList(List<BranchInfo> branchInfoList) {
		this.branchInfoList = branchInfoList;
	}

	@Override
	public String toString() {
		return "BranchSumAmountSortDesc [year=" + year + ", branchInfoList=" + branchInfoList + "]";
	}	
}
