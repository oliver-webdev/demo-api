package demo.api.service;

import demo.api.model.AccountInfo;

public interface SearchService {
	AccountInfo getAccountInfo(String accountNumber);
}
