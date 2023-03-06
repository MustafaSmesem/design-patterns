package patterns.behavioural.memento.editor;

public class Editor {
    private String content;
    private String fontName = "Arial";
    private int fontSize = 12;

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public EditorState createState() {
        return new EditorState(this.content, this.fontName, this.fontSize);
    }

    public void printEditorState() {
        System.out.printf("Editor content: %s. %nFont Name, Size: %s, %s %n", this.content, this.fontName, this.fontSize);
    }

    public void restore(EditorState editorState) {
        this.content = editorState == null ? "" : editorState.Content();
        this.fontName = editorState == null ? "Arial" : editorState.FontName();
        this.fontSize = editorState == null ? 12 : editorState.FontSize();
    }

    public void setContent(String content) {
        this.content = content;
    }
}
