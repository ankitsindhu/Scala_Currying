/**
  * Created by ankit on 15/3/17.
  */
object Student_Example extends App{
val obj1= new Student("Ankit",27,"P15220","System engineer")
  val obj2= new Student("Orijit",37,"P15221","System engineer")
  var list:List[Student]=List(obj1,obj2)
  list.foreach(x=>println(x))
}

 class Student(name:String, Age:Int, Emp_Id:String, Desig:String){
   override def toString: String = "Name "+name+" Age= "+Age+" Emp_id= "+Emp_Id+" Desig= "+Desig
 }