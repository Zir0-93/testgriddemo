package demotest.complexIntegerPackage;

public class TestGridDemo {

    public TestGridDemo() {

    }

    public boolean reactorLevelTooHigh(int reactorLevel1, int reactorLevel2) {

        if (((reactorLevel1 + reactorLevel2) / 2) > 50) {
            return true;
        } else {
            return false;
        }
    }
}
