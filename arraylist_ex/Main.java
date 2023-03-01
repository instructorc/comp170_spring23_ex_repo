import java.util.ArrayList;  
public class Main
{
	public static void main(String[] args) {
		//Two dimensional array
		double[][] price = {
			{350, 390, 435},
			{400, 440, 480},
			{475, 530, 575}
			};

		String[][] selection = {
			{"Snickers", "Twix", "Mars"},
			{"Skittles", "Starburst", "Sour Patch Kids"},
			{"Big Red", "Winter fresh", "Trident"}
			};

		ArrayList<Candy> candyList = new ArrayList<Candy>();

		//Iterate through the multi-Array and populate the list
		for (var i = 0; i < 3; i++)
		{
			for (var x = 0; x < 3; x++)
			{
				Candy aCandy = new Candy(selection[i][x], price[i][x]); //Creating the candy Object
				candyList.add(aCandy); //Adding candy object to array list

			}
		}

        //Output the third item in our array list
        System.out.println(candyList.get(2).getName());
		

		//Output the list using lambda Expression
		//candyList.forEach(x -> System.out.println(x));
	}
}
