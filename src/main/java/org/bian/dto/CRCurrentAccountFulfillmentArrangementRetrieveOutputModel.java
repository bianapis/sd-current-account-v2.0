package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCurrentAccountFulfillmentArrangementRetrieveOutputModel
 */
public class CRCurrentAccountFulfillmentArrangementRetrieveOutputModel   {
  private CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord = null;

  private String currentAccountFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object currentAccountFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String currentAccountFulfillmentArrangementRetrieveActionResponse = null;

  private CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceReportRecord currentAccountFulfillmentArrangementInstanceReportRecord = null;

  private CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceAnalysis currentAccountFulfillmentArrangementInstanceAnalysis = null;


  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  **/

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Current Account Fulfillment Arrangement instance retrieve service call 
   * @return currentAccountFulfillmentArrangementRetrieveActionTaskReference
  **/

  public String getCurrentAccountFulfillmentArrangementRetrieveActionTaskReference() {
    return currentAccountFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setCurrentAccountFulfillmentArrangementRetrieveActionTaskReference(String currentAccountFulfillmentArrangementRetrieveActionTaskReference) {
    this.currentAccountFulfillmentArrangementRetrieveActionTaskReference = currentAccountFulfillmentArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return currentAccountFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getCurrentAccountFulfillmentArrangementRetrieveActionTaskRecord() {
    return currentAccountFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setCurrentAccountFulfillmentArrangementRetrieveActionTaskRecord(Object currentAccountFulfillmentArrangementRetrieveActionTaskRecord) {
    this.currentAccountFulfillmentArrangementRetrieveActionTaskRecord = currentAccountFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return currentAccountFulfillmentArrangementRetrieveActionResponse
  **/

  public String getCurrentAccountFulfillmentArrangementRetrieveActionResponse() {
    return currentAccountFulfillmentArrangementRetrieveActionResponse;
  }

  public void setCurrentAccountFulfillmentArrangementRetrieveActionResponse(String currentAccountFulfillmentArrangementRetrieveActionResponse) {
    this.currentAccountFulfillmentArrangementRetrieveActionResponse = currentAccountFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get currentAccountFulfillmentArrangementInstanceReportRecord
   * @return currentAccountFulfillmentArrangementInstanceReportRecord
  **/

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceReportRecord getCurrentAccountFulfillmentArrangementInstanceReportRecord() {
    return currentAccountFulfillmentArrangementInstanceReportRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReportRecord(CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceReportRecord currentAccountFulfillmentArrangementInstanceReportRecord) {
    this.currentAccountFulfillmentArrangementInstanceReportRecord = currentAccountFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get currentAccountFulfillmentArrangementInstanceAnalysis
   * @return currentAccountFulfillmentArrangementInstanceAnalysis
  **/

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceAnalysis getCurrentAccountFulfillmentArrangementInstanceAnalysis() {
    return currentAccountFulfillmentArrangementInstanceAnalysis;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceAnalysis(CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceAnalysis currentAccountFulfillmentArrangementInstanceAnalysis) {
    this.currentAccountFulfillmentArrangementInstanceAnalysis = currentAccountFulfillmentArrangementInstanceAnalysis;
  }


}

