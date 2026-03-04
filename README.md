       _________ .__                                          
  ____ \_   ___ \|  |__ _____    ____    ____   ___________   
 /  _ \/    \  \/|  |  \\__  \  /    \  / ___\_/ __ \_  __ \  
(  <_> )     \___|   Y  \/ __ \|   |  \/ /_/  >  ___/|  | \/  
 \____/ \______  /___|  (____  /___|  /\___  / \___  >__| /\  
               \/     \/     \/     \//_____/      \/     \/  

---

# 🧨 OChanger

> Advanced Fireball & TNT Modifier for Spigot 1.8.9

OChanger is a lightweight Minecraft plugin that allows you to modify **fireball speed** and **TNT fuse time**, fully configurable via `config.yml`, with built-in world restriction support.

Designed for PvP-based and practice servers.

---

## ✨ Features

* 🔥 Configurable Fireball Speed Multiplier
* 💣 Custom TNT Fuse Time (in ticks)
* 🌍 World Restriction System
* ⚙ Fully Configurable via `config.yml`
* 🧱 Clean Project Architecture
* 🚀 Optimized for Spigot 1.8.9

---

## ⚙ Configuration

```yaml
fireball:
  speed-multiplier: 2.0

tnt:
  fuse-ticks: 40

disabled-worlds:
  - world
  - lobby
```

### Configuration Explanation

| Setting                     | Description                                             |
| --------------------------- | ------------------------------------------------------- |
| `speed-multiplier` | Multiplies the fireball velocity. `1.0` = default speed |
| `fuse-ticks`            | TNT fuse duration in ticks (20 ticks = 1 second)        |
| `disabled-worlds`           | List of worlds where modifiers will NOT apply           |

---

## 🛠 How It Works

* Listens to `ProjectileLaunchEvent` to modify fireball velocity
* Intercepts `TNTPrimed` spawn to adjust fuse ticks
* Applies world validation before modifying entities
* Uses clean utility-based architecture for scalability

---

## 📂 Project Structure

```
me.kayzhng.ochanger
│
├── Listeners
│   ├── FireballModifier
│   └── TNTModifier
│
├── Managers
│   └── CooldownManager
│
├── Utils
│   └── WorldUtils
│
└── OChanger (Main class)
```

---

## 📦 Installation

1. Download the compiled `.jar`
2. Place it in your server's `plugins/` folder
3. Restart the server
4. Edit `config.yml` as needed
5. Reload or restart the server

---

## 🎯 Recommended Use Cases

* Bedwars-style servers
* Practice PvP servers
* Custom TNT mechanics
* Experimental combat setups

---

## 🔧 Requirements

* Spigot 1.8.9
* Java 8

---

## 📜 Version

**Current Version:** 1.0 SNAPSHOT
**Minecraft Version:** 1.8.9

---

## 🚀 Future Plans

* /reload Commands

