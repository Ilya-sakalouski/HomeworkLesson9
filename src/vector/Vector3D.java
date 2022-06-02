package src.vector;

public class Vector3D extends VectorInfo {
    private final String DESCRIPTION3D = "This is 3D vector: ";
    private double x, y, z;

    public String getDESCRIPTION3D() {
        return DESCRIPTION3D;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D() {
    }

    // TODO  ДЛИНА ВЕКТОРА
    public double getModule() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    // TODO  СКАЛЯРНОЕ ПРОИЗВЕДЕНИЕ
    public double getScalar(Vector3D vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    // TODO СЛОЖЕНИЕ
    public Vector3D getAddition(Vector3D vector) {
        return new Vector3D(x + vector.x, y + vector.y, z + vector.z);
    }

    // TODO ВЫЧИТАНИЕ
    public Vector3D getSubtraction(Vector3D vector) {
        return new Vector3D(x - vector.x, y - vector.y, z - vector.z);
    }
    @Override
    public String toString() {
        return "{" + x + "; " + y + "; " + z + "}";
    }
}
