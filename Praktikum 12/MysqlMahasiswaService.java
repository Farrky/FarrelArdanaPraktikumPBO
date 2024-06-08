/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import com.sun.jdi.connect.spi.Connection;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

/**
 *
 * @author LENOVO LEGION
 */
public class MysqlMahasiswaService {
   Connection koneksi = null;
    
    // Constructor
    public MysqlMahasiswaService() {
        this.koneksi = MysqlUtility.getConnection();
    }
    
    private Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String nama = rs.getString("nama");
        return new Mahasiswa(id, nama);
    }
    
    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO Mahasiswa (id, nama) VALUES (?, ?)";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Data mahasiswa berhasil ditambahkan");
        } catch (SQLException e) {
            System.err.println("Gagal menambah data mahasiswa: " + e.getMessage());
        }
    }
    
    public void update(Mahasiswa mhs) {
        String query = "UPDATE Mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Data mahasiswa berhasil diupdate");
        } catch (SQLException e) {
            System.err.println("Gagal mengupdate data mahasiswa: " + e.getMessage());
        }
    }
    
    public void delete(int id) {
        String query = "DELETE FROM Mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data mahasiswa berhasil dihapus");
        } catch (SQLException e) {
            System.err.println("Gagal menghapus data mahasiswa: " + e.getMessage());
        }
    }
    
    public Mahasiswa getById(int id) {
        String query = "SELECT * FROM Mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return makeMhsObject(rs);
            }
        } catch (SQLException e) {
            System.err.println("Gagal mendapatkan data mahasiswa: " + e.getMessage());
        }
        return null;
    }
    
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        String query = "SELECT * FROM Mahasiswa";
        try (Statement stmt = koneksi.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                mahasiswaList.add(makeMhsObject(rs));
            }
        } catch (SQLException e) {
            System.err.println("Gagal mendapatkan semua data mahasiswa: " + e.getMessage());
        }
        return mahasiswaList;
    }
        
}
