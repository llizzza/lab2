public class Humanwithname {
    private Name name;
    private int height;

    public Humanwithname (Name name, int height) {
        this.name = name;
        this.height = height;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return getName() + " с ростом " + getHeight();
    }


}
