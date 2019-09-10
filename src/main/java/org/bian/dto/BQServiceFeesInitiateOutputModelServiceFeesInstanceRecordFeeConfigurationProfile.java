package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile
 */
public class BQServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile   {
  private String feeDefinition = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_hcTGEeChad0JzLk7QA_1324289986  bian-reference: FeeFeature.FeeDefinition  general-info: Definition of the fee or penalty including when and how to apply 
   * @return feeDefinition
  **/

  public String getFeeDefinition() {
    return feeDefinition;
  }

  public void setFeeDefinition(String feeDefinition) {
    this.feeDefinition = feeDefinition;
  }


}

