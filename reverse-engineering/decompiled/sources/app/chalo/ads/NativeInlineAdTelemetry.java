package app.chalo.ads;

import app.chalo.utils.chalologger.ChaloLog;
import com.google.android.gms.ads.nativead.NativeAd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/NativeInlineAdTelemetry;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NativeInlineAdTelemetry {
    public static void a(String str, Long l, String str2, NativeInlineAdSlot nativeInlineAdSlot, String str3, NativeAd nativeAd, String str4, int i) {
        b((i & 1) != 0 ? "NativeInlineAd" : "NativeInlineAdPrefetch", str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : nativeInlineAdSlot, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : nativeAd, false, (i & 128) != 0 ? null : str4);
    }

    public static void b(String str, String str2, Long l, String str3, NativeInlineAdSlot nativeInlineAdSlot, String str4, NativeAd nativeAd, boolean z, String str5) {
        StringBuilder sb = new StringBuilder("event=");
        sb.append(str2);
        if (l != null) {
            long jLongValue = l.longValue();
            sb.append(" requestId=");
            sb.append(jLongValue);
        }
        if (str4 != null) {
            sb.append(" source=");
            sb.append(str4);
        }
        if (str3 != null) {
            sb.append(" adUnitId=");
            sb.append(str3);
        }
        if (nativeInlineAdSlot != null) {
            sb.append(" slot=");
            sb.append(nativeInlineAdSlot);
        }
        if (nativeAd != null) {
            sb.append(" adId=");
            sb.append(System.identityHashCode(nativeAd));
        }
        if (str5 != null && !StringsKt.F(str5)) {
            sb.append(" ");
            sb.append(str5);
        }
        String message = sb.toString();
        if (z) {
            ChaloLog.c(str, message, null);
        } else {
            Intrinsics.i(message, "message");
        }
    }

    public static void c(String str, Long l, String str2, NativeInlineAdSlot nativeInlineAdSlot, String str3, NativeAd nativeAd, String str4, int i) {
        b((i & 1) != 0 ? "NativeInlineAd" : "NativeInlineAdPrefetch", str, (i & 4) != 0 ? null : l, str2, (i & 16) != 0 ? null : nativeInlineAdSlot, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : nativeAd, true, str4);
    }
}
