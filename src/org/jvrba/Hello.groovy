package org.jvrba;

class Hello implements Serializable {
  def num() {
    int num = 1;
    return num;
  }
  
  def hi() {
    String hi = "Hi!";
    println(hi);
  }
}
