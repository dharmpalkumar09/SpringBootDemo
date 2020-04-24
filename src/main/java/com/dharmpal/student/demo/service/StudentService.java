package com.dharmpal.student.demo.service;

import com.dharmpal.student.demo.model.ErrorMessage;
import com.dharmpal.student.demo.model.Student;
import com.dharmpal.student.demo.model.UpdateStatus;
import com.dharmpal.student.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student getOne(Long id){
        Optional<Student> student = studentRepository.findById(id);
        //return studentRepository.getOne(id);
        return student.get();
    }
    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);

    }

    public UpdateStatus updateStudent(Student student,Long id){
        UpdateStatus updateStatus = new UpdateStatus();
        Optional<Student> studentById = studentRepository.findById(id);studentRepository.findById(id);
        ErrorMessage errorMessage = new ErrorMessage();
        if (studentById.equals(Optional.empty())){
            updateStatus.setStatusCode(101);
            errorMessage.setErrorMessage("Record not updated");
            errorMessage.setErrorCode(01);
            updateStatus.setErrorMessage(errorMessage);
            return updateStatus;
        }
        studentRepository.save(student);
        updateStatus.setStatusCode(200);
        errorMessage.setErrorMessage("No error");
        errorMessage.setErrorCode(-1);
        updateStatus.setErrorMessage(errorMessage);
        return updateStatus;
    }

}
