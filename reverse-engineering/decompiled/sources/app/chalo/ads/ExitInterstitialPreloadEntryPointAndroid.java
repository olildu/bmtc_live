package app.chalo.ads;

import app.chalo.providers.CoroutineContextProvider;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ads/ExitInterstitialPreloadEntryPointAndroid;", "Lapp/chalo/ads/ExitInterstitialPreloadEntryPoint;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExitInterstitialPreloadEntryPointAndroid implements ExitInterstitialPreloadEntryPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExitInterstitialAdManager f780a;
    public final ExitInterstitialConfigProvider b;
    public final ContextScope c;
    public final MutexImpl d = MutexKt.a();
    public ExitInterstitialTargetingKey e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/ads/ExitInterstitialPreloadEntryPointAndroid$Companion;", "", "", "TAG", "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ExitInterstitialPreloadEntryPointAndroid(ExitInterstitialAdManager exitInterstitialAdManager, ExitInterstitialConfigProvider exitInterstitialConfigProvider, CoroutineContextProvider coroutineContextProvider) {
        this.f780a = exitInterstitialAdManager;
        this.b = exitInterstitialConfigProvider;
        this.c = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.d((JobSupport) SupervisorKt.b(), coroutineContextProvider.a()));
    }

    @Override // app.chalo.ads.ExitInterstitialPreloadEntryPoint
    public final void a(ExitInterstitialTargetingKey targetingKey) {
        Intrinsics.i(targetingKey, "targetingKey");
        ExitInterstitialTargetingKey exitInterstitialTargetingKey = this.e;
        if (exitInterstitialTargetingKey != null && !exitInterstitialTargetingKey.equals(targetingKey)) {
            b(exitInterstitialTargetingKey, targetingKey);
        }
        BuildersKt.d(this.c, null, CoroutineStart.UNDISPATCHED, new ExitInterstitialPreloadEntryPointAndroid$onHomeTargetingReady$1(this, targetingKey, null), 1);
    }

    public final void b(ExitInterstitialTargetingKey exitInterstitialTargetingKey, ExitInterstitialTargetingKey exitInterstitialTargetingKey2) {
        String message = "entrypoint retargeting from=" + exitInterstitialTargetingKey + " to=" + exitInterstitialTargetingKey2;
        Intrinsics.i(message, "message");
        this.b.invalidate();
        this.f780a.i("targeting_change", "targeting_change_reset_loaded", "targeting_change_reset_showing");
        this.e = null;
    }
}
