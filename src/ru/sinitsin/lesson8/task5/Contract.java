package ru.sinitsin.lesson8.task5;

public class Contract {
       private int numberContract;
       private int dataContract;
       private String[] goodsContract;


       public Contract(int numberContract, int dataContract, String[] goodsContract) {
              this.numberContract = numberContract;
              this.dataContract = dataContract;
              this.goodsContract = goodsContract;
       }

       public int getNumberContract() {
              return numberContract;
       }

       public void setNumberContract(int numberContract) {
              this.numberContract = numberContract;
       }

       public int getDataContract() {
              return dataContract;
       }

       public void setDataContract(int dataContract) {
              this.dataContract = dataContract;
       }

       public String[] getGoodsContract() {
              return goodsContract;
       }

       public void setGoodsContract(String[] goodsContract) {
              this.goodsContract = goodsContract;
       }
}
