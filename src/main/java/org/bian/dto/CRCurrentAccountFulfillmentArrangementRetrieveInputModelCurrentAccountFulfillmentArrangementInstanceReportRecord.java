package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord
 */
public class CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord   {
  private String currentAccountFulfillmentArrangementInstanceReportReference = null;

  private String currentAccountFulfillmentArrangementInstanceReportType = null;

  private String currentAccountFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return currentAccountFulfillmentArrangementInstanceReportReference
  **/

  public String getCurrentAccountFulfillmentArrangementInstanceReportReference() {
    return currentAccountFulfillmentArrangementInstanceReportReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReportReference(String currentAccountFulfillmentArrangementInstanceReportReference) {
    this.currentAccountFulfillmentArrangementInstanceReportReference = currentAccountFulfillmentArrangementInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return currentAccountFulfillmentArrangementInstanceReportParameters
  **/

  public String getCurrentAccountFulfillmentArrangementInstanceReportParameters() {
    return currentAccountFulfillmentArrangementInstanceReportParameters;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReportParameters(String currentAccountFulfillmentArrangementInstanceReportParameters) {
    this.currentAccountFulfillmentArrangementInstanceReportParameters = currentAccountFulfillmentArrangementInstanceReportParameters;
  }


}

