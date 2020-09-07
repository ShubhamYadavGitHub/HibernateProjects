package com.oehm4.basics.utils;

import com.oehm4.basics.dao.AccountDAO;
import com.oehm4.basics.dto.AccountDTO;

public class Test {

	public static void main(String[] args) {
		
		
		
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setId(101L);
		accountDTO.setAccountHolderName("SHUBHAM");
		accountDTO.setAccountNumber(100100100L);
		accountDTO.setMobileNumber(7987958072L);
		accountDTO.setBalance(5000.500);
		accountDTO.setAddress("India");
		
		
		
		 AccountDAO accountDAO = new AccountDAO();
           accountDAO.saveAccountDetails(accountDTO);
	}
}
