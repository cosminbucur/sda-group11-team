package laur;

public class NumberUtil {

    // why at instance level
//    private int value;

    // remove state from object by passing as variable
    public boolean checkIfPositive(int value) {
        // refactor using ternary operator
//        if (this.value > 0) {
//            return true;
//        } else {
//            return false;
//        }

        // condition ? true : false
//        return this.value > 0 ? true : false;

        return value > 0;
    }

    public boolean checkIfPositiveImproved(int value) {
        return value > 0;
    }

//    public void setValue(int value) {
//        this.value = value;
//    }
}
