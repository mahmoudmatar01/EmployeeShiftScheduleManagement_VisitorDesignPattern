package org.DrawingDiagramCanvas_MementoDesignPatternEmployeeShiftScheduleManagement_VisitorDesignPattern;

public class RemoteShiftScheduleManagement implements ShiftScheduleManagement{

    @Override
    public void generateReport() {
        System.out.println("Generating a report for remote shift schedule");
    }

    @Override
    public void calculateOverTime() {
        System.out.println("Calculating over time for remote shift schedule");
    }

    @Override
    public void handleLeavingRequests() {
        System.out.println("Handle leaving requests for remote shift schedule");
    }
}
