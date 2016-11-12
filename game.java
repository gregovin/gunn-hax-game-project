import javax.swing.*;
import java.util.Date;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
class Game extend StateBasedGame{
  public Game(gamename){
    super(gamename);
    this.addState(new Only(0));
  }
  @Override
	public void initStatesList(GameContainer arg0) throws SlickException {
		this.getState(0).init(arg0, this)
	}
  Timestamp v = new Timestamp();
  Player player = new Player([200, 200], [0, 0], 0)
  Random rand = new Random();
  player.getInputMap().put(KeyStroke.getKeyStroke("w"), "mov up")
  player.getInputMap().put(KeyStroke.getKeyStroke("s"), "mov down")
  player.getInputMap().put(KeyStroke.getKeyStroke("a"), "mov left")
  player.getInputMap().put(KeyStroke.getKeyStroke("d"), "mov right")
  player.getActionMap().put("mov up", velCange0(-1))
  player.getActionMap().put("mov down", velCange0(1))
  player.getActionMap().put("mov left", velCange1(-1))
  player.getActionMap().put("mov right", velCange1(1))
  Enimy ls[] = new Enimy[100]
  double x[] = new double[5]
  int k = v.getTime();
  KeyStroke keys[] = new KeyStroke[20]
  public static void main (String args[]) {
    while (0<1) {
      if (rand.nextInt((v.getTime - k)/100 +11) > 10 && ls.size < 100) {
        ls.add(Enimy(rand.nextInt(5),0,[rand.nextInt(400),rand.nextInt(400)]));
      }
      player.update()
      x = player.return_data()
      for (int i = 0; i<ls.len; i++) {
        ls[i].update()
        ls[i].change_vel(x[0], x[1])
      }
    }
  }
}
