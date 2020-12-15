/* Copyright (c) 2008-2015, Avian Contributors

   Permission to use, copy, modify, and/or distribute this software
   for any purpose with or without fee is hereby granted, provided
   that the above copyright notice and this permission notice appear
   in all copies.

   There is NO WARRANTY for this software.  See license.txt for
   details. */

package java.util.jar;

import java.util.zip.ZipEntry;

public abstract class JarEntry extends ZipEntry {
    public JarEntry(String name) {
        super(name);
    }

    public JarEntry(JarEntry je) {
        super(je);
    }

    public JarEntry(ZipEntry ze) {
        super(ze);
    }
}
