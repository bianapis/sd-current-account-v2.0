package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction;
import org.bian.dto.BQDepositsAndWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecord
 */
public class BQDepositsAndWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecord   {
  private String depositType = null;

  private String withdrawalType = null;

  private String accountLimitBreachResponse = null;

  private BQDepositsAndWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction = null;

  private BQDepositsAndWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5_m2sTGEeChad0JzLk7QA_-2008690148/elements/_E6IwwMTGEeChad0JzLk7QA_1495654231  bian-reference: DepositServicet.DepositType  general-info: The type of deposit transaction that can be applied to the account (e.g. customer deposit, internal credit) 
   * @return depositType
  **/

  public String getDepositType() {
    return depositType;
  }

  public void setDepositType(String depositType) {
    this.depositType = depositType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of withdrawal transaction that can be applied to the account (e.g. customer withdrawal, internal service charge, disbursement) 
   * @return withdrawalType
  **/

  public String getWithdrawalType() {
    return withdrawalType;
  }

  public void setWithdrawalType(String withdrawalType) {
    this.withdrawalType = withdrawalType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The handling options if a withdrawal results in a breach of an account limit 
   * @return accountLimitBreachResponse
  **/

  public String getAccountLimitBreachResponse() {
    return accountLimitBreachResponse;
  }

  public void setAccountLimitBreachResponse(String accountLimitBreachResponse) {
    this.accountLimitBreachResponse = accountLimitBreachResponse;
  }


  /**
   * Get depositTransaction
   * @return depositTransaction
  **/

  public BQDepositsAndWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction getDepositTransaction() {
    return depositTransaction;
  }

  public void setDepositTransaction(BQDepositsAndWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction) {
    this.depositTransaction = depositTransaction;
  }


  /**
   * Get withdrawalTransaction
   * @return withdrawalTransaction
  **/

  public BQDepositsAndWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction getWithdrawalTransaction() {
    return withdrawalTransaction;
  }

  public void setWithdrawalTransaction(BQDepositsAndWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
  }


}

