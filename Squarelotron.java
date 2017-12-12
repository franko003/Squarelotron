

public class Squarelotron {
    //instance variables
    int[][] squarelotron;
    int size;
    //constructor
    Squarelotron(int n) {
	size = n;
	//fills 2D array with numbers 1 to n squared, in order
	int count = 1;
	squarelotron = new int[n][n];
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		squarelotron[i][j] = count;
		count += 1;
	    }
	}
    }
    //definition of equals for object Squarelotron
    public boolean equals(Object obj) {
	Squarelotron s = (Squarelotron)obj;
	if (this.squarelotron == s.squarelotron) {
	    if (this.size == s.size) {
		return true;
	    } else {
		return false;
	    }
	} else {
	    return false;
	}
    }
    //methods
    Squarelotron upsideDownFlip(int ring) {
	Squarelotron square = new Squarelotron(size);

	//get the first and last row and column for the ring and store to variables
	int firstRowColumn = ring - 1;
	int lastRowColumn = size - ring;
	/* YOU NEED TO WORK IN HERE TO GET THIS FLIP DOWN FOR RINGS 2 AND GREATER
	 * AS OF RIGHT NOW FOR A SQUARELOTRON OF SIZE 5 A FLIP ON RING 2 WOULD GIVE THIS [21,22,23,24,25]
	 * FOR THE 2ND ROW AND IT SHOULD BE [[6,22,23,24,10]
	 */
	//gets the length of the top row and initializes an array to store it in in order to flip top and bottom rows
	int lengthTop = size - 2 *(ring - 1);
	int[] placeHolder = new int[lengthTop];
	int start = firstRowColumn;
	for (int i = 0; i < lengthTop; i++) {
	    placeHolder[i] = square.squarelotron[lastRowColumn][start];
	    start += 1; 
	}
	int start1 = firstRowColumn;
	for (int j = firstRowColumn; j <= lastRowColumn; j++) {
	    square.squarelotron[lastRowColumn][j] = square.squarelotron[firstRowColumn][start1];
	    start1 += 1; 
	}
	int start2 = 0;
	for (int k = firstRowColumn; k <= lastRowColumn; k++) {
	    square.squarelotron[firstRowColumn][k] = placeHolder[start2];
	    start2 += 1; 
	}

	/*
	//flips the top row and bottom row of the input ring
	int[] placeHolder = square.squarelotron[lastRowColumn];
	square.squarelotron[lastRowColumn] = square.squarelotron[firstRowColumn];
	square.squarelotron[firstRowColumn] = placeHolder;
	 */
	//check for an even or odd number of rows in the squarelotron and get the center
	if (size % 2 == 0) {
	    //set variables for where to start flipping from the top and bottom
	    int startBottom = size / 2;
	    int startTop = startBottom -1;
	    //loop through each row that needs to be flipped from center back out and flip both columns of ring
	    while (startTop > firstRowColumn) {
		int placeHolder1 = square.squarelotron[startBottom][firstRowColumn];
		square.squarelotron[startBottom][firstRowColumn] = square.squarelotron[startTop][firstRowColumn];
		square.squarelotron[startTop][firstRowColumn] = placeHolder1;

		int placeHolder2 = square.squarelotron[startBottom][lastRowColumn];
		square.squarelotron[startBottom][lastRowColumn] = square.squarelotron[startTop][lastRowColumn];
		square.squarelotron[startTop][lastRowColumn] = placeHolder2;

		startTop -= 1;
		startBottom += 1;
	    }
	} else {
	    int startBottom1 = (int) size / 2 + 1;
	    int startTop1 = startBottom1 - 2;

	    while (startTop1 > firstRowColumn) {
		int placeHolder1 = square.squarelotron[startBottom1][firstRowColumn];
		square.squarelotron[startBottom1][firstRowColumn] = square.squarelotron[startTop1][firstRowColumn];
		square.squarelotron[startTop1][firstRowColumn] = placeHolder1;

		int placeHolder2 = square.squarelotron[startBottom1][lastRowColumn];
		square.squarelotron[startBottom1][lastRowColumn] = square.squarelotron[startTop1][lastRowColumn];
		square.squarelotron[startTop1][lastRowColumn] = placeHolder2;

		startTop1 -= 1;
		startBottom1 += 1;
	    }
	}
	return square;
    }
    Squarelotron mainDiagonalFlip(int ring) {
	Squarelotron squareFlip = new Squarelotron(this.size);
	//get the first and last row and column for the ring and store to variables
	int firstFlip = ring - 1;
	int lastFlip = this.size - ring;
	// define iteration length and put first and last row and column numbers in an array in order to iterate
	int[] diagFlip = {firstFlip, lastFlip};
	int iterLength = this.size - 2 * (ring - 1);

	for (int n: diagFlip) {
	    for (int i = firstFlip; i < iterLength + firstFlip; i++) {
		squareFlip.squarelotron[n][i] = this.squarelotron[i][n];
	    }
	    for (int m: diagFlip) {
		for (int j = firstFlip; j < iterLength + firstFlip; j++) {
		    squareFlip.squarelotron[j][m] = this.squarelotron[m][j];
		}
	    }
	}
	return squareFlip;
    }

    void rotateRight(int numberOfTurns) {
	//Initialize a blank 2D array to populate for rotation
	int[][] rotatedSquare = new int[size][size];
	//use absolute value of numberOfTurns variable so we can use mod operator later

	//Check for mod4 to determine number of rotations
	if (numberOfTurns % 4 == 1 || numberOfTurns % 4 == -3) {
	    //initiate int to keep track of row
	    int row = 0;
	    //loop through starting from the [0,n] index of the rotated squarelotron and fill in with the values of the original squarelotron
	    for (int i = size - 1; i >= 0; i--) {
		for (int j = 0; j < size; j++) {
		    rotatedSquare[j][i] = squarelotron[row][j];
		}
		row += 1;
	    }
	    /*
		THIS IS THE CODE THAT WAS WORKING BEFORE
	    int count1 = 1;

	    for (int i = size - 1; i >= 0; i--) {
		for (int j = 0; j < size; j++) {
		    rotatedSquare[j][i] = count1;
		    count1 += 1;
		}
		//insert startIndex = startArray[j];

	    }
	     */
	    squarelotron = rotatedSquare;
	}
	if (numberOfTurns % 4 == 2 || numberOfTurns % 4 == -2) {
	    int row = 0;
	    for (int k = size - 1; k >= 0; k--) {
		for (int l = size - 1, z = 0; l >= 0; l--, z++) {
		    rotatedSquare[k][l] = squarelotron[row][z];
		}
		row += 1;
	    }
	    squarelotron = rotatedSquare;
	}
	if (numberOfTurns % 4 == 3 || numberOfTurns % 4 == -1) {
	    int row = 0;
	    for (int x = 0; x < size; x++) {
		for (int y = size - 1, z = 0; y >= 0; y--, z++) {
		    rotatedSquare[y][x] = squarelotron[row][z];
		}
		row += 1;
	    }
	    squarelotron = rotatedSquare;
	}
    }

    // USED TO RUN TESTS ON SQUARELOTRON METHODS
    /*
    public static void main(String[] args) {
	int checkSize = 4;
	Squarelotron s1 = new Squarelotron(checkSize);
	s1.rotateRight(1);    
	s1.rotateRight(2);

	for (int i = 0; i < checkSize; i++) {
	    for (int j = 0; j < checkSize; j++) {
		//System.out.println(s1.upsideDownFlip(2).squarelotron[i][j]);
		//System.out.println(s1.mainDiagonalFlip(2).squarelotron[i][j]);
		System.out.println(s1.squarelotron[i][j]);
	    }
	    System.out.println("END ROW");
	}

    }
     */

}
