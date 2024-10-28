# EmployeeShiftScheduleManagement_VisitorDesignPattern

This project demonstrates the **Visitor Design Pattern** in an employee shift scheduling application. It allows the application of different operations (such as managing leave requests and calculating bonuses) on various types of shift schedules (Day, Night, and Remote) without altering their structures.

## Project Structure

The project contains the following classes and interfaces:

1. **ShiftScheduleManagement (Interface)**
   - Defines common operations for different shift schedules.
   - Declares methods for generating reports, calculating overtime, and accepting a visitor.
   
2. **DayShiftScheduleManagement**
   - Implements `ShiftScheduleManagement` for day shifts.
   - Contains implementations of `generateReport` and `calculateOverTime` methods.
   - Accepts visitors to apply additional operations specific to day shifts.

3. **NightShiftScheduleManagement**
   - Implements `ShiftScheduleManagement` for night shifts.
   - Similar to `DayShiftScheduleManagement`, with specific implementations for night shifts.
   
4. **RemoteShiftScheduleManagement**
   - Implements `ShiftScheduleManagement` for remote work schedules.
   - Provides unique implementations for generating reports and calculating overtime for remote shifts.

5. **ShiftScheduleManagementVisitor (Interface)**
   - Declares methods for each shift type, allowing the visitor to handle different shift schedules.
   
6. **ManageLeaveRequestVisitor**
   - Implements `ShiftScheduleManagementVisitor` to manage leave requests for each shift type.
   
7. **CalculateBonusVisitor**
   - Implements `ShiftScheduleManagementVisitor` to calculate bonuses for each shift type.
   
8. **Main**
   - Demonstrates the use of the visitor pattern by creating instances of each shift type.
   - Applies multiple visitors (`ManageLeaveRequestVisitor` and `CalculateBonusVisitor`) to each shift instance, showcasing how visitors interact with different shift schedules.

## How It Works

1. **Visitor Pattern Implementation**:
   - Each shift type (Day, Night, Remote) implements `ShiftScheduleManagement` and provides unique behavior for generating reports and calculating overtime.
   - Visitors (`ManageLeaveRequestVisitor` and `CalculateBonusVisitor`) encapsulate additional operations that can be applied to each shift type.

2. **Applying Visitors**:
   - The `Main` class creates a list of `ShiftScheduleManagement` instances and applies different visitors to each one.
   - This structure allows operations to be extended or modified without changing the shift classes.

## Usage

### Setup

1. Clone the repository and import it into your Java IDE.
2. Compile and run the `Main` class to see the Visitor Design Pattern in action.

### Example Code

Here’s an example code snippet demonstrating the system:

```java
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
                    shiftScheduleManagement.acceptVisitor(new ManageLeaveRequestVisitor());
                    shiftScheduleManagement.acceptVisitor(new CalculateBonusVisitor());
                }
        );


    }
}
```

### Sample Output

```plaintext
Generating a report for day shift schedule
Calculating over time for day shift schedule
Manage leaving requests for day shift schedule
Calculating bonus for day shift schedule

Generating a report for night shift schedule
Calculating over time for night shift schedule
Manage leaving requests for night shift schedule
Calculating bonus for night shift schedule

Generating a report for remote shift schedule
Calculating over time for remote shift schedule
Manage leaving requests for remote shift schedule
Calculating bonus for remote shift schedule
```
