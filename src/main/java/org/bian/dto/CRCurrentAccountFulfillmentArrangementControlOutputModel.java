package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCurrentAccountFulfillmentArrangementControlOutputModel
 */
public class CRCurrentAccountFulfillmentArrangementControlOutputModel   {
  private String currentAccountFulfillmentArrangementControlActionTaskReference = null;

  private Object currentAccountFulfillmentArrangementControlActionTaskRecord = null;

  private String currentAccountFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Current Account Fulfillment Arrangement instance control processing service call 
   * @return currentAccountFulfillmentArrangementControlActionTaskReference
  **/

  public String getCurrentAccountFulfillmentArrangementControlActionTaskReference() {
    return currentAccountFulfillmentArrangementControlActionTaskReference;
  }

  public void setCurrentAccountFulfillmentArrangementControlActionTaskReference(String currentAccountFulfillmentArrangementControlActionTaskReference) {
    this.currentAccountFulfillmentArrangementControlActionTaskReference = currentAccountFulfillmentArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return currentAccountFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getCurrentAccountFulfillmentArrangementControlActionTaskRecord() {
    return currentAccountFulfillmentArrangementControlActionTaskRecord;
  }

  public void setCurrentAccountFulfillmentArrangementControlActionTaskRecord(Object currentAccountFulfillmentArrangementControlActionTaskRecord) {
    this.currentAccountFulfillmentArrangementControlActionTaskRecord = currentAccountFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return currentAccountFulfillmentArrangementControlActionResponse
  **/

  public String getCurrentAccountFulfillmentArrangementControlActionResponse() {
    return currentAccountFulfillmentArrangementControlActionResponse;
  }

  public void setCurrentAccountFulfillmentArrangementControlActionResponse(String currentAccountFulfillmentArrangementControlActionResponse) {
    this.currentAccountFulfillmentArrangementControlActionResponse = currentAccountFulfillmentArrangementControlActionResponse;
  }


}

