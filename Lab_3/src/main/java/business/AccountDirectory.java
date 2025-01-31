/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fengpeng
 */
public class AccountDirectory {
    private List<Account> accountList;

    public AccountDirectory() {
        this.accountList = new ArrayList<>();
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
    
    public Account addAccount() {
        Account account = new Account();
        accountList.add(account);
        return account;
    }
    
    public void deleteAccount(Account account) {
        accountList.remove(account);
    }
    
    public Account searchAccount(String accountNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
  
}
