package app.chalo.ads;

import com.google.android.gms.ads.nativead.NativeAd;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidNativeInlineAdPrefetcherImpl f858a;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AndroidNativeInlineAdPrefetcherImpl androidNativeInlineAdPrefetcherImpl = this.f858a;
        AndroidNativeInlineAdPrefetcherImpl.Key key = (AndroidNativeInlineAdPrefetcherImpl.Key) obj;
        NativeAd ad = (NativeAd) obj2;
        AdPrefetchStore.EvictionReason reason = (AdPrefetchStore.EvictionReason) obj3;
        Intrinsics.i(key, "key");
        Intrinsics.i(ad, "ad");
        Intrinsics.i(reason, "reason");
        NativeInlineAdTelemetry.a("prefetch_evict", null, null, null, null, ad, "reason=" + reason + " " + key.a(), 60);
        synchronized (androidNativeInlineAdPrefetcherImpl.c) {
        }
        try {
            ad.destroy();
        } catch (Throwable th) {
            ResultKt.a(th);
        }
        return Unit.f17538a;
    }
}
