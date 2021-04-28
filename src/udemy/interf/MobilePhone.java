package udemy.interf;

public class MobilePhone implements  ITelephone{
    private int myNimber;
    private boolean isRin;
    private boolean isOn = false;

    public MobilePhone(int myNimber) {
        this.myNimber = myNimber;

    }

    @Override
    public void powerOm() {
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn){
            System.out.println("now ringing" + phoneNumber + " on deskphone");
    }else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRin) {
            System.out.println("Answering the mobie phone ");
            isRin = false;
        }
    }

    @Override
    public boolean callPhone() {
        return false;
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNimber && isOn){
            isRin= true;
            System.out.println("ring ring");
        } else {
            isRin=false;
            System.out.println("mobile phone not on or number dif");
        }
        return isRin;
    }

    @Override
    public boolean isRinger() {
        return false;
    }
}
