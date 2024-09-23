public class bank {
    bankAccount userdata[];
    int capacity = 0;
    int length = 0;
    bank(int capacity){
        this.capacity = capacity;
        userdata = new bankAccount[capacity];
    }
    bank(){
      capacity = 50;
      userdata = new bankAccount[capacity];
    }
    void addAccount(bankAccount data){
        userdata[length] = new bankAccount(data);
        length++;
    }



}
