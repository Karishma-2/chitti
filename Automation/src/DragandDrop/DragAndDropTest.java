package DragandDrop;

import org.openqa.selenium.WebDriver;

public class DragAndDropTest {
	
	public static void main(String[] args) {
		DrangandDrop obj = new DrangandDrop();
		obj.lanchBrowser();
		obj.openUrl("https://jqueryui.com/");
		obj.maximize();
		obj.clickOndragdrop("Droppable");
		obj.switchtoframe();
		obj.dragAnddrop("Drag me to my target", "Drop here");
		obj.closeBrowser();
		
	}

}
