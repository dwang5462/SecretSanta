#include "SecretSanta.h"
#include <string>

SecretSanta::SecretSanta() {
	this->name = "";
	this->wishList = "";
}
SecretSanta::SecretSanta(std::string name) {
	this->name = name;
	this->wishList = "";
}
SecretSanta::SecretSanta(std::string name, std::string wishList) {
	this->name = name;
	this->wishList = wishList;
}
	
std::string SecretSanta::getName() const {
	return this->name;
}
	
std::string SecretSanta::getWishList() const {
	return this->wishList;
}
	
void SecretSanta::addToWishList(std::string item) {
	if (this->wishList = "")
		this->wishList += item;
	else
		this->wishList = this->wishList + ", " + item;
}
	
void SecretSanta::removeFromWishList(std::string item) {
	std::string::size_type i = this->wishList.find(item);
	if (i != std::string::npos)
   		this->wishList.erase(i, item.length());
}
	
SecretSanta SecretSanta::getRecipient() const {
	return this->recipient;
}
	
std::string SecretSanta::getRecipientWishlist() const {
	return this->recipient.wishList;
}