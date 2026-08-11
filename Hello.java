class Hello {
public static void main(String[] args){
  String name=System.getenv("USERNAME-VAR");
  if(name!=null){
    System.out.println("WELCOME TO DEVOPS LAB"+" "+name);
  }
  else{
    System.out.println("Environment variable not set!");
  }
}
