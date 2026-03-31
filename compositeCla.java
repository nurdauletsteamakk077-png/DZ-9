abstract class FileSystemComponent {
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException();
    }

    public abstract void display(String indent);
    public abstract int getSize();
}
