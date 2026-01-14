# HMovie App

A modern, high-performance Android application for movie discovery and tracking. Built with **Kotlin** and following the **MVVM (Model-View-ViewModel)** architectural pattern.

---

## 📖 Project Overview

**HMovie** is a sleek Android application designed to provide users with an immersive movie browsing experience. It leverages industry-standard libraries and best practices to ensure a smooth, responsive UI while handling complex data fetching from remote movie databases.

---

## ✨ Key Features

* **Movie Discovery**: Explore popular, trending, and top-rated movies.
* **Search Functionality**: Quickly find movies by title.
* **Detailed Information**: View movie synopses, ratings, release dates, and cast details.
* **MVVM Architecture**: Ensures a clean separation of concerns and maintainable code.
* **Multiple Status View**: Custom handling for Loading, Empty, Error, and Content states for a better UX.
* **Responsive UI**: Optimized for various Android screen sizes and orientations.

---

## 🛠️ Tech Stack & Libraries

* **Language**: [Kotlin](https://kotlinlang.org/) (Primary) & Java.
* **Architecture**: MVVM with BindingData & ViewModel.
* **UI Components**: XML Layouts, Material Design.
* **Networking**: Retrofit / OkHttp (for API consumption).
* **Image Loading**: Glide or Coil (for efficient movie poster rendering).
* **Dependency Injection**: Dagger/Hilt or Koin (if applicable).
* **View Handling**: Custom `multiple-status-view` for state management.

---

## 🚀 Getting Started

### Prerequisites
* **Android Studio Bumblebee** or newer.
* **JDK 11** or higher.
* **Android SDK** (API 21+).

### Installation

1.  **Clone the repository**:
    ```bash
    git clone [https://github.com/hoangdh2001/hmovies-app.git](https://github.com/hoangdh2001/hmovies-app.git)
    cd hmovies-app
    ```

2.  **Open in Android Studio**:
    * Launch Android Studio.
    * Select `Open an existing project`.
    * Navigate to the cloned folder and select `build.gradle`.

3.  **API Configuration**:
    * This app likely uses a provider like **TMDB (The Movie Database)**.
    * If required, obtain your API Key from TMDB and add it to your `local.properties` or appropriate config file:
    ```properties
    MOVIE_API_KEY=your_api_key_here
    ```

4.  **Run the application**:
    * Click the **Run** button (green play icon) in Android Studio to install and launch the app on your emulator or physical device.

---

## 🏗️ Project Structure

```text
app/
├── src/main/java/com/hmovie/
│   ├── ui/             # Activities, Fragments, and Adapters
│   ├── viewmodel/      # ViewModel classes for state management
│   ├── data/           # Repositories, API interfaces, and Models
│   └── di/             # Dependency Injection modules
└── res/                # Layouts, Drawables, and Strings
```
![mvvm-android](https://user-images.githubusercontent.com/76101060/155872266-f54735c2-2979-4564-b97e-9f1418d99ce7.png)
