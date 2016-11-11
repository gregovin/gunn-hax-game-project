class enemy {
  int motion_type;
  int skin;
  double pos[] = double[2];
  double vel[] = double[2];
  double rot;
  public enemy(int motion, int ski, double possitions[], double vels[], rota) {
    motion_type= motion;
    skin = ski;
    pos = possitions;
    vel = vels;
    rot = rota;
  }
  public void update() {
    pos[0] = pos[0] + vel[0];
    pos[1] = pos[1] + vel[1];
    arctan v = new arctan(vel[1], vel[0]);
    rot = v.get_result();
  }
  public void change_vel(double x, double y){
    double dist[] = new double[2];
    switch (motion_type){
      case 0:
        dist[0] = x - pos[0];
        dist[1] = y - pos[1];
        arctan v = new arctan(dist[1], dist[0]);
        double rotation = v.get_result();
        vel[0] = 5 * Math.sin(rotation);
        vel[1] = 5 * Math.cos(rotation);
    }
  }
}
