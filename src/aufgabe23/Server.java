package aufgabe23;

import java.util.Optional;

public class Server {

  String cpuName = null;
  Integer cpuClock = 4500;
  Integer cpuTdp = 330;

  String gpuName = null;
  Integer gpuClock = 2500;
  Integer gpuTdp = 450;

  String ramName = null;
  Integer ramSize = 32;

  CPU cpu = new CPU(cpuName, cpuClock, cpuTdp);

  public CPU getCpu() {
    return cpu;
  }

  GPU gpu = new GPU(gpuName, gpuClock, gpuTdp);

  public GPU getGpu() {
    return gpu;
  }

  RAM ram = new RAM(ramName, ramSize);

  public RAM getRam() {
    return ram;
  }
}
