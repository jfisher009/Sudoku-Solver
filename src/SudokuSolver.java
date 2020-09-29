public class SudokuSolver {

    public SudokuSolver(){
    }

    public int[][] solve(int[][] givenPuzzle){
        if(!(givenPuzzle.length == 9  && givenPuzzle[0].length == 9)){
            throw new IllegalArgumentException("Input should be a 9X9 array");
;        }

    }

    private int[][] generatePossibleValuesGrid(){

    }
}
