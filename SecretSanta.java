import java.util.ArrayList;

public class SecretSanta {
	private String name;
	private WishList santaWishList;
	private SecretSanta recipient;
	
	class WishList {
		private ArrayList<String> list;

		WishList() {
			list = new ArrayList<String>();
		}

		String toString() {
			return list.toString();
		}

		void addToWishList(String item){
			list.add(item);
		}
		void removeFromWishList(String item){
			list.remove(item);
		}
	}
	SecretSanta(){
		name = "";
		santaWishList = new Wishlist();
	}
	SecretSanta(String santaName){
		name = santaName;
		santaWishList = new Wishlist();
	}
	SecretSanta(String santaName, String item){
		name = santaName;
		santaWishList = new Wishlist();
		santaWishList.addToWishList(item);
	}
	String getName(){
		return name;
	}
	Wishlist getWishList(){
		return santaWishList;
	}
	
	SecretSanta getRecipient(){
		return recipient;
	}
	void setRecipient(SecretSanta recip){
		recipient = recip;
	}
	String getRecipientWishList(){
		return recipient.getWishList().toString();
	}
	String toString() {
		return "Name: " + name + "\n" + "Wishlist: " + santaWishList.toString();
	}
}
