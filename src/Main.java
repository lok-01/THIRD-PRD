import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========================================================");
        System.out.println("                    CAMPUSTRACK");
        System.out.println("========================================================");
        System.out.println("       Student Academic Management System");
        System.out.println("--------------------------------------------------------");
        
        int processAnother;
        
        do {
            System.out.print("Enter student ID: ");
            String studentId = scanner.next();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter full name: ");
            String fullName = scanner.nextLine();
            
            int age = 0;
            while (true) {
                System.out.print("Enter age: ");
                if (scanner.hasNextInt()) {
                    age = scanner.nextInt();
                    if (age >= 15 && age <= 35) {
                        System.out.println("Age accepted.");
                        break;
                    }
                } else {
                    scanner.next(); // consume invalid input
                }
                System.out.println("Invalid age. Enter a value between 15 and 35.");
            }
            
            System.out.print("Enter email: ");
            String email = scanner.next();
            
            int courseChoice = 0;
            String courseName = "";
            double baseFee = 0;
            while (true) {
                System.out.println("\nSelect course:\n1. BCA\n2. B.Sc Computer Science\n3. B.E/B.Tech\n4. MCA\n5. Other\n");
                System.out.print("Enter course choice: ");
                if (scanner.hasNextInt()) {
                    courseChoice = scanner.nextInt();
                    if (courseChoice >= 1 && courseChoice <= 5) {
                        switch (courseChoice) {
                            case 1: courseName = "BCA"; baseFee = 35000; break;
                            case 2: courseName = "B.Sc Computer Science"; baseFee = 30000; break;
                            case 3: courseName = "B.E/B.Tech"; baseFee = 50000; break;
                            case 4: courseName = "MCA"; baseFee = 45000; break;
                            case 5: courseName = "Other"; baseFee = 25000; break;
                        }
                        System.out.println("Course selected: " + courseName);
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("Invalid course choice. Select a value from 1 to 5.");
            }
            
            int semester = 0;
            while (true) {
                System.out.print("Enter semester (1-8): ");
                if (scanner.hasNextInt()) {
                    semester = scanner.nextInt();
                    if (semester >= 1 && semester <= 8) {
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("Invalid semester.");
            }
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter career goal: ");
            String careerGoal = scanner.nextLine();
            System.out.println();
            
            // Subjects
            int javaMarks = 0;
            while (true) {
                System.out.print("Enter Java marks: ");
                if (scanner.hasNextInt()) {
                    javaMarks = scanner.nextInt();
                    if (javaMarks >= 0 && javaMarks <= 100) {
                        System.out.println("Java marks accepted.");
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
            }
            
            int sqlMarks = 0;
            while (true) {
                System.out.print("Enter SQL marks: ");
                if (scanner.hasNextInt()) {
                    sqlMarks = scanner.nextInt();
                    if (sqlMarks >= 0 && sqlMarks <= 100) {
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
            }
            
            int webMarks = 0;
            while (true) {
                System.out.print("Enter Web Technology marks: ");
                if (scanner.hasNextInt()) {
                    webMarks = scanner.nextInt();
                    if (webMarks >= 0 && webMarks <= 100) {
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
            }
            
            int aptitudeMarks = 0;
            while (true) {
                System.out.print("Enter Aptitude marks: ");
                if (scanner.hasNextInt()) {
                    aptitudeMarks = scanner.nextInt();
                    if (aptitudeMarks >= 0 && aptitudeMarks <= 100) {
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
            }
            
            int commMarks = 0;
            while (true) {
                System.out.print("Enter Communication marks: ");
                if (scanner.hasNextInt()) {
                    commMarks = scanner.nextInt();
                    if (commMarks >= 0 && commMarks <= 100) {
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
            }
            
            System.out.println();
            
            int totalMarks = javaMarks + sqlMarks + webMarks + aptitudeMarks + commMarks;
            double percentage = (double) totalMarks / 5;
            
            boolean javaPass = javaMarks >= 35;
            boolean sqlPass = sqlMarks >= 35;
            boolean webPass = webMarks >= 35;
            boolean aptitudePass = aptitudeMarks >= 35;
            boolean commPass = commMarks >= 35;
            
            boolean academicPass = javaPass && sqlPass && webPass && aptitudePass && commPass && percentage >= 40.0;
            
            String academicResult = academicPass ? "PASSED" : "FAILED";
            String grade = "F";
            
            if (academicPass) {
                if (percentage >= 85) grade = "A+";
                else if (percentage >= 75) grade = "A";
                else if (percentage >= 65) grade = "B";
                else if (percentage >= 50) grade = "C";
                else grade = "D";
            }
            
            int classesConducted = 0;
            while (true) {
                System.out.print("Enter total classes conducted: ");
                if (scanner.hasNextInt()) {
                    classesConducted = scanner.nextInt();
                    if (classesConducted >= 1 && classesConducted <= 300) {
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("Invalid value. Total classes must be between 1 and 300.");
            }
            
            int classesAttended = 0;
            while (true) {
                System.out.print("Enter classes attended: ");
                if (scanner.hasNextInt()) {
                    classesAttended = scanner.nextInt();
                    if (classesAttended >= 0 && classesAttended <= classesConducted) {
                        System.out.println("Attendance accepted.");
                        break;
                    } else if (classesAttended > classesConducted) {
                        System.out.println("Invalid attendance. Attended classes cannot exceed " + classesConducted + ".");
                        continue;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("Invalid value.");
            }
            
            System.out.println();
            
            double attendancePercentage = ((double) classesAttended / classesConducted) * 100;
            String attendanceStatus = attendancePercentage >= 75 ? "REGULAR" : "SHORTAGE";
            
            int numAssignments = 0;
            while (true) {
                System.out.print("How many assignment scores do you want to enter? ");
                if (scanner.hasNextInt()) {
                    numAssignments = scanner.nextInt();
                    if (numAssignments >= 1 && numAssignments <= 10) {
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("Invalid value. Enter a value between 1 and 10.");
            }
            
            int validAssignments = 0;
            int assignmentTotal = 0;
            
            for (int i = 1; i <= numAssignments; i++) {
                System.out.print("Enter score for assignment " + i + " (0-10, -1 to finish): ");
                int score = scanner.nextInt();
                if (score == -1) {
                    System.out.println("Assignment entry completed early.");
                    break;
                }
                if (score < -1 || score > 10) {
                    System.out.println("Invalid score. Assignment " + i + " skipped.");
                    continue;
                }
                System.out.println("Assignment score accepted.");
                assignmentTotal += score;
                validAssignments++;
            }
            
            double assignmentAverage = 0.0;
            if (validAssignments > 0) {
                assignmentAverage = (double) assignmentTotal / validAssignments;
            }
            
            boolean assignmentPass = validAssignments > 0 && assignmentAverage >= 5.0;
            String assignmentStatus = assignmentPass ? "SATISFACTORY" : "NEEDS IMPROVEMENT";
            
            int scholarshipPercentage = 0;
            if (academicPass && percentage >= 85 && attendancePercentage >= 85) {
                scholarshipPercentage = 10;
            } else if (academicPass && percentage >= 75 && attendancePercentage >= 75) {
                scholarshipPercentage = 5;
            }
            
            double scholarshipAmount = baseFee * scholarshipPercentage / 100.0;
            double finalPayableFee = baseFee - scholarshipAmount;
            
            System.out.println();
            System.out.printf("Final payable fee: ₹%.2f\n", finalPayableFee);
            
            double amountPaid = 0;
            while (true) {
                System.out.print("Enter amount paid: ");
                if (scanner.hasNextDouble()) {
                    amountPaid = scanner.nextDouble();
                    if (amountPaid >= 0 && amountPaid <= finalPayableFee) {
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("Invalid amount. Must be between 0 and final payable fee.");
            }
            
            double feeBalance = finalPayableFee - amountPaid;
            String feeStatus = (feeBalance == 0) ? "PAID" : "PENDING";
            
            boolean clearancePass = academicPass && attendancePercentage >= 75 && assignmentPass && feeBalance == 0;
            String finalClearance = clearancePass ? "CLEARED FOR NEXT SEMESTER" : "ACTION REQUIRED";
            
            System.out.println("\n========================================================");
            System.out.println("                 STUDENT SEMESTER REPORT");
            System.out.println("========================================================");
            System.out.println(String.format("%-27s: %s", "Student ID", studentId));
            System.out.println(String.format("%-27s: %s", "Student Name", fullName));
            System.out.println(String.format("%-27s: %d", "Age", age));
            System.out.println(String.format("%-27s: %s", "Email", email));
            System.out.println(String.format("%-27s: %s", "Course", courseName));
            System.out.println(String.format("%-27s: %d", "Semester", semester));
            System.out.println(String.format("%-27s: %s", "Career Goal", careerGoal));
            System.out.println("\n---------------- ACADEMIC SUMMARY --------------------");
            System.out.println(String.format("%-27s: %d", "Java Marks", javaMarks));
            System.out.println(String.format("%-27s: %d", "SQL Marks", sqlMarks));
            System.out.println(String.format("%-27s: %d", "Web Technology Marks", webMarks));
            System.out.println(String.format("%-27s: %d", "Aptitude Marks", aptitudeMarks));
            System.out.println(String.format("%-27s: %d", "Communication Marks", commMarks));
            System.out.println(String.format("%-27s: %d/500", "Total Marks", totalMarks));
            System.out.println(String.format("%-27s: %.2f%%", "Percentage", percentage));
            System.out.println(String.format("%-27s: %s", "Academic Result", academicResult));
            System.out.println(String.format("%-27s: %s", "Grade", grade));
            System.out.println("\n---------------- ATTENDANCE SUMMARY ------------------");
            System.out.println(String.format("%-27s: %d", "Classes Conducted", classesConducted));
            System.out.println(String.format("%-27s: %d", "Classes Attended", classesAttended));
            System.out.println(String.format("%-27s: %.2f%%", "Attendance Percentage", attendancePercentage));
            System.out.println(String.format("%-27s: %s", "Attendance Status", attendanceStatus));
            System.out.println("\n---------------- ASSIGNMENT SUMMARY ------------------");
            System.out.println(String.format("%-27s: %d", "Valid Assignments", validAssignments));
            System.out.println(String.format("%-27s: %d", "Assignment Total", assignmentTotal));
            System.out.println(String.format("%-27s: %.2f", "Assignment Average", assignmentAverage));
            System.out.println(String.format("%-27s: %s", "Assignment Status", assignmentStatus));
            System.out.println("\n---------------- FEE SUMMARY -------------------------");
            System.out.println(String.format("%-27s: ₹%.2f", "Base Semester Fee", baseFee));
            System.out.println(String.format("%-27s: %d%%", "Scholarship Percentage", scholarshipPercentage));
            System.out.println(String.format("%-27s: ₹%.2f", "Scholarship Amount", scholarshipAmount));
            System.out.println(String.format("%-27s: ₹%.2f", "Final Payable Fee", finalPayableFee));
            System.out.println(String.format("%-27s: ₹%.2f", "Amount Paid", amountPaid));
            System.out.println(String.format("%-27s: ₹%.2f", "Fee Balance", feeBalance));
            System.out.println(String.format("%-27s: %s", "Fee Status", feeStatus));
            System.out.println("\n---------------- FINAL STATUS ------------------------");
            System.out.println(String.format("%-27s: %s", "Semester Clearance", finalClearance));
            
            System.out.println("\n---------------- FAILED CONDITIONS -------------------");
            if (clearancePass) {
                System.out.println("None");
            } else {
                if (!javaPass) System.out.println("- Java marks are below 35.");
                if (!sqlPass) System.out.println("- SQL marks are below 35.");
                if (!webPass) System.out.println("- Web Technology marks are below 35.");
                if (!aptitudePass) System.out.println("- Aptitude marks are below 35.");
                if (!commPass) System.out.println("- Communication marks are below 35.");
                if (percentage < 40.0) System.out.println("- Overall percentage is below 40%.");
                if (attendancePercentage < 75.0) System.out.println("- Attendance is below 75%.");
                
                if (validAssignments == 0) {
                    System.out.println("- No valid assignment score was entered.");
                } else if (assignmentAverage < 5.0) {
                    System.out.println("- Assignment average is below 5.00.");
                }
                
                if (feeBalance > 0) System.out.println("- Semester fee is pending.");
            }
            
            System.out.println("\n---------------- RECOMMENDATIONS ---------------------");
            if (clearancePass) {
                System.out.println("Maintain the current performance in the next semester.");
            } else {
                if (!javaPass || !sqlPass || !webPass || !aptitudePass || !commPass) {
                    System.out.println("Revisit the failed subject and complete additional practice.");
                }
                if (percentage < 40.0) {
                    System.out.println("Improve overall academic performance.");
                }
                if (attendancePercentage < 75.0) {
                    System.out.println("Attend classes regularly and clear the attendance shortage.");
                }
                if (!assignmentPass) {
                    System.out.println("Complete assignments consistently and maintain an average of at least 5.00.");
                }
                if (feeBalance > 0) {
                    System.out.println("Pay the pending semester fee before clearance.");
                }
            }
            System.out.println("========================================================\n");
            
            while (true) {
                System.out.println("Do you want to process another student?");
                System.out.println("1. Yes");
                System.out.println("0. No");
                System.out.print("Enter choice: ");
                if (scanner.hasNextInt()) {
                    processAnother = scanner.nextInt();
                    if (processAnother == 0 || processAnother == 1) {
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("Invalid choice. Enter 1 or 0.");
            }
            System.out.println();
            
        } while (processAnother == 1);
        
        System.out.println("Thank you for using CampusTrack.");
        scanner.close();
    }
}
