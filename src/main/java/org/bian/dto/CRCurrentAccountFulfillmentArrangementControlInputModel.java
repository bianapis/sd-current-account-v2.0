package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCurrentAccountFulfillmentArrangementControlInputModelCurrentAccountFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCurrentAccountFulfillmentArrangementControlInputModel
 */
public class CRCurrentAccountFulfillmentArrangementControlInputModel   {
  private String currentAccountServicingSessionReference = null;

  private String currentAccountFulfillmentArrangementInstanceReference = null;

  private Object currentAccountFulfillmentArrangementControlActionTaskRecord = null;

  private CRCurrentAccountFulfillmentArrangementControlInputModelCurrentAccountFulfillmentArrangementControlActionRequest currentAccountFulfillmentArrangementControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return currentAccountServicingSessionReference
  **/

  public String getCurrentAccountServicingSessionReference() {
    return currentAccountServicingSessionReference;
  }

  public void setCurrentAccountServicingSessionReference(String currentAccountServicingSessionReference) {
    this.currentAccountServicingSessionReference = currentAccountServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  **/

  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
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
   * Get currentAccountFulfillmentArrangementControlActionRequest
   * @return currentAccountFulfillmentArrangementControlActionRequest
  **/

  public CRCurrentAccountFulfillmentArrangementControlInputModelCurrentAccountFulfillmentArrangementControlActionRequest getCurrentAccountFulfillmentArrangementControlActionRequest() {
    return currentAccountFulfillmentArrangementControlActionRequest;
  }

  public void setCurrentAccountFulfillmentArrangementControlActionRequest(CRCurrentAccountFulfillmentArrangementControlInputModelCurrentAccountFulfillmentArrangementControlActionRequest currentAccountFulfillmentArrangementControlActionRequest) {
    this.currentAccountFulfillmentArrangementControlActionRequest = currentAccountFulfillmentArrangementControlActionRequest;
  }


}

