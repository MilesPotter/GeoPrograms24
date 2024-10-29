public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 2;
        plane.pausetime = 0;

        for (int x = 0; x < 10; x = x + 1) {
            System.out.println("x: " + x);
            plane.square(100);
        }
        System.out.println("end of loop");
        for (int x = 1; x < 100; x = x + 1) {// 10 circles
            System.out.println(" circle #" + x);
            plane.circle(20);
            plane.turn(5);
        }
        flower();
    }


    public void flower() {
        plane.teleport(500, 250);
        System.out.println("end of loop");
        for (int x = 1; x < 100; x = x + 1) {// 10 circles
            System.out.println(" circle #" + x);
            plane.circle(20);
            plane.turn(5);
        }
    }
}