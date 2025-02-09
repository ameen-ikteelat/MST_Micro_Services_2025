package factory;

public class HTMLEditorFactory extends EditorFactory {

	@Override
	public Editor createEditor() {
		return new HTMLEditor();
	}
}
