package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCurrentAccountFulfillmentArrangementUpdateInputModelCurrentAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCurrentAccountFulfillmentArrangementUpdateOutputModel
 */
public class CRCurrentAccountFulfillmentArrangementUpdateOutputModel   {
  private CRCurrentAccountFulfillmentArrangementUpdateInputModelCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord = null;

  private String currentAccountFulfillmentArrangementUpdateActionTaskReference = null;

  private Object currentAccountFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  **/

  public CRCurrentAccountFulfillmentArrangementUpdateInputModelCurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(CRCurrentAccountFulfillmentArrangementUpdateInputModelCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return currentAccountFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getCurrentAccountFulfillmentArrangementUpdateActionTaskReference() {
    return currentAccountFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setCurrentAccountFulfillmentArrangementUpdateActionTaskReference(String currentAccountFulfillmentArrangementUpdateActionTaskReference) {
    this.currentAccountFulfillmentArrangementUpdateActionTaskReference = currentAccountFulfillmentArrangementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return currentAccountFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getCurrentAccountFulfillmentArrangementUpdateActionTaskRecord() {
    return currentAccountFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setCurrentAccountFulfillmentArrangementUpdateActionTaskRecord(Object currentAccountFulfillmentArrangementUpdateActionTaskRecord) {
    this.currentAccountFulfillmentArrangementUpdateActionTaskRecord = currentAccountFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

