# Budget Tracker Application
Java-based Budget Tracking application using Swing, JDBC, and SQLite to help users record, update, and manage their expenses. Implemented DAO architecture for clean database operations and ensured smooth user interaction with a responsive desktop UI.
<h2>Table of Contents</h2>
<ul>
  <li> <a href = "#About"> About </a></li>
  <ul>
   <li><a href="#wa"> What is Budget Tracker? </a></li> 
   <li><a href="#features"> Features </a></li> 
   <li><a href="#why"> Why Budget Tracker? </a></li>
  </ul>
  <li> <a href = "#getting_started"> Getting Started </a></li>
  <ul>
   <li><a href="#prerequisites"> Prerequisites </a></li> 
   <li><a href="#installation"> Installation </a></li> 
   <li><a href="#backend_setup"> Backend Setup </a></li>
   <li><a href="#frontend_setup"> Building the App </a></li>
  </ul>
  <li> <a href = "#tech_used"> TechStack Used </a></li>
  <li> <a href = "#architecture"> System Architecture </a></li>
  <li> <a href = "#screenshots"> Screenshots and App Demonstration </a></li>
  <li> <a href = "#conclusion"> Conclusion </a></li>
  <li> <a href = "#team"> Developed By </a></li>
</ul>
<section id = "About">
  <h2> About </h2>
  <h3 id = "wa"> What is Budget Tracker? </h3>
Budget Tracker is a desktop-based expense management application designed to help users record, monitor, and manage their daily financial activities. It allows users to add, update, and delete expenses while organizing them by categories for better clarity. With an integrated SQLite database and JDBC-based data handling, the system ensures smooth, fast, and reliable tracking of personal budgets.
 <h3 id = "features"> Features </h3>
<ul>
    <li><strong>Add, Update & Delete Transactions</strong>
        <ul>
            <li>Quickly add new expenses with amount, category, and description</li>
            <li>Edit existing transactions instantly</li>
            <li>Delete records with safe confirmation dialogs</li>
        </ul>
    </li>
    <br>
    <li><strong>SQLite Database Integration</strong>
        <ul>
            <li>All transactions are securely stored locally using SQLite</li>
            <li>Automatic database initialization on first launch</li>
            <li>Fast and efficient CRUD operations using JDBC</li>
        </ul>
    </li>
    <br>
    <li><strong>Interactive Desktop UI (Java Swing)</strong>
        <ul>
            <li>User-friendly interface designed with clean layouts</li>
            <li>Real-time updates on the transactions table</li>
            <li>Form validation for preventing incorrect inputs</li>
        </ul>
    </li>
    <br>
    <li><strong>Category-Based Expense Organization</strong>
        <ul>
            <li>Supports multiple categories such as Food, Bills, Travel, Shopping, etc.</li>
            <li>Well-structured dropdown for easier data entry</li>
            <li>Helps users understand their spending patterns</li>
        </ul>
    </li>
    <br>
    <li><strong>Automatic Total Expense Calculation</strong>
        <ul>
            <li>Updates total expense automatically when transactions change</li>
            <li>Displays running total for clear financial insight</li>
        </ul>
    </li>
    <br>
    <li><strong>DAO Layer Architecture</strong>
        <ul>
            <li>Implements clean separation between UI, service, and database layers</li>
            <li>Makes the application easy to extend and maintain</li>
        </ul>
    </li>
    <br>
    <li><strong>Portable & Lightweight Application</strong>
        <ul>
            <li>Runs on any system with Java installed</li>
            <li>No external setup required – uses built-in SQLite file database</li>
        </ul>
    </li>
</ul>
<h3 id="why"> Why Budget Tracker? </h3>
<ul>
    <li><strong>Simple & Efficient Expense Management</strong>: Helps users easily record, track, and manage their daily expenses with a clean and intuitive interface.</li>
    <li><strong>Accurate Financial Insights</strong>: Automatically calculates total expenses and organizes spending by category, helping users make better financial decisions.</li>
    <li><strong>Reliable Local Database Storage</strong>: Uses SQLite for secure and offline data storage, ensuring user data remains private and accessible at any time.</li>
    <li><strong>Fast & Responsive Desktop Application</strong>: Built using Java Swing and JDBC, offering smooth performance and instant updates across all transactions.</li>
    <li><strong>Easy to Maintain & Extend</strong>: Uses a modular architecture with DAO and service layers, allowing developers to add new features or connect external systems effortlessly.</li>
    <li><strong>Lightweight & Portable</strong>: Requires no external setup—just run the JAR file on any system with Java installed and start managing expenses instantly.</li>
