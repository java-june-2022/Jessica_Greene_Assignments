public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();

        // Test tenRolls
        /*
        int[] tenRandNums = puzzle.getTenRolls();
        System.out.print("[ ");
        for (int i=0; i<tenRandNums.length; i++) {
            System.out.print(tenRandNums[i] + " ");
        }
        System.out.println("]");
        */

        //Test getRandomLetter
        // System.out.println(puzzle.getRandomLetter());

        //Test generatePassword
        // System.out.println(puzzle.generatePassword());

        //Test getNewPasswordSet
        printArrayValues(puzzle.getNewPasswordSet(4));
        printArrayValues(puzzle.getNewPasswordSet(0));
        printArrayValues(puzzle.getNewPasswordSet(1));
        printArrayValues(puzzle.getNewPasswordSet(-1));
    }
    public static void printArrayValues(String[] stringArr) {
        for (int i=0; i<stringArr.length; i++) {
            System.out.print(stringArr[i] + " ");
        }
        System.out.println();
    }
}