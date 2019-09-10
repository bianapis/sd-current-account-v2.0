package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCurrentAccountFulfillmentArrangementInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCurrentAccountFulfillmentArrangementInitiateOutputModel
 */
public class CRCurrentAccountFulfillmentArrangementInitiateOutputModel   {
  private String currentAccountFulfillmentArrangementInstanceReference = null;

  private String currentAccountFulfillmentArrangementInitiateActionReference = null;

  private Object currentAccountFulfillmentArrangementInitiateActionRecord = null;

  private String currentAccountFulfillmentArrangementInstanceStatus = null;

  private CRCurrentAccountFulfillmentArrangementInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return currentAccountFulfillmentArrangementInitiateActionReference
  **/

  public String getCurrentAccountFulfillmentArrangementInitiateActionReference() {
    return currentAccountFulfillmentArrangementInitiateActionReference;
  }

  public void setCurrentAccountFulfillmentArrangementInitiateActionReference(String currentAccountFulfillmentArrangementInitiateActionReference) {
    this.currentAccountFulfillmentArrangementInitiateActionReference = currentAccountFulfillmentArrangementInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return currentAccountFulfillmentArrangementInitiateActionRecord
  **/

  public Object getCurrentAccountFulfillmentArrangementInitiateActionRecord() {
    return currentAccountFulfillmentArrangementInitiateActionRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInitiateActionRecord(Object currentAccountFulfillmentArrangementInitiateActionRecord) {
    this.currentAccountFulfillmentArrangementInitiateActionRecord = currentAccountFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Current Account Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return currentAccountFulfillmentArrangementInstanceStatus
  **/

  public String getCurrentAccountFulfillmentArrangementInstanceStatus() {
    return currentAccountFulfillmentArrangementInstanceStatus;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceStatus(String currentAccountFulfillmentArrangementInstanceStatus) {
    this.currentAccountFulfillmentArrangementInstanceStatus = currentAccountFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  **/

  public CRCurrentAccountFulfillmentArrangementInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(CRCurrentAccountFulfillmentArrangementInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
  }


}

