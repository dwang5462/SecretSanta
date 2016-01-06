public class SecretSantaList{
	private int listSize;
	private int numSantasInList;
	private SecretSanta[] santasList;

	SecretSantaList(int size){
		listSize = size;
		numSantasInList = 0;
		santasList = new SecretSanta[listSize];
	}
	void addSecretSanta(SecretSanta person){
		if (numSantasInList < listSize){
			santasList[numSantasInList] = person;
			numSantasInList++;
		}

	}
	void deleteSecretSanta(SecretSanta person){
		int position = 0;
		boolean deleteSanta = false;
		for(; position < numSantasInList; position++){
			if(santasList[position] == person)
				deleteSanta = true;
				break;
		}
		if(deleteSanta == true){
			for(int i = position+1; i < numSantasInList; i++){
				santasList[i-1] = santasList[i];
			}
			santasList[numSantasInList-1] = null;
			numSantasInList--;
		}	
	}
	SecretSanta[] getSantasList(){
		return santasList;
	}
	int getNumSantasInList(){
		return numSantasInList;
	}
	void randomizeOrder(){
		for(int i = 0; i<numSantasInList; i++){
			int randomPos = (int)(Math.random()*numSantasInList);
			SecretSanta tempSanta = santasList[i];
			santasList[i] = santasList[randomPos];
			santasList[randomPos] = tempSanta;
		}

	}
	void setAllRecipients(){
		for(int i = 0; i < numSantasInList-1; i++){
			santasList[i].setRecipient(santasList[i+1]);
		}
		santasList[numSantasInList-1].setRecipient(santasList[0]);


	}


}