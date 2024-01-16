import subprocess
import matplotlib.pyplot as plt

def run_java_program(w_value):
    command = ["java", "intruder", str(w_value), "0.5"]
    result = subprocess.run(command, capture_output=True, text=True)
    return int(result.stdout.strip().split()[-1])

def main():
    w_values = list(range(10, 91))
    counts = [run_java_program(w) for w in w_values]
    print(counts)
    Plotting
    plt.plot(w_values, counts, marker='o', linestyle='-')
    plt.title('Count vs. w')
    plt.xlabel('w')
    plt.ylabel('Count')
    plt.grid(True)
    plt.show()

if __name__ == "__main__":
    main()
