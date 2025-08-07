package design_pattern.com.company.compositeDesignPattern.FileSystem;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Movie");
        directory.add(new File("Border"));
        directory.add(new Directory("Comedy Movie"));
        directory.add(new File("Hera pheri"));

        directory.ls();




    }
}
