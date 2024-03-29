package com.epam.rd.tasks.sqlqueries;

/**
 * Implement sql queries like described
 */
public class SqlQueries {
    //Select all employees sorted by last name in ascending order
    //language=HSQLDB
    String select01 = "SELECT ID, LASTNAME, SALARY " +
            "FROM EMPLOYEE " +
            "ORDER BY LASTNAME ";

    //Select employees having no more than 5 characters in last name sorted by last name in ascending order
    //language=HSQLDB
    String select02 = "SELECT ID, LASTNAME, SALARY " +
            "FROM EMPLOYEE " +
            "WHERE LENGTH(LASTNAME) <=5 " +
            "ORDER BY LASTNAME";

    //Select employees having salary no less than 2000 and no more than 3000
    //language=HSQLDB
    String select03 = "SELECT ID, LASTNAME, SALARY "
            + "FROM EMPLOYEE "
            + "WHERE SALARY <= 3000 AND SALARY >= 2000 "
            + "ORDER BY LASTNAME";

    //Select employees having salary no more than 2000 or no less than 3000
    //language=HSQLDB
    String select04 = "SELECT ID, LASTNAME, SALARY "
            + "FROM EMPLOYEE "
            + "WHERE SALARY <= 2000 OR SALARY >= 3000 "
            + "ORDER BY LASTNAME";

    //Select all employees assigned to departments and corresponding department
    //language=HSQLDB
    String select05 = "SELECT EMPLOYEE.ID, EMPLOYEE.LASTNAME, EMPLOYEE.SALARY, DEPARTMENT.NAME "
            + "FROM EMPLOYEE INNER JOIN DEPARTMENT "
            + "ON EMPLOYEE.DEPARTMENT = DEPARTMENT.ID "
            + "ORDER BY LASTNAME";

    //Select all employees and corresponding department name if there is one.
    //Name column containing name of the department "depname".
    //language=HSQLDB
    String select06 = "SELECT EMPLOYEE.ID, EMPLOYEE.LASTNAME, EMPLOYEE.SALARY, DEPARTMENT.NAME AS depname " +
            "FROM EMPLOYEE LEFT JOIN DEPARTMENT " +
            "ON EMPLOYEE.DEPARTMENT = DEPARTMENT.ID " +
            "ORDER BY LASTNAME";

    //Select total salary pf all employees. Name it "total".
    //language=HSQLDB
    String select07 = "SELECT SUM(SALARY) AS total FROM EMPLOYEE";

    //Select all departments and amount of employees assigned per department
    //Name column containing name of the department "depname".
    //Name column containing employee amount "staff_size".
    //language=HSQLDB
    String select08 = "SELECT DEPARTMENT.NAME AS depname, COUNT(EMPLOYEE.LASTNAME) AS staff_size " +
            "FROM DEPARTMENT JOIN EMPLOYEE " +
            "ON DEPARTMENT.ID = EMPLOYEE.DEPARTMENT " +
            "GROUP BY depname";

    //Select all departments and values of total and average salary per department
    //Name column containing name of the department "depname".
    //language=HSQLDB
    String select09 = "SELECT DEPARTMENT.NAME AS depname, SUM(EMPLOYEE.SALARY) AS total, AVG(EMPLOYEE.SALARY) AS average " +
            "FROM DEPARTMENT JOIN EMPLOYEE " +
            "ON DEPARTMENT.ID = EMPLOYEE.DEPARTMENT " +
            "GROUP BY depname";

    //Select lastnames of all employees and lastnames of their managers if an employee has a manager.
    //Name column containing employee's lastname "employee".
    //Name column containing manager's lastname "manager".
    //language=HSQLDB
    String select10 = "SELECT E.LASTNAME AS employee, M.LASTNAME AS manager " +
            "FROM EMPLOYEE E LEFT JOIN EMPLOYEE M " +
            "ON E.MANAGER=M.ID";


}
