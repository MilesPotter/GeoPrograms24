public class B1_MoreLoop extends World {

    public void go() {
        plane.pausetime = 0;
        plane.trailWidth = 1;
        // edit the for loop so it makes a row of squares at the top of the sreen
        // make sure they have a trail width of 5
        // side length 10
        // all touching
        // make another row of squares right below the first one
        // use another for loop

        for (int y = 0; y < 800; y++) {

            for (int x = 0; x < 1000; x = x + 1) {
                plane.teleport(x ,y );
//                plane.setColor(x , 200, 170);
//                square(1);
                plane.setPixelColor(x/4, 150, 20);
                System.out.println("x: " + x);
            }
        }


//        plane.teleport(300, 300);
//        hexagon();

    }

    public void square(int distance) {// distance is the parameter
        for (int z = 0; z < 4; z=z+1){
            plane.isTrail = true;
            plane.move(distance);
            plane.turn(90);
            System.out.println("z: " + z);
        }
    }

    public void hexagon(){
        plane.move(25);
        plane.turn(30);
        plane.move(25);
        plane.turn(60);
        plane.move(25);
        plane.turn(60);
        plane.move(25);
        plane.turn(30);
        plane.move(25);
        plane.turn(30);
        plane.move(25);
        plane.turn(60);
        plane.move(25);
        plane.turn(60);
        plane.move(25);
    }
    {

    }
}
// Level one would be using move and turn
// level 2 would be using all that and adding 4 loops
// Draw a shape with n number of sides
// Share n is a parameter