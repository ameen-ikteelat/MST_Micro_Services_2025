package dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class YnetRSS {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		dbf.setIgnoringComments(true);
		DocumentBuilder parser=dbf.newDocumentBuilder();
		Document doc=parser.parse("http://www.ynet.co.il/Integration/StoryRss3254.xml");
		
		Text txt=doc.createTextNode("Ebay DP Course");
		Element newTitle=doc.createElement("title");
		newTitle.appendChild(txt);
		doc.getDocumentElement().appendChild(newTitle);
		
		NodeList titles=doc.getDocumentElement().getElementsByTagName("title");
		for(int i=0;i<titles.getLength();i++){
			System.out.println(titles.item(i).getTextContent());
		}
	}

}
