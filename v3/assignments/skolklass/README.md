# Skolklass

Uppgiften går ut på att ni ska skapa en egen java-class som ska ha namnet *Skolklass* och vars huvudsakliga syfte är att innehålla 
funktionalitet för att lagra namn på elever i en skolklass. <br>
*Förslagsvis med hjälp av en ArrayList, som vi nyss gått igenom.*

#### Deadline för inlämning är Söndag vecka 4!

## Betygskrav
### E
- *Skolklass* ska ha en konstruktor där man skickar med en 
[*File*](https://docs.oracle.com/javase/8/docs/api/java/io/File.html "File Documentation")
med namn på elever som läses in rad för rad.
- I *Skolklass* ska det gå att skriva ut elevernas namn i namnordning sorterat på **antingen** förnamn eller efternamn.

### C
- I *Skolklass* ska det gå att skriva ut elevernas namn i namnordning sorterat på **både** förnamn och efternamn.
- *Skolklass* ska kunna skapa och skriva ut slumpade grupper med en given gruppstorlek som parameter.
- *Skolklass* ska även ha en tom konstruktor där man själv får skriva in elevers namn via konsolen, rad för rad.

### A
- Du ska ha en till class som heter *Elev* och vars syfte är att lagra information om en skolelev.
  -  Minimumkrav är att en *Elev* ska ha enbart ett förnamn och minst ett efternamn.
- Din *Skolklass* ska skapas med formattering som i de bifogade filerna 
[**te16c.txt**](https://github.com/JaoK/PRR01-VT-2018/blob/master/v3/assignments/skolklass/te16c.txt "te16c") 
eller 
[**te16d.txt**](https://github.com/JaoK/PRR01-VT-2018/blob/master/v3/assignments/skolklass/te16d.txt "te16d").
- *Skolklass* ska då isället för att innehålla namnrepresentationer i from av strängar, innehålla objekt av typen *Elev*.
- Det ska fortfarande gå att göra alla tidigare nämnda kriterier, bara att *Skolklass* innehåller *Elev*er istället för strängar.