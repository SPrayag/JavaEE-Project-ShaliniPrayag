package com.qa.service;

public interface UserAccountService {
	
	String getAllAccounts();
	String createAccount(String account);
	String deleteAccount(int accoundId);
	String updateAccount(int accountId, String account);
	//List<UserAccounts> findAccountsByFirstName(String firstName);
}
