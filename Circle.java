public class Circle {
    double x;
    double y;
    double radius;

    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public String format() {
        /*
        Return String of circle is format "(x - this.x)^2 + (y - this.y)^2 = this.radius^2". For example, if x is 1,
        y is 1 and radius is 2 then return "(x-1)^2 + (y-1)^2 = 4".
         */
        return "(x-" + this.x + ")^2" + "(y-" + this.y + " = " + this.radius;
    }

    public double getCircumference() {
        return this.radius * this.radius;
    }

    public void setRadius(double radius) {
        /*
        Sets this.radius. If radius is negative then set it to 0. If radius is beyond 100 then set it to 100.
         */
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public int compareTo(Circle other) {
        /*
        Return 0 if x, y, radius are all the same, return 1 if the absolute differences between x, y, radius sum up to
        at most 0.5 and otherwise return 2. For example, if the two circles were (1,1), 4 and (1,1.25),4.1 then the
        absolute errors are 0, 0.25, 0.1 which sum up to 0.35 which is less than 0.5 and so 1 is returned.
         */
        if (this.x == other.x && this.y == other.y && this.radius == other.radius) {
            return 0;
        } else {
            double xError = this.x - other.x;
            double yError = this.y - other.y;
            double radiusError = this.radius - other.radius;
            if (xError <= 0.5 || yError <= 0.5 || radiusError <= 0.5) {
                return 2;
            } else {
                return 3;
            }
        }
    }
}
