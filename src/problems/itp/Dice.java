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

  public int leftEar(int head, int face) {
    if (head == this.t) {
      if (face == this.s) return this.e;
      if (face == this.e) return this.n;
      if (face == this.n) return this.w;
      if (face == this.w) return this.s;
    } else if (head == this.s) {
      if (face == this.t) return this.w;
      if (face == this.w) return this.b;
      if (face == this.b) return this.e;
      if (face == this.e) return this.t;
    } else if (head == this.n) {
      if (face == this.t) return this.e;
      if (face == this.e) return this.b;
      if (face == this.b) return this.w;
      if (face == this.w) return this.t;
    } else if (head == this.e) {
      if (face == this.t) return this.s;
      if (face == this.s) return this.b;
      if (face == this.b) return this.n;
      if (face == this.n) return this.t;
    } else if (head == this.w) {
      if (face == this.t) return this.n;
      if (face == this.n) return this.b;
      if (face == this.b) return this.s;
      if (face == this.s) return this.t;
    } else if (head == this.b) {
      if (face == this.n) return this.e;
      if (face == this.e) return this.s;
      if (face == this.s) return this.w;
      if (face == this.w) return this.n;
    }
    return 0;
  }
}
