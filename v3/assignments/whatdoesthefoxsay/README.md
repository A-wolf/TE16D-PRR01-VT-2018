# Kattisuppgift - What does the fox say

Denna vecka ska ni göra kattisuppgiften [*whatdoesthefoxsay*](https://open.kattis.com/problems/whatdoesthefoxsay "whatdoesthefoxsay").

### Uppgiften - Enkelt förklarat
Uppgiften går ut på att ni först får in en rad med massa ord som är separerade med mellanslag.<br>
Sedan får ni ett okänt antal rader med information om vilka ord som ska plockas bort. <br>
Sist får ni en rad som ska avsluta inläsning och skriva ut alla ord som är kvar från originalraden. 

#### Deadline för inlämning är Söndag vecka 4!

- **Tips**:
	-  Använd en ArrayList för att lagra alla ord.
	-  Då kan man enkelt ta bort ord om man på ett smart sätt kombinerar följande:
		-  while-loop
		-  Inbyggda metoden .contains(*String* str)
		-  Inbyggda metoden .remove(*String* str)
	-  Glöm inte bort att använda .equals(*String* str) när du ska jämföra strängar!