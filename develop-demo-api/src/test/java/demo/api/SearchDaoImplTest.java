package demo.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo.api.dao.SearchDao;
import demo.api.entity.BranchInfo;
import demo.api.entity.BranchSum;
import demo.api.entity.BranchSumPerYear;
import demo.api.entity.CustomerMostSum;
import demo.api.entity.CustomerNoDealing;
import demo.api.service.impl.SearchServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest
public class SearchDaoImplTest {

	@Autowired
	SearchServiceImpl service;
	
	@MockBean
	SearchDao dao;

	@Test
	public void getMostSumCustomerTest() {
		
		CustomerMostSum customerMostSum = new CustomerMostSum();
		customerMostSum.setAcctNum("1111111111");
		customerMostSum.setName("TestName");
		customerMostSum.setSumAmt(123456789L);
		customerMostSum.setYear("2019");
		
		List<CustomerMostSum> expected = new ArrayList<CustomerMostSum>();
		expected.add(customerMostSum);
		
		given(this.dao.selectCustomerMostSumPerYear()).willReturn(expected);

		List<CustomerMostSum> actual = service.getMostSumCustomer();
		
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void getNoDealingCustomerTest() {

		CustomerNoDealing customerNoDealing = new CustomerNoDealing();
		customerNoDealing.setAcctNum("1111111111");
		customerNoDealing.setName("TestName");
		customerNoDealing.setYear("2019");
		
		List<CustomerNoDealing> expected = new ArrayList<CustomerNoDealing>();
		expected.add(customerNoDealing);
		
		given(this.dao.selectCustomerNoDealing()).willReturn(expected);

		List<CustomerNoDealing> actual = service.getNoDealingCustomer();
		
		assertThat(actual).isEqualTo(expected);
		
	}

	@Test
	public void getSumPerYearTest() {
		
		List<String> expectedYearList = new ArrayList<String>();
		expectedYearList.add("2019");

		BranchInfo branchInfo1 = new BranchInfo();
		branchInfo1.setBrCode("123456");
		branchInfo1.setBrName("TestBranch");
		branchInfo1.setSumAmt(123456789L);
		
		BranchInfo branchInfo2 = new BranchInfo();
		branchInfo2.setBrCode("999999");
		branchInfo2.setBrName("TestBranch");
		branchInfo2.setSumAmt(555555555L);
		
		List<BranchInfo> branchInfoList = new ArrayList<BranchInfo>();
		branchInfoList.add(branchInfo1);
		branchInfoList.add(branchInfo2);
		
		BranchSumPerYear result = new BranchSumPerYear("2019", branchInfoList);
		List<BranchSumPerYear> expected = new ArrayList<BranchSumPerYear>();
		expected.add(result);
		
		given(this.dao.selectTargetYear()).willReturn(expectedYearList);
		given(this.dao.selectBranchSumPerYear("2019")).willReturn(branchInfoList);
		
		List<BranchSumPerYear> actual = service.getSumPerYear();
		
		assertThat(actual.size()).isEqualTo(expected.size());		
		assertThat(actual.get(0).getYear()).isEqualTo(expected.get(0).getYear());		
		assertThat(actual.get(0).getDataList()).isEqualTo(expected.get(0).getDataList());		
	}

	@Test
	public void getSumOfBranchTest() {
		
		String expectedBrName = "판교점";
		String expectedBrCode = "111111";
		Long expectedSumAmt = 1000000L;

		List<String> brNameList = new ArrayList<String>();
		brNameList.add(expectedBrName);
		
		BranchSum expected = new BranchSum(expectedBrName, expectedBrCode, expectedSumAmt);
		
		given(this.dao.selectCodeAndNameOfBranch(expectedBrName)).willReturn(expectedBrCode);
		given(this.dao.selectSumAmtOfBranch(Lists.newArrayList("판교점", "분당점"))).willReturn(expectedSumAmt);
		
		BranchSum actual = service.getSumOfBranch(expectedBrName);
		
		assertThat(actual.getBrCode()).isEqualTo(expected.getBrCode());				
		assertThat(actual.getBrName()).isEqualTo(expected.getBrName());				
		assertThat(actual.getSumAmt()).isEqualTo(expected.getSumAmt());				
	}
}
