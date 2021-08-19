package aggregators;

import fileprocessors.StockFileReader;

import java.io.IOException;
import java.util.List;

public class AggregatorProcessor<T extends Aggregator> {
    private T aggregator;
    private String fileName;

    public AggregatorProcessor(T t, String fileName) {
        this.aggregator = t;
        this.fileName = fileName;
    }

    public double runAggregator(int index) throws IOException {
        StockFileReader stockFileReader= new StockFileReader(fileName);
        List<String> fileData = stockFileReader.readFileData();
        index--;
        int finalIndex = index;
        fileData.forEach((s)->{
            String[] numbers= s.split(",");
            double value= Double.parseDouble(numbers[finalIndex]);
            aggregator.add(value);
        });

        double calculate = aggregator.calculate();
        return calculate;
    }
}
