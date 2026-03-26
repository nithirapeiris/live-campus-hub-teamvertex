/* Test 1 */

SELECT 
    students.student_id,
    CONCAT(students.first_name, ' ', students.last_name) AS student_name,
    departments.department_Name,
    clubs.club_name,
    students_club.joined_date
FROM 
    students
INNER JOIN 
    departments ON students.department_id = departments.department_id
INNER JOIN 
    students_club ON students.student_id = students_club.student_id
INNER JOIN 
    clubs ON students_club.club_id = clubs.club_id
WHERE 
    students_club.active_status = 1;


/* Test 2 */

SELECT 
    departments.department_Name,
    COUNT(DISTINCT students.student_id) AS total_students_awarded,
    COALESCE(SUM(student_reward.points), 0) AS total_department_points
FROM 
    departments
LEFT JOIN 
    students ON departments.department_id = students.department_id
LEFT JOIN 
    student_reward ON students.student_id = student_reward.student_id
GROUP BY 
    departments.department_Name
ORDER BY 
    total_department_points DESC;


/* Test 3 */

SELECT 
    events.event_title,
    events.event_date,
    clubs.club_name,
    location.location_name
FROM 
    events
INNER JOIN 
    clubs ON events.club_id = clubs.club_id
INNER JOIN 
    location ON events.location_id = location.location_id
ORDER BY 
    events.event_date ASC;
    