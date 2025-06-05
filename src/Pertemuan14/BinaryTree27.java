package Pertemuan14;

public class BinaryTree27 {
    Node27 root;

    public BinaryTree27() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa27 mahasiswa) {
        Node27 newNode = new Node27(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node27 current = root;
            Node27 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else { 
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node27 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk < current.mahasiswa.ipk) { 
                current = current.left;
            } else { 
                current = current.right;
            }
        }
        return result;
    }

    public void traversePreOrder(Node27 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node27 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node27 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    public Node27 getSuccessor(Node27 del) {
        Node27 successor = del.right;
        Node27 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        Node27 parent = root;
        Node27 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node27 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = "); 
                successor.mahasiswa.tampilInformasi();      
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
    private Node27 addRekursif(Node27 current, Mahasiswa27 mahasiswa) {
        if (current == null) {
            return new Node27(mahasiswa);
        }

        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        } else if (mahasiswa.ipk >= current.mahasiswa.ipk) { 
            current.right = addRekursif(current.right, mahasiswa);
        }
        return current;
    }

    public void addRekursif(Mahasiswa27 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }

    public Mahasiswa27 cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree masih kosong!");
            return null;
        }
        Node27 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.print("Mahasiswa dengan IPK terkecil: ");
        current.mahasiswa.tampilInformasi();
        return current.mahasiswa;
    }

    public Mahasiswa27 cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree masih kosong!");
            return null;
        }
        Node27 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.print("Mahasiswa dengan IPK terbesar: ");
        current.mahasiswa.tampilInformasi();
        return current.mahasiswa;
    }
    
    private void tampilMahasiswaIPKdiAtasHelper(Node27 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtasHelper(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtasHelper(node.right, ipkBatas);
        }
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        if (isEmpty()) {
            System.out.println("Tree masih kosong!");
            return;
        }
        System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilMahasiswaIPKdiAtasHelper(root, ipkBatas);
    }
}