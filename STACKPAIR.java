public class STACKPAIR{ 
public static void main(String[] args) 
{ 
  STACK newStack = new STACK(2); 
  PAIR p = new PAIR("Apple",5); 
  newStack.push(p); 
   
  PAIR s = new PAIR("Speed",70); 
  newStack.push(s); 
   
  while(!newStack.isEmpty()){ 
  newStack.pop(); 
  } 
  } 
} 
 