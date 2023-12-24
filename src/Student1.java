public class Student1 {
    private int mom;
    private int dangn;
    private int wallet;
    private int mine;

    public int recieveMoney() {
        this.mom = 10000;
        this.dangn = 20000;
        this.wallet = this.mom + this.dangn;
        return wallet;
    }

    public int sendMoney() {

        int send = this.wallet - this.mine;
        return send;
    }
}
