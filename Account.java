public class Account {

    private String id;
    private String name;
    private int balance;


    Account() {

    }

    Account(String id, String name, int balance) {

        this.id = id;
        this.name = name;
        this.balance = 0;


    }

    // get
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }


    // Set
    public void setID(String id) {

        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance=balance;
    }



    // Account operations
    public int credit(int amount) {//زياده رصيد
        balance += amount;
        return balance;
    }

    public int debit(int amount) {//سحب مبلغ ويتحقق اذا فيه مبلغ
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("رصيد غير كافي!");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("رصيد غير كافي للتحويل!");
        }
        return balance;
    }

    // toString method
    public String toString() {// تعيد سلسله نصيه فيها المعلومات
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance+"]";
    }


}














