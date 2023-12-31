package com.score.bean;

import java.io.Serializable;
//学生的实体类
public class TStudent implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.student_no
     *
     * @mbggenerated
     */
    private Integer studentNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.student_name
     *
     * @mbggenerated
     */
    private String studentName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.student_sex
     *
     * @mbggenerated
     */
    private String studentSex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.del_status
     *
     * @mbggenerated
     */
    private String stuPass;
    
    private double score1;
    
    private double score2;
    
    private double score3;
    
    private double sumScore;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_student
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.student_no
     *
     * @return the value of t_student.student_no
     *
     * @mbggenerated
     */
    public Integer getStudentNo() {
        return studentNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.student_no
     *
     * @param studentNo the value for t_student.student_no
     *
     * @mbggenerated
     */
    public void setStudentNo(Integer studentNo) {
        this.studentNo = studentNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.student_name
     *
     * @return the value of t_student.student_name
     *
     * @mbggenerated
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.student_name
     *
     * @param studentName the value for t_student.student_name
     *
     * @mbggenerated
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.student_sex
     *
     * @return the value of t_student.student_sex
     *
     * @mbggenerated
     */
    public String getStudentSex() {
        return studentSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.student_sex
     *
     * @param studentSex the value for t_student.student_sex
     *
     * @mbggenerated
     */
    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex == null ? null : studentSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.del_status
     *
     * @return the value of t_student.del_status
     *
     * @mbggenerated
     */
    

	public double getScore1() {
		return score1;
	}

	public String getStuPass() {
		return stuPass;
	}

	public void setStuPass(String stuPass) {
		this.stuPass = stuPass;
	}

	public void setScore1(double score1) {
		this.score1 = score1;
	}

	public double getScore2() {
		return score2;
	}

	public void setScore2(double score2) {
		this.score2 = score2;
	}

	public double getScore3() {
		return score3;
	}

	public void setScore3(double score3) {
		this.score3 = score3;
	}

	public double getSumScore() {
		return sumScore;
	}

	public void setSumScore(double sumScore) {
		this.sumScore = sumScore;
	}

	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        return "TStudent{" +
                "studentNo=" + studentNo +
                ", studentName='" + studentName + '\'' +
                ", studentSex='" + studentSex + '\'' +
                ", stuPass='" + stuPass + '\'' +
                ", score1=" + score1 +
                ", score2=" + score2 +
                ", score3=" + score3 +
                ", sumScore=" + sumScore +
                '}';
    }
}