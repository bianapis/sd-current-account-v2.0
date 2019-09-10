package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCurrentAccountFulfillmentArrangementRetrieveInputModel
 */
public class CRCurrentAccountFulfillmentArrangementRetrieveInputModel   {
  private Object currentAccountFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String currentAccountFulfillmentArrangementRetrieveActionRequest = null;

  private CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord currentAccountFulfillmentArrangementInstanceReportRecord = null;

  private CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis currentAccountFulfillmentArrangementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return currentAccountFulfillmentArrangementRetrieveActionRequest
  **/

  public String getCurrentAccountFulfillmentArrangementRetrieveActionRequest() {
    return currentAccountFulfillmentArrangementRetrieveActionRequest;
  }

  public void setCurrentAccountFulfillmentArrangementRetrieveActionRequest(String currentAccountFulfillmentArrangementRetrieveActionRequest) {
    this.currentAccountFulfillmentArrangementRetrieveActionRequest = currentAccountFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get currentAccountFulfillmentArrangementInstanceReportRecord
   * @return currentAccountFulfillmentArrangementInstanceReportRecord
  **/

  public CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord getCurrentAccountFulfillmentArrangementInstanceReportRecord() {
    return currentAccountFulfillmentArrangementInstanceReportRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReportRecord(CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord currentAccountFulfillmentArrangementInstanceReportRecord) {
    this.currentAccountFulfillmentArrangementInstanceReportRecord = currentAccountFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get currentAccountFulfillmentArrangementInstanceAnalysis
   * @return currentAccountFulfillmentArrangementInstanceAnalysis
  **/

  public CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis getCurrentAccountFulfillmentArrangementInstanceAnalysis() {
    return currentAccountFulfillmentArrangementInstanceAnalysis;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceAnalysis(CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis currentAccountFulfillmentArrangementInstanceAnalysis) {
    this.currentAccountFulfillmentArrangementInstanceAnalysis = currentAccountFulfillmentArrangementInstanceAnalysis;
  }


}

