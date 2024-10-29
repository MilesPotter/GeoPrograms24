public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("CharlieBrown.png");
        plane.showBackGround();
        plane.pausetime = 0;


        snoopy();


        for (int j = 0; j < 545; j = j + 1) {
            for (int k = 0; k < 620; k = k + 1) {
                plane.teleport(j, k);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
               // plane.setPixelColor(red, blue,green);

                if (red >= 190 && green <= 100 && blue <= 133) {
                    plane.setPixelColor(blue, blue,blue);
                   // plane.setPixelColor(0, 222, 0);

                    //  plane.setPixelColor(255, 0, 0);

                }

            }
        }
    }

    public void snoopy (){
        for (int y = 0; y < 1060; y = y + 1) {
            for (int x = 0; x < 1000; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red <= 20 && green <= 20 && blue <= 20) {
                    plane.setPixelColor(115, 10, 200);

//                plane.teleport(x, 488 - y);
                    if (red > 185 && red < 197 && green > 145 && green < 155) {
                        plane.setPixelColor(100, 255, 180);
                    }

                }
            }
        }

    }

}
