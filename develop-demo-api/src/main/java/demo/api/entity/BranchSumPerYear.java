package demo.api.entity;

import java.util.List;

public class BranchSumPerYear {
	private String year;
	private List<BranchInfo> dataList;
	
	public BranchSumPerYear() {}
	
	public BranchSumPerYear(String year, List<BranchInfo> dataList) {
		this.year = year;
		this.dataList = dataList;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public List<BranchInfo> getDataList() {
		return dataList;
	}

	public void setDataList(List<BranchInfo> dataList) {
		this.dataList = dataList;
	}

	@Override
	public String toString() {
		return "BranchSumPerYear [year=" + year + ", dataList=" + dataList + "]";
	}
}
