public class SecretSantaTester {
	public static void main(String[] args){
		SecretSanta fred = new SecretSanta("Fred","Chess Set");
		SecretSanta bob = new SecretSanta("Bob", "Bouncy Ball");
		fred.setRecipient(bob);
		
		
		System.out.println("The first Secret Santa is called " + fred.getName());
		System.out.println("The second Secret Santa is called " + bob.getName());
		System.out.println("Fred's recipient is named " + fred.getRecipient().getName());
		System.out.println("Fred needs to buy " + fred.getRecipientWishList() + " for his recipient.");
		
	}
}
