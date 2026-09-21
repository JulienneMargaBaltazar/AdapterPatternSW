package app;
import subsystems.AttendanceSystem;
import subsystems.GradingSystem;
import subsystems.LibrarySystem;
import adapters.AttendanceSystemAdapter;
import adapters.GradingSystemAdapter;
import adapters.LibrarySystemAdapter;

public class Main {
    public static void main(String[] args) {

        AttendanceSystem rawAttendance = new AttendanceSystem();
        GradingSystem rawGrading = new GradingSystem();
        LibrarySystem rawLibrary = new LibrarySystem();

        SchoolManagementApp attendanceModule = new AttendanceSystemAdapter(rawAttendance);
        SchoolManagementApp gradingModule = new GradingSystemAdapter(rawGrading);
        SchoolManagementApp libraryModule = new LibrarySystemAdapter(rawLibrary);

        System.out.println("--- Bootstrapping Application Subsystems ---");
        attendanceModule.integrateSystem();
        gradingModule.integrateSystem();
        libraryModule.integrateSystem();
    }
}
