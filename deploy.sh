#!/usr/bin/env bash
set -euo pipefail

# cartella mods di Minecraft Windows (Fabric)
WIN_MODS="/mnt/c/Users/Asus/AppData/Roaming/.minecraft/mods"

echo "Building mod..."
./gradlew build

JAR=$(ls -t build/libs/*.jar | grep -vE '(sources|javadoc)' | head -n 1)

if [ -z "$JAR" ]; then
  echo "ERROR: no jar found in build/libs"
  exit 1
fi

echo "Deploying $(basename "$JAR") to Minecraft mods folder"
cp -f "$JAR" "$WIN_MODS/"

echo "✅ Done"
