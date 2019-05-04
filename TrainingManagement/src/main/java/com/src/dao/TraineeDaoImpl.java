package com.src.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.src.bean.TraineeDetails;
@Component("dao")
@Repository
@ComponentScan("com")

public class TraineeDaoImpl implements ITraineeDao{
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public int addTrainee(TraineeDetails traineeDetails) {
		entityManager.persist(traineeDetails);
		return 0;
	}

	@Override
	public int updateTrainee(TraineeDetails traineeDetails) {
		// TODO Auto-generated method stub
		entityManager.merge(traineeDetails);
		return 0;
	}

	@Override
	public int deleteTrainee(int tId) {
		// TODO Auto-generated method stub
		TraineeDetails traineeDetails =new TraineeDetails();
		traineeDetails.settId(tId);
		entityManager.remove(getByTid(tId));
		return 0;
	}

	@Override
	public ArrayList<TraineeDetails> getAll() {
		// TODO Auto-generated method stub
		Query query = (Query) entityManager.createQuery("from Product ");
		ArrayList<TraineeDetails> list = (ArrayList<TraineeDetails>) query.list();
		return list;
	}

	@Override
	public TraineeDetails getByTid(int tId) {
		TraineeDetails traineeDetails=entityManager.find(TraineeDetails.class, tId);
		return traineeDetails;
	}

	@Override
	public TraineeDetails register(TraineeDetails traineeDetails) {
		entityManager.persist(traineeDetails);
		return traineeDetails;
	}

	
	public int login(TraineeDetails traineeDetails) {
		int id=0;
		traineeDetails=entityManager.find(TraineeDetails.class,traineeDetails.gettId());
		return id;
	}

}
