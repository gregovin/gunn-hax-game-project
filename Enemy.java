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
}
