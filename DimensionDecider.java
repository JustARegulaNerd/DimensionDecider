import javax.swing.JOptionPane;
import java.lang.Math;

public class DimensionDecider {
	public static void main(String[] args) {
		final String TITLE = "20w14infinite Dimension Decider";
		String[] playableDimensionList = {"blacklight", "busy", "chess", "colors", "content", "darkness", "decay", "gallery", "holes", "pillars", "rooms", "skygrid", "slime", "slime", "wall", "zones", "red", "green", "blue"};
		String[] unplayableDimensionList = {"ant", "basic", "brand", "bridges", "checkerboard", "credits", "custom", "fleet", "isolation", "library", "llama", "message", "missing", "notes", "nothing", "origin", "patterns", "perfection", "retro", "rooms", "shapes", "spiral", "sponge", "terminal", "this_is_a_very_long_phrase_that_hopefully_is_not_in_any_dictionary", "tunnels"};
		int amountOfPlayableDimensions = playableDimensionList.length;
		int amountOfUnplayableDimensions = unplayableDimensionList.length;
		int randomDimensionNumber;
		Object[] options = {"Survival-friendly", "Survival-unfriendly", "Random", "Cancel"};
		
		int selection = JOptionPane.showOptionDialog(null, "Choose the type of dimension you would like to play in.", TITLE, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
		
		switch(selection) {
			case 0:
				randomDimensionNumber = (int)(Math.random() * amountOfPlayableDimensions);
				JOptionPane.showInputDialog(null, "You must beat the " + playableDimensionList[randomDimensionNumber] + " dimension. Good luck.\n\nCopy paste the command below into your world.", TITLE, JOptionPane.INFORMATION_MESSAGE, null, null, "/warp " + playableDimensionList[randomDimensionNumber]);
				break;
			case 1:
				randomDimensionNumber = (int)(Math.random() * amountOfUnplayableDimensions);
				JOptionPane.showInputDialog(null, "You must visit the " + playableDimensionList[randomDimensionNumber] + " dimension. Good luck.\n\nCopy paste the command below into your world.", TITLE, JOptionPane.INFORMATION_MESSAGE, null, null, "/warp " + unplayableDimensionList[randomDimensionNumber]);
				break;
			case 2:
				randomDimensionNumber = (int)(Math.random() * 2147483647);
				JOptionPane.showInputDialog(null, "You must beat the " + randomDimensionNumber + " dimension. Good luck.\n\nCopy paste the command below into your world.", TITLE, JOptionPane.INFORMATION_MESSAGE, null, null, "/warp " + randomDimensionNumber);
				break;
			case 3:
				System.out.println("Exiting!");
				break;
			default:
				System.out.println("Invalid option selected. Please inform the developer, JustARegularNerd, about this issue.");
				break;
		}
	}
}