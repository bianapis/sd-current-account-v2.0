package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentsExecuteOutputModelPaymentsInstanceRecordPaymentTransaction
 */
public class BQPaymentsExecuteOutputModelPaymentsInstanceRecordPaymentTransaction   {
  private String paymentTransactionDate = null;

  private String paymentTransactionStatus = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FDYMU8TGEeChad0JzLk7QA_1746210992  bian-reference: PaymentTransactionValueDate  general-info: The various key dates and times associated with the payment transaction 
   * @return paymentTransactionDate
  **/

  public String getPaymentTransactionDate() {
    return paymentTransactionDate;
  }

  public void setPaymentTransactionDate(String paymentTransactionDate) {
    this.paymentTransactionDate = paymentTransactionDate;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FCe0dcTGEeChad0JzLk7QA_221546661  bian-reference: BankingTransactionStatus  general-info: The processing status of the transaction (e.g. captured, approved, initiated, confirmed, settled) 
   * @return paymentTransactionStatus
  **/

  public String getPaymentTransactionStatus() {
    return paymentTransactionStatus;
  }

  public void setPaymentTransactionStatus(String paymentTransactionStatus) {
    this.paymentTransactionStatus = paymentTransactionStatus;
  }


}

