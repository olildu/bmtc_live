package app.chalo.notification.managers;

import androidx.compose.runtime.ComposerKt;
import app.chalo.providers.UserProfileDetailsProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.notification.managers.NotificationCentralProcessingManagerImpl$currentUserId$2", f = "NotificationCentralProcessingManagerImpl.kt", l = {ComposerKt.providerMapsKey}, m = "invokeSuspend", v = 1)
final class NotificationCentralProcessingManagerImpl$currentUserId$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    int label;
    final /* synthetic */ NotificationCentralProcessingManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCentralProcessingManagerImpl$currentUserId$2(NotificationCentralProcessingManagerImpl notificationCentralProcessingManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = notificationCentralProcessingManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationCentralProcessingManagerImpl$currentUserId$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationCentralProcessingManagerImpl$currentUserId$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        UserProfileDetailsProvider userProfileDetailsProvider = this.this$0.c;
        this.label = 1;
        Object objK = userProfileDetailsProvider.k(this);
        return objK == coroutineSingletons ? coroutineSingletons : objK;
    }
}
