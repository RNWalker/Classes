public class Computer {

    private int storageSpace;
    String modelPrinter;

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

    public void setModelPrinter(String newPrinter){
        this.modelPrinter = newPrinter;
    }

}
