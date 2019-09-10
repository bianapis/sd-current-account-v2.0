package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCurrentAccountFulfillmentArrangementInitiateInputModelCurrentAccountFulfillmentArrangementInstanceRecordAssociations
 */
public class CRCurrentAccountFulfillmentArrangementInitiateInputModelCurrentAccountFulfillmentArrangementInstanceRecordAssociations   {
  private String associationType = null;

  private String associationObligationEntitlement = null;

  private String associationReference = null;


  /**
   * general-info: The type of association (e.g. guarantor, co-signer) 
   * @return associationType
  **/

  public String getAssociationType() {
    return associationType;
  }

  public void setAssociationType(String associationType) {
    this.associationType = associationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the role, obligations or entitlements of the associated party 
   * @return associationObligationEntitlement
  **/

  public String getAssociationObligationEntitlement() {
    return associationObligationEntitlement;
  }

  public void setAssociationObligationEntitlement(String associationObligationEntitlement) {
    this.associationObligationEntitlement = associationObligationEntitlement;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E10RccTGEeChad0JzLk7QA_1392095805  bian-reference: CurrentAccountAgreement (as Agreement).AgreementInvolvement  general-info: Reference to the associated party 
   * @return associationReference
  **/

  public String getAssociationReference() {
    return associationReference;
  }

  public void setAssociationReference(String associationReference) {
    this.associationReference = associationReference;
  }


}

