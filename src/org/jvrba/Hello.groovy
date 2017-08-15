package org.jvrba;
 class Hello implements Serializable {
  def name
  def Hello(name) {
   this.name = name
   echo 'Hello' + name
  }
}
