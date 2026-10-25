package app.chalo.ads;

import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/NativeInlineAdPrefetchDependencies;", "Lorg/koin/core/component/KoinComponent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class NativeInlineAdPrefetchDependencies implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f813a;
    public final Object b;

    public NativeInlineAdPrefetchDependencies() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.f813a = LazyKt.a(lazyThreadSafetyMode, new Function0<GetMiscellaneousCityWiseFlagsConfigUseCase>() { // from class: app.chalo.ads.NativeInlineAdPrefetchDependencies$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(GetMiscellaneousCityWiseFlagsConfigUseCase.class), null, null);
            }
        });
        this.b = LazyKt.a(lazyThreadSafetyMode, new Function0<AndroidNativeInlineAdPrefetcher>() { // from class: app.chalo.ads.NativeInlineAdPrefetchDependencies$special$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(AndroidNativeInlineAdPrefetcher.class), null, null);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final AndroidNativeInlineAdPrefetcher a() {
        return (AndroidNativeInlineAdPrefetcher) this.b.getValue();
    }
}
