פרויקט זה הוא אפליקציית Spring Boot המדגימה מערכת ניהול כיתות (ClassRoom) באמצעות REST API.
המערכת מאפשרת ביצוע פעולות CRUD מלאות על ישות כיתה, תוך שימוש ב־Spring Data JPA וב־H2 Database.

הפרויקט בנוי בארכיטקטורה שכבתית:

Controller

Service

Repository

Entity

טכנולוגיות

Java 17

Spring Boot 3.5.5

Spring Web (REST API)

Spring Data JPA

H2 Database (In-Memory)

Maven

מבנה הפרויקט
src
 └─ main
    └─ java
       └─ com.example.projectrikidiseldorf
          ├─ controllers
          │   └─ ControllerClass
          ├─ services
          │   ├─ ClassServiceInterface
          │   └─ ClassRoomService
          ├─ repositories
          │   └─ ClassRepositories
          ├─ entities
          │   └─ ClassRoom
          └─ ProjectRikiDiseldorfApplication

ישות ClassRoom

המערכת מנהלת אובייקטים מסוג ClassRoom עם השדות הבאים:

roomNumber – מספר חדר (Primary Key)

classNumber – סימון הכיתה

teacher – שם המורה

amountPupil – מספר תלמידים

REST API Endpoints
קבלת כל הכיתות
GET /Class

קבלת כיתה לפי מספר חדר
GET /Class/{roomNumber}

הוספת כיתה
POST /Class


Body (JSON):

{
  "roomNumber": 101,
  "classNumber": "A",
  "teacher": "Dana Cohen",
  "amountPupil": 30
}

עדכון כיתה
PUT /Class/{roomNumber}

מחיקת כיתה
DELETE /Class/{roomNumber}

בסיס נתונים

שימוש ב־H2 Database

הנתונים נשמרים בזיכרון (In-Memory)

כל אתחול מחדש של האפליקציה מאפס את הנתונים

הרצת הפרויקט

ודאי ש־Java 17 מותקן

פתחי את הפרויקט ב־IntelliJ

הרץ את המחלקה:

ProjectRikiDiseldorfApplication


או באמצעות Maven:

mvn spring-boot:run


האפליקציה תרוץ כברירת מחדל על:

http://localhost:8080

מטרת הפרויקט

פרויקט לימודי המדגים:

עבודה עם Spring Boot

בניית REST API

שימוש ב־JPA ו־Repository

הפרדה לשכבות (Controller / Service / Repository)