</ul>

<section id="getting_started">
  <h2> Getting Started </h2>

  <h3 id="prerequisites"> Prerequisites </h3>
  <p>Before you begin, ensure that the following prerequisites are installed on your system:</p>

  <ul>
    <li>
      <strong>Java 17+</strong>: Required to build and run the Budget Tracker desktop application.
      <ul>
        <li><a href="https://adoptium.net">Download Java (Temurin)</a></li>
      </ul>
    </li>
    <li>
      <strong>Apache Maven</strong>: Used to build the project and manage dependencies.
      <ul>
        <li><a href="https://maven.apache.org/download.cgi">Download Maven</a></li>
      </ul>
    </li>
    <li>
      <strong>SQLite</strong>: No installation required; the database file is auto-created in the project folder.
    </li>
    <li>
      <strong>Git</strong>: Required to clone the repository.
      <ul>
        <li><a href="https://git-scm.com/downloads">Download Git</a></li>
      </ul>
    </li>
  </ul>

  <h3 id="installation"> Installation </h3>

  <h4>Clone the Repository:</h4>
  <pre><code>git clone https://github.com/Suhas-Varna/Budget-Tracker-Application.git
cd Budget-Tracker-Application
</code></pre>

  <h3 id="backend_setup"> Build & Run the Application </h3>

  <ol>
    <li>
      <p><strong>Clean and Package the Application</strong> using Maven:</p>
      <pre><code>mvn -DskipTests clean package</code></pre>
    </li>
    <li>
      <p><strong>Run the Application</strong> using the generated JAR file:</p>
      <pre><code>java -jar target/budget-tracker-jdbc-1.0.0-jar-with-dependencies.jar</code></pre>
    </li>
    <li>
      <p><strong>Database Info:</strong></p>
      <ul>
        <li>The SQLite file <code>budget.db</code> will be auto-created on first launch.</li>
        <li>No manual setup is required.</li>
      </ul>
    </li>
  </ol>

  <h3 id="frontend_setup"> Project Structure </h3>
  <ul>
    <li><strong>/src/main/java</strong> — All Java source files</li>
    <li><strong>/src/main/resources</strong> — Database & UI resources</li>
    <li><strong>/target</strong> — Generated JAR file after build</li>
    <li><strong>budget.db</strong> — SQLite database (auto-created)</li>
  </ul>

  <h3 id="run_options"> Optional: Run in Development Mode </h3>
  <p>If you prefer running the project without packaging the JAR:</p>
  <pre><code>mvn exec:java -Dexec.mainClass="com.example.budget.Main"</code></pre>

</section>



<section id = "tech_used">
  <h2> TechStack - Built with
    <img src="https://cdn.icon-icons.com/icons2/2530/PNG/512/flutter_button_icon_151957.png" alt="Flutter" height="20" style="vertical-align: middle; filter: none;"/>
   
  <img src="https://cdn.icon-icons.com/icons2/2530/PNG/512/dart_colour_button_icon_151934.png" alt="Dart" height="20" style="vertical-align: middle; filter: none;"/>
  <img src="https://github.com/user-attachments/assets/b4b3e453-bee1-402c-afd2-c02b137704a6" alt="Firebase" height="20" style="vertical-align: middle; filter: none;"/>
 

  </h2>
 
  Flutter: Flutter is Google's UI toolkit for building natively compiled apps for various platforms.

  Dart: Dart is a fast, modern programming language primarily used in Flutter development.
  
  FastAPI: A modern, high-performance Python web framework for building APIs quickly using async support and automatic documentation.

</section>
  
<section id = "architecture">
  <h2> System Architecture </h2>
  
<h3>🏗️ High-Level Architecture:</h3>

