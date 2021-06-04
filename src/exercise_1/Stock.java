package exercise_1;

public class Stock {
    //private data fields
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercentag(){
        //equation to get the change between the compared stock prices
        double change = currentPrice-previousClosingPrice;

        //equation gets a decimal and turns it into a percent
        return (change/currentPrice)*100;
    }

    @Override
    public String toString(){

        return name+"\n"+symbol+"\nThe previous closing price was: "+previousClosingPrice+" \nThe current price is: "+currentPrice
                + "\nThe change in percentage is :"+ getChangePercentag();
    }
}