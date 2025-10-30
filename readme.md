# 🏠 Nestify – PG & Mess Finder App

![GitHub Repo stars](https://img.shields.io/github/stars/rookiecoder910/nestify?style=social)
![GitHub forks](https://img.shields.io/github/forks/rookiecoder910/nestify?style=social)
![GitHub issues](https://img.shields.io/github/issues/rookiecoder910/nestify)
![GitHub license](https://img.shields.io/github/license/rookiecoder910/nestify)

<img width="400" height="400" alt="nestify" src="https://github.com/user-attachments/assets/b2ac38e3-b05f-45f8-892e-6ea9b089736b" />  

**Nestify** is a mobile + backend project that helps students and working professionals easily find **PG accommodations** and **Mess services** nearby.
It is powered by a **Spring Boot backend** and an **Android app (Kotlin + Jetpack Compose)**.

---

## 🚀 Features

* 🔎 **Search Nearby** – Find PGs and Mess services based on city or current location.
* 🗺 **Map Integration** – View listings with latitude/longitude and navigate easily.
* 🎯 **Filters** – Sort by price, facilities, and availability.
* 👤 **Dual User Roles** –

  * **Seeker**: Search and review PG/Mess.
  * **Owner**: Add and manage listings.
* 🔐 **Authentication** – Secure login/signup using JWT.
* ⭐ **Ratings & Reviews** – Honest feedback system for better decision-making.

---

## 🛠 Tech Stack

### **Backend (Spring Boot)**

* Spring Boot (REST APIs)
* Spring Data JPA (Database ORM)
* Spring Security + JWT (Authentication)
* MySQL / PostgreSQL (Database)

### **Frontend (Mobile App)**

* Android (Kotlin + Jetpack Compose)
* Google Maps API
* Retrofit (API calls)

---

## 📂 Project Structure

### **Spring Boot Backend (`nestify-backend/`)**

```
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
```

### **Android App (`nestify-android/`)**

```
nestify-android/
│── ui/            # Jetpack Compose screens
│── viewmodel/     # State management
│── repository/    # API & Firebase data handling
│── utils/         # Helpers
```

---

## ⚡ API Endpoints (Sample)

### **Authentication**

* `POST /api/auth/signup` → Register a new user
* `POST /api/auth/login` → Login & receive JWT

### **Listings**

* `POST /api/listings` → Add PG/Mess (Owner only)
* `GET /api/listings` → Fetch all listings
* `GET /api/listings/{id}` → Fetch specific listing
* `PUT /api/listings/{id}` → Update listing (Owner only)
* `DELETE /api/listings/{id}` → Remove listing (Owner only)

### **Reviews**

* `POST /api/reviews/{listingId}` → Add review
* `GET /api/reviews/{listingId}` → Get reviews for listing

---

## 📖 Getting Started

### **1. Clone Repo**

```bash
git clone https://github.com/rookiecoder910/nestify.git
cd nestify
```

### **2. Setup Backend**

* Install **Java 17+**
* Setup **MySQL/Postgres** and update `application.yml`
* Run server:

```bash
./mvnw spring-boot:run
```

### **3. Setup Android App**

* Open `nestify-android/` in **Android Studio**
* Add your **Google Maps API Key** in `AndroidManifest.xml`
* Run on **emulator/device**

---

## 🎯 Future Improvements

* 📱 Online booking & payments
* 🖼 Image uploads (Cloudinary / AWS S3)
* 💬 In-app chat between seekers & owners
* 🌐 Web dashboard for PG/Mess owners

---

## 📸 Screenshots

> Add your app screenshots here (replace placeholders below):

| Home Screen                                  | Map View                                    | Listings                                         |
| -------------------------------------------- | ------------------------------------------- | ------------------------------------------------ |
| ![Home](https://via.placeholder.com/200x400) | ![Map](https://via.placeholder.com/200x400) | ![Listings](https://via.placeholder.com/200x400) |

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repo
2. Create your feature branch (`git checkout -b feature-name`)
3. Commit changes (`git commit -m "Add feature"`)
4. Push to branch (`git push origin feature-name`)
5. Open a Pull Request 🚀

---

## 📜 License

This project is licensed under the **MIT License**.

---

## 👨‍💻 Author

**Manas Kumar Yadav**
[GitHub](https://github.com/rookiecoder910) • [LinkedIn](#)

---
