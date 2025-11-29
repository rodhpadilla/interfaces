# The Multi-Cloud Backup Agent

## 📝 Scenario
Your DevOps team is struggling to manage configuration files. Currently, they have scripts scattered everywhere to save these files, and it's a mess.

They need a centralized Java system to handle this.

**The Data:**
The system deals with **Configuration Files**. A file consists simply of a **Filename** (e.g., "nginx.conf") and its **Content** (text).

**The Storage Strategies:**
The team currently supports two storage locations, but they might add more later (like Azure or Google Cloud), so the system must be extensible.
1.  **Local Disk:** The legacy team needs the system to simulate writing the file to the hard drive path `/var/backups`.
2.  **AWS S3:** The cloud team needs the system to simulate uploading the file to an S3 Bucket.

**The Workflow:**
There is a central **Backup Manager**. When an admin gives this manager a configuration file, the manager should save it using whatever storage strategy was configured at startup. The manager shouldn't care if it's saving to Disk or Cloud; it just hits "Save."
