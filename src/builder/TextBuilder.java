package builder;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("=============================\n");
        buffer.append("『" + title + "』\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('■' + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItem(String[] itemes) {
        for (int i = 0; i < itemes.length; i++) {
            buffer.append(" *" + itemes[i] + "\n");
        }
        buffer.append("\n");

    }

    @Override
    public void close() {
        buffer.append("=============================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
