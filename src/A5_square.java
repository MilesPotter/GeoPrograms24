public class A5_square extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 2;
        plane.setColor(200, 0, 0);
        plane.startingAngle(90);
        square(200);// call the square method

    }


    public void square(int length) {// Define the square method
        //Length is a parameter (a type of variable)
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move (length);
        plane.turn(90);
        plane.move (length);
        plane.turn(90);
        plane.move (length);
        plane.turn(90);
        plane.move (length);
        plane.turn(90);
    }

}


