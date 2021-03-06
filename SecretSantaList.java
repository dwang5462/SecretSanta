import java.util.ArrayList;

public class SecretSantaList{
	private int numSantasInList;
	private ArrayList<SecretSanta> santasList;

	SecretSantaList(){
		numSantasInList = 0;
		santasList = new ArrayList<SecretSanta>();
	}
	void addSecretSanta(SecretSanta person){
		santasList.add(person);
		numSantasInList++;
	}
	void deleteSecretSanta(SecretSanta person){
		santasList.remove(person);
		numSantasInList--;
	}
	ArrayList<SecretSanta> getSantasList(){
		return santasList;
	}
	int getNumSantasInList(){
		return numSantasInList;
	}
	void randomizeOrder(){
		for(int i = 0; i<numSantasInList; i++){
			int randomPos = (int)(Math.random()*numSantasInList);
			SecretSanta tempSanta = santasList.get(i);
			santasList.set(i, santasList.get(randomPos));
			santasList.set(randomPos, tempSanta);
		}

	}
	void setAllRecipients(){
		for(int i = 0; i < numSantasInList-1; i++){
			santasList.get(i).setRecipient(santasList.get(i+1));
		}
		santasList.get(numSantasInList-1).setRecipient(santasList.get(0));


	}


}