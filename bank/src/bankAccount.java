import java.io.*;
import java.util.*;

import static java.lang.System.*;


public class bankAccount{
    private String name;
    private String account;
    private String time;
    private String id;
    private double money = 0;
    private String [] detail;
    private int delength = 0;
    bankAccount(){
        detail = new String[40];
    }
    bankAccount(bankAccount a){
        detail = new String[40];
        this.name = a.name;
        this.account = a.account;
        this.time = a.time;
        this.id = a.id;
        this.money = a.money;
        this.delength = a.delength;
        for(int i =0;i<a.delength;i++){
            this.detail[i] = a.detail[i];
        }
    }
    String getName(){
        return  name;
    }
    String getAccount(){
        return account;
    }
    String getTime(){
        return time;
    }
    String getId(){
        return id;
    }
    double getMoney(){
        return money;
    }
    void printdetail(){
        for(int i =0;i<delength;i++){
            System.out.println(detail[i]);
        }
    }
    bankAccount(String name, String acccount,String time, String id,double money){
        this.name = name;
        this.id = id;
        this.time = time;
        this.account = acccount;
        this.money = money;
    }
    void inputmoney(double adder){
        money+=adder;
        detail[delength] = "input money:"+adder+"; total money:"+money;
        delength++;
    }
    void outputmoney(double miner){
        if(money-miner<0){
            out.println("not enough money!");
            return;
        }
        money-=miner;
        detail[delength] = "output money:"+miner+"; total money:"+money;
        delength++;
    }




}
