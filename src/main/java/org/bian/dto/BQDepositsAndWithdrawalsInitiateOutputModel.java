package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsInitiateOutputModel
 */
public class BQDepositsAndWithdrawalsInitiateOutputModel   {
  private BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord = null;

  private String depositsAndWithdrawalsInstanceReference = null;

  private String depositsAndWithdrawalsInitiateActionReference = null;

  private Object depositsAndWithdrawalsInitiateActionRecord = null;

  private String depositsAndWithdrawalsInstanceStatus = null;


  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  **/

  public BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return depositsAndWithdrawalsInitiateActionReference
  **/

  public String getDepositsAndWithdrawalsInitiateActionReference() {
    return depositsAndWithdrawalsInitiateActionReference;
  }

  public void setDepositsAndWithdrawalsInitiateActionReference(String depositsAndWithdrawalsInitiateActionReference) {
    this.depositsAndWithdrawalsInitiateActionReference = depositsAndWithdrawalsInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return depositsAndWithdrawalsInitiateActionRecord
  **/

  public Object getDepositsAndWithdrawalsInitiateActionRecord() {
    return depositsAndWithdrawalsInitiateActionRecord;
  }

  public void setDepositsAndWithdrawalsInitiateActionRecord(Object depositsAndWithdrawalsInitiateActionRecord) {
    this.depositsAndWithdrawalsInitiateActionRecord = depositsAndWithdrawalsInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Deposits And Withdrawals instance (e.g. initialised, pending, active) 
   * @return depositsAndWithdrawalsInstanceStatus
  **/

  public String getDepositsAndWithdrawalsInstanceStatus() {
    return depositsAndWithdrawalsInstanceStatus;
  }

  public void setDepositsAndWithdrawalsInstanceStatus(String depositsAndWithdrawalsInstanceStatus) {
    this.depositsAndWithdrawalsInstanceStatus = depositsAndWithdrawalsInstanceStatus;
  }


}

