public class Main {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
                .buildCpu("Intel i7")
                .buildRam("16GB")
                .buildStorage("512GB SSD")
                .buildGraphicsCard("NVIDIA RTX 3080")
                .getComputer();
        System.out.println(computer);
    }
}