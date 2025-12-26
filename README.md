# 🛡️ ModdingMinecraft

**A Fabric mod for Minecraft that introduces Light Iron - a new lightweight material with special effects!**

[![Minecraft Version](https://img.shields.io/badge/Minecraft-1.21.11-blue.svg)](https://www.minecraft.net/)
[![Fabric](https://img.shields.io/badge/Fabric-0.139.4%2B1.21.11-lightblue.svg)](https://fabricmc.net/)
[![License](https://img.shields.io/badge/License-CC0--1.0-green.svg)](LICENSE)

## ✨ Main Features

### 🔧 New Material: Light Iron
- **Light Iron Ore**: A new ore that generates in the world
- **Raw Light Iron**: The raw ore obtained from mining the block
- **Light Iron Ingot**: The ingot obtained by smelting the raw ore

### 🛡️ Complete Armor Set
A lightweight armor with balanced stats and a special ability:
- **Light Iron Helmet**
- **Light Iron Chestplate**
- **Light Iron Leggings**
- **Light Iron Boots**

### ⚡ Special Effect
- **+20% Speed** when wearing the complete Light Iron armor set
- The effect automatically activates and deactivates when you add/remove pieces

### 🎨 Complete Integration
- Custom creative tab to organize mod items
- Crafting recipes for all items
- Smelting recipes to convert raw ore into ingots
- Complete translations in Italian and English
- Custom textures for all items and blocks

## 📋 Requirements

- **Minecraft**: 1.21.11
- **Fabric Loader**: 0.18.2+
- **Fabric API**: 0.139.4+
- **Java**: 21+

## 🚀 Installation

1. Make sure you have [Fabric](https://fabricmc.net/use/) installed
2. Download the mod JAR file from the [Releases](../../releases) section
3. Place the JAR file in your Fabric profile's `mods` folder
4. Launch Minecraft and enjoy!

## 🎮 How to Play

### Finding Light Iron Ore
Light Iron Ore generates naturally in the world. Look for it in these locations:
- **Height**: Y: -64 to Y: 32
- **Distribution**: Similar to iron, but slightly less common

### Crafting the Armor
1. **Smelt the ore**:
   ```
   Raw Light Iron → Light Iron Ingot (in a furnace)
   ```

2. **Create armor pieces** using ingots in the crafting table:
   - **Helmet**: 5 ingots in helmet pattern
   - **Chestplate**: 8 ingots in chestplate pattern
   - **Leggings**: 7 ingots in leggings pattern
   - **Boots**: 4 ingots in boots pattern

3. **Wear the complete set** to get +20% speed!

### Testing Commands
```minecraft
/give @s moddingminecraft:light_iron_ore
/give @s moddingminecraft:raw_light_iron
/give @s moddingminecraft:light_iron_ingot
/give @s moddingminecraft:light_iron_helmet
/give @s moddingminecraft:light_iron_chestplate
/give @s moddingminecraft:light_iron_leggings
/give @s moddingminecraft:light_iron_boots
```

## 🛠️ Development

### Development Environment Setup
1. Clone this repository
2. Make sure you have Java 21 installed
3. Run `./gradlew build` to compile the mod
4. For development: import the project in IntelliJ IDEA or Eclipse with Gradle support

### Project Structure
```
src/main/java/com/moddingminecraft/
├── ModdingMinecraft.java          # Main mod class
├── registry/                      # Centralized registries
│   ├── ItemRegistry.java         # Item registration
│   └── BlockRegistry.java        # Block registration
├── item/                         # Item classes
│   ├── blueprint/                # Reusable base classes
│   └── material/                 # Custom materials
├── block/                        # Block classes
├── effect/                       # Effect systems
├── init/                         # Component initialization
└── world/                        # World generation
```

### Build & Deploy
```bash
# Compile the mod
./gradlew build

# Deploy (if configured)
./deploy.sh

# Launch client for testing
./gradlew runClient
```

## 📖 API and Modding

This project is a great starting point to learn:
- **Item and block registration** in Fabric
- **Creating custom armor** with unique materials
- **Implementing status effects** based on equipment
- **World generation** for new ores
- **Crafting and smelting systems**
- **Multilingual translations**
- **Code organization** in complex Fabric projects

## 🤝 Contributing

Contributions welcome! Feel free to:
- Open issues for bugs or suggestions
- Create pull requests for improvements
- Fork the project for your own mods

## 📄 License

This project is distributed under the **CC0 1.0 Universal** license.
See the [LICENSE](LICENSE) file for complete details.

## 🙏 Credits

- **Developer**: Federico Germani
- **Inspiration**: Minecraft modding community
- **Framework**: [Fabric](https://fabricmc.net/) and [Minecraft Forge](https://mcforge.readthedocs.io/)

---

**Enjoy the Light Iron! ⚡🛡️**
