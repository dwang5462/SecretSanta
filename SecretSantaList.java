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
			if(santasList[position] == person;)
				deleteSanta = true;
				break;
		}
		for(int i = position+1; i < numSantasInList; i++){
			santasList[i] = santasList[i-1];
		}
		if(deleteSanta == true){
			santasList[numSantasInList] = null;
			numSantasInList--;
		}
	}


}