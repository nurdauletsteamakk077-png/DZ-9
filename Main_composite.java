public class Main2 {
    public static void main(String[] args) {
        File f1 = new File("file1.txt", 100);
        File f2 = new File("file2.txt", 200);

        Directory folder1 = new Directory("Documents");
        Directory folder2 = new Directory("Images");

        folder1.add(f1);
        folder2.add(f2);

        Directory root = new Directory("Root");
        root.add(folder1);
        root.add(folder2);

        root.display("");

        System.out.println("Total size: " + root.getSize());
    }
}
