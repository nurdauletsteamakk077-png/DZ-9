import java.util.*;

class Directory extends FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void add(FileSystemComponent component) {
        if (!components.contains(component)) {
            components.add(component);
        }
    }

    @Override
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Folder: " + name);
        for (FileSystemComponent c : components) {
            c.display(indent + "  ");
        }
    }

    @Override
    public int getSize() {
        int total = 0;
        for (FileSystemComponent c : components) {
            total += c.getSize();
        }
        return total;
    }
}
