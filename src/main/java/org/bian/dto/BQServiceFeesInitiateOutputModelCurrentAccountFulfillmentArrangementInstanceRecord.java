package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCurrentAccountFulfillmentArrangementInitiateInputModelCurrentAccountFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQServiceFeesInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord
 */
public class BQServiceFeesInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord   {
  private CRCurrentAccountFulfillmentArrangementInitiateInputModelCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * Get dateType
   * @return dateType
  **/

  public CRCurrentAccountFulfillmentArrangementInitiateInputModelCurrentAccountFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRCurrentAccountFulfillmentArrangementInitiateInputModelCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

