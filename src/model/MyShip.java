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
	
	// calcula el costo de una nueva carga incluyemdo posibles descuentos, si el
    // cliente es de tipo "Normal" no tiene descuento
    public double costOfLoad(Load newLoad) {

        double total = 0;

        double weightTotal = 0;

        if (newLoad.getTypeLoad().equals(Load.TYPELOAD[0])) {

            weightTotal = newLoad.getWeightByLoad() * newLoad.getNumBoxes();
            total = weightTotal * 390000;

        } else if (newLoad.getTypeLoad().equals(Load.TYPELOAD[1])) {

            weightTotal = newLoad.getWeightByLoad() * newLoad.getNumBoxes();
            total = weightTotal * 250000;

        } else {

            weightTotal = newLoad.getWeightByLoad() * newLoad.getNumBoxes();
            total = weightTotal * 80000;

        }

        if (newLoad.getOwner().getTypeClient().equals(Company.TYPESCLIENT[1])
                && newLoad.getTypeLoad().equals(Load.TYPELOAD[1])) {
            total -= total * Company.DISCOUNT[0];
        }

        if (newLoad.getOwner().getTypeClient().equals(Company.TYPESCLIENT[2])
                && (newLoad.getTypeLoad().equals(Load.TYPELOAD[1]) || newLoad.getTypeLoad().equals(Load.TYPELOAD[2]))) {
            total -= total * Company.DISCOUNT[1];
        }

        if (newLoad.getOwner().getTypeClient().equals(Company.TYPESCLIENT[3])) {
            total -= total * Company.DISCOUNT[2];
        }

        return total;
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