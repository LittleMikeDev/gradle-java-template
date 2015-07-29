#!/bin/bash
rm -rf .git
git init
git add .
git rm --cached "$0"
git commit -m "Initial commit"
rm -- "$0"