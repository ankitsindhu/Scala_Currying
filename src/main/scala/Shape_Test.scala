import sun.security.util.Length

/**
  * Created by ankit on 16/3/17.
  */
object Shape_Test extends App{
  val circle1=new Circle(5,"Red")
  circle1.draw(circle1.drawShape)
  circle1.area()

  /*val cir=new Circle(7)
  cir.draw(cir.drawShape)
  cir.area()*/

  val rec=new Rectangle(5,6,"Blue")
  rec.draw(rec.drawShape)
  rec.area()

  val sq=new Square(25,"Orange")
  sq.draw(sq.drawShape)
  sq.area()

}

abstract class Shape(){
  def drawShape(str:String, rad:Double, widt:Double):String
}

class Circle(radius:Double,color:String="white") extends Shape{
  def this(redius:Double) = {
    this(redius, "white")
     }
   println(s"circle with radius $radius and color $color is defined")
  def draw(f:(String,Double,Double)=> String):Unit= println(f(this.color,this.radius,0.0))

  def area():Unit=println(s"area of circle is ${3.14*radius}")

  override def drawShape(str:String, rad:Double, widt:Double):String=
    s"shape circle with color $str and radius $rad is being drawn.........."
}

class Rectangle(Height:Double,width:Double,color:String="white") extends Shape{
  def this(height:Double, width:Double) = this(height, width,"White")
  def this(height:Double)= this(height,1.0,"white")
  println(s"Rectangle with Height $Height and width $width and color $color is defined")

  def draw(f:(String,Double,Double)=> String):Unit= println(f(this.color,this.Height,this.width))
  def area():Unit=println(s"area of Rectangle is ${this.Height*this.width}")
  override def drawShape(str:String, hgt:Double, widt:Double):String=
    s"shape Rectangle with height $Height and width $widt and color $str is being drawn........."
}

class Square(length:Double,color:String="white") extends Shape{
    println(s"Square with length $length and color $color is defined")

  def draw(f:(String,Double,Double)=> String):Unit= println(f(this.color,this.length,0.0))
  def area():Unit=println(s"area of Square is ${this.length*this.length}")
  override def drawShape(str:String, hgt:Double, widt:Double):String=
    s"shape Square with length $length and color $str is being drawn.............."
}
