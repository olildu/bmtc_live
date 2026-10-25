package app.chalo.ads;

import android.content.Context;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import app.chalo.providers.CoroutineContextProvider;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import defpackage.b3;
import defpackage.j4;
import defpackage.pk0;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/ads/AndroidNativeInlineAdPrefetcherImpl;", "Lapp/chalo/ads/AndroidNativeInlineAdPrefetcher;", "Key", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidNativeInlineAdPrefetcherImpl implements AndroidNativeInlineAdPrefetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f745a;
    public final ContextScope b;
    public final Object c = new Object();
    public final LinkedHashMap d = new LinkedHashMap();
    public final IdentityHashMap e = new IdentityHashMap();
    public final AdPrefetchStore f = new AdPrefetchStore(new b(this));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/ads/AndroidNativeInlineAdPrefetcherImpl$Companion;", "", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_TTL_MILLIS", "J", "", "DEFAULT_MAX_ENTRIES", "I", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/AndroidNativeInlineAdPrefetcherImpl$Key;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Key {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f746a;
        public final Map b;
        public final List c;

        public Key(String adUnitId, Map targeting) {
            Intrinsics.i(adUnitId, "adUnitId");
            Intrinsics.i(targeting, "targeting");
            this.f746a = adUnitId;
            this.b = targeting;
            Set<Map.Entry> setEntrySet = targeting.entrySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.v(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                String string = StringsKt.u0((String) entry.getKey()).toString();
                Locale locale = Locale.ROOT;
                arrayList.add(new Pair(b3.i(locale, "ROOT", string, locale, "toLowerCase(...)"), StringsKt.u0((String) entry.getValue()).toString()));
            }
            this.c = CollectionsKt.v0(new AndroidNativeInlineAdPrefetcherImpl$Key$special$$inlined$sortedBy$1(), arrayList);
        }

        public final String a() {
            List list = this.c;
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Pair) it.next()).d());
            }
            return "adUnitId=" + this.f746a + " targetingKeys=" + arrayList + " targetingHash=" + list.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            if (Intrinsics.d(this.f746a, key.f746a)) {
                return Intrinsics.d(this.c, key.c);
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.f746a.hashCode() * 31);
        }

        public final String toString() {
            return "Key(adUnitId=" + this.f746a + ", targeting=" + this.b + ")";
        }
    }

    public AndroidNativeInlineAdPrefetcherImpl(Context context, CoroutineContextProvider coroutineContextProvider) {
        this.f745a = context.getApplicationContext();
        this.b = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.d((JobSupport) SupervisorKt.b(), coroutineContextProvider.a()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public static final Object e(final AndroidNativeInlineAdPrefetcherImpl androidNativeInlineAdPrefetcherImpl, final String str, Map map, ContinuationImpl continuationImpl) {
        AndroidNativeInlineAdPrefetcherImpl$loadNativeAd$1 androidNativeInlineAdPrefetcherImpl$loadNativeAd$1;
        androidNativeInlineAdPrefetcherImpl.getClass();
        if (continuationImpl instanceof AndroidNativeInlineAdPrefetcherImpl$loadNativeAd$1) {
            androidNativeInlineAdPrefetcherImpl$loadNativeAd$1 = (AndroidNativeInlineAdPrefetcherImpl$loadNativeAd$1) continuationImpl;
            int i = androidNativeInlineAdPrefetcherImpl$loadNativeAd$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidNativeInlineAdPrefetcherImpl$loadNativeAd$1.label = i - Integer.MIN_VALUE;
            } else {
                androidNativeInlineAdPrefetcherImpl$loadNativeAd$1 = new AndroidNativeInlineAdPrefetcherImpl$loadNativeAd$1(androidNativeInlineAdPrefetcherImpl, continuationImpl);
            }
        } else {
            androidNativeInlineAdPrefetcherImpl$loadNativeAd$1 = new AndroidNativeInlineAdPrefetcherImpl$loadNativeAd$1(androidNativeInlineAdPrefetcherImpl, continuationImpl);
        }
        Object objQ = androidNativeInlineAdPrefetcherImpl$loadNativeAd$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidNativeInlineAdPrefetcherImpl$loadNativeAd$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objQ);
                try {
                    AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
                    AdRequestExtensionsKt.a(builder, map);
                    AdManagerAdRequest adManagerAdRequestBuild = builder.build();
                    Intrinsics.h(adManagerAdRequestBuild, "build(...)");
                    final CompletableDeferred completableDeferredC = CompletableDeferredKt.c();
                    final AtomicReference atomicReference = new AtomicReference(null);
                    AdLoader adLoaderBuild = new AdLoader.Builder(androidNativeInlineAdPrefetcherImpl.f745a, str).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).build()).forNativeAd(new j4(0, str, atomicReference, completableDeferredC)).withAdListener(new AdListener() { // from class: app.chalo.ads.AndroidNativeInlineAdPrefetcherImpl$loadNativeAd$loader$2
                        @Override // com.google.android.gms.ads.AdListener
                        public final void onAdClicked() {
                            AndroidNativeInlineAdPrefetcher.InteractionListener interactionListener;
                            NativeAd nativeAd = (NativeAd) atomicReference.get();
                            if (nativeAd == null) {
                                return;
                            }
                            AndroidNativeInlineAdPrefetcherImpl androidNativeInlineAdPrefetcherImpl2 = androidNativeInlineAdPrefetcherImpl;
                            synchronized (androidNativeInlineAdPrefetcherImpl2.c) {
                                interactionListener = (AndroidNativeInlineAdPrefetcher.InteractionListener) androidNativeInlineAdPrefetcherImpl2.e.get(nativeAd);
                            }
                            if (interactionListener == null) {
                                return;
                            }
                            try {
                                interactionListener.a();
                            } catch (Throwable th) {
                                ResultKt.a(th);
                            }
                        }

                        @Override // com.google.android.gms.ads.AdListener
                        public final void onAdFailedToLoad(LoadAdError adError) {
                            Intrinsics.i(adError, "adError");
                            NativeInlineAdTelemetry.c("prefetch_sdk_load_failed", null, str, null, null, null, pk0.g(adError.getCode(), "code=", " message=", adError.getMessage()), AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                            completableDeferredC.complete(null);
                        }

                        @Override // com.google.android.gms.ads.AdListener
                        public final void onAdImpression() {
                            AndroidNativeInlineAdPrefetcher.InteractionListener interactionListener;
                            NativeAd nativeAd = (NativeAd) atomicReference.get();
                            if (nativeAd == null) {
                                return;
                            }
                            AndroidNativeInlineAdPrefetcherImpl androidNativeInlineAdPrefetcherImpl2 = androidNativeInlineAdPrefetcherImpl;
                            synchronized (androidNativeInlineAdPrefetcherImpl2.c) {
                                interactionListener = (AndroidNativeInlineAdPrefetcher.InteractionListener) androidNativeInlineAdPrefetcherImpl2.e.get(nativeAd);
                            }
                            if (interactionListener == null) {
                                return;
                            }
                            try {
                                interactionListener.b();
                            } catch (Throwable th) {
                                ResultKt.a(th);
                            }
                        }
                    }).build();
                    Intrinsics.h(adLoaderBuild, "build(...)");
                    try {
                        adLoaderBuild.loadAd(adManagerAdRequestBuild);
                        try {
                            androidNativeInlineAdPrefetcherImpl$loadNativeAd$1.L$0 = str;
                            androidNativeInlineAdPrefetcherImpl$loadNativeAd$1.L$1 = map;
                            androidNativeInlineAdPrefetcherImpl$loadNativeAd$1.label = 1;
                            objQ = completableDeferredC.q(androidNativeInlineAdPrefetcherImpl$loadNativeAd$1);
                            if (objQ == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } catch (CancellationException e) {
                            throw e;
                        }
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        String message = "event=prefetch_loadAd_throw adUnitId=" + str + " targetingKeys=" + map.keySet();
                        Intrinsics.i(message, "message");
                        return null;
                    }
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable unused2) {
                    String message2 = "event=prefetch_loadNativeAd_throw adUnitId=" + str + " targetingKeys=" + map.keySet();
                    Intrinsics.i(message2, "message");
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.b(objQ);
                } catch (CancellationException e4) {
                    throw e4;
                }
            }
            return (NativeAd) objQ;
        } catch (Throwable unused3) {
        }
    }

    @Override // app.chalo.ads.AndroidNativeInlineAdPrefetcher
    public final NativeAd a(String adUnitId, Map targeting) {
        NativeAd nativeAd;
        Intrinsics.i(adUnitId, "adUnitId");
        Intrinsics.i(targeting, "targeting");
        Key key = new Key(adUnitId, targeting);
        synchronized (this.c) {
            nativeAd = (NativeAd) AdPrefetchStore.a(this.f, key);
        }
        if (nativeAd != null) {
            NativeInlineAdTelemetry.a("prefetch_consume", null, null, null, "hit", nativeAd, key.a(), 28);
            return nativeAd;
        }
        NativeInlineAdTelemetry.a("prefetch_consume", null, null, null, "miss", null, key.a(), 92);
        return nativeAd;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // app.chalo.ads.AndroidNativeInlineAdPrefetcher
    public final Object b(String str, Map map, ContinuationImpl continuationImpl) {
        AndroidNativeInlineAdPrefetcherImpl$awaitThenConsume$1 androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1;
        Key key;
        NativeAd nativeAd;
        CompletableDeferred completableDeferred;
        Key key2;
        String str2 = str;
        Map map2 = map;
        if (continuationImpl instanceof AndroidNativeInlineAdPrefetcherImpl$awaitThenConsume$1) {
            androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1 = (AndroidNativeInlineAdPrefetcherImpl$awaitThenConsume$1) continuationImpl;
            int i = androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1.label = i - Integer.MIN_VALUE;
            } else {
                androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1 = new AndroidNativeInlineAdPrefetcherImpl$awaitThenConsume$1(this, continuationImpl);
            }
        } else {
            androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1 = new AndroidNativeInlineAdPrefetcherImpl$awaitThenConsume$1(this, continuationImpl);
        }
        Object obj = androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            key2 = (Key) androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1.L$2;
            Map map3 = (Map) androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1.L$1;
            String str3 = (String) androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1.L$0;
            try {
                ResultKt.b(obj);
                key = key2;
                map2 = map3;
                str2 = str3;
                NativeInlineAdTelemetry.a("prefetch_await_then_consume", null, null, null, "done", null, key.a(), 92);
                return a(str2, map2);
            } catch (CancellationException e) {
                e = e;
                if (JobKt.h(androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1.getF16340a())) {
                    throw e;
                }
                NativeInlineAdTelemetry.a("prefetch_await_then_consume", null, null, null, "cancelled_in_flight", null, key2.a(), 92);
                return null;
            }
        }
        ResultKt.b(obj);
        key = new Key(str2, map2);
        synchronized (this.c) {
            nativeAd = (NativeAd) AdPrefetchStore.a(this.f, key);
        }
        if (nativeAd != null) {
            NativeInlineAdTelemetry.a("prefetch_await_then_consume", null, null, null, "ready_hit", nativeAd, key.a(), 28);
            return nativeAd;
        }
        synchronized (this.c) {
            completableDeferred = (CompletableDeferred) this.d.get(key);
        }
        if (completableDeferred == null) {
            NativeInlineAdTelemetry.a("prefetch_await_then_consume", null, null, null, "no_in_flight", null, key.a(), 92);
            return null;
        }
        NativeInlineAdTelemetry.a("prefetch_await_then_consume", null, null, null, "awaiting", null, key.a(), 92);
        try {
            androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1.L$0 = str2;
            androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1.L$1 = map2;
            androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1.L$2 = key;
            androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1.label = 1;
            if (completableDeferred.q(androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            NativeInlineAdTelemetry.a("prefetch_await_then_consume", null, null, null, "done", null, key.a(), 92);
            return a(str2, map2);
        } catch (CancellationException e2) {
            e = e2;
            key2 = key;
            if (JobKt.h(androidNativeInlineAdPrefetcherImpl$awaitThenConsume$1.getF16340a())) {
                throw e;
            }
            NativeInlineAdTelemetry.a("prefetch_await_then_consume", null, null, null, "cancelled_in_flight", null, key2.a(), 92);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    @Override // app.chalo.ads.AndroidNativeInlineAdPrefetcher
    public final void c(String adUnitId, Map targeting) throws Throwable {
        ?? ContainsKey;
        Intrinsics.i(adUnitId, "adUnitId");
        Intrinsics.i(targeting, "targeting");
        Map mapR = MapsKt.r(targeting);
        Key key = new Key(adUnitId, mapR);
        NativeInlineAdTelemetry.a("prefetch_requested", null, null, null, null, null, key.a(), 124);
        Object obj = this.c;
        synchronized (obj) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                AdPrefetchStore adPrefetchStore = this.f;
                adPrefetchStore.getClass();
                adPrefetchStore.b(jCurrentTimeMillis);
                boolean zContainsKey = adPrefetchStore.c.containsKey(key);
                ContainsKey = this.d.containsKey(key);
                try {
                    if (!zContainsKey && ContainsKey == 0) {
                        NativeInlineAdTelemetry.a("prefetch_start", null, null, null, null, null, key.a(), 124);
                        CompletableDeferred completableDeferredC = CompletableDeferredKt.c();
                        this.d.put(key, completableDeferredC);
                        BuildersKt.d(this.b, null, null, new AndroidNativeInlineAdPrefetcherImpl$prefetch$1(key, this, adUnitId, mapR, completableDeferredC, null), 3);
                        return;
                    }
                    String str = zContainsKey ? "ready" : "in_flight";
                    NativeInlineAdTelemetry.a("prefetch_coalesced", null, null, null, null, null, "reason=" + str + " " + key.a(), 124);
                    return;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                ContainsKey = obj;
            }
            throw th;
        }
    }

    @Override // app.chalo.ads.AndroidNativeInlineAdPrefetcher
    public final void d(NativeAd ad, NativeInlineAdKt$NativeInlineAd$4$1$bindLoadedAd$6 nativeInlineAdKt$NativeInlineAd$4$1$bindLoadedAd$6) {
        Intrinsics.i(ad, "ad");
        synchronized (this.c) {
            try {
                if (nativeInlineAdKt$NativeInlineAd$4$1$bindLoadedAd$6 == null) {
                    this.e.remove(ad);
                } else {
                    this.e.put(ad, nativeInlineAdKt$NativeInlineAd$4$1$bindLoadedAd$6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
