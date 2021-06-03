package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2) && -1 < x1 && x1 < 8 && -1 < x2 && x2 < 8 && -1 < y1 && y1 < 8 && -1 < y2 && y2 < 8) {
            rsl = Math.abs(x1 - x2);
        }
        return rsl;
    }
}
