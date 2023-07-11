public class Computer {

    private int storageSpace;
    private String modelPrinter;

    public Computer(int storageSpace, String modelPrinter){
        this.modelPrinter = modelPrinter;
        this.storageSpace = storageSpace;
    }

    //Getter
    public int getStorageSpace(){
        return storageSpace;
    }
    public int storageAdd (){return storageSpace = storageSpace+2;
    }

    public String setModelPrinter(String modelPrinter){
        this.modelPrinter = modelPrinter;
        return modelPrinter;
    }
    public String getModelPrinter(){
        return modelPrinter;
    }

}
