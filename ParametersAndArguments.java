public class ParametersAndArguments {

    // Method to calculate area of a room
    public static int calculateArea(int width, int height) {
        int area = width * height;
        return area;
    }

    public static void main(String[] args) {
        // Variable declarations
        int roomWidth = 10;
        int roomHeight = 15;

        // Calculate the area
        int area = calculateArea(roomWidth, roomHeight);

        // Print the result
        System.out.println("The calculated area is: " + area);
    }
}
