# Lottery

------------------------------------------------------------------------
 **Initial situation**

Mr. Keller (57) regularly plays the lottery (6aus49) and occasionally also the Euro Jackpot. Mr. Keller keeps up with the times. Of course he plays online. He plays on the website of his state lottery company (westlotto.de) with his laptop. However, the Quicktipp generators offered there do not offer the functionality that he would like. Mr. Keller would like to ensure during the generation
that his misfortune numbers don't become part of the random line of tips. He is annoyed a little every time the generated Quicktipp tip series contains one of his three unfortunate numbers. Every month his unlucky numbers, which he takes from the horoscope of his favorite magazine, also change. Mr. Keller asked us to provide him with a small Java application that he can run on his laptop in order to generate his line of tips for the next game participation. We thought it was an easy task. And because Mr. Keller is so nice, we would like to help him. Please help us, Mr. Keller help. From another conversation with Mr. Keller we have the following requirements in the form of

User stories derived:

- As a lottery player, I would like to generate a series of tips using a small Java application.

Acceptance criterion:

- As a call and a means of presentation, at least the command Line / terminal line can be used. 

- As a lottery player, I would like to determine whether a special series of bets for Lotto 6aus49 or one for Eurojackpot (5aus50 plus 2aus10) is generated.


Acceptance criteria:

- The selection of the game for which the betting series is to be generated is selected using fixed name parameters

- If this parameter is not defined, a lottery line should be selected for Lotto 6aus49

- If an invalid parameter is specified, an error message is output. The error message contains the valid name parameters.

- As a lottery player, I would like to enter up to six unlucky numbers that are excluded when generating the betting series.


Acceptance criteria:

- The misfortune numbers are transferred as call parameters
- The entered unlucky numbers are checked whether they are within the limits of the valid number range.
- If an invalid unlucky number is specified, an error message is issued. This error message should indicate the valid number range.
- The unlucky numbers are saved so that they can also be taken into account the next time they are used (after closing the application).
- The unlucky  numbers will be considered regardless of the lottery
- As a lottery player, I want to be able to set new unlucky numbers.
- As a lottery player, I would like to be able to delete the unlucky numbers.
- As a lottery player, I want the randomly determined series of bets to be output in such a way that I can simply transfer them.

- Acceptance criterion: Sorted, ascending order of the numbers of the betting series, recognizable separation for the Eurojackpot betting series first 5 out of 50 then 2 out of 10.


# How run this project?

The easiest way is, just download the project or import with Eclipes:

Don't forget to set the package name as 


```bash
Game

```
Then the run lauching file below:

```bash
Game.java

```




The program will show you the path what do to and how to proceed. 

```diff
I don't recommend to run from Windows/Linux console because 
there might be many issues regarding CLASSPATH.  
```

  

