USE inscripcionesCursos;

INSERT INTO estudiantes (nombre, edad) VALUES
('Juan Pérez', 21),
('María Silva', 23),
('Carlos Rojas', 19),
('Ana Gómez', 22),
('Luis Toro', 20);

INSERT INTO cursos (nombre, duracion) VALUES
('Introducción a la Programación', 40),
('Diseño Gráfico Básico', 30),
('Gestión de Proyectos', 60),
('Marketing Digital', 25);

INSERT INTO inscripciones (estudiantes_id_estudiante, cursos_id_curso) VALUES
(1, 1), 
(1, 2), 
(2, 2), 
(2, 3), 
(3, 3), 
(3, 4), 
(4, 1), 
(4, 4);
-- Proyecta a todos los estudiantes y sus respectivos cursos.
SELECT estudiantes.nombre AS Estudiante,cursos.nombre AS Curso FROM estudiantes LEFT JOIN inscripciones  ON estudiantes.id_estudiante = inscripciones.estudiantes_id_estudiante LEFT JOIN cursos  ON inscripciones.cursos_id_curso = cursos.id_curso;

-- Proyecta todos los estudiantes que están inscritos en un curso específico, utilizando el nombre del curso como criterio de búsqueda.
SELECT estudiantes.nombre AS Estudiante, cursos.nombre AS Curso FROM estudiantes INNER JOIN inscripciones  ON estudiantes.id_estudiante = inscripciones.estudiantes_id_estudiante INNER JOIN cursos  ON inscripciones.cursos_id_curso = cursos.id_curso WHERE cursos.nombre = 'Introducción a la Programación';

-- Proyecta todos los cursos en los que está inscrito un estudiante específico, utilizando su nombre como criterio de búsqueda.
SELECT estudiantes.nombre AS Estudiante, cursos.nombre AS Curso, cursos.duracion AS Duracion FROM estudiantes INNER JOIN inscripciones ON estudiantes.id_estudiante = inscripciones.estudiantes_id_estudiante INNER JOIN cursos ON inscripciones.cursos_id_curso = cursos.id_curso WHERE estudiantes.nombre = 'Juan Pérez';

-- Cuenta el número de estudiantes inscritos en cada curso y muestra el nombre del curso junto con el número de estudiantes inscritos.
SELECT cursos.nombre AS Curso, COUNT(inscripciones.estudiantes_id_estudiante) AS Numero_Estudiantes FROM cursos LEFT JOIN inscripciones ON cursos.id_curso = inscripciones.cursos_id_curso GROUP BY cursos.id_curso, cursos.nombre;

-- Encuentra los estudiantes que no están inscritos en ningún curso.
SELECT estudiantes.nombre AS Estudiante, estudiantes.edad AS Edad FROM estudiantes LEFT JOIN inscripciones ON estudiantes.id_estudiante = inscripciones.estudiantes_id_estudiante WHERE inscripciones.estudiantes_id_estudiante IS NULL;

