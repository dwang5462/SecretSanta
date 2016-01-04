#ifndef SECRETSANTALIST_H
#define SECRETSANTALIST_H

#include "SecretSanta.h"
#include <cstdlib>
#include <iostream>
#include <string>

class SecretSantaList {
public:
	SecretSantaList(size_t size);
	void addSecretSanta(SecretSanta person);
	void deleteSecretSanta(SecretSanta person);

private:
	size_t size;
	SecretSanta *santas[size];
};

#endif

