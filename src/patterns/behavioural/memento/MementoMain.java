package patterns.behavioural.memento;

import patterns.behavioural.memento.editor.Editor;
import patterns.behavioural.memento.editor.EditorHistory;

public class MementoMain {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new EditorHistory();
        editor.setContent("Mustafa");
        history.push(editor.createState());
        editor.printEditorState();

        editor.setContent("Osama");
        history.push(editor.createState());
        editor.printEditorState();

        editor.setContent("Yazan");
        editor.printEditorState();

        editor.restore(history.pop());
        editor.printEditorState();

        editor.setFontSize(15);
        editor.printEditorState();
        editor.restore(history.pop());
        editor.printEditorState();
        editor.restore(history.pop());
        editor.printEditorState();

    }
}
