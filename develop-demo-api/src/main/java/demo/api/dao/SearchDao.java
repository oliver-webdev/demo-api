package demo.api.dao;

import demo.api.model.AccountInfo;

public interface SearchDao {
	public AccountInfo selectAccountInfo (String accountNumber);
}
