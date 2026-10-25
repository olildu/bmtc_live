package app.chalo.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HtmlParserKt {
    public static final HtmlTag a(String tag) {
        HtmlTag.INSTANCE.getClass();
        Intrinsics.i(tag, "tag");
        int iHashCode = tag.hashCode();
        if (iHashCode != 98) {
            if (iHashCode != 105) {
                if (iHashCode != 112) {
                    if (iHashCode != 115) {
                        if (iHashCode == 117 && tag.equals(ApsMetricsDataMap.APSMETRICS_FIELD_URL)) {
                            return HtmlTag.UNDERLINE;
                        }
                    } else if (tag.equals("s")) {
                        return HtmlTag.STRIKE;
                    }
                } else if (tag.equals("p")) {
                    return HtmlTag.NORMAL;
                }
            } else if (tag.equals(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT)) {
                return HtmlTag.ITALIC;
            }
        } else if (tag.equals("b")) {
            return HtmlTag.BOLD;
        }
        return HtmlTag.UNKNOWN;
    }
}
