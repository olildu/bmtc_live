package app.chalo.deeplink;

import app.chalo.contract.AppUsageTrackingContract;
import app.chalo.domain.FireAppOpenEventIfRequiredUseCase;
import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DefaultDeepLinkAppOpenTracker;", "Lapp/chalo/deeplink/DeepLinkAppOpenTracker;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultDeepLinkAppOpenTracker implements DeepLinkAppOpenTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FireAppOpenEventIfRequiredUseCase f2471a;
    public final AppUsageTrackingContract b;

    public DefaultDeepLinkAppOpenTracker(FireAppOpenEventIfRequiredUseCase fireAppOpenEventIfRequiredUseCase, AppUsageTrackingContract appUsageTrackingContract) {
        this.f2471a = fireAppOpenEventIfRequiredUseCase;
        this.b = appUsageTrackingContract;
    }

    @Override // app.chalo.deeplink.DeepLinkAppOpenTracker
    public final Object a(Continuation continuation) {
        this.f2471a.e(Constants.DEEPLINK);
        Object objA = this.b.a((ContinuationImpl) continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }
}
