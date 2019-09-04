package demo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.api.model.AccountInfo;
import demo.api.service.SearchService;

@Controller
public class TransactionalInfomationController {

	@Autowired
	SearchService service;
	
	@ResponseBody 
	@RequestMapping(value = "/accountInfo")
	public AccountInfo getAccountInfo(@RequestParam String accountNum) {
		return service.getAccountInfo(accountNum);
	}
}
