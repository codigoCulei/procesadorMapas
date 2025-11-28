#!/bin/bash

# Define the output file name
OUTPUT_FILE="all_java_code.txt"

# Clear the output file if it already exists, or create a new one
> "$OUTPUT_FILE"

# Find all .java files and concatenate their contents to the output file
find . -name "*.java" -exec cat {} + >> "$OUTPUT_FILE"

echo "All .java file contents have been concatenated into '$OUTPUT_FILE'."
