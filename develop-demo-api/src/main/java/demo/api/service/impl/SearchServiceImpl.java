package demo.api.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.api.dao.SearchDao;
import demo.api.entity.BranchInfo;
import demo.api.entity.BranchSum;
import demo.api.entity.BranchSumPerYear;
import demo.api.entity.CustomerMostSum;
import demo.api.entity.CustomerNoDealing;
import demo.api.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	private SearchDao dao;

	@Override
	public List<CustomerMostSum> getMostSumCustomer() {
		return dao.selectCustomerMostSumPerYear();
	}

	@Override
	public List<CustomerNoDealing> getNoDealingCustomer() {
		return dao.selectCustomerNoDealing();
	}

	@Override
	public List<BranchSumPerYear> getSumPerYear() {
		
		List<String> targetYear = dao.selectTargetYear();
		List<BranchSumPerYear> resultList =  new ArrayList<BranchSumPerYear>(); 
		
		for (Iterator<String> itr = targetYear.iterator(); itr.hasNext();) {
			String year =  itr.next();
			List<BranchInfo> data = dao.selectBranchSumPerYear(year);
			BranchSumPerYear result = new BranchSumPerYear(year, data);
			resultList.add(result);
		}
		
		return resultList;
	}

	@Override
	public BranchSum getSumOfBranch(String brName) {

		String brCode = dao.selectCodeAndNameOfBranch(brName);
		
		List<String> brNameList = new ArrayList<String>();		
		if (brName.equals("판교점")) {
			brNameList.add(brName);
			brNameList.add("분당점");
		} else {
			brNameList.add(brName);
		}
		Long sumAmt = dao.selectSumAmtOfBranch(brNameList);
		
		return new BranchSum(brName, brCode, sumAmt);
	}
}
