package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestTransaction
 */
public class BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestTransaction   {
  private String transactionDescription = null;

  private String transactionRateType = null;

  private String transactionInterestCharge = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: General description of the interest transaction 
   * @return transactionDescription
  **/

  public String getTransactionDescription() {
    return transactionDescription;
  }

  public void setTransactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_2b6L4A4hEeO3g-FNSwkb-g_-1305263591  bian-reference: InterestTransaction.AppliedInterestType  general-info: Applicable rate type 
   * @return transactionRateType
  **/

  public String getTransactionRateType() {
    return transactionRateType;
  }

  public void setTransactionRateType(String transactionRateType) {
    this.transactionRateType = transactionRateType;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_E5P_98TGEeChad0JzLk7QA_2006810136  bian-reference: InterestTransaction.AppliedInterestAmount  general-info: The derived interest amount to be applied 
   * @return transactionInterestCharge
  **/

  public String getTransactionInterestCharge() {
    return transactionInterestCharge;
  }

  public void setTransactionInterestCharge(String transactionInterestCharge) {
    this.transactionInterestCharge = transactionInterestCharge;
  }


}

