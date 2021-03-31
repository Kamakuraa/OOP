package FastTrackIt.TemaCurs7.Tema1.Tema1;

public class Bottle1 {
    private int totalCapacity;
    private int availableLiquid;
    private boolean open;

    public Bottle1(int totalCapacity, int availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public boolean hasMoreLiquid(){
        if (totalCapacity > 0) {
            return true;
        }
        return false;
    }
    public void availableLiquid(int availableLiquid){
        totalCapacity -= availableLiquid;
        if (totalCapacity < 100){
            System.out.println("Sticla este apropae goala");
        }
    }
    public void emptyCapacity(int empty){
        availableLiquid -= empty;
    }
    public void isClos(boolean closes){
        if (!open){
            System.out.println("Sticla este inchisa");
        }
    }



    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public void setAvailableLiquid(int availableLiquid) {
        this.availableLiquid = availableLiquid;
    }

    public boolean isOpen() {
        if (open) {
            System.out.println("Bottle is opened");
        } else {
            System.out.println("Bottle is closed");
        }
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
