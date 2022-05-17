package application_backend.content;

import javafx.scene.image.Image;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Configured_Bodies {
    /**
     * Class which holds of the unchanging attributes of the various bodies.
     * @param path
     * @return
     */

    // START -- METHOD TO RETURN AN IMAGE AFTER GIVEN THE FILE PATH TO A NAME WHICH IS BUFFERED FOR SPEED
    @Contract("_ -> new")
    private static @Nullable Image setImage(String path) {
        try {
            return new Image(
                    new BufferedInputStream(
                            new FileInputStream(
                                    path
                            )
                    )
            );
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("FATAL ERROR OCCURRED: IMAGE PATH NOT FOUND IN setImage LINE 16");
            return null;
        }
    }
    // END -- METHOD TO RETURN AN IMAGE AFTER GIVEN THE FILE PATH TO A NAME WHICH IS BUFFERED FOR SPEED

    // START -- DECLARE REFERENCE VARIABLES FOR IMAGES FOR PLANETS
    private final static Image mercuryImage = setImage("src/main/resources/pics/mercury-black-background.jpg");
    private final static Image venusImage =  setImage("src/main/resources/pics/venus-black-background.jpg");
    private final static Image earthImage = setImage("src/main/resources/pics/earth-black-background.jpg");
    private final static Image marsImage = setImage("src/main/resources/pics/mars-black-background.jpg");
    private final static Image jupiterImage = setImage("src/main/resources/pics/jupiter-black-background.jpeg");
    private final static Image saturnImage = setImage("src/main/resources/pics/saturn-black-background.jpg");
    private final static Image neptuneImage = setImage("src/main/resources/pics/neptune-black-background.jpg");
    private final static Image uranusImage = setImage("src/main/resources/pics/uranus-black-background.jpg");
    private final static Image moonImage = setImage("src/main/resources/pics/moon-black-background.jpg");
    private final static Image sunImage = setImage("src/main/resources/pics/sun-black-background.jpg");
    private final static Image solarSystemImage = setImage("src/main/resources/pics/milk-galaxy-black-background.jpg");

    // END -- DECLARE REFERENCE VARIABLES FOR IMAGES FOR PLANETS


    // START MERCURY CONFIGURATION
    public static CelestialBody mercury = new Planet(
                    "Mercury",
                    "1,516 mi",
                    "Mercury—the smallest planet in our solar system and closest to the Sun—is only slightly larger than Earth's Moon. Mercury is the fastest planet, zipping around the Sun every 88 Earth days",
                    "0.4 AU From Local Sun",
                    354,
                    "Our Local Sun",
                    mercuryImage,
                    new ElementConfiguration(
                            "Oxygen",
                            "Silicon",
                            "Magnesium"
                    ),
                    // Source: https://www.lpi.usra.edu/education/IYPT/Mercury.pdf
                    4503000000L,
                    new Atmosphere(
                            "Oxygen",
                            "Sodium",
                            "Hydrogen",
                            "White-ish"
                    )
                    // Source: https://www.adlerplanetarium.org/blog/how-to-identify-planets/#:~:text=Mercury%20is%20white%2Dish%20in,It's%20orange.)
            );
    // END MERCURY CONFIGURATION

    // START VENUS CONFIGURATION
    public static CelestialBody venus = new Planet(
            "Venus",
            "3,760 mi",
            "Venus spins slowly in the opposite direction from most planets. A thick atmosphere traps heat in a runaway greenhouse effect, making it the hottest planet in our solar system.",
            "0.7 AU From Local Sun",
            847L,
            "Our Local Sun",
            venusImage,
            new ElementConfiguration(
                    "Silicon",
                    "Oxygen",
                    "Aluminum"
            ),
            // Source: https://www.quora.com/What-is-the-composition-of-Venus-surface
            4503000000L,
            new Atmosphere(
                    "Carbon Dioxide",
                    "Nitrogen",
                    "Carbon Monoxide",
                    "Orange"
            )
    );

    // END VENUS CONFIGURATION

    // START EARTH CONFIGURATION
    public static CelestialBody earth = new HabitablePlanet(
            "Earth",
            "3,958 mi",
            "Earth—our home planet—is the only place we know of so far that’s inhabited by living things. It's also the only planet in our solar system with liquid water on the surface.",
            "1 AU From Local Sun",
            57L,
            "Our Local Sun",
            earthImage,
            new ElementConfiguration(
                    "Oxygen",
                    "Silicon",
                    "Aluminum"
            ),
            4503000000L,
            new Atmosphere(
                    "Nitrogen",
                    "Oxygen",
                    "Argon",
                    "Blue"
            ),
            7900000000L,
            new AnimalList(
                    "Horses",
                    "Lions",
                    "Dogs"
            )
    );

    // END EARTH CONFIGURATION

    // START MARS CONFIGURATION
    public static CelestialBody mars = new Planet(
            "Mars",
            "2,106 mi",
            "Mars is a dusty, cold, desert world with a very thin atmosphere. There is strong evidence Mars was—billions of years ago—wetter and warmer, with a thicker atmosphere.",
            "1.5 AU From Local Sun",
            -81L,
            "Our Local Sun",
            marsImage,
            new ElementConfiguration(
                    "Silicon",
                    "Oxygen",
                    "Iron"
            ),
            // Source: https://www.nasa.gov/mission_pages/msl/multimedia/pia16460.html#:~:text=By%20far%20the%20predominant%20gas,seasonal%20changes%20in%20atmospheric%20composition.
            4603000000L,
            new Atmosphere(
                    "Carbon Dioxide",
                    "Argon",
                    "Nitrogen",
                    "Yellowish-Brown"
            )
            // Source: https://www.google.com/search?q=what+is+the+age+of+mars&rlz=1C1UEAD_enUS983US983&ei=1WqAYuTDNsu10PEP1cODuAw&ved=0ahUKEwikgrnxv-D3AhXLGjQIHdXhAMcQ4dUDCA4&uact=5&oq=what+is+the+age+of+mars&gs_lcp=Cgdnd3Mtd2l6EAMyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgUIABCRAjoECAAQQzoLCAAQgAQQsQMQgwE6EQguEIAEELEDEIMBEMcBEKMCOgUILhCABDoICAAQgAQQyQM6CAgAEIAEELEDOgsIABCABBCxAxDJAzoECAAQDToHCAAQyQMQDToGCAAQFhAeOggIABAPEBYQHjoICAAQCBANEB46CggAEA8QCBANEB46BQgAEIYDSgQIQRgASgQIRhgAUABYxSNgrCRoBXABeACAAd0BiAGbGZIBBjEuMjUuMZgBAKABAcABAQ&sclient=gws-wiz
    );

    // END MARS CONFIGURATION

    // START JUPITER CONFIGURATION
    public static CelestialBody jupiter = new Planet(
            "Jupiter",
            "43,441 mi",
            "Jupiter is more than twice as massive than the other planets of our solar system combined. The giant planet's Great Red spot is a centuries-old storm bigger than Earth.",
            "5.2 AU From Local Sun",
            -234L,
            "Our Local Sun",
            jupiterImage,
            new ElementConfiguration(
                    "Hydrogen",
                    "Helium",
                    "Oxygen"
            ),
            // Source: https://theconversation.com/water-water-everywhere-in-our-solar-system-but-what-does-that-mean-for-life-76315
            4603000000L,
            new Atmosphere(
                    "Hydrogen",
                    "Helium",
                    "Ammonia",
                    "Light Blue"
            )
            // Source: https://www.space.com/18385-jupiter-atmosphere.html
    );

    // END JUPITER CONFIGURATION

    // START SATURN CONFIGURATION
    public static CelestialBody saturn = new Planet(
            "Saturn",
            "36,184 mi",
            "Adorned with a dazzling, complex system of icy rings, Saturn is unique in our solar system. The other giant planets have rings, but none are as spectacular as Saturn's.",
            "9.5 AU From Local Sun",
            -285L,
            "Our Local Sun",
            saturnImage,
            new ElementConfiguration(
                    "Helium",
                    "Methane",
                    "Ammonia"
            ),
            // Source: https://www.space.com/18475-saturn-s-atmosphere-composition-climate-and-clouds.html
            4503000000L,
            new Atmosphere(
                    "Hydrogen",
                    "Helium",
                    "Ammonia",
                    "Blue"
            )
            // Source: https://www.nasa.gov/mission_pages/cassini/whycassini/17feb_bluesaturn.html#:~:text=The%20color%20there%20is%20blue,and%20nitrogen%20(N2).
    );

    // END SATURN CONFIGURATION

    // START NEPTUNE CONFIGURATION
    public static CelestialBody neptune = new Planet(
            "Neptune",
            "15,299 mi",
            "Neptune—the eighth and most distant major planet orbiting our Sun—is dark, cold and whipped by supersonic winds. It was the first planet located through mathematical calculations, rather than by telescope.",
            "30.1 AU From Local Sun",
            -373L,
            "Our Local Sun",
            neptuneImage,
            new ElementConfiguration(
                    "Hydrogen",
                    "Helium",
                    "Methane"
            ),
            // Source: https://solarsystem.nasa.gov/planets/neptune/in-depth/#:~:text=Neptune's%20atmosphere%20is%20made%20up,a%20little%20bit%20of%20methane.
            4503000000L,
            new Atmosphere(
                    "Hydrogen",
                    "Helium",
                    "Methane",
                    "Blue"
            )
            // Source: https://en.wikipedia.org/wiki/Extraterrestrial_sky#:~:text=Judging%20by%20the%20color%20of,are%20very%20thin%20and%20dark.
    );

    // END NEPTUNE CONFIGURATION

    // START URANUS CONFIGURATION
    public static CelestialBody uranus = new Planet(
            "Uranus",
            "15,759 mi",
            "Uranus—seventh planet from the Sun—rotates at a nearly 90-degree angle from the plane of its orbit. This unique tilt makes Uranus appear to spin on its side.",
            "19.8 AU From Local Sun",
            -353L,
            "Our Local Sun",
            uranusImage,
            new ElementConfiguration(
                    "Hydrogen",
                    "Helium",
                    "Ammonia"
            ),
            // Source: https://sciencing.com/elements-uranus-8198.html
            4503000000L,
            new Atmosphere(
                    "Hydrogen",
                    "Helium",
                    "Methane",
                    "Blue-Green"
            )
            // Source: https://www.weather.gov/fsd/uranus
    );

    // END URANUS CONFIGURATION

    // START LOCAL SOLAR SYSTEM CONFIGURATION
    public static CelestialBody localSolarSystem = new SolarSystem(
            "Local Solar System",
            "39.5 AU Radius",
            "Our solar system consists of our star, the Sun, and everything bound to it by gravity – the planets Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, and Neptune; dwarf planets such as Pluto; dozens of moons; and millions of asteroids, comets, and meteoroids. Beyond our own solar system, we have discovered thousands of planetary systems orbiting other stars in the Milky Way",
            "Center Of Milky Way Galaxy",
            "Milky Way",
            solarSystemImage,
            new ElementConfiguration(
                    "Hydrogen",
                    "Helium",
                    "Oxygen"
            ),
            4600000000L,
            8,
        "Our Local Star"
    );

    // END LOCAL SOLAR SYSTEM CONFIGURATION

    // START EARTH MOON CONFIGURATION
    public static CelestialBody earthMoon = new Moon (
            "Earth's Moon",
            "1,079 mi",
            "Earth's Moon is the only place beyond Earth where humans have set foot, so far. The Moon makes our planet more livable by moderating how much it wobbles on its axis.",
            "238,900 mi From Earth",
            "238,900 mi From Earth",
            moonImage,
            new ElementConfiguration(
                    "Oxygen",
                    "Silicon",
                    "Iron"
            ),
            4530000000L,
            "Earth",
            true
    );

    // END EARTH MOON CONFIGURATION

    // START LOCAL SUN CONFIGURATION
    public static CelestialBody localSun = new Sun(
                    "Our Sun",
                    "432,690 mi",
                    "The Sun is a yellow dwarf star, a hot ball of glowing gases at the heart of our solar system. Its gravity holds everything from the biggest planets to tiny debris in its orbit.",
                    "Center Of Our Solar System",
                    9941L,
                    "Center Of The Milky Way",
                    sunImage,
                    new ElementConfiguration(
                            "Hydrogen",
                            "Helium",
                            "Carbon"
                    ),
                    4603000000L,
                    8,
                    "38,460 Septillion Watts");

    public Configured_Bodies() throws FileNotFoundException {
    }

    // END LOCAL SUN CONFIGURATION
}
