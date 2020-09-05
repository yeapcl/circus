package circus.stuff;

import circus.Asset;

public abstract class Equipment implements Asset {
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /*
    overriding or implementing a method from the interface
     */
    public int getValue() {
        return purchasePrice;
    }
}
