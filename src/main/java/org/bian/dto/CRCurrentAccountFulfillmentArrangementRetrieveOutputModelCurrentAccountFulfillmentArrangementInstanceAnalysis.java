package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceAnalysis
 */
public class CRCurrentAccountFulfillmentArrangementRetrieveOutputModelCurrentAccountFulfillmentArrangementInstanceAnalysis   {
  private String currentAccountFulfillmentArrangementInstanceAnalysisData = null;

  private String currentAccountFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object currentAccountFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return currentAccountFulfillmentArrangementInstanceAnalysisData
  **/

  public String getCurrentAccountFulfillmentArrangementInstanceAnalysisData() {
    return currentAccountFulfillmentArrangementInstanceAnalysisData;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceAnalysisData(String currentAccountFulfillmentArrangementInstanceAnalysisData) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisData = currentAccountFulfillmentArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return currentAccountFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getCurrentAccountFulfillmentArrangementInstanceAnalysisReportType() {
    return currentAccountFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceAnalysisReportType(String currentAccountFulfillmentArrangementInstanceAnalysisReportType) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisReportType = currentAccountFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return currentAccountFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getCurrentAccountFulfillmentArrangementInstanceAnalysisReport() {
    return currentAccountFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceAnalysisReport(Object currentAccountFulfillmentArrangementInstanceAnalysisReport) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisReport = currentAccountFulfillmentArrangementInstanceAnalysisReport;
  }


}

