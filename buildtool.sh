#!/bin/bash

DESTINATION=/c/Users/mehrab/bin/pokeapp

install() {
	echo "Installing to $DESTINATION..."
	cp pokeapp $DESTINATION
}

uninstall() {
	echo "Uninstalling to $DESTINATION..."
	rm "$DESTINATION"
}

test() {
	echo "Testing..."
	./pokeapp num Grass > numGrass.actual
	cmp numGrass.actual numGrass.expected || echo "numGrass test failed..."
}

"$@"

