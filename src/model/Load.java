package model;

/**
	
	*this class handles customer loads

	*
	
	*@author Anderson Rueda.
	
	*@since 1.0
	
	*/

public class Load {

    public final static String[] TYPELOAD = { "PELIGROSA", "PERECEDERA", "NO PERECEDERA" };

    private String typeLoad;

    private double weightByLoad;

    private int numBoxes;

    private Company owner;

    public Load(String typeLoad, double weightByLoad, int numBoxes, Company owner) {

        this.typeLoad = typeLoad;
        this.weightByLoad = weightByLoad;
        this.numBoxes = numBoxes;

        this.owner = owner;
    }
	
	/**
	
	*this methodp returns the type of load

	*<b>pre: </b> 
	
	*<b>post: return getTypeLoad
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getTypeLoad() {
        return typeLoad;
    }
	
	/**
	
	*this methodp returns the weight of the load

	*<b>pre: </b> 
	
	*<b>post: return getWeightByLoad
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public double getWeightByLoad() {
        return weightByLoad;
    }
	
	/**
	
	*this methodp returns the number boxes

	*<b>pre: </b> 
	
	*<b>post: return getNumBoxes
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public int getNumBoxes() {
        return numBoxes;
    }
	
	/**
	
	*this methodp returns the owner of the load

	*<b>pre: </b> 
	
	*<b>post: return getOwner
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public Company getOwner() {
        return owner;
    }

}