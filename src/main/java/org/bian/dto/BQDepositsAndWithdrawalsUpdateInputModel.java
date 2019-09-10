package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsUpdateInputModel
 */
public class BQDepositsAndWithdrawalsUpdateInputModel   {
  private String currentAccountFulfillmentArrangementInstanceReference = null;

  private String depositsAndWithdrawalsInstanceReference = null;

  private BQDepositsAndWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord = null;

  private Object depositsAndWithdrawalsUpdateActionTaskRecord = null;

  private String depositsAndWithdrawalsUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  **/

  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits And Withdrawals instance 
   * @return depositsAndWithdrawalsInstanceReference
  **/

  public String getDepositsAndWithdrawalsInstanceReference() {
    return depositsAndWithdrawalsInstanceReference;
  }

  public void setDepositsAndWithdrawalsInstanceReference(String depositsAndWithdrawalsInstanceReference) {
    this.depositsAndWithdrawalsInstanceReference = depositsAndWithdrawalsInstanceReference;
  }


  /**
   * Get depositsAndWithdrawalsInstanceRecord
   * @return depositsAndWithdrawalsInstanceRecord
  **/

  public BQDepositsAndWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecord getDepositsAndWithdrawalsInstanceRecord() {
    return depositsAndWithdrawalsInstanceRecord;
  }

  public void setDepositsAndWithdrawalsInstanceRecord(BQDepositsAndWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord) {
    this.depositsAndWithdrawalsInstanceRecord = depositsAndWithdrawalsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return depositsAndWithdrawalsUpdateActionTaskRecord
  **/

  public Object getDepositsAndWithdrawalsUpdateActionTaskRecord() {
    return depositsAndWithdrawalsUpdateActionTaskRecord;
  }

  public void setDepositsAndWithdrawalsUpdateActionTaskRecord(Object depositsAndWithdrawalsUpdateActionTaskRecord) {
    this.depositsAndWithdrawalsUpdateActionTaskRecord = depositsAndWithdrawalsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return depositsAndWithdrawalsUpdateActionRequest
  **/

  public String getDepositsAndWithdrawalsUpdateActionRequest() {
    return depositsAndWithdrawalsUpdateActionRequest;
  }

  public void setDepositsAndWithdrawalsUpdateActionRequest(String depositsAndWithdrawalsUpdateActionRequest) {
    this.depositsAndWithdrawalsUpdateActionRequest = depositsAndWithdrawalsUpdateActionRequest;
  }


}

