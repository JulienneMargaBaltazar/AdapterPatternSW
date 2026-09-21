package adapters;

import app.SchoolManagementApp;
import subsystems.GradingSystem;

public class GradingSystemAdapter implements SchoolManagementApp {
    private GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    @Override
    public void integrateSystem() {
        this.gradingSystem.recordGrades();
    }
}
