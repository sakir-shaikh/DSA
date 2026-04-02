# Project: DSA (Data Structures & Algorithms) Interview Preparation

This repository is a structured collection of Data Structures and Algorithms (DSA) implementations in Java, designed for interview preparation and mastering core engineering principles.

## Project Overview

- **Main Technology:** Java
- **Documentation:** Markdown (`.md`)
- **Structure:** Problems are organized by topic (e.g., `Arrays`, `LinkedList`, `Tree`, `Graph`, `Strings`).
- **Components:** Each problem typically consists of:
    - A Java implementation file (`[ProblemName]_[ID]_Java.java`).
    - A detailed documentation file (`[ProblemName]_[ID].md`) covering problem statement, approach, complexity analysis, and edge cases.

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
- **Class Structure:** Use a `public class Solution` or a descriptive class name.
- **Testing:** Always include a `public static void main(String[] args)` method with sample test cases to verify the implementation.
- **Naming:** Follow standard Java `camelCase` for variables and methods, and `PascalCase` for classes.
- **Complexity:** Always prioritize the most optimal time and space complexity. Document these clearly in the associated `.md` file.

### Documentation Standards
Each `.md` file must include:
- **Problem Statement:** Clear description and constraints.
- **Approach & Intuition:** Step-by-step logic, including visual examples if helpful.
- **Complexity Analysis:** Explicit Big O notation for Time and Space.
- **Edge Cases:** List of scenarios the solution handles.
- **Common Mistakes:** Pitfalls to avoid during implementation or interviews.

## Workflow: Adding a New Problem

When adding a new problem, follow these specific steps to ensure consistency:

1.  **Check Category:** Determine the most relevant category (e.g., `Strings`, `Arrays`). If it doesn't exist, create it.
2.  **Assign ID:** Check the latest ID used in that category or globally. Use the next logical sequence number.
3.  **Create Directory:** `mkdir [Category]/[ProblemName]`
4.  **Implementation:**
    - Create `[ProblemName]_[ID]_Java.java`.
    - Ensure it includes a `main` method for verification.
    - Avoid unnecessary packages unless specified.
5.  **Documentation:**
    - Create `[ProblemName]_[ID].md`.
    - Follow the template: Statement, Approach, Complexity, Edge Cases, Mistakes.
6.  **Update Indexes & Stats:**
    - **Global Index:** Append the new problem to `PROBLEMS.md` in the root directory. Format: `| [ProblemName] | [Category] | Java | [Doc Link] |`.
    - **Category Index:** Add the problem to the table in `[Category]/README.md`, ensuring it matches the ID and links correctly.
    - **Global Stats:** Increment the "Total Problems Solved" count in the root `README.md`.
7.  **Verification:**
    - Compile and run the Java file to ensure all test cases pass.
    - Check that all Markdown links in `PROBLEMS.md` and `[Category]/README.md` are correct.
