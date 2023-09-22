public class ComputerBuilder {
    private final Computer computer;

    public ComputerBuilder() {

        this.computer = new Computer();
    }

    public ComputerBuilder buildCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder buildRam(String ram) {
        computer.setRam(ram);
        return this;
    }

    public ComputerBuilder buildStorage(String storage) {
        computer.setStorage(storage);
        return this;
    }

    public ComputerBuilder buildGraphicsCard(String graphicsCard) {
        computer.setGraphicsCard(graphicsCard);
        return this;
    }

    public Computer getComputer() {

        return computer;
    }
}
