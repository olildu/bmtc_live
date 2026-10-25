package app.chalo.deeplink;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkResumeManager;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeepLinkResumeManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeepLinkPendingStore f2463a;
    public final DeepLinkRuntime b;

    public DeepLinkResumeManager(DeepLinkPendingStore deepLinkPendingStore, DeepLinkRuntime deepLinkRuntime) {
        this.f2463a = deepLinkPendingStore;
        this.b = deepLinkRuntime;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        DeepLinkResumeManager$resumePendingDeepLink$1 deepLinkResumeManager$resumePendingDeepLink$1;
        if (continuationImpl instanceof DeepLinkResumeManager$resumePendingDeepLink$1) {
            deepLinkResumeManager$resumePendingDeepLink$1 = (DeepLinkResumeManager$resumePendingDeepLink$1) continuationImpl;
            int i = deepLinkResumeManager$resumePendingDeepLink$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deepLinkResumeManager$resumePendingDeepLink$1.label = i - Integer.MIN_VALUE;
            } else {
                deepLinkResumeManager$resumePendingDeepLink$1 = new DeepLinkResumeManager$resumePendingDeepLink$1(this, continuationImpl);
            }
        } else {
            deepLinkResumeManager$resumePendingDeepLink$1 = new DeepLinkResumeManager$resumePendingDeepLink$1(this, continuationImpl);
        }
        Object objA = deepLinkResumeManager$resumePendingDeepLink$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = deepLinkResumeManager$resumePendingDeepLink$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            deepLinkResumeManager$resumePendingDeepLink$1.label = 1;
            objA = this.f2463a.a(deepLinkResumeManager$resumePendingDeepLink$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        DeepLinkResolutionRequest deepLinkResolutionRequest = (DeepLinkResolutionRequest) objA;
        return deepLinkResolutionRequest == null ? Boolean.FALSE : Boolean.valueOf(this.b.a(deepLinkResolutionRequest));
    }
}
