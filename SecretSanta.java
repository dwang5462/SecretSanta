public class SecretSanta {
	private String name;
	private String wishList;
	private SecretSanta recipient;
	
	SecretSanta(){
		name = "";
		wishList = "";
	}
	SecretSanta(String santaName){
		name = santaName;
		wishList = "";
	}
	SecretSanta(String santaName, String wishL){
		name = santaName;
		wishList = wishL;
	}
	String getName(){
		return name;
	}
	String getWishList(){
		return wishList;
	}
	void addToWishList(String item){
		wishList += item;
	}
	void removeFromWishList(String item){
		
	}
	SecretSanta getRecipient(){
		return recipient;
	}
	void setRecipient(SecretSanta recip){
		recipient = recip;
	}
	String getRecipientWishList(){
		return recipient.getWishList();
	}
}
