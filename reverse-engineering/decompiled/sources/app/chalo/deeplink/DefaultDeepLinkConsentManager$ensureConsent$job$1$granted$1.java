package app.chalo.deeplink;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.deeplink.DefaultDeepLinkConsentManager$ensureConsent$job$1$granted$1", f = "DefaultDeepLinkConsentManager.kt", l = {}, m = "invokeSuspend", v = 1)
final class DefaultDeepLinkConsentManager$ensureConsent$job$1$granted$1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
    /* synthetic */ boolean Z$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DefaultDeepLinkConsentManager$ensureConsent$job$1$granted$1 defaultDeepLinkConsentManager$ensureConsent$job$1$granted$1 = new DefaultDeepLinkConsentManager$ensureConsent$job$1$granted$1(2, continuation);
        defaultDeepLinkConsentManager$ensureConsent$job$1$granted$1.Z$0 = ((Boolean) obj).booleanValue();
        return defaultDeepLinkConsentManager$ensureConsent$job$1$granted$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((DefaultDeepLinkConsentManager$ensureConsent$job$1$granted$1) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return Boolean.valueOf(this.Z$0);
    }
}
