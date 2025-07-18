#!/bin/bash

echo "[INFO] Starting Interest Calculation Job"

# Call the REST API to apply interest (mocked URL)
curl -X POST http://localhost:8080/api/interest

echo "[INFO] Interest calculation job completed."
