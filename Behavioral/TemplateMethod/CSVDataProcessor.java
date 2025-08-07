package TemplateMethod;

public class CSVDataProcessor extends DataProcessor {
    
    @Override
    protected void readData() {
        System.out.println("Reading data from CSV file");
    }
    
    @Override
    protected void processData() {
        System.out.println("Processing CSV data: parsing columns, validating format");
    }
    
    @Override
    protected void writeData() {
        System.out.println("Writing processed CSV data to database");
    }
}