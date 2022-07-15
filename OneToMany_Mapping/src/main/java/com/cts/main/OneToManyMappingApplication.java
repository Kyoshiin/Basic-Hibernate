package com.cts.main;

 

import java.util.List;
import java.util.Set;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

 

import com.cts.model.Paper;
import com.cts.model.Semester;
import com.cts.repository.PaperRepository;
import com.cts.repository.SemesterRepository;

 

@SpringBootApplication
@ComponentScan("com.cts")
@EntityScan(basePackages = { "com.cts.model" })
@EnableJpaRepositories(basePackages = "com.cts.repository")
public class OneToManyMappingApplication implements CommandLineRunner {

 

    @Autowired
    SemesterRepository srepo;

 

    @Autowired
    PaperRepository prepo;
    
    public static void main(String[] args) {
        SpringApplication.run(OneToManyMappingApplication.class, args);
    }

 

    @Override
    public void run(String... args) throws Exception {
        Semester semester1 = new  Semester("First");
        Semester semester2 = new  Semester("Second");
        Semester semester3 = new  Semester("Third");
        Semester semester4 = new  Semester("Fourth");
        Semester semester5 = new  Semester("Fifth");
        Semester semester6 = new  Semester("Sixth");
        Semester semester7 = new  Semester("Seventh");
        Semester semester8 = new  Semester("Eighth");
        Semester semester9 = new  Semester("Elective Paper");
        srepo.save(semester1);
        srepo.save(semester2);
        srepo.save(semester3);
        srepo.save(semester4);
        srepo.save(semester5);
        srepo.save(semester6);
        srepo.save(semester7);
        srepo.save(semester8);
        srepo.save(semester9);
        
        Paper paper[] = new Paper[53];
        paper[0] = new Paper("Technical English",semester1);
        paper[1] = new Paper("Physical Chemistry",semester1);
        paper[2] = new Paper("Organic and Inorganic Chemistry",semester1);
        paper[3] = new Paper("Calculus",semester1);
        paper[4] = new Paper("Engineering Mathematics-I",semester1);
        paper[5] = new Paper("Computer Programming and Utilization",semester1);
        paper[6] = new Paper("Engineering Graphics and Drawing",semester1);
        paper[7] = new Paper("Quantum Physics and its applications",semester1);
        paper[8] = new Paper("Linear Algebra and Ordinary Differential Equations I",semester2);
        paper[9] = new Paper("Biology",semester2);
        paper[10] = new Paper("Electricity and Magnetism",semester2);
        paper[11] = new Paper("Abstractions and Paradigms in Programming",semester2);
        paper[12] = new Paper("Workshop Practice",semester2);         
        paper[13] = new Paper("Data Structures and Algorithms",semester3);
        paper[14] = new Paper("Introduction to Electrical and Electronic Circuits",semester3);
        paper[15] = new Paper("Discrete Structures",semester3);
        paper[16] = new Paper("Data Analysis and Interpretation",semester3);
        paper[17] = new Paper("Design and Analysis of Algorithms",semester4);
        paper[18] = new Paper("Computer Networks",semester4);
        paper[19] = new Paper("The logic for Computer Science",semester4);
        paper[20] = new Paper("Digital Logic Design",semester4);
        paper[21] = new Paper("Database and Information Systems",semester5);
        paper[22] = new Paper("Computer Architecture",semester5);
        paper[23] = new Paper("Operating Systems",semester5);
        paper[24] = new Paper("Artificial Intelligence",semester6);
        paper[25] = new Paper("Automata Theory",semester6);
        paper[26] = new Paper("Numerical Analysis",semester6);
        paper[27] = new Paper("Implementation of Programming Languages",semester6);
        paper[28] = new Paper("Cryptography and Network Security",semester7);
        paper[29] = new Paper("Digital Signal Processing",semester7);
        paper[30] = new Paper("Computer-Aided Geometric Design",semester7);
        paper[31] = new Paper("Machine Learning",semester8);
        paper[32] = new Paper("Natural Language Programming",semester8);
        paper[33] = new Paper("Advanced Analysis & Design of Algorithms",semester8);
        paper[34] = new Paper("Advanced Database Management Systems",semester9);
        paper[35] = new Paper("Big Data Analytics",semester9);
        paper[36] = new Paper("Cloud Computing",semester9);
        paper[37] = new Paper("Computer Graphics & Animation",semester9);
        paper[38] = new Paper("Cyber Network Security",semester9);
        paper[39] = new Paper("Data Visualization",semester9);
        paper[40] = new Paper("Data Warehousing",semester9);
        paper[41] = new Paper("Digital Hardware Design",semester9);
        paper[42] = new Paper("GIS",semester9);
        paper[43] = new Paper("High Performance Computing",semester9);
        paper[44] = new Paper("Host Computer Security",semester9);
        paper[45] = new Paper("Human Computer Interaction",semester9);
        paper[46] = new Paper("Information Retrieval",semester9);
        paper[47] = new Paper("Information Security",semester9);
        paper[48] = new Paper("NLP & Text Analytics",semester9);
        paper[49] = new Paper("Robotics",semester9);
        paper[50] = new Paper("Security Attacks and Defenses",semester9);
        paper[51] = new Paper("Soft Computing and Optimization",semester9);
        paper[52] = new Paper("Wireless Sensor Networks",semester9);
        
        for (Paper paper2 : paper) {
            prepo.save(paper2);
        }
        
        List<Semester> listSem = srepo.findAll();
        for (Semester semester : listSem) {
            System.out.println(semester);
            Set<Paper> paperSet = semester.getPapers();
//            for (Paper paper : paperSet) {
//                System.out.println(paper);
//            }
        }

 

    }

 

}