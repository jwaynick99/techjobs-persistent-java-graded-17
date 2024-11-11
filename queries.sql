--Part 1
/*
    id int,
    employer VARCHAR(255),
    name VARCHAR(255),
    skills VARCHAR(255)
    PRIMARY KEY(id)
*/
--Part 2
SELECT name
FROM employer
WHERE location = "St. Louis City";
--Part 3
DROP TABLE job;
--Part 4
SELECT *
FROM skill
LEFT join job_skills ON job_skills.skills_id = skill.id
WHERE job_skills.jobs_id is not null
ORDER BY name ASC;
