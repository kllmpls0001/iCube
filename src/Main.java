public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.mulNum();
        cube.rotate();
        CubeWin win = new CubeWin(cube);
    }
}