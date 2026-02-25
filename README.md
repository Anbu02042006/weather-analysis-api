🌦 Weather Analysis API
Java Developer Internship Assessment Project
📌 Project Overview

The Weather Analysis API is a Spring Boot backend application developed as part of a Java Developer Internship Assessment.

This project processes nearly 20 years of weather forecast data for Delhi from a CSV dataset, stores it in a database, and exposes REST APIs to retrieve, filter, sort, and analyze weather information.

The application demonstrates strong backend development concepts including:

CSV Data Processing

REST API Development

Database Integration

Filtering & Sorting

Data Analytics

Modular Spring Boot Architecture

🎯 Assessment Requirements Covered
Requirement	Status
Process CSV File	✅ Implemented
Store Data into Database	✅ Spring Data JPA
Create REST APIs	✅ Controller Layer
Filtering Functionality	✅ Date & Month APIs
Sorting Functionality	✅ Dynamic Sorting
Modular Code Structure	✅ Layered Architecture
🧱 Tech Stack
Technology	Purpose
Java 21	Programming Language
Spring Boot	Backend Framework
Spring Data JPA	ORM
H2 Database	In-memory Database
Maven	Build Tool
REST APIs	Data Access
Postman	API Testing
🏗 Project Architecture

The application follows Layered Architecture:

Client (Postman)
        ↓
Controller Layer
        ↓
Service Layer
        ↓
Repository Layer
        ↓
Database (H2)
📁 Project Structure
com.weather_analysis.api
│
├── controller
│      WeatherController.java
│
├── service
│      WeatherService.java
│
├── service.impl
│      WeatherServiceImpl.java
│
├── repository
│      WeatherRepository.java
│
├── entity
│      WeatherData.java
│
├── dto
│      TemperatureStatsDTO.java
│
├── util
│      CsvReaderUtil.java
│
└── WeatherAnalysisApiApplication.java
📂 Dataset Information

Dataset contains historical weather data including:

Date

Weather Condition

Temperature

Humidity

Pressure

Heat Index

CSV File Location:

src/main/resources/testset.csv
⚙️ Data Processing Workflow

CSV file is read using BufferedReader.

Each row is converted into a WeatherData entity.

Date is parsed using DateTimeFormatter.

Empty numeric values are safely handled.

Data is stored using:

weatherRepository.saveAll(data);
🗄 Database Configuration

This project uses H2 In-Memory Database.

Access H2 Console
http://localhost:8096/h2-console
Credentials
JDBC URL : jdbc:h2:mem:weatherdb
Username : sa
Password : (leave empty)
🚀 How to Run the Project
1️⃣ Clone Repository
git clone https://github.com/YOUR_USERNAME/weather-analysis-api.git
2️⃣ Open Project

Open using:

Spring Tool Suite (STS)

IntelliJ IDEA

Eclipse

3️⃣ Run Application

Run:

WeatherAnalysisApiApplication.java

Application runs at:

http://localhost:8096
🔌 API Endpoints
✅ Load CSV Data

Loads CSV data into database.

POST /weather/load

Response:

Weather Data Loaded Successfully
✅ Get All Weather Data
GET /weather/all

Returns all weather records.

✅ Filter By Date
GET /weather/date?date=1996-11-01

Returns weather details for a specific date.

✅ Filter By Month
GET /weather/month?year=1996&month=11

Returns weather data for selected month.

✅ Monthly Temperature Statistics

Calculates:

Highest temperature

Median temperature

Minimum temperature

GET /weather/stats?year=1996&month=11

Example Response:

{
  "high": 32.5,
  "median": 24.3,
  "minimum": 10.2
}
✅ Sort Weather Data

Dynamic sorting supported using Spring Data JPA.

GET /weather/sort?field=temperature

Supported fields:

date

temperature

humidity

pressure

heatIndex

🧠 Key Implementation Concepts
CSV Processing

Uses ClassPathResource

Reads line-by-line

Converts rows into objects

Filtering

Implemented using repository methods:

findByDate()
findByDateBetween()
Sorting

Dynamic sorting using:

Sort.by(field)
Statistics Calculation

Median calculated manually after sorting temperature list.

🧪 API Testing

All APIs tested using Postman.

Recommended Testing Order

/weather/load

/weather/all

/weather/date

/weather/month

/weather/sort

/weather/stats

📈 Future Enhancements

Pagination support

Swagger API Documentation

MySQL Integration

Global Exception Handling

Docker Deployment

Authentication & Authorization

👨‍💻 Author

Anbumani S

📍 Coimbatore, India

🔗 LinkedIn: https://www.linkedin.com/in/anbu242006/

💻 GitHub: https://github.com/Anbu02042006

✅ Evaluation Checklist
Feature	Status
CSV Processing	✅
Database Storage	✅
REST APIs	✅
Filtering	✅
Sorting	✅
Statistics Calculation	✅
Documentation	✅
⭐ Conclusion

This project demonstrates backend development skills using Spring Boot, including real-world data processing, API design, database integration, filtering, sorting, and analytical computations aligned with industry standards.
