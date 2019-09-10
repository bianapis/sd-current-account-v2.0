package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments
 */
public class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments   {
  private String projectedTransactionFeeType = null;

  private String projectedTransactionFeeCharge = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeTransaction.ProjectedFeeType  general-info: The fee or penalty type 
   * @return projectedTransactionFeeType
  **/

  public String getProjectedTransactionFeeType() {
    return projectedTransactionFeeType;
  }

  public void setProjectedTransactionFeeType(String projectedTransactionFeeType) {
    this.projectedTransactionFeeType = projectedTransactionFeeType;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_FMBK98TGEeChad0JzLk7QA_-1487452687  bian-reference: FeeTransaction.ProjectedFeeAmount  general-info: The anticipated fee or penalty amount 
   * @return projectedTransactionFeeCharge
  **/

  public String getProjectedTransactionFeeCharge() {
    return projectedTransactionFeeCharge;
  }

  public void setProjectedTransactionFeeCharge(String projectedTransactionFeeCharge) {
    this.projectedTransactionFeeCharge = projectedTransactionFeeCharge;
  }


}

