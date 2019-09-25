import javax.swing.JOptionPane;

class vertebrates{
	public static void main(String[] args) {
		String animalType="";
		int bloodTypeInt = JOptionPane.showConfirmDialog(null,"Does the animal have cold blood?");
		boolean bloodCold = (bloodTypeInt == JOptionPane.YES_OPTION);
		if (bloodCold){
			int coveringTypeInt = JOptionPane.showConfirmDialog(null,"Does the animal have scales?");
			boolean scales = (coveringTypeInt == JOptionPane.YES_OPTION);
			if (scales){
				int finsInt = JOptionPane.showConfirmDialog(null,"Does the animal have fins?");
				boolean fins = (finsInt == JOptionPane.YES_OPTION);
				animalType = (fins)?"fish":"reptile";
			}
			else
				animalType = "amphibian";

		}
		else{
			int coveringTypeInt = JOptionPane.showConfirmDialog(null,"Does the animal have feathers?");
			boolean feathers = (coveringTypeInt == JOptionPane.YES_OPTION);
			animalType = (feathers)?"bird":"mammal";
		}
		
		JOptionPane.showMessageDialog(null,"It would appear you have a "+animalType+" on your hands!");
	}
}