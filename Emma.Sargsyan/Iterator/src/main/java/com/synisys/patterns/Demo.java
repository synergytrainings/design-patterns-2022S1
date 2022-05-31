package com.synisys.patterns;

import com.synisys.patterns.impl.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emma.sargsyan
 */
public class Demo {

    public static void main(String[] args) {
        OrgChart company = generateCompany();
        ManagerEmployeeIterator managerEmployeeIterator = new ManagerEmployeeAggregate(company.getFirstVertex()).getIterator();

        System.out.println("For Owner:");
        System.out.println("    next employee is" + managerEmployeeIterator.nextDestinations());
        System.out.println("    next employee is" + managerEmployeeIterator.nextDestinations());
        System.out.println("    previous employee is" + managerEmployeeIterator.previousDestinations());

        ManagerEmployeeIterator devManagerEmployeeIterator = new ManagerEmployeeAggregate(managerEmployeeIterator.nextDestinations()).getIterator();
        System.out.println("For Lead Dev:");
        System.out.println("    next employee is" + devManagerEmployeeIterator.nextDestinations());
        System.out.println("    next employee is" + devManagerEmployeeIterator.nextDestinations());
        System.out.println("    next manager is" + devManagerEmployeeIterator.nextSources());

        DeveloperIterator developerIterator = new DeveloperAggregate(company.getFirstVertex()).getIterator();
        System.out.println("For Owner(only developers):");
        System.out.println("    next developer employee is" + developerIterator.nextDestinations());

    }

    private static OrgChart generateCompany() {
        Employee owner = new Employee("Owner Name", "Owner Last Name", Position.DEVELOPER, new ArrayList<>());

        Employee leadDev = new Employee("Lead Dev Name", "Lead Dev Last Name", Position.DEVELOPER, new ArrayList<>(List.of(owner)));
        Employee leadQA = new Employee("Lead QA Name", "Lead QA Last Name", Position.QA, new ArrayList<>(List.of(owner)));
        Employee leadPM = new Employee("Lead PM Name", "Lead PM Last Name", Position.PM, new ArrayList<>(List.of(owner)));

        owner.addEmployees(new ArrayList<>(List.of(leadPM, leadDev, leadQA)));

        Employee developer1 = new Employee("Dev 1 Name", "Dev 1 Last Name", Position.DEVELOPER, new ArrayList<>(List.of(leadDev)));
        Employee developer2 = new Employee("Dev 2 Name", "Dev 2 Last Name", Position.DEVELOPER, new ArrayList<>(List.of(leadDev)));

        leadDev.addEmployees(new ArrayList<>(List.of(developer1, developer2)));

        Employee qa1 = new Employee("QA 1 Name", "QA 1 Last Name", Position.QA, new ArrayList<>(List.of(leadQA, leadPM)));
        Employee qa2 = new Employee("QA 2 Name", "QA 2 Last Name", Position.QA, new ArrayList<>(List.of(leadQA, leadPM)));

        leadPM.addEmployees(new ArrayList<>(List.of(qa1, qa2)));
        leadQA.addEmployees(new ArrayList<>(List.of(qa1, qa2)));

        return new OrgChart(owner, "Company Name", 2000);
    }

}