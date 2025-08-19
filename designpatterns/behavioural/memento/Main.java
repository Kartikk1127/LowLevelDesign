package designpatterns.behavioural.memento;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ResumeEditor editor = new ResumeEditor();
        ResumeHistory history = new ResumeHistory();

        editor.setName("Alice");
        editor.setEducation("B.Tech CSE");
        editor.setExperience("Fresher");
        editor.setSkills(Arrays.asList("Java","DSA"));

        history.save(editor);
        editor.printResume();

        editor.setExperience("SDE Intern at TUF+");
        editor.setSkills(Arrays.asList("Java","DSA","LLD","Spring Boot"));
        history.save(editor);

        editor.printResume();
        history.undo(editor);
        editor.printResume();

        history.undo(editor);
        editor.printResume();
    }
}
