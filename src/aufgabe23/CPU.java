package aufgabe23;

import java.util.Optional;

public class CPU {

  public String name;
  public int clock;
  public int tdp;

  public CPU(String name, int clock, int tdp) {
    this.name = name;
    this.clock = clock;
    this.tdp = tdp;
  }

  public String getName() {
    return Optional.ofNullable(name).orElse("Default CPU");
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getClock() {
    return clock;
  }

  public void setClock(int clock) {
    this.clock = clock;
  }

  public int getTdp() {
    return tdp;
  }

  public void setTdp(int tdp) {
    this.tdp = tdp;
  }
}
