// generated by tscfg 0.3.3 on Thu Sep 01 11:12:22 PDT 2016
// source: example/issue5.conf

package tscfg.example;

public class JavaIssue5Cfg {
  public final Foo foo;
  public static class Foo {
    public final Config config;
    public static class Config {
      public final java.lang.String bar;
      public Config(com.typesafe.config.Config c) {
        this.bar = c != null && c.hasPathOrNull("bar") ? c.getString("bar") : "baz";
      }
      public java.lang.String toString() { return toString(""); }
      public java.lang.String toString(java.lang.String i) {
        return i+ "bar = " + this.bar + "\n";
      }
    }
    public Foo(com.typesafe.config.Config c) {
      this.config = new Config(__$config(c, "config"));
    }
    public java.lang.String toString() { return toString(""); }
    public java.lang.String toString(java.lang.String i) {
      return i+ "config {\n" + this.config.toString(i+"    ") +i+ "}\n";
    }
  }
  public JavaIssue5Cfg(com.typesafe.config.Config c) {
    this.foo = new Foo(__$config(c, "foo"));
  }
  public java.lang.String toString() { return toString(""); }
  public java.lang.String toString(java.lang.String i) {
    return i+ "foo {\n" + this.foo.toString(i+"    ") +i+ "}\n";
  }
  private static com.typesafe.config.Config __$config(com.typesafe.config.Config c, java.lang.String path) {
    return c != null && c.hasPath(path) ? c.getConfig(path) : null;
  }
}