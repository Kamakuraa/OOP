package udemy.interf;

public class DeskPHone implements ITelephone {
    private int myNimber;
    private boolean isRin;

    public DeskPHone(int myNimber) {
        this.myNimber = myNimber;

    }

    @Override
    public void powerOm() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("now ringing" + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if (isRin) {
            System.out.println("Answering the desk phone ");
            isRin = false;
        }
    }

    @Override
    public boolean callPhone() {
        return false;
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNimber){
            isRin= true;
            System.out.println("ring ring");
        } else {
            isRin=false;
        }
        return isRin;
    }

    @Override
    public boolean isRinger() {
        return false;
    }
}
