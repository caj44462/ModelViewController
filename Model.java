package application;

public class Model implements ModelInterface {

	private int numberOfCredits;

	private String yearInSchool;

	public Model(int numberOfCredits) {
		setNumberOfCredits(numberOfCredits);
	}

	public void setNumberOfCredits(int newNumberOfCredits) {
		numberOfCredits = newNumberOfCredits;
		if (numberOfCredits >= 0 && numberOfCredits <= 30) {
			yearInSchool = "Freshman";
		} else if (numberOfCredits >= 31 && numberOfCredits <= 60) {
			yearInSchool = "Sophomore";
		} else if (numberOfCredits >= 61 && numberOfCredits <= 90) {
			yearInSchool = "Junior";
		} else if (numberOfCredits >= 91 && numberOfCredits <= 122) {
			yearInSchool = "Senior";
		}
	}

	@Override
	public void setIndependent(int newIndependent) {
		setNumberOfCredits(newIndependent);

	}

	@Override
	public int getIndependent() {
		return numberOfCredits;
	}

	@Override
	public String getDependent() {
		return yearInSchool;
	}

}
