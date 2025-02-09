package factory;

public class XMLEditorFactory extends EditorFactory {

	@Override
	public Editor createEditor() {
		return new XMLEditor();
	}
}
