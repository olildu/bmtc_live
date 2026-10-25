package app.chalo.ads;

import defpackage.nf1;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/NativeInlineAdAnalyticsMetadata;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class NativeInlineAdAnalyticsMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f806a;
    public final NativeInlineAdSlot b;
    public final boolean c;
    public final String d;
    public final NativeMediaAspectRatioCategory e;
    public final float f;

    public NativeInlineAdAnalyticsMetadata(String adUnitId, NativeInlineAdSlot slot, boolean z, String loadSource, NativeMediaAspectRatioCategory nativeMediaAspectRatioCategory, float f) {
        Intrinsics.i(adUnitId, "adUnitId");
        Intrinsics.i(slot, "slot");
        Intrinsics.i(loadSource, "loadSource");
        this.f806a = adUnitId;
        this.b = slot;
        this.c = z;
        this.d = loadSource;
        this.e = nativeMediaAspectRatioCategory;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeInlineAdAnalyticsMetadata)) {
            return false;
        }
        NativeInlineAdAnalyticsMetadata nativeInlineAdAnalyticsMetadata = (NativeInlineAdAnalyticsMetadata) obj;
        return Intrinsics.d(this.f806a, nativeInlineAdAnalyticsMetadata.f806a) && this.b == nativeInlineAdAnalyticsMetadata.b && this.c == nativeInlineAdAnalyticsMetadata.c && Intrinsics.d(this.d, nativeInlineAdAnalyticsMetadata.d) && this.e == nativeInlineAdAnalyticsMetadata.e && Float.compare(this.f, nativeInlineAdAnalyticsMetadata.f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f) + ((this.e.hashCode() + nf1.e((((this.b.hashCode() + (this.f806a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237)) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NativeInlineAdAnalyticsMetadata(adUnitId=");
        sb.append(this.f806a);
        sb.append(", slot=");
        sb.append(this.b);
        sb.append(", hasVideo=");
        pk0.x(", loadSource=", this.d, ", aspectRatioCategory=", sb, this.c);
        sb.append(this.e);
        sb.append(", mediaAspectRatio=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
