#Pentru dezvoltarea unui joc online (cu supereroi) sa se dezvolte o solutie software care

##1. Pentru a gestiona o structura ierarhica de caractere (de ex o armata sau un grup de jucatori)
- sa se gaseasca o solutie eficienta care sa permita gruparea jucatorilor
- un grup poate contine caractere controlate de jucatori sau alte grupuri

##2. Pentru a gestiona eficient (din punct de vedere al memoriei) scenariile in care jucatorii interactioneaza cu
   mai multe caractere controlate de calculator
- colectia de caractere coordonate de calculator contine elemente de acelasi fel (aceleasi modele 3D)
- spatiul ocupat de un model 3D este semnificativ
- generarea unui astfel de scenariu necesita un spatiu semnificativ de memorie pentru client
- modelele 3D sunt afisate pe ecran la coordonate diferite si pot avea texturi de culori diferite
- trebuie gasita o solutie eficienta privind gestiunea acestor situatii
