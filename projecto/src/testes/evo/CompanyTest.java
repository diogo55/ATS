import org.junit.Test;

import java.awt.geom.Point2D;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class CompanyTest {


    @Test
    public void addDriver() {
        Company c = new Company("c","c");
        Driver d = new Driver("d", "", (String) null, "", LocalDate.of(1990,10,13), 2.0, null);
        c.addDriver(d);
        Driver d2 = new Driver("", "", (String) null, "", LocalDate.of(1990,10,13), 2.0, null);;
        c.addDriver(d2);
        assertEquals(2,c.getDrivers().size(),0.0001);
        assertEquals(true,c.getDrivers().containsKey(d));


    }

    @Test
    public void addVehicle() {
        Car v = new Car("E%bB(EvkbG3Taf(Dn", 3023.4061587, new Point2D.Double(), "E%bB(EvkbG3Taf(Dn");
        Bike b = new Bike("a", 0.0, new Point2D.Double(), "A");
        Helicopter h = new Helicopter("", 0.0, new Point2D.Double(), "");
        Company c = new Company("c","c");
        c.addVehicle(v);
        assertEquals(1,c.getVehicles().size(),0.0001);
        c.addVehicle(b);
        c.addVehicle(h);
        assertEquals(3,c.getVehicles().size(),0.0001);
        assertEquals(true,c.getVehicles().containsValue(h));
        Car c2 = new Car("E%bB(EvkbG3Taf(Dn", 3023.4061587, new Point2D.Double(), "E%bB(EvkbG3Taf(Dn");
        assertEquals(false,c.getVehicles().containsValue(c2));
    }

    @Test
    public void availiableTaxis() {
        Company c = new Company("c","c");
        assertEquals(false,c.availiableTaxis());
        Driver d = new Driver("d", "", (String) null, "", LocalDate.of(1990,10,13), 2.0, null);
        c.addDriver(d);
        d.setAvailability(true);
        assertEquals(true,c.availiableTaxis());
        d.setAvailability(false);
        assertEquals(false,c.availiableTaxis());
        Driver d2 = new Driver("", "", (String) null, "", LocalDate.of(1990,10,13), 2.0, null);;
        c.addDriver(d2);
        d2.setAvailability(false);
        assertEquals(false,c.availiableTaxis());
        d2.setAvailability(true);
        assertEquals(true,c.availiableTaxis());
    }

    @Test
    public void pickDriver() {
        Company c = new Company("c","c");
        Driver d = new Driver("d", "", (String) null, "", LocalDate.of(1990,10,13), 2.0, null);
        c.addDriver(d);
        Driver d2 = new Driver("d2", "", (String) null, "", LocalDate.of(1990,10,13), 2.0, null);;
        c.addDriver(d2);
        d.setAvailability(false);
        assertEquals("d2",c.pickDriver());
        d2.setAvailability(false);
        assertEquals(null,c.pickDriver());
        d.setAvailability(true);
        d2.setAvailability(true);
        assertNotNull(c.pickDriver());
    }

    @Test
    public void pickVehicle() {
        Company c = new Company("c","c");
        Bike b = new Bike("a", 0.0, new Point2D.Double(100,0), "A");
        Bike b2 = new Bike("b", 0.0, new Point2D.Double(0,0), "A");
        c.addVehicle(b);
        c.addVehicle(b2);
        b2.setAvailable(true);
        assertEquals("b",c.pickVehicle(new Point2D.Double(0,0)));
        b2.setAvailable(false);
        assertEquals("a",c.pickVehicle(new Point2D.Double()));
        b.setAvailable(false);
        assertEquals(null,c.pickVehicle(new Point2D.Double()));



    }

    @Test
    public void addTrip() {
        Company c = new Company("c","c");
        LocalDate d1 = LocalDate.of(2018,11,12);
        Trip trip0 = new Trip(500, new Point2D.Double(), new Point2D.Double(5,0), 5.0, 10.0, d1, "","", "", 5, 5.0, new Point2D.Double(), 8.0, 10.0, 7.0);
        Point2D.Double point2D_Double1 = new Point2D.Double();
        c.addTrip(trip0);
        Trip trip1 = new Trip(501, new Point2D.Double(), new Point2D.Double(5,0), 5.0, 10.0, d1, "","", "", 5, 5.0, new Point2D.Double(), 8.0, 10.0, 7.0);
        c.addTrip(trip1);
        assertEquals(2,c.getTotalTrips(),0.001);
        assertEquals(20,c.getMoneyGenerated(),0.0001);
        assertEquals(2,c.getTrips().size(),0.0001);
        assertEquals(true,c.getTrips().contains(trip0));

    }
}