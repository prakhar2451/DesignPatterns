class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "CPU: " + cpu + ", RAM: " + ram + ", Storage: " + storage + ", Graphics Card: " + graphicsCard;
    }
}