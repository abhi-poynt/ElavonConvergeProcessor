package com.elavon.converge.model.type;

public enum CardShortDescription {
    AMEX("AMEX"),
    UNIONPAY("CUP"),
    DISCOVER("DISC"),
    MASTERCARD("MC"),
    PAYPAL("PP"),
    VISA("VISA");

    private final String value;

    CardShortDescription(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return value;
    }
}
