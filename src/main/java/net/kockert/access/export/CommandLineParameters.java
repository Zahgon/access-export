/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package net.kockert.access.export;

import com.beust.jcommander.Parameter;
import java.util.*;

public class CommandLineParameters {

    @Parameter(description = "<source> <target>")
    private List<String> parameters = new ArrayList<>();

    @Parameter(names = { "-h", "--help" }, help = true, description = "display usage instructions")
    private boolean help;

    @Parameter(names = { "-t", "--tables" }, description = "tables to export, comma-separated")
    private List<String> tablesToExport = Collections.emptyList();

    @Parameter(names = { "-f", "--format" }, description = "export format: 'sqlite' or 'csv'")
    private String format = "sqlite";

    public List<String> getParameters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean helpRequested() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Set<String> getTablesToExport() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean hasTablesToExport() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ExportFormat getFormat() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean insufficientParameters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
