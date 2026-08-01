import re
import matplotlib.pyplot as plt

with open("README.md", "r", encoding="utf-8") as f:
    content = f.read()

completed = len(re.findall(r"\[x\]", content, re.IGNORECASE))
remaining = len(re.findall(r"\[ \]", content))

plt.figure(figsize=(6,6))
plt.pie(
    [completed, remaining],
    labels=["Solved", "Remaining"],
    colors=["green", "red"],   # Green for solved, Red for remaining
    autopct="%1.1f%%",
    startangle=90              # Optional: starts chart from the top
)

plt.title("DSA Progress")
plt.savefig("progress.png")