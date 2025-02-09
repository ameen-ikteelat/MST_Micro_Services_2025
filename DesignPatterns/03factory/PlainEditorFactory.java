package factory;

public class PlainEditorFactory extends EditorFactory {

	@Override
	public Editor createEditor() {
		return new PlainEditor();
	}
}
