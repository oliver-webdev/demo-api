package demo.api.service;

import java.util.List;

import demo.api.entity.BranchSum;
import demo.api.entity.BranchSumPerYear;
import demo.api.entity.CustomerMostSum;
import demo.api.entity.CustomerNoDealing;

public interface SearchService {
	List<CustomerMostSum> getMostSumCustomer();
	List<CustomerNoDealing> getNoDealingCustomer();
	List<BranchSumPerYear> getSumPerYear();
	BranchSum getSumOfBranch(String brName);
}
