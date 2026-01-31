 class Vehicle {
  void start_engine(){
     System.out.println("engine is starting");
   } 
   void stop_engine(){
   System.out.println("engine is stoping");
   }
   void display_info(){
    System.out.println("this is vehicle");
   }
}
class Car extends Vehicle{
    int num_of_doors;
     Car(int num_of_doors){
        this.num_of_doors=num_of_doors;
    }
     @Override
     void start_engine(){
     System.out.println("car engine is started");
   } @Override
   void stop_engine(){
   System.out.println("car engine is stoped");
   } @Override
   void display_info(){
    System.out.println("the car having :"+num_of_doors+" doors");
   }



}
class Bicycle extends Vehicle{
   String type;
    Bicycle(String type){
    this.type=type;
   }
   @Override
     void start_engine(){
     System.out.println("Bicycle has no engine , pedaling is started");
   } @Override
   void stop_engine(){
   System.out.println("Bicycle has no engine , pedaling is stoped");
   } @Override
    void display_info(){
    System.out.println("the Bicycle is on :"+type);
   }

}
public class Polymorphism{
   public static void main(String[] args ){
    Vehicle c=new Car(4);
    Vehicle b=new Bicycle("road"); 

    c.start_engine();
    c.stop_engine();
    c.display_info();

    b.start_engine();
    b.stop_engine();
    b.display_info();
      
   }
}
/*output:
car engine is started
car engine is stoped
the car having :4 doors
Bicycle has no engine , pedaling is started
Bicycle has no engine , pedaling is stoped
the Bicycle is on :roa
 */
