# Homework: The Multi-Vendor Network Manager

## 🎯 Objective
Build a flexible network automation tool that works with multiple vendors (Cisco & Juniper) without changing the core business logic.

**Key Learning Goal:** Master the "Holy Trinity" of Spring Boot architecture:
1.  **The Contract** (Interface)
2.  **The Bean** (Implementation)
3.  **The Service** (Consumer)

---

## 📋 Requirements

### 1. The Contract (The Interface)
**File:** `RouterDevice.java`

Define the "Universal Rules" that every router in your company must obey.
* **Method 1:** `void connect(String ipAddress)`
* **Method 2:** `void sendCommand(String command)`
* **Method 3:** `void disconnect()`

### 2. The Beans (The Implementations)
Create two distinct classes that "sign" the contract.

**File:** `CiscoRouter.java`
* **Behavior:**
    * `connect`: Print `[Cisco] Connecting to <ip> via SSH...`
    * `sendCommand`: Print `[Cisco-IOS] Executing: <command>`
    * `disconnect`: Print `[Cisco] Session ended.`

**File:** `JuniperRouter.java`
* **Behavior:**
    * `connect`: Print `[Juniper] Connecting to <ip> via NETCONF...`
    * `sendCommand`: Print `[Juniper-Junos] Executing: <command>`
    * `disconnect`: Print `[Juniper] Session ended.`

### 3. The Service (The Consumer)
**File:** `NetworkManagementService.java`

This is where your business logic lives. It should **not** know about "Cisco" or "Juniper" specifically.

* **State:** A `private final RouterDevice router;`
* **Constructor:** Inject the `RouterDevice` here. (This is **Dependency Injection**).
* **Method:** `public void performMaintenance(String ip)`
    * **Workflow:**
        1.  Connect to the IP.
        2.  Send command: `"show version"`
        3.  Send command: `"reload"`
        4.  Disconnect.

---

## 🧪 The Orchestration (Main)
**File:** `Main.java`

Prove that your Service is "Polymorphic".

1.  **Scenario A (Cisco):**
    * Create a `CiscoRouter` bean.
    * Inject it into a `new NetworkManagementService`.
    * Run maintenance on `"192.168.1.1"`.

2.  **Scenario B (Juniper):**
    * Create a `JuniperRouter` bean.
    * Inject it into a *new instance* of `NetworkManagementService`.
    * Run maintenance on `"10.0.0.1"`.

---

## 💡 Self-Check Questions
* Did `NetworkManagementService` have to change code to support Juniper? (Hint: It shouldn't).
* Which class represents the **"Contract"**?
* Which classes act as the **"Beans"**?