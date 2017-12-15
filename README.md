# Squarelotron
One class Java object that performs 3 different types of manipulations on a square matrix (2D array)

## Description 
A **Squarelotron** is a square matrix of numbers.  This matrix is made up of square rings that can flip independently either upside-down or through the main diagnol.  See example below:  

| 1 | 2 | 3 | 4 |  
| :--: | :--: | :--: | :--: |
| 5 | 6 | 7 | 8 |  
| 9 | 10 | 11 | 12 |  
| 13 | 14 | 15 | 16 |

This **Squarelotron** has two rings  
Ring **1** is the outside ring _(1 2 3 4 8 12 16 15 14 13 9 5)_  
Ring **2** is the inside ring _(6 7 11 10)_

## Examples of Manipulations
There are 3 manipulations that can be performed: **Upside-Down Flip**, **Main-Diagonol Flip**, and **Rotate Right**  
When a flip manipulation is performed you must declare what **ring** you want it performed on  
When a rotate manipulation is performed you must declare the **number** of rotations  
Below are the outputs of each performed on the example **Squarelotron** above  

#### Upside-Down Flip (Ring 1)

| 13 | 14 | 15 | 16 |  
| :--: | :--: | :--: | :--: |
| 9 | 6 | 7 | 12 |  
| 5 | 10 | 11 | 8 |  
| 1 | 2 | 3 | 4 |

#### Main-Diagonol Flip (Ring 2)

| 1 | 2 | 3 | 4 |  
| :--: | :--: | :--: | :--: |
| 5 | 6 | 10 | 8 |  
| 9 | 7 | 11 | 12 |  
| 13 | 14 | 15 | 16 |

#### Rotate Right (1 time)

| 13 | 9 | 5 | 1 |  
| :--: | :--: | :--: | :--: |
| 14 | 10 | 6 | 2 |  
| 15 | 11 | 7 | 3 |  
| 16 | 12 | 8 | 4 |

## Testing
This class was created using test-driven development, the test file is included

## Improvements/Bugs

* Add a constructor that takes in a matrix and creates a **Squarelotron** object with those values rather than the default 1, 2, 3, ..., n values
* Need to solve the **Null** issue with Upside-Down Flip on a matrix of size 3
