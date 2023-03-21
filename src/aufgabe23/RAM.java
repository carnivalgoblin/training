package aufgabe23;

import java.util.Optional;

public class RAM {

  String name ;
  int size;

  public RAM(String name, int size) {
    this.name = name;
    this.size = size;
  }

  public String getName() {
    return Optional.ofNullable(name).orElse("Default RAM");
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }
}
