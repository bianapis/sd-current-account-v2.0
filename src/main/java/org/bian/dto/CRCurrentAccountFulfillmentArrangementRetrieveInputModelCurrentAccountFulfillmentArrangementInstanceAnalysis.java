package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis
 */
public class CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis   {
  private String currentAccountFulfillmentArrangementInstanceAnalysisReference = null;

  private String currentAccountFulfillmentArrangementInstanceAnalysisReportType = null;

  private String currentAccountFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return currentAccountFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getCurrentAccountFulfillmentArrangementInstanceAnalysisReference() {
    return currentAccountFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceAnalysisReference(String currentAccountFulfillmentArrangementInstanceAnalysisReference) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisReference = currentAccountFulfillmentArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return currentAccountFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getCurrentAccountFulfillmentArrangementInstanceAnalysisParameters() {
    return currentAccountFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceAnalysisParameters(String currentAccountFulfillmentArrangementInstanceAnalysisParameters) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisParameters = currentAccountFulfillmentArrangementInstanceAnalysisParameters;
  }


}

