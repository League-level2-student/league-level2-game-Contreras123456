import javax.swing.JFrame;

public class TaxiGame {
	JFrame frame;
	JPanel panel();
	GamePanel gamepanel;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	
TaxiGame(){
	frame = new JFrame();
	panel = new JPanel();
}
public static void main(String[] args) {
TaxiGame taxigame = new TaxiGame();
taxigame.setup();
}
void setup() {
	frame.add(gamepanel);
}

}