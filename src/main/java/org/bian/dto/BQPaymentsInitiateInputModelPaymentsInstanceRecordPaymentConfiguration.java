package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference;
import org.bian.dto.BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference;

import javax.validation.Valid;
  
/**
 * BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfiguration
 */
public class BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfiguration   {
  private String paymentSchedule = null;

  private BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference directDebitMandateReference = null;

  private BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference billPayMandateReference = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E7CIosTGEeChad0JzLk7QA_1664636213/elements/_E7CIpMTGEeChad0JzLk7QA_-1145087031  bian-reference: StandingOrderArrangement.StandingOrderSchedule  general-info: Processing schedule for repeating payments for standing orders (e.g. start date, end, period, number/cycles). Note this triggers an internal execution call as necessary 
   * @return paymentSchedule
  **/

  public String getPaymentSchedule() {
    return paymentSchedule;
  }

  public void setPaymentSchedule(String paymentSchedule) {
    this.paymentSchedule = paymentSchedule;
  }


  /**
   * Get directDebitMandateReference
   * @return directDebitMandateReference
  **/

  public BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference getDirectDebitMandateReference() {
    return directDebitMandateReference;
  }

  public void setDirectDebitMandateReference(BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference directDebitMandateReference) {
    this.directDebitMandateReference = directDebitMandateReference;
  }


  /**
   * Get billPayMandateReference
   * @return billPayMandateReference
  **/

  public BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference getBillPayMandateReference() {
    return billPayMandateReference;
  }

  public void setBillPayMandateReference(BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference billPayMandateReference) {
    this.billPayMandateReference = billPayMandateReference;
  }


}

