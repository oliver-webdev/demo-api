package demo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.api.entity.BranchSum;
import demo.api.entity.BranchSumPerYear;
import demo.api.entity.CustomerMostSum;
import demo.api.entity.CustomerNoDealing;
import demo.api.exception.BrCodeNotFoundException;
import demo.api.service.SearchService;

@RestController
@RequestMapping("/api")
public class TransactionalInfomationController {

	@Autowired
	SearchService service;
	
	@ResponseBody 
	@RequestMapping(method = RequestMethod.GET, path="/mostSumCustomer")
	public List<CustomerMostSum> mostSumCustomer() {
		return service.getMostSumCustomer();
	}

	@ResponseBody 
	@RequestMapping(method = RequestMethod.GET, path="/noDealingCustomer")
	public List<CustomerNoDealing> noDealingCustomer() {
		return service.getNoDealingCustomer();
	}

	@ResponseBody 
	@RequestMapping(method = RequestMethod.GET, path="/sumPerYear")
	public List<BranchSumPerYear> sumPerYear() {
		return service.getSumPerYear();
	}

	@ResponseBody 
	@RequestMapping(method = RequestMethod.POST, path="/sumOfBranch")
	public BranchSum sumOfBranch(@RequestParam String brName) {
		if (brName.equals("분당점")) {
			throw new BrCodeNotFoundException("br code not found error");
		}
		return service.getSumOfBranch(brName);
	}
}
