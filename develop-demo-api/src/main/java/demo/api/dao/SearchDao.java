package demo.api.dao;

import java.util.List;

import demo.api.entity.CustomerMostSum;
import demo.api.entity.CustomerNoDealing;
import demo.api.model.AccountInfo;

public interface SearchDao {
	public AccountInfo selectAccountInfo (String accountNumber);
	
	public List<CustomerMostSum> selectCustomerMostSumPerYear();
	public List<CustomerNoDealing> selectCustomerNoDealing();
//	public BranchSumPerYear getSumPerYear();
//	public BranchSum getSumOfBranch();
}
