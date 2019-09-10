package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeConfigurationProfile
 */
public class BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeConfigurationProfile   {
  private String feeDefinition = null;

  private String feeType = null;


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


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeFeature.FeeType `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeFeature.FeeType  general-info: The fee or penalty type applied 
   * @return feeType
  **/

  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }


}

