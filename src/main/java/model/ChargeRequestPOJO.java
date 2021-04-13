package model;

import lombok.Data;

@Data
public class ChargeRequestPOJO {

    public enum Currency {
        EUR, USD;
    }
    private String description;
    private int amount;
    private Currency currency;
    private String stripeEmail;
    private String stripeToken;
    
    public String getDescription()
    {
    	return description;
    }
    public int getAmount()
    {
    	return amount;
    }
    public Currency getCurrency()
    {
    	return currency;
    }
    public String getStripeEmail()
    {
    	return stripeEmail;
    }
    public String getStripToken()
    {
    	return stripeToken;
    }
}