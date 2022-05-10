package com.github.jeondohyeon.simplePhEngine;

import com.github.jeondohyeon.simplePhEngine.vector.Vector;

/**
 * @author : 전도현 (jdh59681@naver.com)
 * 
 * 3차원 오브젝트(정적)를 정의합니다.
 */
public class object3d {
  public Vec3 Location;
  public Vec3 Velocity;
  public Vec3 Accelation;
  public Vec3 Torque;
  
  public static final void setLocation(Vec3 l) {this.Location.set(l);}
  public static final void setVelocity(Vec3 v) {this.Velocity.set(v);}
  public static final void setAccelation(Vec3 a) {this.Accelation.set(a);}
  public static final void setTorque(Vec3 t) {this.Torque.set(t);}
  
  public static final getLocation() {return this.Location;}
  public static final getVelocity() {return this.Velocity;}
  public static final getAccelation() {return this.Accelation;}
  public static final getTorque() {return this.Torque;}
  
  public static final void transformLocation() {
    this.Location.x += this.Velocity.x;
    this.Location.y += this.Velocity.y;
    this.Location.z += this.Velocity.z;
  }
  public static final void transformVelocity() {
    this.Velocity.x += this.Accelation.x / 2;
    this.Velocity.y += this.Accelation.y / 2;
    this.Velocity.z += this.Accelation.z / 2;
  }
  
  public static final void Transform(@NotNull boolean stopWhenCollide, 
                                     @NotNull float collideAccelTransformRate,
                                     @Nullable Vec3 wallPos1,
                                     @Nullable Vec3 wallPos2) {
    this.transformVelocity();
    this.transformLocation();
    this.transformVelocity();
    if (!(wallPos1 == null || wallPos2 == null)) {
      if (!(this.inRange(wallPos1, wallPos2, this.Location) {
        
      }
    }
  }
}
