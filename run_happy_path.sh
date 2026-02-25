#!/bin/bash

cd /Users/luispersonal/mkrs-btg-tests

# Ejecutar tests
./gradlew test \
  -Dserenity.take.screenshots=FOR_FAILURES \
  -Dserenity.test.root=org.btg.practual \
  --info 2>&1 | tee test_output.log

echo "Test execution completed"
echo "Check test_output.log for full output"
