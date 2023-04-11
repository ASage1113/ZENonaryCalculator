# ZENonaryCalculator
Some calculations related to the hit video game, Zero Escape: 999

Rules of the game it is calulating is simple. 
9 players are trapped in a strange place, each with a bracelet stuck to them labled 1 to 9. 
The only way to progress is to open doors with the bracelets
Doors are labeled as well with single digit numbers
The rules of who can go through which door are as followed
  1. only 3 to 5 bracelets can pass through a door
  2. their bracelet numbers must have a be added together and if that digital root is equal to the door number, it will open
    i. the digital roots takes all digits in a integer above 9, and add them up, repeats till a single digit is made
      a. For example if the players with 5, 8 and 9 combine their scores, they would get a total of 22, and 2+2 = 4. So you can pass the 4 door
  3. the to escape they must progress through the location till they reach the nine door, then following the rules, they can escape.
There are other rules in the actual video game, but they aren't relavent to this project

Current Features
---
1. Able to calcuate what door a specific group of 3 to 5 players can open
2. Able to find every combination of players who can go through a particular door as well as the number of combinations available
3. Able to find every combination a particualr character would need to get through a door as well as the number of combinations available

Future Goals (in order of importance to me)
---
Make it more than just a .java file, something executable and more interactive
the ability to calcuate who multiple people can bring through a particular door
The ability to name each player
A full text based simulator for a nonary game

Known issues
---
Can repeat numbers in feature one
Only avaialbe as a .java for now, unavailabe outside of an IDE
