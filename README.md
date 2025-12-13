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
  <li> <a href = "#tech_used"> TechStack Used </a></li>
  <li> <a href = "#architecture"> System Architecture </a></li>
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


<section id="tech_used">
  <h2> TechStack - Built With
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java" height="20" style="vertical-align: middle;"/>
    <img src="https://cdn-icons-png.flaticon.com/512/4248/4248443.png" alt="JDBC" height="20" style="vertical-align: middle;"/>
    <img src="https://maven.apache.org/images/maven-logo-black-on-white.png" alt="Maven" height="20" style="vertical-align: middle;"/>
    <img src="https://cdn-icons-png.flaticon.com/512/702/702814.png" alt="CLI" height="20" style="vertical-align: middle;"/>
  </h2>

  <p><strong>Java</strong><br>Core language for building the app’s logic.</p>
   <p><strong>JDBC</strong><br>Manages database connectivity and queries.</p>
   <p><strong>SQLite</strong><br>Stores user data and transaction records.</p>
    <p><strong>Maven</strong><br>Build automation and dependency management.</p>
    <p><strong>Command-Line UI</strong><br>Lightweight and fast user interface.</p>
</section>


<section id="architecture">
  <h2>🧩 System Architecture</h2>

  <h3>🏗️ High-Level Architecture:</h3>

<pre>
┌───────────────────────────────────────────────────────────┐
│                     BUDGET TRACKER APP                    │
│                                                           │
│   ┌──────────────┐   ┌────────────────────┐               │
│   │  Home Screen │ → │  Add Expense Form  │               │
│   └──────────────┘   └────────────────────┘               │
│             ↓                     ↓                       │
│   ┌────────────────┐   ┌──────────────────────┐           │
│   │ Expense Module │   │ Category Management  │           │
│   │ • Add/Update   │   │ • Create/Edit/Delete │           │
│   │ • Delete       │   │ • Icons/Colors       │           │
│   └────────────────┘   └──────────────────────┘           │
│                     ↓                                     │
│           ┌───────────────────────────┐                   │
│           │ Local Database (SQLite)   │                   │
│           │ • Expense Records         │                   │
│           │ • Category Records        │                   │
│           └───────────────────────────┘                   │
└───────────────────────────────────────────────────────────┘
</pre>

  <h3>📊 Data Flow Diagram:</h3>

<pre>
USER INPUT (Add Expense / Edit / Delete)
            │
            ▼
┌─────────────────────────────────────┐
│          UI Layer                   │
│ • Form Validation                   │
│ • Input Formatting                  │
└───────────────────────┬─────────────┘
                        │
                        ▼
┌────────────────────────────────────┐
│         Service Layer              │
│ • Handles CRUD operations          │
│ • Converts data into models        │
└───────────────────────┬────────────┘
                        │
                        ▼
┌─────────────────────────────────────┐
│          DAO / Repository           │
│ • Interacts with SQLite             │
│ • Executes Queries                  │
└───────────────────────┬─────────────┘
                        │
                        ▼
┌─────────────────────────────────────┐
│         SQLite Database             │
│ • Stores expenses, categories       │
│ • Ensures persistent local data     │
└─────────────────────────────────────┘
</pre>


  <h3>🔐 Security & Data Handling</h3>

<ul>
  <li><strong>Local Storage Only</strong>  
    • No external API calls  
    • User expenses remain on the device
  </li>

  <li><strong>SQLite + DAO Layer</strong>  
    • Secure and isolated database  
    • Prevents invalid writes & corrupted data
  </li>

  <li><strong>Validation & Error Handling</strong>  
    • Safe input handling  
    • Avoids crashes and database inconsistencies
  </li>
</ul>


  <h3>⚡ Performance Optimizations</h3>

<ul>
  <li><strong>Efficient State Management</strong>  
    • Minimal rebuilds  
    • Smooth UI transitions
  </li>

  <li><strong>Optimized SQLite Queries</strong>  
    • Fast reads  
    • Batch inserts for large expense imports
  </li>

  <li><strong>Lazy Rendering</strong>  
    • Loads expenses only when needed  
    • Improves performance in large lists
  </li>
</ul>

</section>




<section id="conclusion">
  <h2>Conclusion</h2>
  <p>
   Budget Tracker provides a simple, efficient, and organized way to manage personal finances by combining intuitive UI, secure local storage, and powerful tracking tools. With features like expense categorization, monthly budgeting, real-time analytics, and a smooth Flutter-powered experience, it empowers users to stay financially aware and make informed decisions. Its lightweight architecture, fast performance, and offline functionality make it a reliable daily companion for anyone aiming to build better financial habits and maintain full control over their expenses.
  </p>
</section>



<section id = "team">
  <h2>Developed by</h2>
  <h3> Suhas Varna </h3>
<p align="left">
  <a href="https://github.com/Suhas-Varna" style="text-decoration: none;" target="_blank" rel="nofollow">
    <img src="https://img.shields.io/badge/GitHub-black?style=flat&logo=github" alt="GitHub" style="max-width: 100%;">
  </a>
  <a href="https://www.linkedin.com/in/suhas-varna2003/" style="text-decoration: none;" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-blue?style=flat&logo=linkedin" alt="LinkedIn" />
  </a>
</p>
</section>
