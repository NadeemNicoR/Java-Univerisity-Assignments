import java.util.Arrays;

public class Food {

	   private String name; //name of the food          
	   private String category; //the category of food (en.wikipedia.org/wiki/List_of_foods)
	   private String color;
	   private int calories;
	   private int protiens;// put three further attributes here
	   
	   public Food()
	   {
		   this.name="dummy";
		   this.category="dummy";
		   this.color="dummy";
		   this.calories=0;
		   this.protiens=0;
	   }
	   public Food(String name, String category,String color,int calories,int protiens )
	   {
		   this.name=name;
		   this.category=category;
		   this.color=color;
		   this.calories= calories;
		   this.protiens=protiens;
	   }
	   public String toString() 
	   {
		   String att[]=new String[5];
	       att[0]= this.name;
	       att[1]=this.category;
	       att[2]=this.color;
	       att[3]= String.valueOf(calories);
	       att[4]=String.valueOf(protiens);
	       String attributes =Arrays.toString(att);
		return attributes;
	   }
	   
	   public int hashCode() 
	   {
		   return color.length()*name.length()*category.length();
	   }
	   
	   public boolean equals(Object obj) {
		   Food compareObj = null;
		   if(obj instanceof Food)
			   compareObj = (Food) obj;
		   if(compareObj!=null && this.name.equals(compareObj.name) && this.category.equals(compareObj.category) && this.color.equals(compareObj.color)
				   && this.protiens==compareObj.protiens && this.calories==compareObj.calories)
			   return true;
		   
		   return false;
	   }
}
