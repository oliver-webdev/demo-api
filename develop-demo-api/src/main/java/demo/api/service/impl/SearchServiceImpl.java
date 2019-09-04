package demo.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.api.dao.SearchDao;
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

}
