//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.18 at 02:18:43 AM EET 
//


package edu.pragmatic.xml.homework.students.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "teachers",
    "students",
    "exams"
})
@XmlRootElement(name = "school")
public class School {

    @XmlElement(required = true)
    protected School.Teachers teachers;
    @XmlElement(required = true)
    protected School.Students students;
    @XmlElement(required = true)
    protected School.Exams exams;
    @XmlAttribute(name = "name")
    protected String name;

    public School.Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(School.Teachers value) {
        this.teachers = value;
    }

    public School.Students getStudents() {
        return students;
    }

    public void setStudents(School.Students value) {
        this.students = value;
    }

    public School.Exams getExams() {
        return exams;
    }

    public void setExams(School.Exams value) {
        this.exams = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "exam"
    })
    public static class Exams {

        protected List<School.Exams.Exam> exam;

        public List<School.Exams.Exam> getExam() {
            if (exam == null) {
                exam = new ArrayList<School.Exams.Exam>();
            }
            return this.exam;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "students"
        })
        public static class Exam {

            @XmlElement(required = true)
            protected School.Exams.Exam.Students students;
            @XmlAttribute(name = "teacher")
            protected Byte teacher;

            public School.Exams.Exam.Students getStudents() {
                return students;
            }

            public void setStudents(School.Exams.Exam.Students value) {
                this.students = value;
            }

            public Byte getTeacher() {
                return teacher;
            }

            public void setTeacher(Byte value) {
                this.teacher = value;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id"
            })
            public static class Students {

                @XmlElement(type = Byte.class)
                protected List<Byte> id;

                public List<Byte> getId() {
                    if (id == null) {
                        id = new ArrayList<Byte>();
                    }
                    return this.id;
                }
            }
        }
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "student"
    })
    public static class Students {

        protected List<School.Students.Student> student;
        public List<School.Students.Student> getStudent() {
            if (student == null) {
                student = new ArrayList<School.Students.Student>();
            }
            return this.student;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Student {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            protected Byte id;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "grade")
            protected String grade;
            @XmlAttribute(name = "age")
            protected Byte age;
            @XmlAttribute(name = "teacher")
            protected String teacher;

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public Byte getId() {
                return id;
            }

            public void setId(Byte value) {
                this.id = value;
            }

            public String getName() {
                return name;
            }

            public void setName(String value) {
                this.name = value;
            }

            public String getGrade() {
                return grade;
            }

            public void setGrade(String value) {
                this.grade = value;
            }

            public Byte getAge() {
                return age;
            }

            public void setAge(Byte value) {
                this.age = value;
            }

            public String getTeacher() {
                return teacher;
            }

            public void setTeacher(String value) {
                this.teacher = value;
            }

        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "teacher"
    })
    public static class Teachers {

        protected List<School.Teachers.Teacher> teacher;

        public List<School.Teachers.Teacher> getTeacher() {
            if (teacher == null) {
                teacher = new ArrayList<School.Teachers.Teacher>();
            }
            return this.teacher;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Teacher {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            protected Byte id;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "lastName")
            protected String lastName;

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public Byte getId() {
                return id;
            }

            public void setId(Byte value) {
                this.id = value;
            }

            public String getName() {
                return name;
            }

            public void setName(String value) {
                this.name = value;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String value) {
                this.lastName = value;
            }

        }

    }

}