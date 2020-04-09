package model;

/**
	
	*this class is in charge of the ship's clients

	*
	
	*@author Anderson Rueda.
	
	*@since 1.0
	
	*/

public class Company {

    public static final String[] TYPESCLIENT = { "Normal", "Plata", "Oro", "Platinum" };
    public static final double[] DISCOUNT = { 0.015, 0.03, 0.05 };

    private String name;

    private String commercialRNumber;

    private String dateCR;

    private double weightAccum;

    private double moneyAccum;

    private String typeClient;

    public Company(String name, String commercialRNumber, String dateCR) {

        typeClient = TYPESCLIENT[0];

        this.name = name;
        this.commercialRNumber = commercialRNumber;
        this.dateCR = dateCR;

        weightAccum = 0;
        moneyAccum = 0;

    }
	
	/**
	
	*this methodp returns the name of the client

	*<b>pre: </b> 
	
	*<b>post: return client name added
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getName() {
        return name;
    }
	
	/**
	
	*this method modifies the client's name

	*<b>pre: </b> 
	
	*<b>post: customer name changed
	
	*@param name != null
	
	*@author Anderson Rueda.
	
	*/

    public void setName(String name) {
        this.name = name;
    }
	
	/**
	
	*this methodp returns the weight accum of the client

	*<b>pre: </b> 
	
	*<b>post: return weight accum added
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public double getWeightAccum() {
        return weightAccum;
    }
	
	/**
	
	*this method modifies the weight accum

	*<b>pre: </b> 
	
	*<b>post: weight accum changed
	
	*@param weightAccum >= 0
	
	*@author Anderson Rueda.
	
	*/

    public void setWeightAccum(double weightAccum) {
        this.weightAccum = weightAccum;
    }
	
	/**
	
	*this methodp returns the money accum

	*<b>pre: </b> 
	
	*<b>post: money accum added
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public double getMoneyAccum() {
        return moneyAccum;
    }
	
	/**
	
	*this method modifies money accum

	*<b>pre: </b> 
	
	*<b>post: money accum changed
	
	*@param moneyAccum != null
	
	*@author Anderson Rueda.
	
	*/

    public void setMoneyAccum(double moneyAccum) {
        this.moneyAccum = moneyAccum;
    }
	
	/**
	
	*this methodp returns the type of client

	*<b>pre: </b> 
	
	*<b>post: return type of client added
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getTypeClient() {
        return typeClient;
    }
	
	/**
	
	*this method modifies the type of client

	*<b>pre: </b> 
	
	*<b>post: return type of client changed
	
	*@param name != null
	
	*@author Anderson Rueda.
	
	*/

    public void setTypeClient(String typeClient) {
        this.typeClient = typeClient;
    }
	
	/**
	
	*this methodp returns the commercial register number

	*<b>pre: </b> 
	
	*<b>post: commercial register number added
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getCommercialRNumber() {
        return commercialRNumber;
    }
	
	/**
	
	*this methodp returns the date of the register number

	*<b>pre: </b> 
	
	*<b>post: return date of the register number added
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getDateCR() {
        return dateCR;
    }
	
	/**
	
	*this method modifies the date of the register number

	*<b>pre: </b> 
	
	*<b>post: the date of the register number changed
	
	*@param register number != null
	
	*@author Anderson Rueda.
	
	*/

    public void setDateCR(String dateCR) {
        this.dateCR = dateCR;
    }

}