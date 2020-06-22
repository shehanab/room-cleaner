
# Coding Task: Robot   Cleaners

 

A series of robotic  cleaners are to be placed in a rectangular room. This room must be navigated by the cleaners so that they can clean the room.

A cleaner’s position and location is represented by a combination of x and y coordinates and a letter representing one of the four cardinal compass points. The room is divided up into a grid to simplify navigation. An example position might be (0, 0, N), which means the   cleaner is in the bottom left corner and facing North.

In order to control a cleaner, the controller sends a simple string of letters. The possible letters are ‘L’, ‘R’ and ‘M’. ‘L’ and ‘R’ make the   cleaner spin 90 degrees left or right respectively, without moving from its current spot. ‘M’ means move forward one grid point and maintain the same heading.

Assume that the square directly North from (x, y) is (x, y+1).

 

## Rules:

The room needs to be initialized with its size, the lower-left coordinates are assumed to be 0,0.
Each   cleaner needs to be initialized with its position coordinate and initial direction.
Once initialized, a   cleaner can be given a series of instructions. (L, R, and M)
Each   cleaner can be considered to be in separate room so they will not hit each other.
If a   cleaner is given an instruction that would take it through a wall, it would hit the wall and not move… it can still continue processing the rest of the instructions normally.
 

## Output:             

It should be possible to get the final coordinates and heading for each   cleaner.
 

### Example:

 

Room Size: 6 x 6

 

  Cleaner initial state: (1, 2, N)

Instructions: [L, M, L, M, L, M, L, M, M]

Final state: (1, 3, N)
 

  Cleaner initial state: (3, 5, N)

Instructions: [M, L, M]

Final state: (2, 5, W)
Note: The first ‘M’ had no effect as the   cleaner bumped into the wall.
 
