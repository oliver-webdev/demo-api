package demo.api.dao;

import java.util.List;

import demo.api.entity.BranchInfo;
import demo.api.entity.CustomerMostSum;
import demo.api.entity.CustomerNoDealing;

public interface SearchDao {
	public List<CustomerMostSum> selectCustomerMostSumPerYear();
	public List<CustomerNoDealing> selectCustomerNoDealing();
	public List<String> selectTargetYear();
	public List<BranchInfo> selectBranchSumPerYear(String year);
	public String selectCodeAndNameOfBranch(String brName);
	public Long selectSumAmtOfBranch(List<String> brNameList);
}
