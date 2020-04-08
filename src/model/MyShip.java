package model;

import java.util.ArrayList;

public class MyShip {

    public final static double WEIGHTLIMIT = 28000;

    private String nameCaptain;

    private ArrayList<Load> theLoads;
    private Company[] clients;

    private double totalWeight;

    public MyShip(String nameCamptain) {

        nameCaptain = nameCamptain;

        totalWeight = 0;

        theLoads = new ArrayList<Load>();

    }
	
	public String getNameCaptain() {
        return nameCaptain;
    }
	
	public Company[] getClients() {
        return clients;
    }

    public void setClients(Company[] clients) {
        this.clients = clients;
    }

    public ArrayList<Load> getMyLoads() {
        return theLoads;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }