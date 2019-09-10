package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountLienExchangeInputModelAccountLienExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQPaymentsExchangeInputModel
 */
public class BQPaymentsExchangeInputModel   {
  private String currentAccountFulfillmentArrangementInstanceReference = null;

  private String paymentsInstanceReference = null;

  private Object paymentsExchangeActionTaskRecord = null;

  private BQAccountLienExchangeInputModelAccountLienExchangeActionRequest paymentsExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payments instance 
   * @return paymentsInstanceReference
  **/

  public String getPaymentsInstanceReference() {
    return paymentsInstanceReference;
  }

  public void setPaymentsInstanceReference(String paymentsInstanceReference) {
    this.paymentsInstanceReference = paymentsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return paymentsExchangeActionTaskRecord
  **/

  public Object getPaymentsExchangeActionTaskRecord() {
    return paymentsExchangeActionTaskRecord;
  }

  public void setPaymentsExchangeActionTaskRecord(Object paymentsExchangeActionTaskRecord) {
    this.paymentsExchangeActionTaskRecord = paymentsExchangeActionTaskRecord;
  }


  /**
   * Get paymentsExchangeActionRequest
   * @return paymentsExchangeActionRequest
  **/

  public BQAccountLienExchangeInputModelAccountLienExchangeActionRequest getPaymentsExchangeActionRequest() {
    return paymentsExchangeActionRequest;
  }

  public void setPaymentsExchangeActionRequest(BQAccountLienExchangeInputModelAccountLienExchangeActionRequest paymentsExchangeActionRequest) {
    this.paymentsExchangeActionRequest = paymentsExchangeActionRequest;
  }


}

