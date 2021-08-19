package client;

import aggregators.AggregatorProcessor;
import aggregators.MaxAggregator;

import java.io.IOException;

public class AggregatorApp {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir")+"/table.csv");
//        MaxAggregator maxAggregator= new MaxAggregator();
//        AggregatorProcessor<MaxAggregator> aggregatorProcessor= new AggregatorProcessor<>(maxAggregator,System.getProperty("user.dir")+"table.csv");
//        System.out.println(aggregatorProcessor.runAggregator(1));
    }
}
