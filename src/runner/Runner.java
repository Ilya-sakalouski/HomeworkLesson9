package src.runner;

import src.vector.Vector3D;

public class Runner {
    public static void main(String[] args) {
        Vector3D vector1 = new Vector3D(2, 3.4, 12);
        Vector3D vector2 = new Vector3D(3, 11, 4.6);

        vector1.getMeVectorInfo3D(vector1.getDESCRIPTION3D(), vector1.getX(), vector1.getY(), vector1.getZ());
        vector2.getMeVectorInfo3D(vector2.getDESCRIPTION3D(), vector2.getX(), vector2.getY(), vector2.getZ());

        System.out.println("Vector's 1 length is: " + vector1.getModule());
        System.out.println("Vector's 2 length is: " + vector2.getModule());
        System.out.println("The scalar product of these vectors is: " + vector1.getScalar(vector2));
        System.out.println("The sum of these vectors is: " + vector1.getAddition(vector2));
        System.out.println("The subtraction of these vectors is: " + vector1.getSubtraction(vector2));
    }
}
