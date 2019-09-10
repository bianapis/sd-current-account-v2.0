package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits;
import org.bian.dto.CRCurrentAccountFulfillmentArrangementInitiateInputModelCurrentAccountFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord
 */
public class BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord   {
  private BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRCurrentAccountFulfillmentArrangementInitiateInputModelCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
  }


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

