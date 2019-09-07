package demo.api.service;

import java.util.List;

import demo.api.entity.CustomerMostSum;
import demo.api.entity.CustomerNoDealing;
import demo.api.model.AccountInfo;

public interface SearchService {
	AccountInfo getAccountInfo(String accountNumber);
	
	List<CustomerMostSum> getMostSumCustomer();
	List<CustomerNoDealing> getNoDealingCustomer();
//	BranchSumPerYear getSumPerYear();
//	BranchSum getSumOfBranch(String brName);
}
