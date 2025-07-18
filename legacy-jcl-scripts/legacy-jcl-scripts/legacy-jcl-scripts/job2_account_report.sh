#!/bin/bash

echo "[INFO] Running Account Report Job"

# Simulated DB call or API output
cat <<EOF
+----+----------+----------+
| ID | Name     | Balance  |
+----+----------+----------+
| 1  | Priya    | 1025.00  |
| 2  | Arjun    | 785.50   |
| 3  | Kavya    | 1643.75  |
+----+----------+----------+
EOF

echo "[INFO] Report generation complete"
