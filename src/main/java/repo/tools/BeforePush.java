package repo.tools;

import repo.tools.internal.ReadmeBuilder;

import java.io.File;
import java.io.IOException;
import java.net.URL;


public class BeforePush {
    public static void main(String[] args) throws IOException {
        new ReadmeBuilder(new File("README.md")).buildToc();
    }
}
