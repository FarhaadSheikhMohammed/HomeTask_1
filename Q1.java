import java.util.*;
import java.lang.*;
public class Q1
{
    public static void main(String[] args)
    {
    	int sun_diameter,earth_diameter;
    	double sun_radius,earth_radius,sun_volume,earth_volume,sun_to_earth;
        sun_diameter=865000;
        earth_diameter=7600;
        sun_radius = sun_diameter/2.0;
        earth_radius = earth_diameter/2.0;
        sun_volume=4*Math.PI*Math.pow(sun_radius,3)/3;
        earth_volume=4*Math.PI*Math.pow(earth_radius,3)/3;
        sun_to_earth= sun_volume/earth_volume;
        String SunVolume = String.format("%.1f", sun_volume);
        String EarthVolume = String.format("%.1f", earth_volume);
        String SunToEarth = String.format("%.1f", sun_to_earth);

        System.out.println("Volume of Sun is "+SunVolume +" cubic miles");
        System.out.println("Volume of Earth is "+EarthVolume +" cubic miles");
        System.out.println("The ratio of the volume of the Sun to the volume of the Earth is "+SunToEarth);
    }
}