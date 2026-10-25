package app.chalo.ads;

import app.chalo.utils.chalologger.ChaloLog;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/AdsterUnifiedAdTargetingHelper;", "Lorg/koin/core/component/KoinComponent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AdsterUnifiedAdTargetingHelper implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f731a = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<AdTargetingProvider>() { // from class: app.chalo.ads.AdsterUnifiedAdTargetingHelper$special$$inlined$inject$default$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KoinComponent koinComponent = this;
            return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(AdTargetingProvider.class), null, null);
        }
    });

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    public final Object a(ContinuationImpl continuationImpl) throws Throwable {
        AdsterUnifiedAdTargetingHelper$buildTargeting$1 adsterUnifiedAdTargetingHelper$buildTargeting$1;
        Object objA;
        if (continuationImpl instanceof AdsterUnifiedAdTargetingHelper$buildTargeting$1) {
            adsterUnifiedAdTargetingHelper$buildTargeting$1 = (AdsterUnifiedAdTargetingHelper$buildTargeting$1) continuationImpl;
            int i = adsterUnifiedAdTargetingHelper$buildTargeting$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adsterUnifiedAdTargetingHelper$buildTargeting$1.label = i - Integer.MIN_VALUE;
            } else {
                adsterUnifiedAdTargetingHelper$buildTargeting$1 = new AdsterUnifiedAdTargetingHelper$buildTargeting$1(this, continuationImpl);
            }
        } else {
            adsterUnifiedAdTargetingHelper$buildTargeting$1 = new AdsterUnifiedAdTargetingHelper$buildTargeting$1(this, continuationImpl);
        }
        Object objA2 = adsterUnifiedAdTargetingHelper$buildTargeting$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = adsterUnifiedAdTargetingHelper$buildTargeting$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA2);
                AdTargetingProvider adTargetingProvider = (AdTargetingProvider) this.f731a.getValue();
                adsterUnifiedAdTargetingHelper$buildTargeting$1.label = 1;
                objA2 = adTargetingProvider.a(MapsKt.d(), adsterUnifiedAdTargetingHelper$buildTargeting$1);
                if (objA2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA2);
            }
            objA = (Map) objA2;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA == null) {
            return objA;
        }
        if (thA instanceof CancellationException) {
            throw thA;
        }
        ChaloLog.c("AdsterUnifiedAd", "Failed to build ad targeting", thA);
        return MapsKt.d();
    }
}
