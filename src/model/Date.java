package model;



public class Date {

    private int day;

    private int month;
    
    private int year;

    
    

    public Date(int day, int month,int year) {

        this.day=day;

        this.month=month;

        this.year=year;

       

    }
	
	/**
	
	*this method modifies the day of the date of register
	

	*<b>pre: </b> 
	
	*<b>post: day of the date of register changed
	
	*@param day != null
	
	*@author Anderson Rueda.
	
	*/

    public void setDay(int day) {

        this.day=day;

    }
	
	/**
	
	*this methodp returns the day of the date of register  

	*<b>pre: </b> 
	
	*<b>post: day of the date of register added
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getday() {

        return day;

    }
	
	/**
	
	*this method modifies the month of the date of register

	*<b>pre: </b> 
	
	*<b>post: month of the date of register changed
	
	*@param month != null
	
	*@author Anderson Rueda.
	
	*/

    public void setMonth(int month) {

        this.month=month

    }
	
	/**
	
	*this methodp returns the month of the date of register 

	*<b>pre: </b> 
	
	*<b>post: month of the date of register added
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public int getMont(){

        return month;
    }
	
	/**
	
	*this method modifies the year of the date of register

	*<b>pre: </b> 
	
	*<b>post: year of the date of register changed
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public void setyear(int year) {

        this.year=year;

    }
	
	/**
	
	*this methodp returns the year of the date of register 

	*<b>pre: </b> 
	
	*<b>post: year of the date of register added
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public String getyear() {

        return year;

    }

    

   



}