package patterns.behavioural.memento.editor;

import java.util.Stack;

public class EditorHistory {
    private final Stack<EditorState> states = new Stack<>();

    public void push(EditorState editorState) {
        states.push(editorState);
    }

    public EditorState pop() {
        if (!states.isEmpty())
            return states.pop();
        System.out.println("History is empty");
        return null;
    }
}
