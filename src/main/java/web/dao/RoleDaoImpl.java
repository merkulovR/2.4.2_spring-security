package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Role> getAllRoles() {
        List<Role> roles = entityManager.createQuery("FROM Role", Role.class)
                .getResultList();
        return roles;
    }

    @Override
    public void addRole(Role role) {
        if (role.getId() == 0) {
            entityManager.persist(role);
        }

        entityManager.merge(role);
    }

    @Override
    public void deleteRole(String name) {
        entityManager.remove(getRole(name));
    }

    @Override
    public Role getRole(String name) {
        return entityManager.find(Role.class, name);
    }
}
