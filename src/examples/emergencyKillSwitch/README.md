# Homework: The "Emergency Kill Switch"

## 📝 The Business Scenario
A security breach has been detected in your corporate network. A specific malware is spreading via physical LAN ports in your branch offices.

The CISO (Chief Information Security Officer) has ordered the immediate isolation of infected ports across the network.

**The Problem:**
We have a list of specific network interfaces that need to be administratively shut down **immediately**.
* Some switches are **Cisco IOS**. To shut down a port there, you typically send: `interface <port_id>` followed by `shutdown`.
* Some switches are **Juniper Junos**. To shut down a port there, you typically send: `set interfaces <port_id> disable`.

**The Requirement:**
The Network Operations Center (NOC) needs a Java tool where they can input a **Target Interface** (which consists of a Switch IP, the Port Name, and the Switch Brand) and the tool executes the lockdown.

The NOC manager wants to be able to script this. They might say:
*"Lock down Port Gi0/1 on the Cisco switch at 192.168.1.50"*
and then immediately say:
*"Lock down Port ge-0/0/1 on the Juniper switch at 10.0.0.5"*

The system handles the syntax differences. The NOC manager just hits "Kill".
