package fasttrackIt.curs12.curs12Reluare;

public enum Month {
    JAN(1),
    FEB(2),
    MAR(3),
    APR(4),
    MAY(5),
    JUN(6),
    JUL(7),
    AUG(8),
    SEP(8),
    OCT(9),
    NOV(10),
    DEC(11);
private int number;
    Month(int number)  {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
