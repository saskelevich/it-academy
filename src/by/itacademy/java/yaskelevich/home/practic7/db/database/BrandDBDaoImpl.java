package by.itacademy.java.yaskelevich.home.practic7.db.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import by.itacademy.java.yaskelevich.home.practic7.db.IDao;
import by.itacademy.java.yaskelevich.home.practic7.db.entity.Brand;

public class BrandDBDaoImpl extends AbstractDBDao implements IDao<Brand> {
    private static final IDao<Brand> INSTANCE = new BrandDBDaoImpl();

    public static IDao<Brand> getInstance() {
        return INSTANCE;
    }

    @Override
    public Brand insert(final Brand entity) {
        try (Connection conn = createConnection();
                PreparedStatement stmt = conn.prepareStatement("insert into brand (name) values (?)",
                        Statement.RETURN_GENERATED_KEYS);)

        {
            stmt.setString(1, entity.getName());
            stmt.executeUpdate();

            final ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                // Retrieve the auto generated key(s).
                final int generatedId = rs.getInt(1);
                entity.setId(generatedId);
            }
        } catch (final SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return entity;
    }

    @Override
    public void update(final Brand entity) {
        try (Connection conn = createConnection();
                PreparedStatement stmt = conn.prepareStatement("update brand set name=?, updated=? where id=?");) {
            stmt.setString(1, entity.getName());
            stmt.setObject(2, new Date(), Types.TIMESTAMP);
            stmt.setInt(3, entity.getId());

            stmt.executeUpdate();
        } catch (final SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public void delete(final Integer id) {
        try (Connection conn = createConnection(); Statement stmt = conn.createStatement();) {

            final int rowsAffected = stmt.executeUpdate(String.format("delete brand where id=%s", id));

            if (rowsAffected != 1)
                throw new IllegalArgumentException("unexpected deleted rows count:" + rowsAffected);
        } catch (final SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public List<Brand> getAll() {
        Statement st = null;
        ResultSet rs = null;
        try (Connection conn = createConnection()) {

            st = conn.createStatement();
            rs = st.executeQuery("select * from brand");
        } catch (final SQLException e) {
            e.printStackTrace();
        }

        final List<Brand> list = new ArrayList<>();

        try {
            while (rs.next()) {

                final Brand brand = new Brand();

                brand.setId(rs.getInt("id"));
                brand.setName(rs.getString("name"));
                brand.setCreated(rs.getDate("created"));
                brand.setUpdated(rs.getDate("updated"));
                list.add(brand);
            }
        } catch (final SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

}
