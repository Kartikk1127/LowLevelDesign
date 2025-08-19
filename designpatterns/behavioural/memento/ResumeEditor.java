package designpatterns.behavioural.memento;

import java.util.List;

//Originator with memento inside
public class ResumeEditor {
    private String name;
    private String education;
    private String experience;
    private List<String> skills;

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printResume() {
        System.out.println("---Resume---");
        System.out.println("Name: " + name);
        System.out.println("Education: " + education);
        System.out.println("Experience: " + experience);
        System.out.println("Skills: " + skills);
        System.out.println("------------");
    }

    public Memento save() {
        return new Memento(name,education,experience,List.copyOf(skills));
    }

    public void restore(Memento memento) {
        this.name = memento.getName();
        this.education = memento.getEducation();
        this.experience = memento.getExperience();
        this.skills = memento.getSkills();
    }

    public static class Memento {
        private final String name;
        private final String education;
        private final String experience;
        private final List<String> skills;

        private Memento(String name, String education, String experience, List<String> skills) {
            this.name = name;
            this.education = education;
            this.experience = experience;
            this.skills = skills;
        }

        public String getName() {
            return name;
        }

        public String getEducation() {
            return education;
        }

        public String getExperience() {
            return experience;
        }

        public List<String> getSkills() {
            return skills;
        }
    }
}
