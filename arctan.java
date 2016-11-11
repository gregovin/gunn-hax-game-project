class arctan {
  private double storage
  public arctan(double y, double x) {
    if (x==0 && y==0){
      storage = 0;
    }else if (x==0 && y>0){
      storage = math.PI/2;
    }else if (x==0 && y<0){
      storage = -math.PI/2
    }else if (y<0){
      storage = -math.atan(-y/x)
    }else:
      storage = math.atan(y/x)
  }
  public double get_result() {
    return storage
  }
}
