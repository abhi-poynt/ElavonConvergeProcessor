package com.elavon.converge.model;

import com.elavon.converge.model.type.AVSResponse;
import com.elavon.converge.model.type.CVV2Response;
import com.elavon.converge.model.type.CardShortDescription;
import com.elavon.converge.model.type.CardType;
import com.elavon.converge.model.type.TokenResponse;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Sample Response:
 * <txn>
 *   <ssl_card_short_description>MC</ssl_card_short_description>
 *   <ssl_cvv2_response />
 *   <ssl_account_balance>10.00</ssl_account_balance>
 *   <ssl_result_message>APPROVAL</ssl_result_message>
 *   <ssl_invoice_number />
 *   <ssl_promo_code />
 *   <ssl_result>0</ssl_result>
 *   <ssl_txn_id>231017A15-67ADEA9E-4E0D-410A-B11C-61B0BE82DEB9</ssl_txn_id>
 *   <ssl_completion_date />
 *   <ssl_transaction_type>SALE</ssl_transaction_type>
 *   <ssl_avs_response />
 *   <ssl_account_status />
 *   <ssl_approval_code>CMC345</ssl_approval_code>
 *   <ssl_enrollment />
 *   <ssl_exp_date>1225</ssl_exp_date>
 *   <ssl_loyalty_program />
 *   <ssl_tender_amount />
 *   <ssl_departure_date />
 *   <ssl_card_type>CREDITCARD</ssl_card_type>
 *   <ssl_loyalty_account_balance />
 *   <ssl_salestax />
 *   <ssl_amount>10.00</ssl_amount>
 *   <ssl_card_number>54**********3330</ssl_card_number>
 *   <ssl_issue_points />
 *   <ssl_txn_time>10/23/2017 06:12:25 PM</ssl_txn_time>
 *   <ssl_access_code />
 * </txn>
 */
@Root(name = "txn")
public class ElavonTransactionResponse extends ElavonResponse {

    @Element(name = "ssl_txn_id", required = false)
    private String txnId;

    @Element(name = "ssl_txn_time", required = false)
    private Date txnTime;

    // Transaction approval code
    @Element(name = "ssl_approval_code", required = false)
    private String approvalCode;

    @Element(name = "ssl_amount", required = false)
    private BigDecimal amount;

    //The amount originally requested on partial approvals only
    @Element(name = "ssl_requested_amount", required = false)
    private BigDecimal requestedAmount;

    // This is the difference of the amount requested versus the amount authorized that the merchant
    // has to collect from the consumer on partial approvals only
    @Element(name = "ssl_balance_due", required = false)
    private BigDecimal balanceDue;

    // The balance left on the card, which is always 0.00 for a partially authorized transaction.
    @Element(name = "ssl_account_balance", required = false)
    private BigDecimal accountBalance;

    @Element(name = "ssl_avs_response", required = false)
    private AVSResponse avsResponse;

    @Element(name = "ssl_cvv2_response", required = false)
    private CVV2Response cvv2Response;

    @Element(name = "ssl_card_number", required = false)
    private CVV2Response cardNumberMasked;

    @Element(name = "ssl_invoice_number", required = false)
    private String invoiceNumber;

    @Element(name = "ssl_conversion_rate", required = false)
    private float conversionRate;

    @Element(name = "ssl_cardholder_currency", required = false)
    private String cardCurrency;

    // Total amount in cardholder currency, only returned on DCC transactions
    @Element(name = "ssl_cardholder_amount", required = false)
    private BigDecimal cardholderAmount;

    // Base amount in cardholder currency, only returned on DCC transactions.
    @Element(name = "ssl_cardholder_base_amount", required = false)
    private BigDecimal cardholderBaseAmount;

    // Tip amount in cardholder currency, only returned on DCC transactions with Service market segment
    @Element(name = "ssl_cardholder_tip_amount", required = false)
    private BigDecimal cardholderTipAmount;

    // Server ID submitted with the request. Only returned on Service market segment based on the merchant setup.
    @Element(name = "ssl_server", required = false)
    private String serverId;

    // Shift information submitted with the request. Only returned on Service market segment based on the merchant setup
    @Element(name = "ssl_shift", required = false)
    private String shift;

    // ssl_eci_ind - NOT USED. returned on 3D Secure transactions

    // Transaction currency. Returned only if terminal is setup for Multi- Currency
    @Element(name = "ssl_card_short_description", required = false)
    private CardShortDescription cardShortDescription;

    @Element(name = "ssl_card_type", required = false)
    private CardType cardType;

    @Element(name = "ssl_transaction_currency", required = false)
    private String transactionCurrency;

    @Element(name = "ssl_token", required = false)
    private String token;

    @Element(name = "ssl_token_response", required = false)
    private TokenResponse tokenResponse;

    //TODO convert to enum. Should verify return values with Elavon
    // Outcome of the Add to Card Manager request, examples: Card Added, Card Updated, Not Permitted, or
    // FAILURE - First Name - is required.
    // Returned only if storing token is requested in a terminal that setup for Tokenization.
    @Element(name = "ssl_add_token_response", required = false)
    private String addTokenResponse;

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public Date getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(Date txnTime) {
        this.txnTime = txnTime;
    }

    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(BigDecimal requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public BigDecimal getBalanceDue() {
        return balanceDue;
    }

    public void setBalanceDue(BigDecimal balanceDue) {
        this.balanceDue = balanceDue;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public AVSResponse getAvsResponse() {
        return avsResponse;
    }

    public void setAvsResponse(AVSResponse avsResponse) {
        this.avsResponse = avsResponse;
    }

    public CVV2Response getCvv2Response() {
        return cvv2Response;
    }

    public void setCvv2Response(CVV2Response cvv2Response) {
        this.cvv2Response = cvv2Response;
    }

    public CVV2Response getCardNumberMasked() {
        return cardNumberMasked;
    }

    public void setCardNumberMasked(CVV2Response cardNumberMasked) {
        this.cardNumberMasked = cardNumberMasked;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public float getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(float conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getCardCurrency() {
        return cardCurrency;
    }

    public void setCardCurrency(String cardCurrency) {
        this.cardCurrency = cardCurrency;
    }

    public BigDecimal getCardholderAmount() {
        return cardholderAmount;
    }

    public void setCardholderAmount(BigDecimal cardholderAmount) {
        this.cardholderAmount = cardholderAmount;
    }

    public BigDecimal getCardholderBaseAmount() {
        return cardholderBaseAmount;
    }

    public void setCardholderBaseAmount(BigDecimal cardholderBaseAmount) {
        this.cardholderBaseAmount = cardholderBaseAmount;
    }

    public BigDecimal getCardholderTipAmount() {
        return cardholderTipAmount;
    }

    public void setCardholderTipAmount(BigDecimal cardholderTipAmount) {
        this.cardholderTipAmount = cardholderTipAmount;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public CardShortDescription getCardShortDescription() {
        return cardShortDescription;
    }

    public void setCardShortDescription(CardShortDescription cardShortDescription) {
        this.cardShortDescription = cardShortDescription;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public TokenResponse getTokenResponse() {
        return tokenResponse;
    }

    public void setTokenResponse(TokenResponse tokenResponse) {
        this.tokenResponse = tokenResponse;
    }

    public String getAddTokenResponse() {
        return addTokenResponse;
    }

    public void setAddTokenResponse(String addTokenResponse) {
        this.addTokenResponse = addTokenResponse;
    }
}