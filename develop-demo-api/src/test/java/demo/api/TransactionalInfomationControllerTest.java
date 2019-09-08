package demo.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo.api.controller.TransactionalInfomationController;
import demo.api.entity.BranchInfo;
import demo.api.entity.BranchSum;
import demo.api.entity.BranchSumPerYear;
import demo.api.entity.CustomerMostSum;
import demo.api.entity.CustomerNoDealing;
import demo.api.exception.BrCodeNotFoundException;
import demo.api.service.impl.SearchServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest
public class TransactionalInfomationControllerTest {
	
	@Autowired
	TransactionalInfomationController controller;
	
	@MockBean
	SearchServiceImpl service;
	
	@Test
	public void mostSumCustomerTest() throws Exception {

		CustomerMostSum customerMostSum = new CustomerMostSum();
		customerMostSum.setAcctNum("1111111111");
		customerMostSum.setName("TestName");
		customerMostSum.setSumAmt(123456789L);
		customerMostSum.setYear("2019");
		
		List<CustomerMostSum> expected = new ArrayList<CustomerMostSum>();
		expected.add(customerMostSum);
		
		given(this.service.getMostSumCustomer()).willReturn(expected);

		List<CustomerMostSum> actual = controller.mostSumCustomer();
		
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void noDealingCustomerTest() throws Exception {

		CustomerNoDealing customerNoDealing = new CustomerNoDealing();
		customerNoDealing.setAcctNum("1111111111");
		customerNoDealing.setName("TestName");
		customerNoDealing.setYear("2019");
		
		List<CustomerNoDealing> expected = new ArrayList<CustomerNoDealing>();
		expected.add(customerNoDealing);
		
		given(this.service.getNoDealingCustomer()).willReturn(expected);

		List<CustomerNoDealing> actual = controller.noDealingCustomer();
		
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void sumPerYearTest() throws Exception {

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
		
		BranchSumPerYear branchSumPerYear = new BranchSumPerYear();
		branchSumPerYear.setDataList(branchInfoList);
		branchSumPerYear.setYear("2019");
		
		List<BranchSumPerYear> expected = new ArrayList<BranchSumPerYear>();
		expected.add(branchSumPerYear);
		
		given(this.service.getSumPerYear()).willReturn(expected);

		List<BranchSumPerYear> actual = controller.sumPerYear();
		
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void sumOfBranchTest() throws Exception {

		String testParam = "TestString";
		
		BranchSum expected = new BranchSum();
		expected.setBrCode("123456");
		expected.setBrName("TestBranch");
		expected.setSumAmt(1111111L);
		
		given(this.service.getSumOfBranch(testParam)).willReturn(expected);

		BranchSum actual = controller.sumOfBranch(testParam);
		
		assertThat(actual).isEqualTo(expected);
	}

	@Test(expected = BrCodeNotFoundException.class)
	public void sumOfBranchTest_Exception() throws Exception {

		String testParam = "분당점";		
		
		controller.sumOfBranch(testParam);
	}
}