<pre>
┌───────────────────────────────────────────────────────────────────────┐
│                            Budget Tracker LENS APP                              │
│   ┌──────────────┐  ┌───────────────┐  ┌──────────────────────────┐   │
│   │  Home Screen │→ │  Voice Input  │→ │  Intent Classification   │   │
│   └──────────────┘  └───────────────┘  └──────────────────────────┘   │
│                 ↓                 ↓                 ↓                 │
│       ┌────────────────┐  ┌─────────────────┐  ┌──────────────────┐   │
│       │ Scene Module   │  │  OCR Module     │  │ Navigation Module│   │
│       │ (YOLOv5-Nano)  │  │ (Google ML Kit) │  │ (Google Maps API)│   │
│       └────────────────┘  └─────────────────┘  └──────────────────┘   │
│                                   ↓                                   │
│                        ┌────────────────────────┐                     │
│                        │ Emergency SOS Module   │                     │
│                        │ • One-tap Call/Share   │                     │
│                        │ • Live Location        │                     │
│                        └────────────────────────┘                     │
│                                   ↓                                   │
│                         ┌───────────────────────┐                     │
│                         │   HTTP Client (DIO)   │                     │
│                         └───────────────────────┘                     │
└───────────────────────────────│───────────────────────────────────────┘
                                │
                       ═════════╪══════════
                        API CALLS │ JSON RESPONSE
                       ═════════╪══════════
                                │
┌───────────────────────────────▼──────────────────────────────────────┐
│                           FASTAPI BACKEND                            │
│   ┌────────────────────────────────────────────────────────────────┐ │
│   │            Intent Processing & Routing Engine                  │ │
│   │  • Receives speech text                                        │ │
│   │  • Groq-based intent classifier (Scene / OCR / Navigate / SOS) │ │
│   │  • Sends response back to app                                  │ │
│   └────────────────────────────────────────────────────────────────┘ │
│                                │                                     │
│     ┌──────────────────────┐   │   ┌──────────────────────────────┐  │
│     │ /predict-intent      │───┘   │ /vision-processing           │  │
│     └──────────────────────┘       └──────────────────────────────┘  │
└───────────────────────────────│──────────────────────────────────────┘
                                │
                       ═════════╪══════════
                        API CALLS │ AI RESPONSES
                       ═════════╪══════════
                                │
┌───────────────────────────────▼──────────────────────────────────────┐
│                           GROQ AI PLATFORM                           │
│    ┌──────────────────────────────┐  ┌────────────────────────────┐  │
│    │ Whisper-v3-turbo             │  │ Llama 3.1 / 3.3 Models     │  │
│    │ • Speech-to-Text             │  │ • Intent Classification    │  │
│    │ • Multi-language             │  │ • Dialogue Understanding   │  │
│    │ • High Accuracy              │  │ • Fast Inference           │  │
│    └──────────────────────────────┘  └────────────────────────────┘  │
└──────────────────────────────────────────────────────────────────────┘
</pre>

<h3>📊 Data Flow Diagram:</h3>

<pre>
  USER GIVES VOICE COMMAND
        │
        ▼
┌────────────────────────────────────┐
│        Flutter App (Budget Tracker Lens)     │
│  • Mic long-press listener         │
│  • Speech capture                  │
│  • Pre-processing                  │
└───────────────────┬────────────────┘
                    │  HTTP POST (JSON: transcript)
                    ▼
┌────────────────────────────────────┐
│            FastAPI Backend         │
│  • Receive text command            │
│  • Clean & normalize input         │
└───────────────────┬────────────────┘
                    │
                    ▼
┌────────────────────────────────────┐
│     Intent Classifier (Groq AI)    │
│  • Identify intent:                │
│    scene / object / OCR /          │
│    navigation / SOS                │
└───────────────────┬────────────────┘
                    │
                    ▼
┌────────────────────────────────────────────┐
│         Route to Appropriate Module        │
│  • Scene → YOLOv5-Nano (image description) │
│  • Object Detection → YOLOv5-Nano          │
│  • OCR → Google ML Kit (text reading)      │
│  • Navigation → Google Maps API            │
│  • SOS → Call / Share location             │
└───────────────────┬────────────────────────┘
                    │
                    ▼
┌────────────────────────────────────┐
│         Module Processing          │
│  • ESP32 Camera image capture      │
│  • Vision / OCR inference          │
│  • Walking route computation       │
│  • Emergency operations            │
└───────────────────┬────────────────┘
                    │
                    ▼
