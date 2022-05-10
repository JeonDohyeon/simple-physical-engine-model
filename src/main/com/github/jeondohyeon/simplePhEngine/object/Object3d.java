package com.github.jeondohyeon.simplePhEngine;

import com.github.jeondohyeon.simplePhEngine.vector.Vector;

public class object3d {
  public Vec3 Location;
  public Vec3 Velocity;
  public Vec3 Accelation;
  public Vec3 Torque;
  
  public static final void setLocation(Vec3 l) {self.Location.set(l);}
  public static final void setVelocity(Vec3 v) {self.Velocity.set(v);}
  public static final void setAccelation(Vec3 a) {self.Accelation.set(a);}
  public static final void setTorque(Vec3 t) {self.Torque.set(t);}
  
  public static final getLocation() {return self.Location;}
  public static final getVelocity() {return self.Velocity;}
  public static final getAccelation() {return self.Accelation;}
  public static final getTorque() {return self.Torque;}
}
