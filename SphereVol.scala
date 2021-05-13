import scala.math

object SphereVol extends App{
  def volume(r:Double):Double=(4.0/3.0)*math.Pi*r*r*r;

  println("Volume of a sphere with radius 5 = "+volume(5));
}
