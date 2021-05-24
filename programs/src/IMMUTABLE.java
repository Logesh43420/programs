
public final class IMMUTABLE {
     private  int phone ;
     private  String name ;
     
     public IMMUTABLE() {
    	 phone =34;
    	 name= "ravi";
     }
     
     public IMMUTABLE (int phone ,String name)
     {
    	 this.phone=phone;
    	 this. name =name;
     }
	
	public String toString()
	{
		return  name  + phone ;
	}
}