┌────────────────────────────────────┐
│           JSON Response            │
│  • Objects detected                │
│  • Scene summary                   │
│  • Extracted text                  │
│  • Navigation instructions         │
│  • SOS confirmation                │
└───────────────────┬────────────────┘
                    │  HTTP JSON Response
                    ▼
┌────────────────────────────────────┐
│      Flutter App (Front-End)       │
│  • Parse JSON                      │
│  • Convert to Text-to-Speech       │
│  • Show navigation steps           │
│  • Display detection results       │
│  • Trigger SOS actions             │
└────────────────────────────────────┘
                    │
                    ▼
            USER RECEIVES OUTPUT
</pre>

<h3>🔄 API Key Rotation Workflow:</h3>
<pre>
INITIAL STATE
┌─────────────────────┐
│ Keys: [K1, K2, K3]  │
│ Current: K1         │
│ Index: 0            │
└──────────┬──────────┘
           │
           ▼
    API REQUEST WITH K1
           │
           ├──── SUCCESS ────► Return Result
           │
           └──── RATE LIMIT ERROR
                      │
                      ▼
           ┌──────────────────┐
           │ Log Error        │
           │ Rotate to K2     │
           │ Index: 1         │
           └─────────┬────────┘
                     │
                     ▼
           RETRY WITH K2
                     │
                     ├──── SUCCESS ────► Return Result
                     │
                     └──── RATE LIMIT ERROR
                                │
                                ▼
                     ┌──────────────────┐
                     │ Rotate to K3     │
                     │ Index: 2         │
                     └─────────┬────────┘
                               │
                               ▼
                     RETRY WITH K3
                               │
                               └──── If all keys exhausted
                                            │
                                            ▼
                                   Return 429 Error
                                   "All keys rate limited"
</pre>

<h3>🗂️ Project Structure:</h3>

<pre>
Budget Tracker/
│
├── Budget Tracker/                # Flutter Frontend
│   ├── lib/
│   │   ├── main.dart          # App entry point
│   │   ├── pages              # Features Screens
│   ├── pubspec.yaml           # Flutter dependencies
│   ├── android/               # Android-specific config
│   ├── ios/                   # iOS-specific config
│   └── README.md
│   ├── server/                 # FastAPI Backend
│       ├── server.py           # Main application file
│       ├── requirements.txt    # Python dependencies
│
├── README.md                  # Main project documentation
└── LICENSE
</pre>

<h3>🔐 Budget Tracker Security Architecture</h3>

<ul>
  <li><strong>API Key Management</strong>:
    <ul>
      <li>Secure storage of API keys in .env (never committed to Git)</li>
      <li>Server-side key rotation for uninterrupted AI processing</li>
      <li>Keys never exposed to frontend or client devices</li>
    </ul>
  </li>
  
  <li><strong>Data Privacy</strong>:
    <ul>
      <li>Audio is processed completely in-memory</li>
      <li>No audio or generated content stored on the server</li>
      <li>Temporary files auto-deleted after processing</li>
      <li>Zero user tracking — Budget Tracker does not collect or retain personal data</li>
    </ul>
  </li>
  
  <li><strong>API Security</strong>:
    <ul>
      <li>Strict CORS policies for trusted domains</li>
      <li>Request validation, sanitization, and safe error handling</li>
      <li>Protected backend routes to prevent unauthorized usage</li>
    </ul>
  </li>
</ul>

<h3>⚡ Budget Tracker Performance Optimizations</h3>

<ul>
  <li><strong>Backend</strong>:
    <ul>
      <li>FastAPI backend with highly optimized async processing</li>
      <li>Groq LLM inference speeds up to 330 tokens/sec</li>
      <li>Memory-efficient pipeline for handling long audio files</li>
      <li>Automatic key rotation prevents API rate-limit slowdowns</li>
    </ul>
  </li>
  
  <li><strong>Frontend</strong>:
    <ul>
      <li>Lazy-loaded UI components for faster initial load</li>
      <li>Optimized PDF generation with cached fonts</li>
      <li>Compressed and optimized images</li>
      <li>Smooth and efficient state management for a responsive UI</li>
    </ul>
  </li>
</ul>
</section>

