public class STACK{ 
  public PAIR[] theStack; 
  public int top; 
  public int MaxSize; 
   
  public STACK(int size) 
  { 
    MaxSize = size; 
    theStack = new PAIR[MaxSize]; 
    top=-1; 
  } 
  public void push(PAIR j) 
  { 
    theStack[++top] = j; 
  } 
  public PAIR pop() 
  { 
    PAIR s = theStack[top--]; 
    s.display();
    return s; 
  } 
  public boolean isEmpty() 
  { 
    return top==-1; 
  } 
} 
 
 
