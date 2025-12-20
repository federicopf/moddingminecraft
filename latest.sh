#!/bin/bash

# Script to copy the latest Minecraft log to the project directory
# Usage: ./latest.sh

MINECRAFT_LOGS_DIR="/mnt/c/Users/Asus/AppData/Roaming/.minecraft/logs"
PROJECT_DIR="/mnt/c/Users/Asus/Desktop/moddingminecraft"
LATEST_LOG="$MINECRAFT_LOGS_DIR/latest.log"

if [ ! -f "$LATEST_LOG" ]; then
    echo "Error: latest.log not found in $MINECRAFT_LOGS_DIR"
    exit 1
fi

# Remove old log file if it exists
if [ -f "$PROJECT_DIR/latest.log" ]; then
    rm "$PROJECT_DIR/latest.log"
fi

cp "$LATEST_LOG" "$PROJECT_DIR/latest.log"
echo "Latest Minecraft log copied to $PROJECT_DIR/latest.log"
