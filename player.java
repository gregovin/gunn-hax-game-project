class player {
  private double pos[] = new double[2]
  private double vel[] = new double[2];
  private double rot;
  public player(double pos1[], double vel1[], double rot1) {
    pos = pos1;
    vel = vel1;
    rot = rot1;
  }
  public void update(){
    pos[0] = pos[0] + vel[0];
    pos[1] = pos[1] + vel[1];
  }
  public double[] return_data(){
    double[] ls = new double[5];
    ls[0] = pos[0];
    ls[1] = pos[1];
    ls[2] = vel[1];
    ls[3] = vel[2];
    ls[4] = rot;
    return ls;
  }
  public void velchange0(double val) {
    if (vel[0]<10){
      vel[0] = vel[0] + val;
    }
  }
  public void velchange1(double val) {
    if (vel[1] < 10) {
      vel[1] = vel[1] + val
  }
}
