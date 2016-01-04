#ifndef SECRETSANTA_H
#define SECRETSANTA_H

#include <iostream>
<<<<<<< HEAD
#include <string>
//#include <math>
=======
#include <math>
#include <string>
>>>>>>> origin/master
#include <random>

class SecretSanta {
public:
<<<<<<< HEAD
	SecretSanta();
	SecretSanta(std::string name);
=======
>>>>>>> origin/master
	SecretSanta(std::string name, std::string wishList);
	std::string getName() const;
	std::string getWishList() const;
	void addToWishList(std::string item);
	void removeFromWishList(std::string item);
<<<<<<< HEAD
	std::string getRecipient() const;
	std::string getRecipientWishList() const;
=======
	SecretSanta getRecipient() const;
	std::string getRecipientWishlist() const;
>>>>>>> origin/master

private:
	std::string name;
	std::string wishList;
	SecretSanta* recipient;
<<<<<<< HEAD
};

#endif
=======


};
>>>>>>> origin/master
