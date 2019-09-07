package demo.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.api.dao.SearchDao;
import demo.api.entity.CustomerMostSum;
import demo.api.entity.CustomerNoDealing;
import demo.api.model.AccountInfo;
import demo.api.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	private SearchDao dao;

	@Override
	public AccountInfo getAccountInfo(String accountNumber) {
		return dao.selectAccountInfo(accountNumber);
	}

	@Override
	public List<CustomerMostSum> getMostSumCustomer() {
		return dao.selectCustomerMostSumPerYear();
	}

	@Override
	public List<CustomerNoDealing> getNoDealingCustomer() {
		return dao.selectCustomerNoDealing();
	}

//	@Override
//	public BranchSumPerYear getSumPerYear() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public BranchSum getSumOfBranch(String brName) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
