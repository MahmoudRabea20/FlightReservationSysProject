
package util;
import data.Flight;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PassengeruiUtil {
    private static PreparedStatement mystatObj;
    private static ResultSet myresObj;
    private Connection myconObj;
    public static double computePaymentAmount(String Class, int numOfSeats, double basePrice){
        double multiplier = 0, amount;
        switch (Class){
            case "First" :
                multiplier = 2;
                break;
            case "Bussiness":
                multiplier = 1.5;
                break;
            case "Economy":
                multiplier = 1;
                break;
        }
        amount = numOfSeats*multiplier*basePrice;
        return amount;
    }
    public static ArrayList<Flight> search(java.util.Date date,String departureAirport,String arrivalAirport){
        String query = "select * FROM ROOT.FLIGHTS WHERE departureairport=? AND arrivalairport=? AND flightdate=?";
        java.sql.Date flightDate = new java.sql.Date(date.getTime());
        try{
            Connection myConObj = DbUtils.connectDB();
            mystatObj= myConObj.prepareStatement(query);
            mystatObj.setString(1, departureAirport);
            mystatObj.setString(2, arrivalAirport);
            mystatObj.setDate(3, flightDate);
            myresObj = mystatObj.executeQuery();
            ArrayList<Flight> agentsList = new ArrayList<Flight>();
            while(myresObj.next()){
                System.out.println(myresObj.toString());
                Flight flight = new Flight(myresObj.getInt(1));
                agentsList.add(flight);
            }
            return agentsList;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
        
    }
    public static DefaultTableModel updateSearchTableModel(DefaultTableModel model, ArrayList<Flight> matchingFlights) {
        for (int i = 0; i<matchingFlights.size();i++) {
            Object[] o = new Object[7];
            o[0] = matchingFlights.get(i).getId();
            o[1] = matchingFlights.get(i).getAirline();
            o[2] = matchingFlights.get(i).getDepartureAirport();
            o[3] = matchingFlights.get(i).getArrivalAirport();
            o[4] = matchingFlights.get(i).getFlightDate();
            o[5] = matchingFlights.get(i).getDepartureTime();
            o[6] = matchingFlights.get(i).getFlightDuration();
            model.addRow(o);
    }
        return model;
}
    public static void createReservation(int flightID, String firstName,String surname,String nationality,String passportNumber,Date passportExpiryDate,int reservationNumberOfSeats,String reservationClass) {
        
    }
}