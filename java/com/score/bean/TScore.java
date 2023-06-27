package com.score.bean;
//成绩单的实体类
import java.io.Serializable;

public class TScore implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_score.score_id
     *
     * @mbggenerated
     */
    private Integer scoreId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_score.score_value
     *
     * @mbggenerated
     */
    private Integer scoreValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_score.score_type
     *
     * @mbggenerated
     */
    private String scoreType;
    
    private String scoreTypeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_score.student_id
     *
     * @mbggenerated
     */
    private Integer studentId;
    
    private String studentName;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_score
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_score.score_id
     *
     * @return the value of t_score.score_id
     *
     * @mbggenerated
     */
    public Integer getScoreId() {
        return scoreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_score.score_id
     *
     * @param scoreId the value for t_score.score_id
     *
     * @mbggenerated
     */
    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_score.score_value
     *
     * @return the value of t_score.score_value
     *
     * @mbggenerated
     */
    public Integer getScoreValue() {
        return scoreValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_score.score_value
     *
     * @param scoreValue the value for t_score.score_value
     *
     * @mbggenerated
     */
    public void setScoreValue(Integer scoreValue) {
        this.scoreValue = scoreValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_score.score_type
     *
     * @return the value of t_score.score_type
     *
     * @mbggenerated
     */
    public String getScoreType() {
        return scoreType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_score.score_type
     *
     * @param scoreType the value for t_score.score_type
     *
     * @mbggenerated
     */
    public void setScoreType(String scoreType) {
        this.scoreType = scoreType == null ? null : scoreType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_score.student_id
     *
     * @return the value of t_score.student_id
     *
     * @mbggenerated
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_score.student_id
     *
     * @param studentId the value for t_score.student_id
     *
     * @mbggenerated
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getScoreTypeName() {
		return scoreTypeName;
	}

	public void setScoreTypeName(String scoreTypeName) {
		this.scoreTypeName = scoreTypeName;
	}

	

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_score
     *
     * @mbggenerated
     */
	
}