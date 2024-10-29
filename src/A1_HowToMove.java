public class A1_HowToMove extends World {//class = program
//THIS IS A COMMENT
    //THESE CAN BE USED TO TAKE NOTES
    public void go() {   // this is a method/ingredients (has parentheses)

        System.out.println("This message will be printed to the window below.");
        plane.pausetime = 2;//Integer (int) variable
        plane.startingAngle(0);// method
        plane.isTrail = true;// boolean variable
        plane.move(200);// method
        plane.isTrail = false;
        plane.move(100);
        plane.isTrail = true;
        plane.move(200);

    }

}//End of class/program

