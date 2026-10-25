package app.chalo.ads;

import android.content.Context;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ads/NativeInlineAdPrefetchEntryPointAndroid;", "Lapp/chalo/ads/NativeInlineAdPrefetchEntryPoint;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NativeInlineAdPrefetchEntryPointAndroid implements NativeInlineAdPrefetchEntryPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContextProvider f816a;
    public final AndroidNativeInlineAdPrefetcher b;
    public final AdTargetingProvider c;
    public final GetMiscellaneousCityWiseFlagsConfigUseCase d;
    public final Context e;
    public final ContextScope f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/ads/NativeInlineAdPrefetchEntryPointAndroid$Companion;", "", "", "TAG", "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public NativeInlineAdPrefetchEntryPointAndroid(Context context, CoroutineContextProvider coroutineContextProvider, AndroidNativeInlineAdPrefetcher androidNativeInlineAdPrefetcher, AdTargetingProvider adTargetingProvider, GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase) {
        this.f816a = coroutineContextProvider;
        this.b = androidNativeInlineAdPrefetcher;
        this.c = adTargetingProvider;
        this.d = getMiscellaneousCityWiseFlagsConfigUseCase;
        this.e = context.getApplicationContext();
        this.f = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.d((JobSupport) SupervisorKt.b(), coroutineContextProvider.a()));
    }

    @Override // app.chalo.ads.NativeInlineAdPrefetchEntryPoint
    public final void b() {
        BuildersKt.d(this.f, null, null, new NativeInlineAdPrefetchEntryPointAndroid$prefetchRouteDetailsNativeInline$1("home_component_started", this, null), 3);
    }
}
