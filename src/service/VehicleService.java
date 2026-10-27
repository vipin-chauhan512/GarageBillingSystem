package service;

import config.DbConfig;
import entity.Customer;
import entity.Vehicle;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VehicleService {
    
    public void addVehicle(Vehicle vehicle) throws SQLException
    {
        Connection conn = DbConfig.getConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO vehicles (id,customer_id,number_plate,model) VALUES (?,?,?,?)");
        ps.setInt(1, vehicle.getId());
        ps.setInt(2, vehicle.getCustomerId());
        ps.setString(3, vehicle.getNumberplate());
        ps.setString(4, vehicle.getModel());
        ps.executeUpdate();
        ps.close();
        conn.close();
    }

    public List<Vehicle> getAllVehicle() throws SQLException
    {
        List<Vehicle> list = new ArrayList<>();
        Connection conn = DbConfig.getConnection();
        Statement st=conn.createStatement();
       ResultSet rs = st.executeQuery("SELECT * from vehicles");
       while (rs.next())
       {
           list.add(new Vehicle(rs.getInt("id"),
                   rs.getInt("CustomerId"), rs.getString("numberplate"),rs.getString("model")));

       }
       return list;
    }

    public Vehicle getVehicleBasedOnNum(String number) throws SQLException
    {
        Vehicle vehicle=new Vehicle();
        Connection conn = DbConfig.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * from Vehicles where CustomerId = "+number);
        while (rs.next())
        {
          vehicle = new Vehicle(rs.getInt("id"),
                    rs.getInt("CustomerId"), rs.getString("numberplate"),rs.getString("model"));

        }
        return vehicle;
    }
}
