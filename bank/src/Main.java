import static java.lang.System.setOut;

import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) {
        int  a = 0;
        Scanner reader = new Scanner(System.in);
        bank maindata = new bank();

        while(a!=-1){
            System.out.println("please enter the number that you want to be serverd;");
            System.out.println("1:createaccount  2:logging account  3:delete account");
            a = reader.nextInt();
            reader.nextLine();
        switch(a){
            case 1:
                String name;
                String account;
                String time;
                String id;
                double money;
                System.out.println("please enter your name");
                name = reader.nextLine();
                name.trim();
                System.out.println("please enter your account number");               
                account = reader.nextLine();
                account.trim();
                System.out.println("please enter the time now");      
                time = reader.nextLine();
                time.trim();
                System.out.println("please enter your id");
                id = reader.nextLine();
                id.trim();
                System.out.println("please enter your pure money");
                money = reader.nextDouble();
                reader.nextLine();
                bankAccount new1 = new bankAccount(name,account,time,id,money);
                maindata.addAccount(new1);
                break;
            case 2:
                System.out.println("please enter the account number. if you forget,please enter -1");
                String number = reader.nextLine();
                number.trim();
                if(number=="-1"){
                    System.out.println("if you remember other information please talk to our man");
                    break;
                }
                int i = 0;
                int findflag = 0;
                
                for(i = 0;i<maindata.length;i++){

                    if(maindata.userdata[i].getAccount().equals(number)){
                        findflag = 1;
                        break;
                    }
                }
                if(findflag==0){
                    System.out.println("can't find account");
                    break;
                }
                
                int wrongflag = 0;
                do{
                System.out.println("enter the number please");
                System.out.println("1:look up money  2:input money  3:output money 4:look up detail");
                    String signal = reader.next();
                    switch (signal){
                        case "1":
                            System.out.println( maindata.userdata[i].getMoney());
                            break;
                        case "2":
                            System.out.println("please enter your money added");
                            double add = reader.nextDouble();
                            maindata.userdata[i].inputmoney(add);
                            break;
                        case "3":
                            System.out.println("please enter the money you taken");
                            double min = reader.nextDouble();
                            maindata.userdata[i].outputmoney(min);
                            break;
                        case "4":
                            maindata.userdata[i].printdetail();
                            break;
                        case "5":
                            wrongflag=1;
                            break;
                        default:
                            System.out.println("please check your enter");
                            
                    }
                }while(wrongflag==0);
                break;
            case 3:
                System.out.println("please proint out the account that u want to delete");
                String deletedata = reader.next();
                int j = 0;
                int deleteflag = 0;
                for(;j<maindata.length;j++){
                    if(maindata.userdata[j].getAccount()==deletedata){
                        deleteflag = 1;
                        break;
                    }
                }
                if(deleteflag==0){
                    System.out.println("can't find this account");
                }else{
                    swap(maindata.userdata[j],maindata.userdata[maindata.length-1]);
                    maindata.length-=1;
                }
                break;
            default:
                System.out.println("please check your number");
                break;
        }
        }
        System.out.println("ended");
    }

    private static void swap(bankAccount bankAccount, bankAccount bankAccount2) {
        bankAccount temp;
        temp = bankAccount2;
        bankAccount2 = bankAccount;
        bankAccount = temp;
        
    }
}


