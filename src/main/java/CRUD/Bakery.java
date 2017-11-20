package CRUD;

import Entity.Cake;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Bakery {
    public EntityManager em = Persistence.createEntityManagerFactory("GURF").createEntityManager();
    public Cake add(Cake cake){
        em.getTransaction().begin();
        Cake cakeFromDB = em.merge(cake);
        em.getTransaction().commit();
        return cakeFromDB;
    }

    public void del(long id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public Cake get(long id) {
        return em.find(Cake.class, id);
    }

    public void update(Cake cake){
        em.getTransaction().begin();
        em.merge(cake);
        em.getTransaction().commit();
    }

    public List<Cake> getAll(){
        TypedQuery<Cake> names = em.createNamedQuery("Cake.getAll", Cake.class);
        return  names.getResultList();
    }

}
