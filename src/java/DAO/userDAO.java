/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import DTO.Company;
import DTO.Event;
import DTO.Teacher;
import Utils.DBUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SE150886 Phan Hong Long
 */
public class userDAO {
    private final String SEARCH_EVENT_BYNAME = "SELECT [idEvent]\n"
            + "      ,[title]\n"
            + "      ,[major]\n"
            + "      ,[location]\n"
            + "      ,[numOfTeacher]\n"
            + "      ,[numOfStudent]\n"
            + "      ,[capacity]\n"
            + "      ,[numOfCompany]\n"
            + "      ,[idStatus]\n"
            + "      ,[image]\n"
            + "      ,[startTime]\n"
            + "      ,[endTime]\n"
            + "      ,[idCompany]\n"
            + "      ,[idGroup]\n"
            + "      ,[numOfCollaborator]\n"
            + "      ,[currentCollaborator]\n"
            + "  FROM [dbo].[Event]\n"
            + "  where idEvent like ?";
    private final String SEARCH_EVENT_BYCOMPANY = "SELECT [idCompany]\n"
            + "      ,[name]\n"
            + "      ,[address]\n"
            + "      ,[major]\n"
            + "      ,[website]\n"
            + "      ,[phone]\n"
            + "      ,[status]\n"
            + "      ,[idLogin]\n"
            + "  FROM [dbo].[Company]\n"
            + "  where name like ?";
    private final String SEARCH_EVENT_TEACHER = "SELECT [idRole]\n"
            + "      ,[roleName]\n"
            + "  FROM [dbo].[RoleDetail]\n"
            + "  where  roleName = 'Teacher'";
    private final String SHOWLIST_EVENTS = "SELECT [idEvent]\n"
            + "      ,[idCompany]\n"
            + "      ,[idGroup]\n"
            + "      ,[idStatus]\n"
            + "      ,[title]\n"
            + "      ,[description]\n"
            + "      ,[major]\n"
            + "      ,[location]\n"
            + "      ,[numOfTeacher]\n"
            + "      ,[numOfStudent]\n"
            + "      ,[capacity]\n"
            + "      ,[numOfCompany]\n"
            + "      ,[image]\n"
            + "      ,[startTime]\n"
            + "      ,[endTime]\n"
            + "      ,[numOfCollaborator]\n"
            + "      ,[currentCollaborator]\n"
            + "  FROM [dbo].[Event]\n"
            + "  where idStatus like ?";

     public List<Event> GetListEvent(String search) throws SQLException {
        List<Event> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                stm = conn.prepareStatement(SEARCH_EVENT_BYNAME);
                stm.setString(1, "%" + search + "%");
                rs = stm.executeQuery();
                while (rs.next()) { // tro ve nguoi dung dau tien sql
                    int idEvent = rs.getInt("idEvent");
                    int title = rs.getInt("title");
                    String major = rs.getString("major");
                    String location = rs.getString("location");
                    int numOfTeacher = rs.getInt("numOfTeacher");
                    int numOfStudent = rs.getInt("numOfStudent");
                    String capacity = rs.getString("capacity");
                    int numOfCompany = rs.getInt("numOfCompany");
                    int idStatus = rs.getInt("idStatus");
                    String image = rs.getString("image");
                    Date startTime = rs.getDate("startTime");
                    Date endTime = rs.getDate("endTime");
                    int idCompany = rs.getInt("idCompany");
                    int idGroup = rs.getInt("idGroup");
                    int numOfCollaborator = rs.getInt("numOfCollaborator");
                    int currentCollaborator = rs.getInt("currentCollaborator");
                    list.add(new Event(idEvent, title, major, location, numOfTeacher, numOfStudent, capacity,
                            numOfCompany, idStatus, image, startTime, endTime,
                            idCompany, idGroup, numOfCollaborator, currentCollaborator));
                }
            }

        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public List<Company> GetListEventByCompany(String search) throws SQLException {
        List<Company> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                stm = conn.prepareStatement(SEARCH_EVENT_BYCOMPANY);
                stm.setString(1, "%" + search + "%");
                rs = stm.executeQuery();
                while (rs.next()) { // tro ve nguoi dung dau tien sql
                    int idCompany = rs.getInt("idCompany");
                    String name = rs.getString("name");
                    String address = rs.getString("address");
                    String major = rs.getString("major");
                    String website = rs.getString("website");
                    String phone = rs.getString("phone");
                    int status = rs.getInt("status");
                    int idLogin = rs.getInt("idLogin");
                    list.add(new Company(idCompany, name, address, major, website, phone, status, idLogin));
                }
            }

        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public List<Teacher> GetListEventByTeacher(String search) throws SQLException {
        List<Teacher> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                stm = conn.prepareStatement(SEARCH_EVENT_TEACHER);
                stm.setString(1, "%" + search + "%");
                rs = stm.executeQuery();
                while (rs.next()) { // tro ve nguoi dung dau tien sql
                    int idRole = rs.getInt("idRole");
                    String roleName = rs.getString("roleName");
                    list.add(new Teacher(idRole, roleName));
                }
            }

        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

}
