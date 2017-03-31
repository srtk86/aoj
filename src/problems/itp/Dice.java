package problems.itp;

public class Dice {

  private int t;
  private int s;
  private int e;
  private int n;
  private int w;
  private int b;

  public Dice(int t, int s, int e, int w, int n, int b) {
    this.t = t;
    this.s = s;
    this.e = e;
    this.w = w;
    this.n = n;
    this.b = b;
  }

  public void roll(Character direction) {
    if (direction == 'N') {
      int tmp = this.t;
      this.t = this.s;
      this.s = this.b;
      this.b = this.n;
      this.n = tmp;
    } else if (direction == 'E') {
      int tmp = this.t;
      this.t = this.w;
      this.w = this.b;
      this.b = this.e;
      this.e = tmp;
    } else if (direction == 'W') {
      int tmp = this.t;
      this.t = this.e;
      this.e = this.b;
      this.b = this.w;
      this.w = tmp;
    } else if (direction == 'S') {
      int tmp = this.t;
      this.t = this.n;
      this.n = this.b;
      this.b = this.s;
      this.s = tmp;
    }
  }

  public int eye() {
    return this.t;
  }
}
