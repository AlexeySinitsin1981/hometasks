package ru.sinitsin.lesson8.task5;

public class Converter {
    public static Act convert(Contract contract){
        Act act = new Act();
        act.setNumberAct(contract.getNumberContract());
        act.setDataAct(contract.getDataContract());
        act.setGoodsAct(contract.getGoodsContract());

        return act;
    }

}
