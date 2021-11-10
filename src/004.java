
class Main {
    public static void main(String[] args) {
        new Sundial().printType();
        new Sundial().printTime();
        new Mechanical().printType();
        new Mechanical().printTime();
        new Cuckoo().printType();
    }
}

class Angle {
    int degree;
    protected static int limit = 180;

    protected int correctRange(int number) {
        if (-limit < number && number < limit) {
            return number;
        } else {
            return number - limit;
        }
    }

    public int Set(Double value) {
        return correctRange(value.intValue());
    }

    public int Add(Double value) {
        return degree + correctRange(value.intValue());
    }

    public int Compare(Double value) {
        if (value.intValue() == degree) {
            return 1;
        } else {
            return -1;
        }
    }

    public Angle(int deg) {
        degree = deg;
    }
}

class UAngle extends Angle {
    int degree;
    protected static int _limit = limit = 360;

    public UAngle(int deg) {
        super(deg);
        degree = deg;
    }
}

class Clock {
    protected static String type;

    public void printTime() {
        System.out.println(System.currentTimeMillis());
    }

    public void printType() {
        System.out.println(type);
    }
}

class Sundial extends Clock {
    protected static String _type = type = "Sundial";
}

class Mechanical extends Clock {
    protected static String _type = type = "Mechanical";
}

class Cuckoo extends Mechanical {
    protected static String _type = type = "Cuckoo";
}

class Grandfather extends Mechanical {
    protected static String _type = type = "Grandfather";
}

class Digital extends Clock {
    protected static String _type = type = "Digital";
}

class Atomic extends Clock {
    protected static String _type = type = "Atomic";
}
