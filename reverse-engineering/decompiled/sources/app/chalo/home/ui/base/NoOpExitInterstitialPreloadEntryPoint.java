package app.chalo.home.ui.base;

import app.chalo.ads.ExitInterstitialPreloadEntryPoint;
import app.chalo.ads.ExitInterstitialTargetingKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/NoOpExitInterstitialPreloadEntryPoint;", "Lapp/chalo/ads/ExitInterstitialPreloadEntryPoint;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class NoOpExitInterstitialPreloadEntryPoint implements ExitInterstitialPreloadEntryPoint {
    @Override // app.chalo.ads.ExitInterstitialPreloadEntryPoint
    public final void a(ExitInterstitialTargetingKey targetingKey) {
        Intrinsics.i(targetingKey, "targetingKey");
    }
}
