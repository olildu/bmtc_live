package defpackage;

import android.os.Bundle;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.MediaItem;
import androidx.media3.common.StreamKey;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.MediaExtractorCompat;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.BundledExtractorsAdapter;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.mp4.Track;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.CuesWithTimingSubtitle;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multimaps;
import com.google.common.net.MediaType;
import java.util.Collection;
import org.apache.commons.io.IOUtils;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ld implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18303a;

    public /* synthetic */ ld(int i) {
        this.f18303a = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f18303a) {
            case 0:
                return BundledExtractorsAdapter.lambda$init$0((Extractor) obj);
            case 1:
                return ((Cue) obj).toSerializableBundle();
            case 2:
                return Cue.fromBundle((Bundle) obj);
            case 3:
                return ((Cue) obj).toBinderBasedBundle();
            case 4:
                return CuesWithTimingSubtitle.lambda$static$0((CuesWithTiming) obj);
            case 5:
                return ((TrackGroupArray) obj).toBundle();
            case 6:
                return ((DefaultTrackSelector.SelectionOverride) obj).toBundle();
            case 7:
                return TrackGroupArray.fromBundle((Bundle) obj);
            case 8:
                return DefaultTrackSelector.SelectionOverride.fromBundle((Bundle) obj);
            case 9:
                return new DefaultAnalyticsCollector((Clock) obj);
            case 10:
                return Label.fromBundle((Bundle) obj);
            case 11:
                return ((Label) obj).toBundle();
            case 12:
                return ((Iterable) obj).iterator();
            case 13:
                return MediaExtractorCompat.lambda$selectExtractor$0((Extractor) obj);
            case 14:
                return ((StreamKey) obj).toBundle();
            case 15:
                return ((MediaItem.SubtitleConfiguration) obj).toBundle();
            case 16:
                return StreamKey.fromBundle((Bundle) obj);
            case 17:
                return MediaItem.SubtitleConfiguration.fromBundle((Bundle) obj);
            case 18:
                String str = (String) obj;
                if (MediaType.g.n(str) && !str.isEmpty()) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(str.length() + 16);
                sb.append('\"');
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '\r' || cCharAt == '\\' || cCharAt == '\"') {
                        sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                    }
                    sb.append(cCharAt);
                }
                sb.append('\"');
                return sb.toString();
            case 19:
                return ImmutableMultiset.h((Collection) obj);
            case 20:
                return Mp4Extractor.lambda$processMoovAtom$2((Track) obj);
            case 21:
                return Multimaps.a((Collection) obj);
            case 22:
                return Timeline.Window.fromBundle((Bundle) obj);
            case 23:
                return Timeline.Period.fromBundle((Bundle) obj);
            case 24:
                return Format.fromBundle((Bundle) obj);
            case 25:
                return TrackGroupArray.lambda$getTrackTypes$0((TrackGroup) obj);
            case 26:
                return ((TrackGroup) obj).toBundle();
            case 27:
                return TrackGroup.fromBundle((Bundle) obj);
            case 28:
                return ((TrackSelectionOverride) obj).toBundle();
            default:
                return TrackSelectionOverride.fromBundle((Bundle) obj);
        }
    }
}
