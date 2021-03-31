package FastTrackIt.Curs7;

public class Door {
    private boolean open;
    private boolean locked;

    public Door() {
        this.open = false;
        this.locked = true;
    }

    public void open() {
        if (locked) {
            System.out.println("usa nu se poate deschide");
        } else {
            this.open = true;
        }
    }

    public void closed(){
        this.open = false;
    }
    public void lock(){
        if (open) {
            System.out.println(" u se poate incuia");
        } else {
            this.open = false;
        }
    }

    public void unlock(){
        this.locked = false;
    }

    public boolean isOpen() {
        return open;
    }
    public boolean isLocked(){
        return locked;
    }
}
