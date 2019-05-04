package com.src.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.src.bean.TraineeDetails;
import com.src.dao.TraineeDaoImpl;
@Component("service")
@Service
@Transactional
public class TraineeServiceImpl implements ITraineeService {
	@Autowired
	TraineeDaoImpl dao;

	@Override
	public int addTrainee(TraineeDetails traineeDetails) {
		// TODO Auto-generated method stub
		return dao.addTrainee(traineeDetails);	}

	@Override
	public int updateTrainee(TraineeDetails traineeDetails) {
		// TODO Auto-generated method stub
		return dao.updateTrainee(traineeDetails);
	}

	@Override
	public int deleteTrainee(int tId) {
		// TODO Auto-generated method stub
		return dao.deleteTrainee(tId);
	}

	@Override
	public ArrayList<TraineeDetails> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public TraineeDetails getByTid(int tId) {
		// TODO Auto-generated method stub
		return dao.getByTid(tId);
	}

	@Override
	public int login(TraineeDetails traineeDetails) {
		// TODO Auto-generated method stub
		return dao.login(traineeDetails);
	}

	@Override
	public TraineeDetails register(TraineeDetails traineeDetails) {
		// TODO Auto-generated method stub
		return dao.register(traineeDetails);
	}

}
