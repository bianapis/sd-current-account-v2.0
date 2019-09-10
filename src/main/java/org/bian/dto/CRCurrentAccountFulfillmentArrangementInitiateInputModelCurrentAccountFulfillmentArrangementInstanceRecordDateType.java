package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCurrentAccountFulfillmentArrangementInitiateInputModelCurrentAccountFulfillmentArrangementInstanceRecordDateType
 */
public class CRCurrentAccountFulfillmentArrangementInitiateInputModelCurrentAccountFulfillmentArrangementInstanceRecordDateType   {
  private String date = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E_9E5sTGEeChad0JzLk7QA_-1723898882  bian-reference: CurrentAccount (as Account).AccountDate `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Value of the date type 
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


}

