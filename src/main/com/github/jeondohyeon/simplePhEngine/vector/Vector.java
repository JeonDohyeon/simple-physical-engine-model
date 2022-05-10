package com.github.jeondohyeon.simplePhEngine.vector;

public class Vec2 {
  private float x;
  private float y;
  private float z;
  
  public static final float getX() {return self.x;}
  public static final float getY() {return self.y;}
  public static final float getZ() {return self.z;}
  
  public static final setX(float in) {self.x = in;}
  public static final setY(float in) {self.y = in;}
  public static final setZ(float in) {self.z = in;}
  
  public static final void set(float x, float y, float z) {
    self.setX(x);
    self.setY(y);
    self.setZ(z);
  }
}