<section id="screenshots">
  <h2 id="screenshots">App Demonstration</h2>
  <button> <a href="https://drive.google.com/file/d/1n1-7fQX8kG-AyN3iRzpJ3jv9V25sCGOn/view?usp=sharing" target="_blank">Clear here to watch</button></a>  
  <h2> Screenshots </h2>   
  <img src="https://github.com/user-attachments/assets/d6bd2d65-d428-42fb-85ec-74c09cb683cf" style="width: 200px;" />
  <img src="https://github.com/user-attachments/assets/8e57886b-b97d-4e0f-a5b2-5b706a504648" style="width: 200px;" />
  <img src="https://github.com/user-attachments/assets/4cc12fba-0970-4075-8817-d9f5fc1175b7" style="width: 200px;" />
  <img src="https://github.com/user-attachments/assets/12ef30fb-c8ef-4002-8895-a6eb8a92c82f" style="width: 200px;" />
  <img src="https://github.com/user-attachments/assets/a5a7a83d-a530-4dac-9f4e-15809d40e187" style="width: 200px;" />
  <img src="https://github.com/user-attachments/assets/69b02efd-b210-4333-83a1-d4d3573adf2c" style="width: 200px;" />
  <img src="https://github.com/user-attachments/assets/c779e588-933b-418c-b02c-43b988e50107" style="width: 200px;" />
  <img src="https://github.com/user-attachments/assets/92a35f92-bd16-4df0-871a-c51502b645d7" style="width: 200px;" />
  <img src="https://github.com/user-attachments/assets/140f5198-8a1d-4201-9961-c4885a6aa90d" style="width: 200px;" />
  <img src="https://github.com/user-attachments/assets/8b9f325c-ff8b-4510-ae0b-c485cac584eb" style="width: 200px;" />
  <img src="https://github.com/user-attachments/assets/af308e05-06b2-4ca0-8291-d7338f82a54f" style="width: 200px;" />
  <img src="https://github.com/user-attachments/assets/cfe636ad-b298-44c7-bf60-4c681b1a532b" style="width: 200px;" />
  <img src="https://github.com/user-attachments/assets/f9c92b41-cf4b-4343-a97b-80551fbb6997" style="width: 200px;" />
</section>


<section id="conclusion">
  <h2>Conclusion</h2>
  <p>
   Budget Tracker Lens represents a practical, human-centered assistive technology designed to empower visually impaired individuals with enhanced perception, awareness, and independence. By integrating ESP32-CAM based edge processing with an intelligent mobile application, the system provides essential features such as scene description, object recognition, text reading, and situational navigation without heavy dependence on cloud services. Its modular design, low-cost hardware, and real-time audio feedback make it both accessible and scalable for everyday use. Ultimately, Budget Tracker Lens demonstrates how affordable innovation, thoughtful engineering, and user-centric design can work together to significantly improve the quality of life for people with vision impairments.
  </p>
</section>



<section id = "team">
  <h2> The Team </h2>
  <h3> Suhas Varna </h3>
<p align="left">
  <a href="https://github.com/Suhas-Varna" style="text-decoration: none;" target="_blank" rel="nofollow">
    <img src="https://img.shields.io/badge/GitHub-black?style=flat&logo=github" alt="GitHub" style="max-width: 100%;">
  </a>
  <a href="https://www.linkedin.com/in/suhas-varna2003/" style="text-decoration: none;" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-blue?style=flat&logo=linkedin" alt="LinkedIn" />
  </a>
</p>

<h3> Seeripi Ganesh Kumar  </h3>
<p align="left">
  <a href="" style="text-decoration: none;" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-black?style=flat&logo=github" alt="GitHub" />
  </a>
  <a href="" style="text-decoration: none;" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-blue?style=flat&logo=linkedin" alt="LinkedIn" />
  </a>
</p>

<h3> Vikas D H </h3>
<p align="left">
  <a href="" style="text-decoration: none;" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-black?style=flat&logo=github" alt="GitHub" />
  </a>
  <a href="" style="text-decoration: none;" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-blue?style=flat&logo=linkedin" alt="LinkedIn" />
  </a>
</p>

<h3> Sanjay J </h3>
<p align="left">
  <a href="" style="text-decoration: none;" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-black?style=flat&logo=github" alt="GitHub" />
  </a>
  <a href="" style="text-decoration: none;" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-blue?style=flat&logo=linkedin" alt="LinkedIn" />
  </a>
</p>
</section>
