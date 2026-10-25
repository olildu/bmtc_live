package app.chalo.ads;

import app.chalo.utils.chalologger.ChaloLog;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/AdsterFixedBannerTargetingHelper;", "Lorg/koin/core/component/KoinComponent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AdsterFixedBannerTargetingHelper implements KoinComponent {
    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) throws Throwable {
        AdsterFixedBannerTargetingHelper$buildTargeting$1 adsterFixedBannerTargetingHelper$buildTargeting$1;
        Object objA;
        if (continuationImpl instanceof AdsterFixedBannerTargetingHelper$buildTargeting$1) {
            adsterFixedBannerTargetingHelper$buildTargeting$1 = (AdsterFixedBannerTargetingHelper$buildTargeting$1) continuationImpl;
            int i = adsterFixedBannerTargetingHelper$buildTargeting$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adsterFixedBannerTargetingHelper$buildTargeting$1.label = i - Integer.MIN_VALUE;
            } else {
                adsterFixedBannerTargetingHelper$buildTargeting$1 = new AdsterFixedBannerTargetingHelper$buildTargeting$1(this, continuationImpl);
            }
        } else {
            adsterFixedBannerTargetingHelper$buildTargeting$1 = new AdsterFixedBannerTargetingHelper$buildTargeting$1(this, continuationImpl);
        }
        Object obj = adsterFixedBannerTargetingHelper$buildTargeting$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = adsterFixedBannerTargetingHelper$buildTargeting$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                throw null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            objA = (Map) obj;
            Throwable thA = Result.a(objA);
            if (thA == null) {
                return objA;
            }
            if (thA instanceof CancellationException) {
                throw thA;
            }
            ChaloLog.c("AdsterFixedBannerAd", "Failed to build ad targeting", thA);
            return MapsKt.d();
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
    }
}
