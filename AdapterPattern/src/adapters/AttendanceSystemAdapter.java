package adapters;

import app.SchoolManagementApp;
import subsystems.AttendanceSystem;

public class AttendanceSystemAdapter implements SchoolManagementApp {
    private AttendanceSystem attendanceSystem;

    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }

    @Override
    public void integrateSystem() {
        this.attendanceSystem.markAttendance();
    }
}
