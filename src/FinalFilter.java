public class FinalFilter extends World {
    public int red;
    public int blue;
    public int green;
// snow
    public void go() {
        plane.loadBackGround("summer-skiing.jpg");
        plane.showBackGround();

        for (int y = 427; y < 650; y = y + 1) {
            for (int x = 0; x < 1049; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red <= 232 && red > 200 && green <= 230 && blue <= 240) {
                    plane.setPixelColor(245, 114, 166);
                } // jacket
            }
        }

                 for (int y = 16; y < 293; y = y + 1) {
                    for (int x = 136; x < 512; x = x + 1) {
                        plane.teleport(x, y);

                        red = plane.howMuchRed();
                        green = plane.howMuchGreen();
                        blue = plane.howMuchBlue();

                        if (red <= 170 && red > 100 && green <= 195 && blue <= 160) {
                            plane.setPixelColor(245, 164, 66);
                        }
                        }
                    }

                    for (int y = 0; y < 650; y = y + 1) {
                        for (int x = 0; x < 1000; x = x + 1) {
                            plane.teleport(x, y);

                            red = plane.howMuchRed();
                            green = plane.howMuchGreen();
                            blue = plane.howMuchBlue();

//                plane.teleport(x, 488 - y);
                            if (red > 185 && red < 225 && green > 225 && green < 225) {
                                plane.setPixelColor(100, 255, 0);
                            } // sky

                        }
                    }

                }
            }

