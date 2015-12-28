#ifndef SECRETSANTA_H
#define SECRETSANTA_H

#include <iostream>
#include <math>
#include <string>
#include <random>

class SecretSanta {
public:
	SecretSanta(std::string name, std::string wishList);
	std::string getName() const;
	std::string getWishList() const;
	void addToWishList(std::string item);
	void removeFromWishList(std::string item);
	SecretSanta getRecipient() const;
	std::string getRecipientWishlist() const;

private:
	std::string name;
	std::string wishList;
	SecretSanta* recipient;


};
