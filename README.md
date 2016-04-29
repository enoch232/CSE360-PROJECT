# CSE360 - Group Project 

> This is a group project for CSE360 (Spring 2016).

***

## Group Member

- Joshua Hsu (*jahsu*)
- Enoch Ko (*Enoch Ko*)
- Richard Quach (*RichardQuach*)
- Yanyao Wang (*yanyaowang*)
- Zeyu Zhang (*TooSchoolForCool*)

***
## Build Instructions
- This program runs off of Java 1.7. 
- Put all of the class files in the same folder and run the tester class to run the program. This is for running the text version of the game.
- You can also use command line `javac Tester.java` for compiling and use `java Tester` for running the program
- To run the GUI version of the game, take the DiceGameApp folder and run it as a project. We used Netbeans to run the project.

***

## Dice Game

>  At the start of each round, a player can bet an amount. Each player can choose to roll the dice or pass the his turn. Once a player pass his turn he cannot roll the dice any more. If all players choose PASS their own turn, then this round is over and will pick up a winner. The aim of the game is to accumulate a higher point total than the other players, but without exceeding a target number (for example 31). The winner of a round will receive a bet reward, and the losers will lose the amount they bet. The goal is to be the last person remaining with a positive balance. 

***

## Rules
- At the start of the game, the admin will be prompted to enter the target score.
- Next, the admin will be prompted to enter the number of players.
- Each player will then be prompted to enter their name and their balance.
- Then each player will take their turn. During their turn, they can check the ranking board, check current score, check current balance, pass their turn, roll the dice, bet an amount, or quit.
- At the start of each round, each player will be prompted to bet an amount. Afterwards, the turns will begin.
- If a player selects roll, they will roll a dice. The value of their roll will be added to their score. The goal of this game is to have the player's score be closest or equal to the target score without exceeding it. If a player exceeds the target score, they lose that round.
- A player can pass their turn. If they pass their turn, the turn will go to the next player. If every player passes their turn consecutively, the round will end.
- When a round ends, the winner will be decided. The winner will be the player whose score is closest or equal to the target score.
- The winner of a round will receive the same amount they bet back, including their initial bet. For example, if a player has a balance of 100 and bets 10 and wins the round, their balance would be 110 at the end of that round.
- In the event of a tie, the players who have tied will be considered winners of that round, and will each receive their bet rewards.
- A player can choose to quit the game. If they do so, they will be removed from the game.
- The game will end when all players have quit the game or there is only one player left with a positive balance.