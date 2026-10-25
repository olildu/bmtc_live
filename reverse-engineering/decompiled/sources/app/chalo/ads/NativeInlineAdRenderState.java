package app.chalo.ads;

import com.google.android.gms.ads.nativead.NativeAd;
import defpackage.r30;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/NativeInlineAdRenderState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class NativeInlineAdRenderState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f817a;
    public final NativeInlineAdLoadSource b;
    public final NativeInlineAdLifecycleFlags c;
    public final NativeAd d;
    public final NativeMediaAspectRatioCategory e;
    public final NativeInlineContentLayout f;
    public final NativeAdLayoutCache.Key g;
    public final NativeAdLayoutCache.CachedSize h;
    public final float i;
    public final LinkedHashMap j;
    public final NativeInlineAdAnalyticsMetadata k;

    public NativeInlineAdRenderState(long j, NativeInlineAdLoadSource nativeInlineAdLoadSource, NativeInlineAdLifecycleFlags nativeInlineAdLifecycleFlags, NativeAd nativeAd, NativeMediaAspectRatioCategory nativeMediaAspectRatioCategory, NativeInlineContentLayout layout, NativeAdLayoutCache.Key key, NativeAdLayoutCache.CachedSize cachedSize, float f, LinkedHashMap linkedHashMap, NativeInlineAdAnalyticsMetadata nativeInlineAdAnalyticsMetadata) {
        Intrinsics.i(layout, "layout");
        this.f817a = j;
        this.b = nativeInlineAdLoadSource;
        this.c = nativeInlineAdLifecycleFlags;
        this.d = nativeAd;
        this.e = nativeMediaAspectRatioCategory;
        this.f = layout;
        this.g = key;
        this.h = cachedSize;
        this.i = f;
        this.j = linkedHashMap;
        this.k = nativeInlineAdAnalyticsMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeInlineAdRenderState)) {
            return false;
        }
        NativeInlineAdRenderState nativeInlineAdRenderState = (NativeInlineAdRenderState) obj;
        return this.f817a == nativeInlineAdRenderState.f817a && this.b == nativeInlineAdRenderState.b && this.c.equals(nativeInlineAdRenderState.c) && this.d.equals(nativeInlineAdRenderState.d) && this.e == nativeInlineAdRenderState.e && this.f == nativeInlineAdRenderState.f && this.g.equals(nativeInlineAdRenderState.g) && Intrinsics.d(this.h, nativeInlineAdRenderState.h) && Float.compare(this.i, nativeInlineAdRenderState.i) == 0 && this.j.equals(nativeInlineAdRenderState.j) && this.k.equals(nativeInlineAdRenderState.k);
    }

    public final int hashCode() {
        long j = this.f817a;
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        NativeAdLayoutCache.CachedSize cachedSize = this.h;
        return ((this.j.hashCode() + r30.a(this.i, (iHashCode + (cachedSize == null ? 0 : cachedSize.hashCode())) * 31, 31)) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "NativeInlineAdRenderState(requestId=" + this.f817a + ", loadSource=" + this.b + ", lifecycleFlags=" + this.c + ", nativeAd=" + this.d + ", aspectRatioCategory=" + this.e + ", layout=" + this.f + ", cacheKey=" + this.g + ", cachedSize=" + this.h + ", mediaAspectRatio=" + this.i + ", additionalInfo=" + this.j + ", analyticsMetadata=" + this.k + ")";
    }
}
