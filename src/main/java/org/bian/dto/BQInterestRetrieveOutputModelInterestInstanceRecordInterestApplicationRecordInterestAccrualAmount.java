package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount
 */
public class BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount   {
  private String interestAccrualType = null;

  private String interestAccrualCharge = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_E5P_-cTGEeChad0JzLk7QA_348288418  bian-reference: InterestTransaction.AccuredInterestType  general-info: The interest type being tracked 
   * @return interestAccrualType
  **/

  public String getInterestAccrualType() {
    return interestAccrualType;
  }

  public void setInterestAccrualType(String interestAccrualType) {
    this.interestAccrualType = interestAccrualType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The accrued amount of applied interest 
   * @return interestAccrualCharge
  **/

  public String getInterestAccrualCharge() {
    return interestAccrualCharge;
  }

  public void setInterestAccrualCharge(String interestAccrualCharge) {
    this.interestAccrualCharge = interestAccrualCharge;
  }


}

