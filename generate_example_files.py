import os

EQ = "CLEVER/examples/eq/"
NEQ = "CLEVER/examples/neq/"


def load_examples():
    eq = os.listdir(EQ)
    neq = os.listdir(NEQ)

    return [eq, neq]


def generate_example_files(folders, isEq):
    prefix = "eq" if isEq else "neq"
    for folder in folders:
        os.mkdir(f"examples/{prefix}/{folder}")
        with open(f"examples/{prefix}/{folder}/{folder.capitalize()}_1c.java", "w") as f:
            f.writelines([f"package {prefix}.{folder};\n", f"class {folder.capitalize()}_1c {{}}"])


def generate_symex(folders_eq, folders_neq):
  with open("params.java", "w") as f:
    for folder in folders_eq:
      f.write(f'public static final SymExParameter {folder.capitalize()}_EQ = new SymExParameter("${{jpf-shadow}}/build/jpf-shadow.jar","${{jpf-shadow}}/src/examples", "eq.{folder}", "{folder.capitalize()}", "METHODNAME", "METHOD_SIG()", 1, "","evaluation-results/{folder.capitalize()}_EQ/shadow-results/", null);\n\n')
    for folder in folders_neq:
      f.write(f'public static final SymExParameter {folder.capitalize()}_NEQ = new SymExParameter("${{jpf-shadow}}/build/jpf-shadow.jar","${{jpf-shadow}}/src/examples", "neq.{folder}", "{folder.capitalize()}", "METHODNAME", "METHOD_SIG()", 1, "","evaluation-results/{folder.capitalize()}_NEQ/shadow-results/", null);\n\n')
      


def main():
    eq, neq = load_examples()
    try:
        os.mkdir("examples")
    except FileExistsError:
        pass
    try:
        os.mkdir("examples/eq")
    except FileExistsError:
        pass
    try:
        os.mkdir("examples/neq")
    except FileExistsError:
        pass
    generate_example_files(eq, True)
    generate_example_files(neq, False)
    generate_symex(eq, neq)

if __name__ == "__main__":
    main()
