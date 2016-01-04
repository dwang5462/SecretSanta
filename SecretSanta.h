#ifndef SECRETSANTA_H
#define SECRETSANTA_H

#include <iostream>
#include <string>
//#include <math>
#include <random>

class SecretSanta {
public:
	SecretSanta();
	SecretSanta(std::string name);
	SecretSanta(std::string name, std::string wishList);
	std::string getName() const;
	std::string getWishList() const;
	void addToWishList(std::string item);
	void removeFromWishList(std::string item);
	std::string getRecipient() const;
	std::string getRecipientWishList() const;

private:
	std::string name;
	std::string wishList;
	SecretSanta* recipient;
};

#endif