DROP TABLE IF EXISTS ApacheEmployee;

CREATE TABLE ApacheEmployee (
  id INT AUTO_INCREMENT PRIMARY KEY,
  age INT NOT NULL,
  name VARCHAR(100) NOT NULL,
  department VARCHAR(100),
  salary DECIMAL(10,2) NOT NULL 
);

INSERT INTO ApacheEmployee (name, age, department, salary) VALUES 
 ('John Doe', 30, 'Engineering', 75000.00),
 ('Jane Smith', 28, 'Marketing', 65000.00),
 ('Mike Johnson', 35, 'Engineering', 80000.00),
 ('Sarah Williams', 32, 'HR', 55000.00),
 ('David Brown', 23, 'Finance', 70000.00),
 ('Lisa Davis', 40, 'Engineering', 78000.00),
 ('Tom Wilson', 34, 'Marketing', 62000.00),
 ('Emma Garcia', 33, 'HR', 58000.00);
