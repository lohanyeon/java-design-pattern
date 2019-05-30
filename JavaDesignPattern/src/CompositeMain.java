import composite.Component;
import composite.File;
import composite.Folder;

public class CompositeMain {

	
	public static void main(String[] args) {
		Folder root = new Folder("root"),
				home = new Folder("home"),
				lohan = new Folder("lohan"),
				music = new Folder("music");
		File track1 = new File("track1"),
				track2 = new File("track2");
		
		root.addComponent(home);
			home.addComponent(lohan);
			home.addComponent(music);
		
		music.addComponent(track1);
		music.addComponent(track2);
		
		show(root);
	}
	
	private static void show(Component component) {
		System.out.println(component.getClass().getName()+"|"+component.getName());
		if (component instanceof Folder) {
			for (Component c : ((Folder)component).getChildren()) {
				System.out.println("===> " + c.getName());
				show(c);
			}
		}
	}
}
