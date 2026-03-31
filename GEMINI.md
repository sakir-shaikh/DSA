# Project: DSA (Data Structures & Algorithms) Interview Preparation

This repository is a structured collection of Data Structures and Algorithms (DSA) implementations in Java, designed for interview preparation and mastering core engineering principles.

## Project Overview

- **Main Technology:** Java
- **Documentation:** Markdown (`.md`)
- **Structure:** Problems are organized by topic (e.g., `Arrays`, `LinkedList`, `Tree`, `Graph`).
- **Components:** Each problem typically consists of:
    - A Java implementation file (`[ProblemName]_[ID]_Java.java`).
    - A detailed documentation file (`[ProblemName]_[ID].md`) covering problem statement, approach, complexity analysis, and edge cases.
- **Goals:** Algorithmic efficiency (Time/Space complexity), clean and idiomatic code, and systematic problem-solving.

## Building and Running

The Java implementations are designed as standalone files. Many include a `main` method for direct testing.

### Prerequisites
- Java Development Kit (JDK) installed and configured in your environment.

### Commands

- **Compile and Run a specific problem:**
  ```powershell
  # Navigate to the problem directory (e.g., Arrays/BinarySearch)
  cd Arrays/BinarySearch
  # Compile the Java file
  javac BinarySearch_1_Java.java
  # Run the compiled class
  java BinarySearch_1_Java
  ```
- **Alternative (Java 11+):** Run directly without explicit compilation step:
  ```powershell
  java Arrays/BinarySearch/BinarySearch_1_Java.java
  ```

## Development Conventions

### File Structure & Naming
- **Directory:** `[Category]/[ProblemName]/`
- **Code:** `[ProblemName]_[ID]_Java.java` (ID is a sequence number or identifier).
- **Docs:** `[ProblemName]_[ID].md`

### Coding Standards
- **Class Structure:** Most problems use a `Solution` class or a descriptive class name.
- **Testing:** Include a `public static void main(String[] args)` method with sample test cases to verify the implementation.
- **Naming:** Follow standard Java `camelCase` for variables and methods, and `PascalCase` for classes.
- **Complexity:** Always prioritize the most optimal time and space complexity. Document these clearly in the associated `.md` file.

### Documentation Standards
Each `.md` file must include:
- **Problem Statement:** Clear description and constraints.
- **Approach & Intuition:** Step-by-step logic, including visual examples if helpful.
- **Complexity Analysis:** Explicit Big O notation for Time and Space.
- **Edge Cases:** List of scenarios the solution handles (e.g., empty input, single element).
- **Common Mistakes:** Pitfalls to avoid during implementation or interviews.

## Adding a New Problem
1. Identify the appropriate category (or create a new one).
2. Create a subfolder for the problem.
3. Add the Java implementation following the naming convention.
4. Add the Markdown documentation file.
5. Update `PROBLEMS.md` in the root directory to include the new problem.
