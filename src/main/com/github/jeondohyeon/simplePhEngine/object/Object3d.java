package com.github.jeondohyeon.simplePhEngine;

import com.github.jeondohyeon.simplePhEngine.vector.Vector;

/**
 * @author : 전도현 (jdh59681@naver.com)
 * 
 * 3차원 오브젝트(정적)를 정의합니다.
 */
public class Object3d {
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
    Vec3 formerLoc = this.Location;
    this.transformVelocity();
    this.transformLocation();
    this.transformVelocity();
    if (!(wallPos1 == null || wallPos2 == null)) {
      while (inRange(wallPos1, wallPos2, this.Location) != null) {
        char collide = inRange(wallPos1, wallPos2, this.Location);
        float _x, _y, _z, rate;
        _x = this.Location.x - formerLoc.x;
        _y = this.Location.y - formerLoc.y;
        _z = this.Location.z - formerLoc.z;
        if (collide == "x") {
          rate = a;
        }
      }
    }
  }
  
  public static final inRange(@NotNull Vec3 pos1,
                              @NotNull Vec3 pos2,
                              @NotNull Vec3 testPosition) {
    Vec3 _pos1 = new Vec3();
    Vec3 _pos2 = new Vec3();
    Vec3 _t = testPosition;
  
    // transform phase
    if (pos1.x <= pos2.x) {
      _pos1.x = pos1.x;
      _pos2.x = pos2.x;
    } else {
      _pos1.x = pos2.x;
      _pos2.x = pos1.x;
    }
    if (pos1.y <= pos2.y) {
      _pos1.y = pos1.y;
      _pos2.y = pos2.y;
    } else {
      _pos1.y = pos2.y;
      _pos2.y = pos1.y;
    }
    if (pos1.z <= pos2.z) {
      _pos1.z = pos1.z;
      _pos2.z = pos2.z;
    } else {
      _pos1.z = pos2.z;
      _pos2.z = pos1.z;
    }
  
    // test phase
    if (!(_pos1.x <= _t.x && _t.x <= _pos2.x)) return "x";
    if (!(_pos1.y <= _t.y && _t.y <= _pos2.y)) return "y";
    if (!(_pos1.z <= _t.z && _t.z <= _pos2.z)) return "z";
    return null;
  }
}
