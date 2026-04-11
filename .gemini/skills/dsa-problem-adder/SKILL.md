---
name: dsa-problem-adder
description: Automates the process of adding a new DSA problem implementation and documentation to the repository. Use when a user provides a solution for a specific problem (e.g., LeetCode 42) and wants it integrated into the project following GEMINI.md standards.
---

# DSA Problem Adder

This skill automates the integration of a new Data Structures and Algorithms (DSA) problem into the repository. It ensures consistency across directory structures, file naming, documentation, indexes, and global stats.

## Mandatory Research Phase (Think Before Act)

Before writing any code, you MUST:
1.  **Read `GEMINI.md`**: Foundational mandates take absolute precedence.
2.  **Determine Category**: Map the problem to an existing directory (e.g., `Arrays`, `LinkedList`, `Tree`). If it's a new category, prepare to create the directory and a new `README.md`.
3.  **Assign next ID**:
    - Check the latest ID used in the target category by reading its `README.md` or `PROBLEMS.md`.
    - Use the next logical sequence number (usually incremental).
4.  **Confirm File Paths**:
    - Directory: `[Category]/[ProblemName]/`
    - Java: `[ProblemName]_[ID]_Java.java`
    - Docs: `[ProblemName]_[ID].md`

## Implementation Phase

### 1. Java Solution
- Create the file at `[Category]/[ProblemName]/[ProblemName]_[ID]_Java.java`.
- **MUST** include a `main` method with multiple test cases to verify the implementation.
- Use clean, idiomatic Java (`camelCase` for methods/vars, `PascalCase` for classes).
- Reference [template-java.md](./references/template-java.md) for structure.

### 2. Documentation
- Create the file at `[Category]/[ProblemName]/[ProblemName]_[ID].md`.
- Follow the structure in [template-doc.md](./references/template-doc.md).
- Include: Problem Statement, Approach & Intuition, Complexity Analysis (Big O), Edge Cases, and Common Mistakes.

## Update Phase (Integrity Check)

You must update the following files to maintain repository consistency:
1.  **Global Index (`PROBLEMS.md`)**: Append the new problem to the table.
2.  **Category Index (`[Category]/README.md`)**: Add the problem to the category-specific table.
3.  **Global Stats (`README.md`)**: Increment the "Total Problems Solved" count.

## Verification Phase

**Validation is mandatory.**
1.  **Compile & Run**: Execute `java [Path/To/Solution].java`.
2.  **Verify Output**: Ensure all test cases in the `main` method output "PASSED". If any fail, fix the implementation before proceeding.
3.  **Check Links**: Verify that all new links in `PROBLEMS.md` and category `README.md` correctly point to the files.

## Source Control Phase

1.  **Stage Files**: `git add` only the files created or modified for this specific problem.
2.  **Final Review**: Run `git status` and `git diff --staged` to confirm the changes.
3.  **Commit**: Use a professional message: `feat: add [ProblemName] ([SourceID]) using [Method]`.
4.  **Push**: `git push origin main`.

## Quality Guardrails
- **Self-Correction**: If a category is missing, create it with a standard `README.md` following the pattern of others.
- **Complexity First**: Always prioritize and document the most optimal time and space complexity.
- **No Hacks**: Avoid suppressing warnings or using non-idiomatic Java.
- **Consistency**: Ensure indentation and formatting match the rest of the project.
