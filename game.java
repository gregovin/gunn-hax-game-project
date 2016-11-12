import javax.swing.*;
import java.util.Date
class game {
  Timestamp v = new Timestamp();
  Player player = new Player([200, 200], [0, 0], 0)
  Random rand = new Random();
  player.getInputMap().put(KeyStroke.getKeyStroke("w"), "mov up")
  player.getInputMap().put(KeyStroke.getKeyStroke("s"), "mov down")
  player.getInputMap().put(KeyStroke.getKeyStroke("a"), "mov left")
  player.getInputMap().put(KeyStroke.getKeyStroke("d"), "mov right")
  player.getActionMaP().put("mov up", velCange0(-1))
  player.getActionMaP().put("mov down", velCange0(1))
  player.getActionMaP().put("mov left", velCange1(-1))
  player.getActionMaP().put("mov right", velCange1(1))
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
      x = player.getData()
      for (int i = 0; i<ls.len; i++) {
        ls[i].update()
      }
    }
  }
}
