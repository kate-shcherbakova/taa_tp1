package jpa;


import jakarta.persistence.EntityManager;

public class JpaTest {


	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
			EntityManager manager = EntityManagerHelper.getEntityManager();

//		JpaTest test = new JpaTest(manager);

//		EntityTransaction tx = manager.getTransaction();
//		tx.begin();
//---
//		DAO dao = new DAO(manager);
//		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin();

//		// IT WORKS WELL, IT SAVES THE DATA INTO THE DB
//		StudentDao studentDao = new StudentDao();
//		Student student = new Student("Oleksii", "345");
//		studentDao.save(student);
//
//		ProfDao profDao = new ProfDao();
//		Prof prof = new Prof("Olivier", "istic");
//		profDao.save(prof);
//
//		RdvDao rdvDao = new RdvDao();
//		Rdv rdv = new Rdv("Questions", Long.valueOf(60));
//		rdvDao.save(rdv);

		try {
//			dao.populateStudents();
//			dao.populateProfs();
//			dao.listUsers();
//---
//			Student s = new Student("Kate", "123");
//			EntityManagerHelper.getEntityManager().persist(s);

			// TODO create and persist entity
		} catch (Exception e) {
			e.printStackTrace();
		}
//		transaction.commit();

			
   	 manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		System.out.println(".. done");
	}




}
