public class R3Vector {
    double x, y, z;


    R3Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static R3Vector sum(R3Vector a, R3Vector b){
        R3Vector c = new R3Vector(0, 0, 0);
        c.x = a.x + b.x;
        c.y = a.y + b.y;
        c.z = a.z + b.z;
        return c;
    }

    public static R3Vector minus(R3Vector a, R3Vector b){
        R3Vector c = new R3Vector(0, 0, 0);
        c.x = a.x - b.x;
        c.y = a.y - b.y;
        c.z = a.z - b.z;
        return c;
    }

    void mulNum(double b){
        x *= b;
        y *= b;
        z *= b;
    }

    private static double mulScal(R3Vector a, R3Vector b){
        double c = 0;
        c += a.x * b.x;
        c += a.y * b.y;
        c += a.z * b.z;
        return c;
    }

    static R3Vector multiplyVector(R3Vector a, R3Vector b){
        R3Vector c = new R3Vector(0, 0, 0);
        c.x = a.y * b.z - a.z * b.y;
        c.y = a.z * b.x - a.x * b.z;
        c.z = a.x * b.y - a.y * b.z;
        return c;
    }

    public static double mulMix(R3Vector a, R3Vector b, R3Vector c){
        return mulScal(multiplyVector(a, b), c);
    }

    void translate(double dx, double dy, double dz) {
        this.x += dx;
        this.y += dy;
        this.z += dz;
    }

    void printVector(){
        System.out.println(this.x + " " + this.y + " " + this.z + " ");
    }

    private void rotateZ(double u) {
        u = Math.toRadians(u);
        double nx, ny;
        nx = this.x * Math.cos(u) - this.y * Math.sin(u);
        ny = this.x * Math.sin(u) + this.y * Math.cos(u);
        this.x = round100(nx);
        this.y = round100(ny);
    }

    private void rotateX(double u) {
        u = Math.toRadians(u);
        double nz, ny;
        ny = -this.z * Math.sin(u) + this.y * Math.cos(u);
        nz = this.z * Math.cos(u) + this.y * Math.sin(u);
        this.z = round100(nz);
        this.y = round100(ny);
    }

    private void rotateY(double u) {
        u = Math.toRadians(u);
        double nx, nz;
        nx = this.x * Math.cos(u) + this.z * Math.sin(u);
        nz = -this.x * Math.sin(u) + this.z * Math.cos(u);
        this.x = round100(nx);
        this.z = round100(nz);
    }

    void rotate(){
        rotateX(78.0);
        rotateY(30.0);
        rotateZ(147.0);
    }

    private static double round100(double a){
        return (double)((int)(a * 100)) / 100;
    }
}