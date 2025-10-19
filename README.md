# 📱 Project 1: Simple Calculator App

## Objective
Create a **Simple Calculator App** that performs **Addition, Subtraction, Multiplication, Division, and Modulus** on two input numbers.

---

## Features & Flow

### 1. Splash Screen
- Displays **app name** and **developer name** for a short duration.  
- Automatically opens **Calculator screen** after the delay.

### 2. Main Screen (`CalculatorActivity`)
- Uses `TextInputLayout` + `TextInputEditText` for **two input numbers**.  
- **Calculate Button:**  
  - On click, performs all 5 operations:  
    - Addition  
    - Subtraction  
    - Multiplication  
    - Division  
    - Modulus  

- **Five TextViews** to display results.  
- Developer name/ID displayed at the bottom of the layout.

---

## Validation Rules
- Inputs **cannot be empty**.  
- Only **numeric input** allowed.  
- **Division/Modulus by zero** → show **Toast:** `"Division or Modulus by 0 not allowed."`  

---

## Example Output


---

## Tech Stack
- **Language:** Kotlin  
- **Platform:** Android Studio  
- **UI Components:** ConstraintLayout, TextInputLayout, TextInputEditText, Button, TextViews  
- **Navigation:** Intent (for Splash → Calculator screen)

---

## Screenshots


---

## Author
**MD Kajam-all Koraish**
