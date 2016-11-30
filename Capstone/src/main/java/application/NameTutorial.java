package application;

import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.Page;
import org.rapidoid.gui.GUI;
import org.rapidoid.html.Tag;
import org.rapidoid.web.Screen;

@Controller
public class NameTutorial {

	@Page("/hi/{name}")
	public Screen hi(String name) {
		Tag msg = GUI.h4("Hi, ", GUI.i18n(name), "!");
		return GUI.page(msg).brand("What is thy name?");
	}
}

