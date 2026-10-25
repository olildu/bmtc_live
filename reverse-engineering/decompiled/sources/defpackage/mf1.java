package defpackage;

import androidx.media3.common.util.Consumer;
import androidx.media3.extractor.text.CuesWithTimingSubtitle;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.ImmutableList;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class mf1 {
    public static void a(SubtitleParser subtitleParser, byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        subtitleParser.parse(bArr, 0, bArr.length, outputOptions, consumer);
    }

    public static Subtitle b(SubtitleParser subtitleParser, byte[] bArr, int i, int i2) {
        ImmutableList.Builder builderI = ImmutableList.i();
        subtitleParser.parse(bArr, i, i2, SubtitleParser.OutputOptions.ALL, new os0(builderI, 19));
        return new CuesWithTimingSubtitle(builderI.j());
    }

    public static void c(SubtitleParser subtitleParser) {
    }
}
