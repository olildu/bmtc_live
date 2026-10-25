package app.chalo.ads;

import android.content.Context;
import app.chalo.constants.Source;
import com.adster.sdk.mediation.AdError;
import com.adster.sdk.mediation.AdRequestConfiguration;
import com.adster.sdk.mediation.AdSterAdLoader;
import com.adster.sdk.mediation.InterstitialAdEventsListener;
import com.adster.sdk.mediation.MediationAdListener;
import com.adster.sdk.mediation.MediationInterstitialAd;
import defpackage.i71;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/DefaultExitInterstitialAdLoaderFactory;", "Lapp/chalo/ads/ExitInterstitialAdLoaderFactory;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultExitInterstitialAdLoaderFactory implements ExitInterstitialAdLoaderFactory {
    /* JADX WARN: Type inference failed for: r0v3, types: [app.chalo.ads.DefaultExitInterstitialAdLoaderFactory$create$1] */
    @Override // app.chalo.ads.ExitInterstitialAdLoaderFactory
    public final DefaultExitInterstitialAdLoaderFactory$create$1 a(final ExitInterstitialAdManager$createCallbacks$1 exitInterstitialAdManager$createCallbacks$1) {
        final AdSterAdLoader adSterAdLoaderBuild = AdSterAdLoader.INSTANCE.builder().withAdsListener(new MediationAdListener() { // from class: app.chalo.ads.DefaultExitInterstitialAdLoaderFactory$create$loader$1
            @Override // com.adster.sdk.mediation.AdListener
            public final void onFailure(AdError adError) {
                Intrinsics.i(adError, "adError");
                int errorCode = adError.getErrorCode();
                String errorMessage = adError.getErrorMessage();
                if (errorMessage == null) {
                    errorMessage = "";
                }
                String str = errorMessage;
                ExitInterstitialAdManager$createCallbacks$1 exitInterstitialAdManager$createCallbacks$2 = exitInterstitialAdManager$createCallbacks$1;
                ExitInterstitialAdManager.a(exitInterstitialAdManager$createCallbacks$2.f775a, errorCode, str, null, exitInterstitialAdManager$createCallbacks$2.c);
            }

            @Override // com.adster.sdk.mediation.MediationAdListener, com.adster.sdk.mediation.AdListener
            public final void onInterstitialAdLoaded(MediationInterstitialAd ad) {
                Object accepted;
                Intrinsics.i(ad, "ad");
                super.onInterstitialAdLoaded(ad);
                ExitInterstitialAdManager$createCallbacks$1 exitInterstitialAdManager$createCallbacks$2 = exitInterstitialAdManager$createCallbacks$1;
                SdkExitInterstitialLoadedAd sdkExitInterstitialLoadedAd = new SdkExitInterstitialLoadedAd(ad);
                ExitInterstitialAdManager exitInterstitialAdManager = exitInterstitialAdManager$createCallbacks$2.f775a;
                long j = exitInterstitialAdManager$createCallbacks$2.b;
                long j2 = exitInterstitialAdManager$createCallbacks$2.c;
                synchronized (exitInterstitialAdManager.j) {
                    try {
                        if (j2 != exitInterstitialAdManager.q) {
                            accepted = StaleLoadResolution.Stale.f827a;
                        } else {
                            ExitInterstitialLoadedAd exitInterstitialLoadedAd = exitInterstitialAdManager.r;
                            exitInterstitialAdManager.r = sdkExitInterstitialLoadedAd;
                            exitInterstitialAdManager.s = (Long) exitInterstitialAdManager.f.invoke();
                            exitInterstitialAdManager.n = false;
                            accepted = new StaleLoadResolution.Accepted(exitInterstitialLoadedAd);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (accepted instanceof StaleLoadResolution.Stale) {
                    String message = "load success ignored reason=stale_generation generation=" + j2;
                    Intrinsics.i(message, "message");
                    ExitInterstitialAdManager.c(sdkExitInterstitialLoadedAd, "stale_generation_loaded");
                    return;
                }
                ExitInterstitialLoadedAd exitInterstitialLoadedAd2 = ((StaleLoadResolution.Accepted) accepted).f826a;
                if (exitInterstitialLoadedAd2 != null) {
                    ExitInterstitialAdManager.c(exitInterstitialLoadedAd2, "replaced_loaded_ad");
                }
                long jLongValue = ((Number) exitInterstitialAdManager.f.invoke()).longValue() - j;
                ExitInterstitialAdManager.h(exitInterstitialAdManager, "ad loaded", MapsKt.h(new Pair("adLoadTime", Long.valueOf(jLongValue))), 2);
                StringBuilder sbG = i71.g(jLongValue, "load success loadTimeMs=", " generation=");
                sbG.append(j2);
                String message2 = sbG.toString();
                Intrinsics.i(message2, "message");
            }
        }).withInterstitialAdEventsListener(new InterstitialAdEventsListener() { // from class: app.chalo.ads.DefaultExitInterstitialAdLoaderFactory$create$loader$2
            @Override // com.adster.sdk.mediation.InterstitialAdEventsListener
            public final void onAdClicked() {
                ExitInterstitialAdManager$createCallbacks$1 exitInterstitialAdManager$createCallbacks$2 = exitInterstitialAdManager$createCallbacks$1;
                ExitInterstitialAdManager exitInterstitialAdManager = exitInterstitialAdManager$createCallbacks$2.f775a;
                long j = exitInterstitialAdManager$createCallbacks$2.c;
                Source source = ExitInterstitialAdManager.w;
                if (exitInterstitialAdManager.d(j)) {
                    ExitInterstitialAdManager.h(exitInterstitialAdManager, "ad clicked", null, 6);
                    return;
                }
                String message = "callback onAdClicked ignored reason=stale_generation generation=" + j;
                Intrinsics.i(message, "message");
            }

            @Override // com.adster.sdk.mediation.InterstitialAdEventsListener
            public final void onAdClosed() {
                CloseResolution accepted;
                ExitInterstitialAdManager$createCallbacks$1 exitInterstitialAdManager$createCallbacks$2 = exitInterstitialAdManager$createCallbacks$1;
                ExitInterstitialAdManager exitInterstitialAdManager = exitInterstitialAdManager$createCallbacks$2.f775a;
                long j = exitInterstitialAdManager$createCallbacks$2.c;
                synchronized (exitInterstitialAdManager.j) {
                    try {
                        if (j != exitInterstitialAdManager.q) {
                            String message = "callback onAdClosed ignored reason=stale_generation generation=" + j;
                            Intrinsics.i(message, "message");
                            accepted = CloseResolution.Ignored.f756a;
                        } else {
                            ExitInterstitialLoadedAd exitInterstitialLoadedAd = exitInterstitialAdManager.t;
                            if (exitInterstitialLoadedAd == null || !exitInterstitialAdManager.o) {
                                accepted = CloseResolution.Ignored.f756a;
                            } else {
                                exitInterstitialAdManager.t = null;
                                exitInterstitialAdManager.o = false;
                                exitInterstitialAdManager.p = false;
                                accepted = new CloseResolution.Accepted(exitInterstitialLoadedAd);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (accepted instanceof CloseResolution.Accepted) {
                    ExitInterstitialAdManager.c(((CloseResolution.Accepted) accepted).f755a, "closed");
                    exitInterstitialAdManager.k.mo7576trySendJP2dKIU(ExitInterstitialAdEvent.Closed.f772a);
                }
            }

            @Override // com.adster.sdk.mediation.InterstitialAdEventsListener
            public final void onAdImpression() {
                ExitInterstitialAdManager$createCallbacks$1 exitInterstitialAdManager$createCallbacks$2 = exitInterstitialAdManager$createCallbacks$1;
                ExitInterstitialAdManager exitInterstitialAdManager = exitInterstitialAdManager$createCallbacks$2.f775a;
                long j = exitInterstitialAdManager$createCallbacks$2.c;
                Source source = ExitInterstitialAdManager.w;
                if (exitInterstitialAdManager.d(j)) {
                    ExitInterstitialAdManager.h(exitInterstitialAdManager, "ad impression", null, 6);
                    return;
                }
                String message = "callback onAdImpression ignored reason=stale_generation generation=" + j;
                Intrinsics.i(message, "message");
            }

            @Override // com.adster.sdk.mediation.InterstitialAdEventsListener
            public final void onAdOpened() {
                boolean z;
                ExitInterstitialAdManager$createCallbacks$1 exitInterstitialAdManager$createCallbacks$2 = exitInterstitialAdManager$createCallbacks$1;
                ExitInterstitialAdManager exitInterstitialAdManager = exitInterstitialAdManager$createCallbacks$2.f775a;
                long j = exitInterstitialAdManager$createCallbacks$2.c;
                synchronized (exitInterstitialAdManager.j) {
                    try {
                        z = false;
                        if (j != exitInterstitialAdManager.q) {
                            String message = "callback onAdOpened ignored reason=stale_generation generation=" + j;
                            Intrinsics.i(message, "message");
                        } else if (exitInterstitialAdManager.t != null && exitInterstitialAdManager.o && !exitInterstitialAdManager.p) {
                            z = true;
                            exitInterstitialAdManager.p = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    ExitInterstitialAdManager.h(exitInterstitialAdManager, "ad rendered", null, 6);
                    exitInterstitialAdManager.k.mo7576trySendJP2dKIU(ExitInterstitialAdEvent.Opened.f773a);
                }
            }

            @Override // com.adster.sdk.mediation.InterstitialAdEventsListener
            public final void onAdRevenuePaid(double d, String adUnitId, String network) {
                Intrinsics.i(adUnitId, "adUnitId");
                Intrinsics.i(network, "network");
                ExitInterstitialAdManager$createCallbacks$1 exitInterstitialAdManager$createCallbacks$2 = exitInterstitialAdManager$createCallbacks$1;
                ExitInterstitialAdManager exitInterstitialAdManager = exitInterstitialAdManager$createCallbacks$2.f775a;
                long j = exitInterstitialAdManager$createCallbacks$2.c;
                String str = exitInterstitialAdManager.h;
                if (!exitInterstitialAdManager.d(j)) {
                    String message = "callback onAdRevenuePaid ignored reason=stale_generation generation=" + j;
                    Intrinsics.i(message, "message");
                    return;
                }
                exitInterstitialAdManager.g("ad paid impression", StringsKt.F(adUnitId) ? str : adUnitId, MapsKt.i(new Pair("valueMicros", Long.valueOf(MathKt.g(1000000.0d * d))), new Pair("currencyCode", "USD"), new Pair("network", network)));
                if (StringsKt.F(adUnitId)) {
                    adUnitId = str;
                }
                String message2 = "callback onAdRevenuePaid adUnitId=" + ((Object) adUnitId) + " network=" + network + " revenueUsd=" + d;
                Intrinsics.i(message2, "message");
            }
        }).build();
        return new ExitInterstitialAdLoader() { // from class: app.chalo.ads.DefaultExitInterstitialAdLoaderFactory$create$1
            @Override // app.chalo.ads.ExitInterstitialAdLoader
            public final void a(Context context, String placementName, Map targeting) {
                Intrinsics.i(context, "context");
                Intrinsics.i(placementName, "placementName");
                Intrinsics.i(targeting, "targeting");
                AdRequestConfiguration.Builder builder = AdRequestConfiguration.Companion.builder(context, placementName);
                for (Map.Entry entry : targeting.entrySet()) {
                    builder.addCustomTargetingValue((String) entry.getKey(), (String) entry.getValue());
                }
                adSterAdLoaderBuild.loadAd(builder.build());
            }
        };
    }
}
