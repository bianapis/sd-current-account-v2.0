package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction;
import org.bian.dto.BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord
 */
public class BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord   {
  private BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction = null;

  private BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction = null;


  /**
   * Get depositTransaction
   * @return depositTransaction
  **/

  public BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction getDepositTransaction() {
    return depositTransaction;
  }

  public void setDepositTransaction(BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction) {
    this.depositTransaction = depositTransaction;
  }


  /**
   * Get withdrawalTransaction
   * @return withdrawalTransaction
  **/

  public BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction getWithdrawalTransaction() {
    return withdrawalTransaction;
  }

  public void setWithdrawalTransaction(BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
  }


}

