package app.chalo.ridehailing.feedback;

import app.chalo.datastore.LocalDataStore;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.HomeArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ridehailing.feedback.AutoRideFeedbackDelegate$onSkipUserFeedbackCtaClick$1", f = "AutoRideFeedbackDelegate.kt", l = {87}, m = "invokeSuspend", v = 1)
final class AutoRideFeedbackDelegate$onSkipUserFeedbackCtaClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AutoRideFeedbackDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoRideFeedbackDelegate$onSkipUserFeedbackCtaClick$1(AutoRideFeedbackDelegate autoRideFeedbackDelegate, Continuation continuation) {
        super(2, continuation);
        this.this$0 = autoRideFeedbackDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoRideFeedbackDelegate$onSkipUserFeedbackCtaClick$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoRideFeedbackDelegate$onSkipUserFeedbackCtaClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            LocalDataStore localDataStore = this.this$0.n;
            List listR = CollectionsKt.R(AutoRideFeedbackDelegate.u);
            this.label = 1;
            if (localDataStore.c(listR, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ChaloNavigationManagerKt.f(this.this$0.l, new HomeArgs((String) null, (String) null, 7));
        return Unit.f17538a;
    }
}
