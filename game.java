import java.util.Date
class game {
  Timestamp v = new Timestamp();
  Player player = new Player([200, 200], [0, 0], 0)
  Random rand = new Random();
  Enimy ls[] = new Enimy[100]
  int k = v.getTime();
  public static void main (String args[]) {
    while (0<1) {
      if (rand.nextInt((v.getTime - k)/100 +11) > 10 && ls.size < 100) {
        ls.add(Enimy(rand.nextInt(5),0,[rand.nextInt(400),rand.nextInt(400)]));
      }
      player.update();
      
    }
  }
}
