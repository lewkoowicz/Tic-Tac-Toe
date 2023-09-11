# Tic-Tac-Toe Game

This is a simple text-based Tic-Tac-Toe game implemented in Java. It allows two players to take turns marking cells on a 3x3 grid until one player wins, or the game ends in a draw.

## How to Play

1. Compile and run the Java program.

2. The game board is displayed as a 3x3 grid, with each cell initially empty.


3. Players take turns entering their moves. When prompted, enter the row and column where you want to place your mark (X or O). Rows and columns are numbered from 1 to 3. For example, to place your mark in the center cell, you would enter "2 2".

4. The game will continue until one player wins (by forming a horizontal, vertical, or diagonal line of their marks), or the game ends in a draw (all cells are filled).

5. The game will announce the winner or declare a draw and then exit.

## Rules

- Player 1 is X, and Player 2 is O.
- A player cannot place their mark in a cell that is already occupied.
- The game checks for a winner after each move and ends if there is one.
- If all cells are filled and there is no winner, the game ends in a draw.

## Additional Notes

- The program includes input validation to ensure that only valid coordinates are accepted.
- It uses a simple 2D array to represent the game board.
- The game loop continues until there is a winner or a draw, at which point the game ends.
