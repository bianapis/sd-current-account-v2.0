package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentsUpdateInputModelPaymentsInstanceRecordPaymentTransaction
 */
public class BQPaymentsUpdateInputModelPaymentsInstanceRecordPaymentTransaction   {
  private String paymentTransactionType = null;

  private String paymentTransactionPayeeReference = null;

  private String paymentTransactionPayeeAccountReference = null;

  private String paymentTransactionPayeeBankReference = null;

  private String paymentTransactionAmount = null;

  private String paymentTransactionFeeType = null;

  private String paymentTransactionFeeCharge = null;

  private String paymentTransactionDate = null;

  private String paymentTransactionPaymentMechanism = null;

  private String paymentTransactionPaymentPurpose = null;

  private String paymentTransactionBankBranchLocationReference = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FA2cwMTGEeChad0JzLk7QA_1385452657/elements/_q58kEK23EeKuGrOch6U_ZQ_-1354685933  bian-reference: PaymentTransactionType  general-info: The type of payment transaction (e.g. customer payment, standing order, direct debit, bill pay) 
   * @return paymentTransactionType
  **/

  public String getPaymentTransactionType() {
    return paymentTransactionType;
  }

  public void setPaymentTransactionType(String paymentTransactionType) {
    this.paymentTransactionType = paymentTransactionType;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNycTGEeChad0JzLk7QA_-591715083  bian-reference: PaymentTransactionInvolvementType (as Payee)  general-info: Reference to the party to whom the payment is made 
   * @return paymentTransactionPayeeReference
  **/

  public String getPaymentTransactionPayeeReference() {
    return paymentTransactionPayeeReference;
  }

  public void setPaymentTransactionPayeeReference(String paymentTransactionPayeeReference) {
    this.paymentTransactionPayeeReference = paymentTransactionPayeeReference;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_4a7goJo3EeOJb4DIsGFWTA  bian-reference: PaymentTransaction.Account (as Payee Account)  general-info: Reference to the account to which the payment is made 
   * @return paymentTransactionPayeeAccountReference
  **/

  public String getPaymentTransactionPayeeAccountReference() {
    return paymentTransactionPayeeAccountReference;
  }

  public void setPaymentTransactionPayeeAccountReference(String paymentTransactionPayeeAccountReference) {
    this.paymentTransactionPayeeAccountReference = paymentTransactionPayeeAccountReference;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNyMTGEeChad0JzLk7QA_-246206935  bian-reference: PaymentTransactionInvolvementType (as PayeeBank)  general-info: Reference to the bank where the payee account is held 
   * @return paymentTransactionPayeeBankReference
  **/

  public String getPaymentTransactionPayeeBankReference() {
    return paymentTransactionPayeeBankReference;
  }

  public void setPaymentTransactionPayeeBankReference(String paymentTransactionPayeeBankReference) {
    this.paymentTransactionPayeeBankReference = paymentTransactionPayeeBankReference;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_xIKY4Hm5EeKIubTif2R3gg_40795932  bian-reference: PaymentTransactionPrincipleAmount  general-info: The amount (and currency if applicable) of the payment 
   * @return paymentTransactionAmount
  **/

  public String getPaymentTransactionAmount() {
    return paymentTransactionAmount;
  }

  public void setPaymentTransactionAmount(String paymentTransactionAmount) {
    this.paymentTransactionAmount = paymentTransactionAmount;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeTransactionAppliedFeeType  general-info: The fee type applied to the payment transaction 
   * @return paymentTransactionFeeType
  **/

  public String getPaymentTransactionFeeType() {
    return paymentTransactionFeeType;
  }

  public void setPaymentTransactionFeeType(String paymentTransactionFeeType) {
    this.paymentTransactionFeeType = paymentTransactionFeeType;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_FMBK98TGEeChad0JzLk7QA_-1487452687  bian-reference: FeeTransactionAppliedFeeAmount  general-info: The fee charge applied to the transaction 
   * @return paymentTransactionFeeCharge
  **/

  public String getPaymentTransactionFeeCharge() {
    return paymentTransactionFeeCharge;
  }

  public void setPaymentTransactionFeeCharge(String paymentTransactionFeeCharge) {
    this.paymentTransactionFeeCharge = paymentTransactionFeeCharge;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FDYMU8TGEeChad0JzLk7QA_1746210992  bian-reference: PaymentTransactionValueDate  general-info: The various key dates and times associated with the payment transaction 
   * @return paymentTransactionDate
  **/

  public String getPaymentTransactionDate() {
    return paymentTransactionDate;
  }

  public void setPaymentTransactionDate(String paymentTransactionDate) {
    this.paymentTransactionDate = paymentTransactionDate;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FAi6ycTGEeChad0JzLk7QA_1746210990  bian-reference: PaymentTransactionUsedMechanism  general-info: Requested payment mechanism (e.g. Wire, ACH) 
   * @return paymentTransactionPaymentMechanism
  **/

  public String getPaymentTransactionPaymentMechanism() {
    return paymentTransactionPaymentMechanism;
  }

  public void setPaymentTransactionPaymentMechanism(String paymentTransactionPaymentMechanism) {
    this.paymentTransactionPaymentMechanism = paymentTransactionPaymentMechanism;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the purpose including any external reference to the transaction 
   * @return paymentTransactionPaymentPurpose
  **/

  public String getPaymentTransactionPaymentPurpose() {
    return paymentTransactionPaymentPurpose;
  }

  public void setPaymentTransactionPaymentPurpose(String paymentTransactionPaymentPurpose) {
    this.paymentTransactionPaymentPurpose = paymentTransactionPaymentPurpose;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_z2I6YGx5EeKmZJ0Ago--9g_239738909  bian-reference: PaymentTransactionInvolvementAsPartyRole.Party.Location  general-info: Reference to the location the payment transaction is initiated from  
   * @return paymentTransactionBankBranchLocationReference
  **/

  public String getPaymentTransactionBankBranchLocationReference() {
    return paymentTransactionBankBranchLocationReference;
  }

  public void setPaymentTransactionBankBranchLocationReference(String paymentTransactionBankBranchLocationReference) {
    this.paymentTransactionBankBranchLocationReference = paymentTransactionBankBranchLocationReference;
  }


}

