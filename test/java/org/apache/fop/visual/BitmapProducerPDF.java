/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* $Id$ */

package org.apache.fop.visual;

import java.net.URI;

import org.apache.fop.apps.MimeConstants;

/**
 * BitmapProducer implementation that uses the PDFRenderer and an external converter
 * to create bitmaps.
 * <p>
 * See the superclass' javadoc for info on the configuration format.
 */
public class BitmapProducerPDF extends AbstractPSPDFBitmapProducer {

    /**
     * Default constructor.
     */
    public BitmapProducerPDF(URI baseUri) {
        super(baseUri);
        this.targetFormat = MimeConstants.MIME_PDF;
    }

    /** {@inheritDoc} */
    protected String getTargetExtension() {
        return "pdf";
    }

}
