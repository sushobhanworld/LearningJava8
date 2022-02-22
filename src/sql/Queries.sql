SELECT * FROM employee ORDER BY salary DESC LIMIT 1 OFFSET 2;
--here offset means row third
-- highest salary
SELECT * FROM `employee` ORDER BY `salary` DESC LIMIT 1;

SELECT name, MAX(salary) AS salary
  FROM employee
 WHERE salary < (SELECT MAX(salary)
                 FROM employee
                 WHERE salary < (SELECT MAX(salary)
                 FROM employee)
                );

 SELECT salary
 FROM employee
 ORDER BY salary desc limit n-1,1