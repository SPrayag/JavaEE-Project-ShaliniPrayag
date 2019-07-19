package com.qa.service;

import javax.inject.Inject;

import com.qa.persistence.repository.UserAccountRepository;

public class UserAccountServiceImpl {

	@Inject
	private UserAccountRepository repo;

	@Override
	public String getAllAccounts() {
		return this.repo.getAllAccounts();
	} 

	@Override
	public String createAccount(String account) {
		return this.repo.createAccount(account);
	}

	@Override
	public String deleteAccount(int accountId) {
		return this.repo.deleteAccount(accountId);
	}

	@Override
	public String updateAccount(int accountId, String account) {
		return this.repo.updateAccount(accountId, account);
	}

	/*
	 * @Override public List<UserAccount> findAccountsByFirstName(String firstName)
	 * { return this.repo.findAccountsByFirstName(firstName); }
	 */

}
