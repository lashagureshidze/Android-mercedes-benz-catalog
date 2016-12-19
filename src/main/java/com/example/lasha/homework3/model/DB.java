package com.example.lasha.homework3.model;

import com.example.lasha.homework3.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Model Provider
 *
 * Created by lasha on 3/25/2015.
 */
public class DB {

    private static List<Vehicle> data;

    /**
     * returns vehicles list in efficient way
     * if list will be generate only once
     * @return Vehicles list .
     */
    public static List<Vehicle> getData() {
        if (data != null) return data;

        generateData();
        return data;
    }

    /**
     * returns Vehicle object in position
     * @param position
     * @return
     */
    public static Vehicle getVehicle(int position) {
        if (data == null) {
            generateData();
        }
        return data.get(position);
    }

    /**
     * returns vehicle with specified id
     * @param id
     * @return
     */
    public static Vehicle getVehicle(long id) {
        if (data == null) {
            generateData();
        }

        for (Vehicle v : data) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }

    private static void generateData() {
        data = new ArrayList<>();


        Vehicle c = new Vehicle();
        c.setId(1);
        c.setPhotoId(R.drawable.c);
        c.setPhotoIdHD(R.drawable.c63_hd);
        c.setName("Mercedes-Benz");
        c.setModel("C63 AMG");
        c.setPrice("63,675");
        c.setFuelCity(13);
        c.setFuelHwy(19);
        c.setAcceleration("3.7");
        c.setPower(481);
        c.setSpeed(174);
        c.setDescription("The C63 AMG coupe is the final place of refuge for Benz's 451-hp, naturally aspirated 6.2-liter V-8. With its sharp throttle response and unholy roar, the engine makes Mercedes’ smallest rear-drive coupe feel as if it’s eaten a jar full of hot peppers laced with steroids. Want more of a kick? The C63 also offers the 507 Edition with 507 hp. An all-new, rechristened Mercedes-AMG C63 sedan—based on the new C-class—is coming soon; a twin-turbo 4.0-liter V-8 will replace the legendary 6.2.");
        data.add(c);

        c = new Vehicle();
        c.setId(3);
        c.setPhotoId(R.drawable.cls);
        c.setPhotoIdHD(R.drawable.cls_hd);
        c.setName("Mercedes-Benz");
        c.setModel("CLS63 AMG");
        c.setPrice("1.7,475");
        c.setFuelCity(16);
        c.setFuelHwy(22);
        c.setAcceleration("3.2");
        c.setPower(577);
        c.setSpeed(220);
        c.setDescription("Whenever you add the letters “AMG” to a Mercedes model, you are sure to get breathtaking performance, and the CLS63 AMG is no exception. As the high-horsepower version of Mercedes’ “four-door coupe,” it offers stylish lines with room for four. Under the hood is a twin-turbo 5.5-liter V-8 that makes a beastly 577 hp and 590 lb-ft with a seven-speed automatic. All-wheel drive (4MATIC) is standard as is an adaptive sport suspension. The CLS63 may be expensive and exclusive, but it’s worth it.");
        data.add(c);

        c = new Vehicle();
        c.setId(2);
        c.setPhotoId(R.drawable.cla);
        c.setPhotoIdHD(R.drawable.cla_hd);
        c.setName("Mercedes-Benz");
        c.setModel("CLA45 AMG");
        c.setPrice("49,425");
        c.setFuelCity(13);
        c.setFuelHwy(19);
        c.setAcceleration("4.2");
        c.setPower(355);
        c.setSpeed(174);
        c.setDescription("The steroid-enhanced version of Mercedes’ slinky CLA-class sedan comes with a potent 355-hp turbocharged four-cylinder engine, a seven-speed dual-clutch automatic, all-wheel drive, and a sport-tuned chassis. The result: outstanding performance by almost every measure. Unfortunately, some cheap plastics and poor panel fits mar the CLA45’s interior, and the rear seat is extremely tight. Add in a precious price when a few options boxes are checked, and the CLA45 AMG can be a tough sell.");
        data.add(c);

        c = new Vehicle();
        c.setId(4);
        c.setPhotoId(R.drawable.e);
        c.setPhotoIdHD(R.drawable.e_hd);
        c.setName("Mercedes-Benz");
        c.setModel("E63 AMG");
        c.setPrice("101,525");
        c.setFuelCity(15);
        c.setFuelHwy(21);
        c.setAcceleration("3.4");
        c.setPower(557);
        c.setSpeed(174);
        c.setDescription("Absurd power and blistering acceleration are not the E63’s only party tricks; thanks to computer trickery and an excellent suspension, it’s also quite agile. But oh, that mighty hand-built, 550-hp 5.5-liter twin-turbo V-8 is a sweetheart of an engine. Opt for the S-model and power increases to an even loftier 577 hp. A seven-speed automatic and all-wheel drive are standard; if the sedan isn’t quite enough for you, check out the E63 AMG wagon which will haul the groceries home in record time.");
        data.add(c);

        c = new Vehicle();
        c.setId(5);
        c.setPhotoId(R.drawable.g);
        c.setPhotoIdHD(R.drawable.g_hd);
        c.setName("Mercedes-Benz");
        c.setModel("G63 AMG");
        c.setPrice("138,075");
        c.setFuelCity(12);
        c.setFuelHwy(14);
        c.setAcceleration("5.0");
        c.setPower(544);
        c.setSpeed(132);
        c.setDescription("Breathtakingly expensive, hugely powerful, aggressively thirsty, and anachronistic in looks, this is not for the shy. With its roots going back to 1979, the legendary g-wagen retains its basic fashionista-meets-Sandinista look. Its twin-turbo 5.5-liter V-8 cranks out 536 hp and 560 lb-ft of torque and mates to a seven-speed automatic. Mercedes’ all-wheel-drive system, 4MATIC, is standard, making the G63 highly capable off-road although it’s more likely to be seen outside a Hollywood hot spot.");
        data.add(c);

        c = new Vehicle();
        c.setId(6);
        c.setPhotoId(R.drawable.gl);
        c.setPhotoIdHD(R.drawable.gl_hd);
        c.setName("Mercedes-Benz");
        c.setModel("GL63 AMG");
        c.setPrice("120,375");
        c.setFuelCity(13);
        c.setFuelHwy(19);
        c.setAcceleration("5.3");
        c.setPower(481);
        c.setSpeed(150);
        c.setDescription("The top-flight GL63 AMG is built for those who crave performance, luxury, and exclusivity—you know; the finer things in life. AMG works its magic on the GL, resulting in 550 hp from its twin-turbocharged 5.5-liter V-8, a seven-speed automatic transmission with rev-matching on downshifts, enhanced all-wheel drive, plus improved suspension, steering, and brakes. Other upgrades include flared fenders housing AMG’s 21-inch wheels, stainless steel running boards and sport bucket seats.");
        data.add(c);

        c = new Vehicle();
        c.setId(7);
        c.setPhotoId(R.drawable.s_coupe);
        c.setPhotoIdHD(R.drawable.s_coupe_hd);
        c.setName("Mercedes-Benz");
        c.setModel("S63 COUPE AMG");
        c.setPrice("161,675");
        c.setFuelCity(15);
        c.setFuelHwy(23);
        c.setAcceleration("3.7");
        c.setPower(577);
        c.setSpeed(187);
        c.setDescription("The S63 AMG and S65 AMG are Teutonic chariots of the gods, mixing sumptuous luxury with earth-shaking power. Huge front air intakes, big wheels, and quad tailpipes hint at the powertrains on tap: the S63 has a 577-hp twin-turbo V-8 with all-wheel drive; the S65 wields a 621-hp twin-turbo V-12 that sends 738 lb-ft to the rear wheels. The cabin is awash in leather, carbon fiber, and more leather. Choose the sedan if you need four doors; to us, the coupe is one of the most beautiful cars around.");
        data.add(c);

        c = new Vehicle();
        c.setId(8);
        c.setPhotoId(R.drawable.sl);
        c.setPhotoIdHD(R.drawable.sl_hd);
        c.setName("Mercedes-Benz");
        c.setModel("SL63 AMG");
        c.setPrice("216,156");
        c.setFuelCity(13);
        c.setFuelHwy(19);
        c.setAcceleration("3.1");
        c.setPower(577);
        c.setSpeed(200);
        c.setDescription("The SL AMGs are the high-performance roadsters for those who refuse to settle for anything less than awesome. First, there’s the SL63 AMG with its 530-hp, 5.5-liter twin-turbo V-8 mated to a quick-shifting seven-speed automatic. Need more? The AMG Performance package makes 577 hp. The more potent (yet not speedier) SL65 AMG offers up a 621-hp, 6.0-liter twin-turbo V-12. The optional active suspension helps the brutish duo behave but the steering, while quick and linear, is a bit numb.");
        data.add(c);

        c = new Vehicle();
        c.setId(9);
        c.setPhotoId(R.drawable.sls);
        c.setPhotoIdHD(R.drawable.sls_hd);
        c.setName("Mercedes-Benz");
        c.setModel("SLS AMG");
        c.setPrice("229,050");
        c.setFuelCity(13);
        c.setFuelHwy(17);
        c.setAcceleration("3.2");
        c.setPower(622);
        c.setSpeed(200);
        c.setDescription("The SLS AMG GT is an incredibly fast and rare supercar that harkens back to the Gullwings of yore. It’s powered by a 6.2-liter V-8 that makes 583 hp, mated to a seven-speed dual-clutch automatic transmission and rear-wheel drive. Got cash to burn? Opt for the Black Series with 622 hp and other go-fast goodies. No matter your choice, the SLS remains a Mercedes, replete with a luxurious, well-appointed interior. The insanity concludes soon with the 2015 SLS AMG GT Final Edition. Get yours now!");
        data.add(c);

        c = new Vehicle();
        c.setId(10);
        c.setPhotoId(R.drawable.gla);
        c.setPhotoIdHD(R.drawable.gla_hd);
        c.setName("Mercedes-Benz");
        c.setModel("GLA45 AMG");
        c.setPrice("49,225");
        c.setFuelCity(23);
        c.setFuelHwy(29);
        c.setAcceleration("4.2");
        c.setPower(355);
        c.setSpeed(158);
        c.setDescription("As the hot-rod version of the GLA250, the GLA45 AMG massages the turbo 2.0-liter to 355 hp and 332 lb-ft, then adds a revised seven-speed transmission and all-wheel drive to put down power. Everything from steering knuckles to brake calipers and bushings are upgraded. As such, this compact-crossover hot-hatch has sports cars squarely in the sights of its three-pointed star. The exhaust bark and sticky tires are standard; sport seats and a sport steering wheel, however, are on the options list.");
        data.add(c);

        c = new Vehicle();
        c.setId(11);
        c.setPhotoId(R.drawable.m);
        c.setPhotoIdHD(R.drawable.m_hd);
        c.setName("Mercedes-Benz");
        c.setModel("M-class");
        c.setPrice("63,825");
        c.setFuelCity(18);
        c.setFuelHwy(23);
        c.setAcceleration("6.4");
        c.setPower(302);
        c.setSpeed(134);
        c.setDescription("There’s much to like about the M-class—the first-rate cabin, modern tech, and towing ability—but those seeking something sporty should keep looking. The base setup is a 302-hp 3.5-liter V-6 with rear-wheel drive for the Sunbelt set; 4MATIC all-wheel drive is optional. Other engines include a 200-hp 2.1-liter turbo-diesel four and a 329-hp, twin-turbo 3.0-liter V-6, both with 4MATIC. Don’t expect the M-class to be handy off-road, but it can tackle nasty weather with its 4MATIC all-wheel drive.");
        data.add(c);

        c = new Vehicle();
        c.setId(12);
        c.setPhotoId(R.drawable.maybach);
        c.setPhotoIdHD(R.drawable.maybach_hd_1);
        c.setName("Mercedes-Benz");
        c.setModel("Maybach S600");
        c.setPrice("190,275");
        c.setFuelCity(12);
        c.setFuelHwy(14);
        c.setAcceleration("6.4");
        c.setPower(585);
        c.setSpeed(165);
        c.setDescription("This sumptuous limo is not just a stretched S-class with a Maybach badge—it’s far more lavish than that ordinary sedan. A 523-hp, 6.0-liter twin-turbo V-12 provides effortless motivation while passengers enjoy hot-stone massaging, leather recliners. Touted as the world’s quietest car and with a standard Burmester audio system, the S600 is a rolling concert hall as well. And forget that new-car smell—the air-filtration system infuses the cabin with the Maybach’s own signature fragrance.");
        data.add(c);
    }
}
