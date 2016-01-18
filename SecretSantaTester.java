import java.util;

public class SecretSantaTester {
	public static void main(String[] args){
		SecretSanta fred = new SecretSanta("Fred","Chess Set");
		SecretSanta bob = new SecretSanta("Bob", "Bouncy Ball");
		fred.setRecipient(bob);
		SecretSantaList listSS = new SecretSantaList();
		listSS.addSecretSanta(fred);
		listSS.addSecretSanta(bob);

		System.out.println("Number of santas in the list: " + listSS.getNumSantasInList());
		System.out.println("1st Santa in the list: " + listSS.getSantasList().get(0).getName());
		System.out.println("2nd Santa in the list: " + listSS.getSantasList().get(1).getName());
		
		listSS.randomizeOrder();
		System.out.println("1st Santa in the list: " + listSS.getSantasList().get(0).getName());
		System.out.println("2nd Santa in the list: " + listSS.getSantasList().get(1).getName());
		

		listSS.setAllRecipients();
		System.out.println("1st Santa's recipient is : " +  listSS.getSantasList().get(0).getRecipient().getName());
		System.out.println("2nd Santa's recipient is : " +  listSS.getSantasList().get(1).getRecipient().getName());



		listSS.deleteSecretSanta(fred);
		System.out.println("1st Santa in the list: " + listSS.getSantasList().get(0).getName());
		System.out.println("Number of santas in the list: " + listSS.getNumSantasInList());
		
		System.out.println("The first Secret Santa is called " + fred.getName());
		System.out.println("The second Secret Santa is called " + bob.getName());
		System.out.println("Fred's recipient is named " + fred.getRecipient().getName());
		System.out.println("Fred needs to buy " + fred.getRecipientWishList() + " for his recipient.");
		
	}
}
