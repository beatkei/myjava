interface DebugPrintable {
    // interface でもフィールド宣言できるがそれは自動的にstaticでfinalとなる
    enum Type {
        NO_ERROR, FILE_ERROR, MEMORY_ERROR,
    };
    String PREFIX = "ERROR";
    void debugPrint();
}
