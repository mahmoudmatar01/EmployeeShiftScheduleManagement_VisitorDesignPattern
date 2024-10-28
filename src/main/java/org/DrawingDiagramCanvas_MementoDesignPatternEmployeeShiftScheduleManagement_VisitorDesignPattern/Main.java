package org.DrawingDiagramCanvas_MementoDesignPatternEmployeeShiftScheduleManagement_VisitorDesignPattern;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // create different instances
        ShiftScheduleManagement dayShiftScheduleManagement = new DayShiftScheduleManagement();
        ShiftScheduleManagement nightShiftScheduleManagement = new NightShiftScheduleManagement();
        ShiftScheduleManagement remoteShiftScheduleManagement = new RemoteShiftScheduleManagement();

        List<ShiftScheduleManagement>shiftScheduleManagementList= List.of(
                dayShiftScheduleManagement,
                nightShiftScheduleManagement,
                remoteShiftScheduleManagement
        );

        shiftScheduleManagementList.forEach(
                shiftScheduleManagement -> {
                    shiftScheduleManagement.generateReport();
                    shiftScheduleManagement.calculateOverTime();
                    shiftScheduleManagement.handleLeavingRequests();
                }
        );


    }
}