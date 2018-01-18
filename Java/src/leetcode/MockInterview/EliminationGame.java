package leetcode.MockInterview;

public class EliminationGame {
    public static void main(String[] args) {
        EliminationGame eliminationGame = new EliminationGame();
        System.out.print(eliminationGame.lastRemaining(1342342343));
    }

    public int lastRemaining(int n) {
        if (n == 1) {
            return 1;
        }
        return (n / 2 + 1 - lastRemaining(n / 2)) * 2;
    }

    /*public int lastRemaining(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = 0;
        for(int i = 1; i<= n ; i++) {
            if(i % 2 == 0) {
                stringBuilder.append(i);
                length++;
            }
        }
        return eliminateValue(stringBuilder, length,1);
    }*/

    private int eliminateValue(StringBuilder stringBuilder, int length, int oddOrEven) {
        if(length == 1){
            return Integer.parseInt(stringBuilder.toString());
        }
        StringBuilder builder = new StringBuilder();
        int builderLength = 0;
        for(int i = 0; i< length; i++) {
            if(oddOrEven == 1 && i % 2 == 0) {
                builder.append(stringBuilder.charAt(i));
                builderLength++;
            } else if (oddOrEven == 0 && i%2 != 0) {
                builder.append(stringBuilder.charAt(i));
                builderLength++;
            }
        }

        if(oddOrEven == 0) {
            return eliminateValue(builder , builderLength , 1);
        } else {
            return eliminateValue(builder , builderLength , 0);
        }
    }
}
