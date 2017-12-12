
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SquarelotronTest {
    Squarelotron testSquare2;
    Squarelotron testSquare3;
    Squarelotron testSquare4;
    Squarelotron testSquare5;
    Squarelotron testSquare6;
    Squarelotron testSquare7;
    Squarelotron testSquare8;

    @Before
    public void setUp() throws Exception {
	testSquare2 = new Squarelotron(2);
	testSquare3 = new Squarelotron(3);
	testSquare4 = new Squarelotron(4);
	testSquare5 = new Squarelotron(5);
	testSquare6 = new Squarelotron(6);
	testSquare7 = new Squarelotron(7);
	testSquare8 = new Squarelotron(8);
    }

    @Test
    public void testUpsideDownFlip() {
	//Ring 1 Tests
	//Tests for even sided
	assertEquals(4, testSquare2.upsideDownFlip(1).squarelotron[0][1]);
	assertEquals(8, testSquare4.upsideDownFlip(1).squarelotron[2][3]);
	assertEquals(12, testSquare6.upsideDownFlip(1).squarelotron[4][5]);
	assertEquals(5, testSquare8.upsideDownFlip(1).squarelotron[7][4]);
	assertEquals(48, testSquare8.upsideDownFlip(1).squarelotron[2][7]);
	
	//Tests for odd sided
	assertEquals(3, testSquare3.upsideDownFlip(1).squarelotron[2][2]);
	assertEquals(20, testSquare5.upsideDownFlip(1).squarelotron[1][4]);
	assertEquals(6, testSquare5.upsideDownFlip(1).squarelotron[3][0]);
	assertEquals(49, testSquare7.upsideDownFlip(1).squarelotron[0][6]);
	assertEquals(15, testSquare7.upsideDownFlip(1).squarelotron[4][0]);
	
	//Ring 2 Tests
	//Tests for even sided
	assertEquals(6, testSquare4.upsideDownFlip(2).squarelotron[2][1]);
	assertEquals(17, testSquare6.upsideDownFlip(2).squarelotron[3][4]);
	assertEquals(11, testSquare6.upsideDownFlip(2).squarelotron[4][4]);
	assertEquals(50, testSquare8.upsideDownFlip(2).squarelotron[1][1]);
	assertEquals(39, testSquare8.upsideDownFlip(2).squarelotron[3][6]);
		
	//Tests for odd sided
	assertEquals(7, testSquare3.upsideDownFlip(2).squarelotron[2][0]);
	assertEquals(20, testSquare5.upsideDownFlip(2).squarelotron[3][4]);
	assertEquals(19, testSquare5.upsideDownFlip(2).squarelotron[1][3]);
	assertEquals(39, testSquare7.upsideDownFlip(2).squarelotron[1][3]);
	assertEquals(13, testSquare7.upsideDownFlip(2).squarelotron[5][5]);
	
	//Ring 3 Tests
	//Tests for even sided
	assertEquals(22, testSquare6.upsideDownFlip(3).squarelotron[2][3]);
	assertEquals(35, testSquare8.upsideDownFlip(3).squarelotron[3][2]);
	assertEquals(38, testSquare8.upsideDownFlip(3).squarelotron[3][5]);
	
	//Tests for odd sided
	assertEquals(18, testSquare5.upsideDownFlip(3).squarelotron[3][2]);
	assertEquals(24, testSquare7.upsideDownFlip(3).squarelotron[3][2]);
	assertEquals(33, testSquare7.upsideDownFlip(3).squarelotron[2][4]);
	
	//Ring 4 Tests
	assertEquals(25, testSquare7.upsideDownFlip(4).squarelotron[3][3]);
	assertEquals(36, testSquare8.upsideDownFlip(4).squarelotron[3][3]);
    }

    @Test
    public void testMainDiagonalFlip() {
	//Ring 1 Tests
	assertEquals(3, testSquare2.mainDiagonalFlip(1).squarelotron[0][1]);
	assertEquals(8, testSquare3.mainDiagonalFlip(1).squarelotron[1][2]);
	assertEquals(15, testSquare4.mainDiagonalFlip(1).squarelotron[2][3]);
	assertEquals(3, testSquare5.mainDiagonalFlip(1).squarelotron[2][0]);
	assertEquals(25, testSquare6.mainDiagonalFlip(1).squarelotron[0][4]);
	assertEquals(46, testSquare7.mainDiagonalFlip(1).squarelotron[3][6]);
	assertEquals(58, testSquare8.mainDiagonalFlip(1).squarelotron[1][7]);
	
	//Ring 2 Tests
	assertEquals(2, testSquare2.mainDiagonalFlip(2).squarelotron[0][1]);
	assertEquals(6, testSquare3.mainDiagonalFlip(2).squarelotron[1][2]);
	assertEquals(10, testSquare4.mainDiagonalFlip(2).squarelotron[1][2]);
	assertEquals(14, testSquare5.mainDiagonalFlip(2).squarelotron[3][2]);
	assertEquals(2, testSquare6.mainDiagonalFlip(2).squarelotron[0][1]);
	assertEquals(27, testSquare7.mainDiagonalFlip(2).squarelotron[5][3]);
	assertEquals(51, testSquare8.mainDiagonalFlip(2).squarelotron[2][6]);
	
	//Ring 3 Tests
	assertEquals(2, testSquare2.mainDiagonalFlip(3).squarelotron[0][1]);
	assertEquals(6, testSquare3.mainDiagonalFlip(3).squarelotron[1][2]);
	assertEquals(7, testSquare4.mainDiagonalFlip(3).squarelotron[1][2]);
	assertEquals(13, testSquare5.mainDiagonalFlip(3).squarelotron[2][2]);
	assertEquals(21, testSquare6.mainDiagonalFlip(3).squarelotron[2][3]);
	assertEquals(26, testSquare7.mainDiagonalFlip(3).squarelotron[4][3]);
	assertEquals(21, testSquare8.mainDiagonalFlip(3).squarelotron[4][2]);
	
	//Ring 4 Tests
	assertEquals(2, testSquare2.mainDiagonalFlip(4).squarelotron[0][1]);
	assertEquals(6, testSquare3.mainDiagonalFlip(4).squarelotron[1][2]);
	assertEquals(7, testSquare4.mainDiagonalFlip(4).squarelotron[1][2]);
	assertEquals(13, testSquare5.mainDiagonalFlip(4).squarelotron[2][2]);
	assertEquals(21, testSquare6.mainDiagonalFlip(4).squarelotron[3][2]);
	assertEquals(26, testSquare7.mainDiagonalFlip(4).squarelotron[3][4]);
	assertEquals(29, testSquare8.mainDiagonalFlip(4).squarelotron[4][3]);
    }

    @Test
    public void testRotateRight() {
	testSquare2.rotateRight(1);
	testSquare3.rotateRight(1);
	testSquare4.rotateRight(1);
	testSquare5.rotateRight(1);
	testSquare6.rotateRight(1);
	testSquare7.rotateRight(1);
	testSquare8.rotateRight(1);
	//Test for mod4 == 0 rotations
	/*
	assertEquals(4, testSquare2.squarelotron[1][1]);
	assertEquals(5, testSquare3.squarelotron[1][1]);
	assertEquals(6, testSquare4.squarelotron[1][1]);
	assertEquals(7, testSquare5.squarelotron[1][1]);
	assertEquals(8, testSquare6.squarelotron[1][1]);
	assertEquals(9, testSquare7.squarelotron[1][1]);
	assertEquals(10, testSquare8.squarelotron[1][1]);
	*/
	//Test for mod4 == 1 rotations
	assertEquals(4, testSquare2.squarelotron[1][0]);
	assertEquals(3, testSquare3.squarelotron[2][2]);
	assertEquals(16, testSquare4.squarelotron[3][0]);
	assertEquals(21, testSquare5.squarelotron[0][0]);
	assertEquals(14, testSquare6.squarelotron[1][3]);
	assertEquals(10, testSquare7.squarelotron[2][5]);
	assertEquals(16, testSquare8.squarelotron[7][6]);
	/*
	//Test for mod4 == 2 rotations
	assertEquals(1, testSquare2.squarelotron[1][1]);
	assertEquals(2, testSquare3.squarelotron[2][1]);
	assertEquals(1, testSquare4.squarelotron[3][3]);
	assertEquals(3, testSquare5.squarelotron[4][2]);
	assertEquals(27, testSquare6.squarelotron[1][3]);
	assertEquals(30, testSquare7.squarelotron[2][5]);
	assertEquals(2, testSquare8.squarelotron[7][6]);
	
	//Test for mod4 == 3 rotations
	assertEquals(3, testSquare2.squarelotron[1][1]);
	assertEquals(4, testSquare3.squarelotron[2][1]);
	assertEquals(13, testSquare4.squarelotron[3][3]);
	assertEquals(11, testSquare5.squarelotron[4][2]);
	assertEquals(23, testSquare6.squarelotron[1][3]);
	assertEquals(40, testSquare7.squarelotron[2][5]);
	assertEquals(49, testSquare8.squarelotron[7][6]);
	*/
    }

}
