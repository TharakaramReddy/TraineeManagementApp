package com.src.dao;

import java.util.ArrayList;

import com.src.bean.TraineeDetails;

public interface ITraineeDao {
	public int login(TraineeDetails traineeDetails);
	public TraineeDetails register(TraineeDetails traineeDetails);
	int addTrainee(TraineeDetails traineeDetails);
    int updateTrainee(TraineeDetails traineeDetails);
	int deleteTrainee(int tId);
	ArrayList<TraineeDetails> getAll();
	TraineeDetails getByTid(int tId);
}
