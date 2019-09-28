package laur;

public class IsPositive {

    private int value;

    public boolean checkIfPositive() {

        if (this.value > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setValue(int value) {
        this.value = value;
    }
}
