package ru.sinitsin.lesson8.task5;

public class Act {
    private int numberAct;
    private int dataAct;
    private String[] goodsAct;

    public int getNumberAct() {
        return numberAct;
    }

    public void setNumberAct(int numberAct) {
        this.numberAct = numberAct;
    }

    public int getDataAct() {
        return dataAct;
    }

    public void setDataAct(int dataAct) {
        this.dataAct = dataAct;
    }

    public String[] getGoodsAct() {
        return goodsAct;
    }

    public void setGoodsAct(String[] goodsAct) {
        this.goodsAct = goodsAct;
    }

    @Override
    public String toString() {
        return "номер акта: " + numberAct + "\nдата акта: " + dataAct + "\nколичество товаров в акте: " + goodsAct.length;
    }
}
