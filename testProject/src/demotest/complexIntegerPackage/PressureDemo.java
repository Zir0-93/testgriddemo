package demotest.complexIntegerPackage;

class PressureDemo {

    public int calculatePressure(int s1, int s2, boolean emergStop) {
        if (emergStop) {
            return -1;
        }
        else {
            if (Math.abs(s1 - s2) > 5) {
                return -2;
            }
            else {
                if ((s1 + s2) / 2 < 40) {
                    return -3;
                }
 else if (((double) s1 + (double) s2) / 2 > 80) {
                    return -4;
                }
                else {
                    return (s1 + s2) / 2;
                }
            }
        }
    }
}