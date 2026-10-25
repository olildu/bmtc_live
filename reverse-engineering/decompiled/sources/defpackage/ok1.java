package defpackage;

import androidx.media3.common.DataReader;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class ok1 {
    public static int a(TrackOutput trackOutput, DataReader dataReader, int i, boolean z) {
        return trackOutput.sampleData(dataReader, i, z, 0);
    }

    public static void b(TrackOutput trackOutput, ParsableByteArray parsableByteArray, int i) {
        trackOutput.sampleData(parsableByteArray, i, 0);
    }
}
