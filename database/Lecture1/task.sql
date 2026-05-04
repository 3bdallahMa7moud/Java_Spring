-- Create table
CREATE TABLE EmployeeInfo (
    emp_id NUMBER PRIMARY KEY,
    emp_name VARCHAR2(100),
    emp_age NUMBER,
    date_of_birth DATE,
    location VARCHAR2(200)
);

-- Remove old address and add new address columns
ALTER TABLE EmployeeInfo DROP COLUMN location;

ALTER TABLE EmployeeInfo ADD (
    city VARCHAR2(100),
    street_name VARCHAR2(100)
);

-- Rename name column
ALTER TABLE EmployeeInfo RENAME COLUMN emp_name TO full_name;

-- Make table read only
ALTER TABLE EmployeeInfo READ ONLY;

-- Make it editable again to continue changes
ALTER TABLE EmployeeInfo READ WRITE;

-- Create another table from selected columns
CREATE TABLE Supervisor AS
SELECT
    emp_id,
    full_name,
    date_of_birth
FROM EmployeeInfo;

-- Rename main table
RENAME EmployeeInfo TO MainEmployee;

-- Delete tables
DROP TABLE MainEmployee;
DROP TABLE Supervisor;
