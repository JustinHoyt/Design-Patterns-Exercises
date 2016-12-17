package FactoryMethod;

public class Resume extends Document{
    
    @Override
    public void createPages() {
        pages.add(new SkillsPage());
        pages.add(new EducationPage());
        pages.add(new ExperiencePage());
    }
    
    @Override
    public String getDocName() {
        return "Resume";
    }

}