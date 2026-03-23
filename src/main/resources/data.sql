-- Initial data for Student Management API
-- Note: UUIDs are generated for sample purposes. Hibernate handles generation for new records.

INSERT INTO students (id, first_name, last_name, dob, address) VALUES 
('550e8400-e29b-41d4-a716-446655440000', 'John', 'Doe', '2000-01-01', '123 Main St, New York'),
('6ba7b810-9dad-11d1-80b4-00c04fd430c8', 'Jane', 'Smith', '1999-05-15', '456 Oak Ave, Los Angeles'),
('7da7b810-9dad-11d1-80b4-00c04fd430c8', 'Alice', 'Johnson', '2001-08-20', '789 Pine Rd, Chicago');
