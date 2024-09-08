package org.example.global;

public enum SellMenu {
    COFFEE("커피", 5000L, 1), BAGEL("베이글", 3800L, 2);
    private final String name;
    private final long price;

    private final int order;

    SellMenu(String name, long price, int order) {
        this.name = name;
        this.price = price;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.order + "번 " + this.name + " : " + this.price;
    }

}
