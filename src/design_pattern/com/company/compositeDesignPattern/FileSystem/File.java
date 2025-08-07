package design_pattern.com.company.compositeDesignPattern.FileSystem;

public class File implements FileSystem{
    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("The file name is "+fileName);
    }
}
