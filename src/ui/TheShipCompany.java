package ui;

import model.*;

import java.util.Scanner;

public class TheShipCompany {

    private static MyShip elPirata;
    private static Scanner r;
    private static int opt;

    public TheShipCompany() {

    }

    public void welcomeMsg() {
        System.out.println("\n\nBIENVENIDO A LA MEJOR EMPRESA TRANSPORTISTA DEL LEJANO OESTE MARITIMO\n");

        System.out.println("********************************************************************");
        System.out.println("********************* EL PIRATA COMPANY S.A ************************");
        System.out.println("********************************************************************\n\n");

    }
	
	/**
	
	*This method allows entering the name of the captain of the ship, the 5 clients, the name of the company and also the client's data.

	*<b>pre: </b> 
	
	*<b>post: Captain's name, customer data changed
	
	*@param 
	
	*@author Anderson Rueda.
	
	*/

    public void init() {

        r = new Scanner(System.in);
        opt = 0;

        System.out.println("Ingrese el nombre del capitan del barco");
        String nameCaptain = r.nextLine();

        elPirata = new MyShip(nameCaptain);
        System.out.println("Por favor agrege los 5 clientes: \n");
        Company clients[] = new Company[5];

        int numClients = 0;

        while (numClients < clients.length) {

            System.out.println("Cual es el numbre de la empresa no. " + (numClients + 1) + "?");
            String name = r.nextLine();
            System.out.println("Cual es el numero de registro mercantil de la empresa no. " + (numClients + 1) + "?");
            String commercialRNumber = r.nextLine();
            System.out.println("Cual es la fecha de expedicion del registro mercantil de la empresa no. "
                    + (numClients + 1) + "?");
					String dateCR = r.nextLine();
            

            clients[numClients] = new Company(name, commercialRNumber, dateCR);

            numClients++;

        }

        elPirata.setClients(clients);

    }
	
	/**
	
	*This method modifies the company that owns the cargo, the type of cargo, the weight of the cargo, and also updates from customers.

	*<b>pre: </b> company, cargo and its initialized characteristics
	
	*<b>post:company that owns the cargo, type of cargo, weight, number of boxes also number of clients changed
	
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public void addLoad() {

        System.out.println("Cual es la empresa propietaria de la carga?");

        for (int i = 0; i < elPirata.getClients().length; i++) {
            System.out.println((i + 1) + " " + elPirata.getClients()[i].getName());
        }

        int numClient = r.nextInt();
        Company owner = elPirata.getClients()[numClient - 1];
        System.out.println("Cual es el tipo de carga que se desea enviar?");
        for (int i = 0; i < Load.TYPELOAD.length; i++) {
            System.out.println((i + 1) + " " + Load.TYPELOAD[i]);
        }
        String typeLoad = Load.TYPELOAD[r.nextInt() - 1];
        System.out.println("Cuanto pesa cada caja (Gramos)?");
        double weightByLoad = (r.nextDouble() * 0.001);
        System.out.println("Cuantas cajas son? ");
        int numBoxes = r.nextInt();

        Load newLoad = new Load(typeLoad, weightByLoad, numBoxes, owner);

        System.out.println(elPirata.reciveLoad(newLoad));

        // verifica si el cliente es actualizable
        if (elPirata.canUpgrade(numClient)) {

            System.out.println(elPirata.upgradeClient(numClient));

        } else {
            System.out.println(
                    "Nota: Este cliente pronto sera actualizado de plan (Solo aplica para clientes diferentes de Platinum).");
        }

    }
	
	/**
	
	*this method displays the main menu

	*<b>pre: </b> 
	
	*<b>post: main menu displaye
	 
	*@param
	
	*@author Anderson Rueda.
	
	*/

    public void showMenu() {
        System.out.println(
                "Menu principal:\n\n\nEscoja la opcion que desee:\n\n(1) Cargar el barco\n(2) Descargar el barco para iniciar un nuevo viaje\n(3) Mostrar peso total de la carga que transporta el barco\n(4) Verificar si se puede zarpar\n(5) Salir");

    }
	
	/**
	
	*this method modifies the client's name

	*<b>pre: </b> 
	
	*<b>post: customer name changed
	
	*@param name != null
	
	*@author Anderson Rueda.
	
	*/

    public void emptyMyShip() {
        System.out.println(elPirata.resetShip());
    }
	
	/**
	
	*this method prints the total weight

	*<b>pre: </b> 
	
	*<b>post: total weight displayed per screen
	
	*@param 
	
	*@author Anderson Rueda.
	
	*/

    public void showWeightActually() {
        System.out.println("El peso total de la carga hasta el momento es: " + elPirata.getTotalWeight() + "kilos");
    }
	
	/**
	
	*this method shows if the pirate can snatch or not

	*<b>pre: </b> initialized canSail method
	
	*<b>post: customer name changed
	
	*@param canSail != null
	
	*@author Anderson Rueda.
	
	*/

    public void checkSail() {
        System.out.println(elPirata.canSail());
    }
	
	/**
	
	*this method gives a message once the user exits the software

	*<b>pre: </b> 
	
	*<b>post: Thank you message for using the software to the user
	
	*@param 
	
	*@author Anderson Rueda.
	
	*/

    public void exitMsg() {
        System.out.println("Muchas gracias por utilizar este software, adios");
    }
	
	public static void main(String[] args) {
		
		 TheShipCompany myShip = new TheShipCompany();

        myShip.welcomeMsg();
        myShip.init();

        do {

            myShip.showMenu();
            opt = r.nextInt();

            switch (opt) {
                case 1:

                    myShip.addLoad();

                    break;

                case 2:
                    myShip.emptyMyShip();
                    break;

                case 3:
                    myShip.showWeightActually();
                    break;

                case 4:
                    myShip.checkSail();
                    break;

                case 5:

                    myShip.exitMsg();

                    break;

                default:
                    System.out.println("Ha digitado una opcion invalida, vuelva a intentar, gracias");
                    break;
            }

        } while (opt != 5);

        r.close();
	
	
	
	}
	
}