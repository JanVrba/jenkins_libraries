package org.jvrba;
 class Hello implements Serializable {
  def name
  Hello(name) {
   this.name = name
   echo 'Hello' + name
  }
}
