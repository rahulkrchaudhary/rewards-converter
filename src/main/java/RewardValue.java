public class RewardValue {
    double cashValue;
    double milesValue;
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
//        this.milesValue=cashToMiles(cashValue);

    }
    public RewardValue(float milesValue){
        this.milesValue=milesValue;
//        this.cashValue=milesTocash(milesValue);
    }
//    public double cashToMiles(double cash){
//        return (cash/0.0035);
//    }
//    public double milesTocash(double miles){
//        return (miles*0.0035);
//    }


    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return cashValue*0.0035;
    }
}
