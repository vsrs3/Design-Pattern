package TemplateMethod;

public abstract class DataProcessor {
    
    // Template method
    public final void process() {
        readData();
        processData();
        writeData();
    }
    
    protected abstract void readData();
    protected abstract void processData();
    protected abstract void writeData();
}