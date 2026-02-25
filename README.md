<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>

<header>
<h1>🌦 Weather Analysis API</h1>
<p>Spring Boot REST API for Weather Data Processing & Analytics</p>
</header>

<div class="container">

<div class="card">
<h2>📌 Project Overview</h2>
<p>
Weather Analysis API is a backend application built using Java and Spring Boot.
The system processes nearly 20 years of Delhi weather data from a CSV dataset,
stores it into a database, and exposes REST APIs for filtering, sorting,
and analytical computations.
</p>

<ul>
<li>CSV Data Processing</li>
<li>REST API Development</li>
<li>Database Integration</li>
<li>Weather Analytics</li>
<li>Layered Architecture</li>
</ul>
</div>

<div class="card">
<h2>🎯 Key Features</h2>
<ul>
<li>✅ CSV File Processing</li>
<li>✅ Spring Data JPA Integration</li>
<li>✅ RESTful APIs</li>
<li>✅ Date & Month Filtering</li>
<li>✅ Dynamic Sorting</li>
<li>✅ Temperature Statistics</li>
<li>✅ Modular Architecture</li>
</ul>
</div>

<div class="card">
<h2>🧱 Tech Stack</h2>

<table>
<tr><th>Technology</th><th>Usage</th></tr>
<tr><td>Java 21</td><td>Programming Language</td></tr>
<tr><td>Spring Boot</td><td>Backend Framework</td></tr>
<tr><td>Spring Data JPA</td><td>ORM</td></tr>
<tr><td>H2 Database</td><td>In-Memory DB</td></tr>
<tr><td>Maven</td><td>Build Tool</td></tr>
<tr><td>Postman</td><td>API Testing</td></tr>
</table>

</div>

<div class="card">
<h2>🏗 Architecture</h2>

<pre>
Client (Postman)
        ↓
Controller Layer
        ↓
Service Layer
        ↓
Repository Layer
        ↓
H2 Database
</pre>

</div>

<div class="card">
<h2>📁 Project Structure</h2>

<pre>
com.weatheranalysis.api
│
├── controller
│     └── WeatherController.java
├── dto
│     └── TemperatureStatsDTO.java
├── entity
│     └── WeatherData.java
├── repository
│     └── WeatherRepository.java
├── service
│     ├── WeatherService.java
│     └── impl
│           └── WeatherServiceImpl.java
├── util
│     └── CsvReaderUtil.java
└── WeatherAnalysisApiApplication.java
</pre>

</div>

<div class="card">
<h2>📂 Dataset</h2>

<p>Historical Delhi weather dataset containing:</p>

<ul>
<li>Date</li>
<li>Weather Condition</li>
<li>Temperature</li>
<li>Humidity</li>
<li>Pressure</li>
<li>Heat Index</li>
</ul>

<pre>src/main/resources/testset.csv</pre>

</div>

<div class="card">
<h2>🔌 API Endpoints</h2>

<div class="endpoint">POST /weather/load</div>
Loads CSV data into database.

<div class="endpoint">GET /weather/all</div>
Fetch all weather records.

<div class="endpoint">GET /weather/date?date=1996-11-01</div>
Filter weather by date.

<div class="endpoint">GET /weather/month?year=1996&month=11</div>
Filter weather by month.

<div class="endpoint">GET /weather/stats?year=1996&month=11</div>
Temperature statistics.

<div class="endpoint">GET /weather/sort?field=temperature</div>
Dynamic sorting support.

</div>

<div class="card">
<h2>🗄 Database Configuration</h2>

<pre>
H2 Console:
http://localhost:8096/h2-console

JDBC URL : jdbc:h2:mem:weatherdb
Username : sa
Password : (empty)
</pre>

</div>

<div class="card">
<h2>🚀 How to Run</h2>

<pre>
git clone https://github.com/anbu242006/weather-analysis-api.git
cd weather-analysis-api
mvn spring-boot:run
</pre>

Application URL:

<pre>http://localhost:8096</pre>

</div>

<div class="card">
<h2>👨‍💻 Author</h2>

<p>
<b>Anbumani S</b><br>
📍 Coimbatore, India<br><br>

GitHub:
<a href="https://github.com/anbu02042006" target="_blank">
https://github.com/anbu242006
</a>
<br><br>

LinkedIn:
<a href="https://www.linkedin.com/in/anbu242006/" target="_blank">
https://www.linkedin.com/in/anbu242006/
</a>
</p>

</div>

</div>

<footer>
⭐ Weather Analysis API — Java Backend Internship Assessment Project
</footer>

</body>
</html>
