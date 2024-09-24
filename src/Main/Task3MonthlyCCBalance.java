class Main {
    public static void main(String[] args) {
        double CCBalance = 5000.0;
        double interest =0.17;
        int oneMonthInterest = (int) (CCBalance * interest);
        int twoMonthsInterest = (int) ((CCBalance * interest + CCBalance) * interest);
        System.out.println("Interest due from month one is/" + oneMonthInterest + "/and interest due from month two is/" + twoMonthsInterest);
    }
}
