import java.util.*;

public class Area {
    int rowNumber;
    int colNumber;
    int mineCount;
    char[][] mine;
    int areaSize;
    char[][] selectedMine;
    boolean isWinFlag;
    public Area(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
    }

    public void run() {
        this.isWinFlag=false;
        mine(this.rowNumber, this.colNumber);
        System.out.println("Mine Map");
        showMineMap(this.mine);
        System.out.println("Welcome to Minefield");
        this.selectedMine = new char[this.rowNumber][this.colNumber];
        selection();
    }
    public void showMineMap(char[][] map) {
        for (char[] chars : map) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println(" ");
        }
    }

    public void mine(int rowNumber, int colNumber) {
        this.areaSize = rowNumber * colNumber;
        this.mineCount = this.areaSize/ 4;
        int mineCounter = 0;
        List<Integer> mineLoc = mineLocation(this.areaSize, this.mineCount);
        this.mine = new char[rowNumber][colNumber];
        for (int i = 0; i < this.mine.length; i++) {
            for (int j = 0; j < this.mine[i].length; j++) {
                if (mineLoc.contains(mineCounter)) { // Mine Possibilities
                    this.mine[i][j] = '*';
                }
                else {
                    this.mine[i][j] = '-';
                }
                mineCounter++;
            }
        }
    }
    public List<Integer> mineLocation(int areaSize, int mineCount){
        Random rand = new Random();
        List<Integer> mineLoc = new ArrayList<>();

        while(true) {
            int rand_temp = rand.nextInt(areaSize);
            if (mineLoc.contains(rand_temp)) continue;
            else mineLoc.add(rand_temp);
            if (mineLoc.size() == mineCount) break;
        }
        return mineLoc;
    }

    public void selection() {
        boolean failFlag = false;
        showSelectedMineMap();
        while(!failFlag) {
            checkWin();
            if (this.isWinFlag) {
                System.out.println("You won");
                break;
            }
            System.out.println("-----------------------------------------------------------");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a row number : ");
            int selectedRow = input.nextInt();
            System.out.print("Enter a column number : ");
            int selectedCol = input.nextInt();
            failFlag = compareMaps(selectedRow, selectedCol);
        }
    }

    public void showSelectedMineMap() {
        for (int i = 0; i < this.selectedMine.length; i++) {
            for (int j = 0; j < this.selectedMine[i].length; j++) {
                this.selectedMine[i][j] = '-';
            }
        }
        showMineMap(this.selectedMine);
    }

    public boolean compareMaps(int selectedRow, int selectedCol) {
        try {
            if (this.mine[selectedRow][selectedCol] == '*') {
                System.out.println("Game Over :(");
                return true;
            } else {
                char count = Character.forDigit(getNumber(selectedRow, selectedCol), 10);
                this.selectedMine[selectedRow][selectedCol] = count;
                showMineMap(this.selectedMine);
                return false;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Illegal movement. Try again.");
            return false;
        }
    }

    public int getNumber(int selectedRow, int selectedCol) {
        int count = 0;
        for (int i = selectedRow - 1; i <= selectedRow + 1; i++) {
            for (int j = selectedCol - 1; j <= selectedCol + 1; j++) {
                if(i == selectedRow && j == selectedCol) {
                    continue;
                }else {
                    try {
                        if (this.mine[i][j] == '*') {
                            count++;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException ignored) {
                    }
                }
            }
        }
        return count;
    }
    public void checkWin() {
        int count = 0;
        for (char[] chars : this.selectedMine) {
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == '-') count++;
            }
        }
        if (count == this.mineCount) this.isWinFlag = true;
    }
}
