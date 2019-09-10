package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceReportRecord
 */
public class CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceReportRecord   {
  private String currentAccountFulfillmentArrangementInstanceReportData = null;

  private String currentAccountFulfillmentArrangementInstanceReportType = null;

  private Object currentAccountFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return currentAccountFulfillmentArrangementInstanceReportData
  **/

  public String getCurrentAccountFulfillmentArrangementInstanceReportData() {
    return currentAccountFulfillmentArrangementInstanceReportData;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReportData(String currentAccountFulfillmentArrangementInstanceReportData) {
    this.currentAccountFulfillmentArrangementInstanceReportData = currentAccountFulfillmentArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return currentAccountFulfillmentArrangementInstanceReportType
  **/

  public String getCurrentAccountFulfillmentArrangementInstanceReportType() {
    return currentAccountFulfillmentArrangementInstanceReportType;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReportType(String currentAccountFulfillmentArrangementInstanceReportType) {
    this.currentAccountFulfillmentArrangementInstanceReportType = currentAccountFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return currentAccountFulfillmentArrangementInstanceReport
  **/

  public Object getCurrentAccountFulfillmentArrangementInstanceReport() {
    return currentAccountFulfillmentArrangementInstanceReport;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReport(Object currentAccountFulfillmentArrangementInstanceReport) {
    this.currentAccountFulfillmentArrangementInstanceReport = currentAccountFulfillmentArrangementInstanceReport;
  }


}

