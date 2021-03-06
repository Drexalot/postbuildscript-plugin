package org.jenkinsci.plugins.postbuildscript;

import hudson.Util;

/**
 * @author Gregory Boissinot
 */
@Deprecated
public class GroovyScript {

    private final String filePath;

    private final String content;

    public GroovyScript(String filePath, String content) {
        this.filePath = Util.fixEmpty(filePath);
        this.content = Util.fixEmpty(content);
    }

    @SuppressWarnings("unused")
    public String getFilePath() {
        return filePath;
    }

    @SuppressWarnings("unused")
    public String getContent() {
        return content;
    }
}
