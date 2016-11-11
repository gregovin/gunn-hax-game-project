class Enemy {
  int motion_type;
  int skin;
  double pos[] = double[2];
  double vel[] = double[2];
  double rot;
  double start[] = double[2];
  public enemy(int motion, int ski, double possitions[]) {
    motion_type= motion;
    skin = ski;
    pos = possitions;
    vel[0] = 0;
    vel[1] = 0;
    rot = 0;
    start = pos;
    d = 0
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
        if (Math.sqrt(dist[0]*dist[0] + dist[1] * dist[1])) < 100){
          arctan v = new arctan(dist[1], dist[0]);
          double rotation = v.get_result();
          vel[0] = 5 * Math.sin(rotation);
          vel[1] = 5 * Math.cos(rotation);
        }
        break;
      case 1:
        if (d==0){
          vel[0] = 3;
          vel[1] = 0;
          if (pos[0] - start[0] >= 30) {
            d = 1;
          }
        }else{
          vel[0] = -3;
          vel[1] = 0;
          if (pos[0] - start[0] <= 0) {
            d = 0;
          }
        }
        break;
      case 2:
        if (d==0){
          vel[0] = 0;
          vel[1] = 3;
          if (pos[1] - start[1] >= 30) {
            d = 1;
          }
        }else{
          vel[0] = 0;
          vel[1] = -3;
          if (pos[1] - start[1] <= 0) {
            d = 0;
          }
        }
        break;
      case 3:
        if (d==0) {
          vel[0] = 3;
          vel[1] = 0;
          if (pos[0] - start[0] >= 30) {
            d = 1;
          }
        }else if (d==1) {
          vel[0] = 0;
          vel[1] = 3;
          if (pos[1] - start[1] >= 30) {
            d =2;
          }
        }else if (d==2) {
          vel[0] = -3;
          vel[1] = 0;
          if (pos[0] - start[0] <= 0) {
            d = 3
          }
        }else {
          vel[0] == 0;
          vel[1] == -3;
          if (pos[1] - start[1] <= 0) {
            d = 0
          }
        }
        break;
      case 4:
        if (d==1) {
          vel[0] = 3;
          vel[1] = 0;
          if (pos[0] - start[0] >= 30) {
            d = 2;
          }
        }else if (d==0) {
          vel[0] = 0;
          vel[1] = 3;
          if (pos[1] - start[1] >= 30) {
            d =1;
          }
        }else if (d==3) {
          vel[0] = -3;
          vel[1] = 0;
          if (pos[0] - start[0] <= 0) {
            d = 0
          }
        }else {
          vel[0] == 0;
          vel[1] == -3;
          if (pos[1] - start[1] <= 0) {
            d = 3
          }
        }
        break;
    }
  }
  //back in the main part
}
