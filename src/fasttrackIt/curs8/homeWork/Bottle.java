package fasttrackIt.curs8.homeWork;

public class Bottle {
    private int capacity;
    private int availableLiquid;
    private boolean open;


    public Bottle() {
        this(500);
    }

    public Bottle(int capacity) {
        this(capacity, 0, true);
    }

    public Bottle(int capacity, int availableLiquid) {
        this(capacity, availableLiquid, false);
    }

    public Bottle(int capacity, int availableLiquid, boolean open) {
        if (capacity <= 0) {
            this.capacity = 1;
        } else {
            this.capacity = capacity;
        }

        if (availableLiquid < 0) {
            this.availableLiquid = 0;
        } else if (availableLiquid > this.capacity) {
            this.availableLiquid = this.capacity;
        } else {
            this.availableLiquid = availableLiquid;
        }

        this.open = open;
    }

    public boolean hasLiquid() {
        return availableLiquid > 0;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public int getEmpty() {
        return capacity - availableLiquid;
    }

    public String open() {
        if (open) {
            return "the bottle is opened";
        } else {
            this.open = true;
            return "Bottle is open";
        }
    }

    public String close() {
        if (!open) {
            return "The bootle is already closed";
        } else {
            this.open = false;
            return "Bottle is closed";
        }
    }

    public String drink(int amount) {
        if (open){
            if (amount > availableLiquid) {
                return "nu mai exista. Maie doar" + availableLiquid;
            } else {
                this.availableLiquid -= amount;
                return "ai baut " + amount + " lichid";
            }
        } else {
            return "Sticla este inchisa";
        }
    }
    }
