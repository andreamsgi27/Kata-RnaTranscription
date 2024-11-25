package org.factoriaf5.rna_transcription;


public class RnaTranscription {
    
    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Implement method");
        char[] dnaChars = dnaStrand.toCharArray();
        char[] dnaTranscripted = new char[(dnaChars.length)];

        for (int i = 0; i < dnaChars.length; i++){
            if (dnaChars[i] == 'C') {
                dnaTranscripted[i] = 'G';
            } else if (dnaChars[i] == 'G') {
                dnaTranscripted[i] = 'C';
            } else if (dnaChars[i] == 'T') {
                dnaTranscripted[i] = 'A';
            } else if (dnaChars[i] == 'A') {
                dnaTranscripted[i] = 'U';
            } else {
                dnaTranscripted[i] = dnaChars[i];
            }
        }

        return new String(dnaTranscripted);
    }

}
