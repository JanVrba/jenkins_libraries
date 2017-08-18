package org.jvrba;

class Hello implements Serializable {
  def num() {
    int num = 1;
    return num;
  }
  
  void hi() {
    String hi = "Hi!";
    println(hi);
  }
}
