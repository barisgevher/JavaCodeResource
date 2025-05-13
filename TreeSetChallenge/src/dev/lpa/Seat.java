package dev.lpa;

public class Seat {
    private char rowChar;
    private int seatNum;
    protected String seatNumber;
    protected boolean isReserved;


    public Seat(char rowChar, int seatNum) {
        this.rowChar = rowChar;
        this.seatNum = seatNum;
        this.seatNumber = rowChar + "000" + seatNum;
        this.isReserved = false;

    }

    public Seat() {
    }

    public char getRowChar() {
        return rowChar;
    }

    public void setRowChar(char rowChar) {
        this.rowChar = rowChar;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }


}
