🏠 Nestify – PG & Mess Finder App
---
<img width="400" height="400" alt="nestify" src="https://github.com/user-attachments/assets/b2ac38e3-b05f-45f8-892e-6ea9b089736b" />



Nestify is a mobile + backend project that helps students and working professionals find PG accommodations and Mess services nearby.
It is powered by a Spring Boot backend and an Android frontend (Kotlin + Jetpack Compose).



🚀 Features

🔎 Search Nearby – Find PGs and Mess services based on city or location.

🗺 Map Integration – Listings include latitude/longitude for location-based search.

🎯 Filters – Sort by price, facilities, and availability.

👤 Dual User Roles –

Seeker: can search and review PG/Mess.

Owner: can add/manage listings.

🔐 Authentication – Secure login/signup with JWT.

⭐ Ratings & Reviews – Honest feedback for better decisions.

🛠 Tech Stack
Backend (Spring Boot)

Spring Boot (REST APIs)

Spring Data JPA (Database ORM)

Spring Security + JWT (Authentication)

MySQL / PostgreSQL (Database)

Frontend (Mobile App)

Android (Kotlin + Jetpack Compose)

Google Maps API

Retrofit (for API calls)

📂 Project Structure
Spring Boot Backend
nestify-backend/
│── src/main/java/com/nestify
│   ├── controller/        # REST Controllers
│   ├── service/           # Business logic
│   ├── repository/        # Database access layer
│   ├── model/             # Entities (User, Listing, Review)
│   └── NestifyApplication.java
│
└── src/main/resources/
    ├── application.yml    # Config (DB, JWT secret, etc.)

Android App
nestify-android/
│── ui/            # Jetpack Compose screens
│── viewmodel/     # State management
│── repository/    # API & Firebase data handling
│── utils/         # Helpers

⚡ API Endpoints (Sample)
Authentication

POST /api/auth/signup → register user

POST /api/auth/login → login & get JWT

Listings

POST /api/listings → add PG/Mess (Owner only)

GET /api/listings → get all listings

GET /api/listings/{id} → get specific listing

PUT /api/listings/{id} → update listing (Owner only)

DELETE /api/listings/{id} → remove listing (Owner only)

Reviews

POST /api/reviews/{listingId} → add review

GET /api/reviews/{listingId} → get all reviews

📖 Getting Started
1. Clone Repo
git clone https://github.com/rookiecoder910/nestify.git

 2. cd nestify

3. Setup Backend

Install Java 17+

Setup MySQL/Postgres and update application.yml

Run with:

./mvnw spring-boot:run

3. Setup Android App

Open nestify-android/ in Android Studio

Add Google Maps API Key in AndroidManifest.xml

Run app on emulator/device

🎯 Future Improvements

📱 Online booking & payments

🖼 Image upload (Cloudinary / S3)

💬 In-app chat between seekers & owners

🌐 Web dashboard for PG/Mess owners

🤝 Contributing

Contributions are welcome!

Fork repo

Create feature branch

Submit PR 🚀

📜 License

This project is licensed under the MIT License.

👨‍💻 Author

Manas Kumar Yadav
