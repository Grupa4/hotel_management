package hotel_management;

import java.sql.SQLException;

public class MainMetoda {

	public static void main(String[] args) throws SQLException {
		
		java.util.Scanner unos=new java.util.Scanner(System.in);
		
		// Kreiramo ConnectDB objekat
		ConnectDB db = new ConnectDB();
		db.createDB();
		db.createTableRooms();
		db.createTableUsers();
		db.createTableServices();
		
		System.out.println("\nHOTEL SISTEM - DOBRODOSLI! \n");
		System.out.println("Unesite username:");
		String username=unos.nextLine();
		System.out.println("Unesite password:");
		String password=unos.nextLine();
		
		//Provjera postoji li korisnik i citanje id-a
		String idKorisnika=db.provjeriKorisnika(username, password);
		
		System.out.println(); //Prazan red
		
		if(idKorisnika.equals("0000")){
		// Ulazimo u meni administratora
		ManagementInterface admin = new ManagementInterface();
		admin.meniZaAdmina();
		
		}else {
		//Ulazimo u meni gosta
		GuestInterface gost=new GuestInterface(idKorisnika);	
		gost.meniKorisnika();
		}
		

	}
	
	
}