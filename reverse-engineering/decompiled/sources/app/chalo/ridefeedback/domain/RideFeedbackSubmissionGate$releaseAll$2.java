package app.chalo.ridefeedback.domain;

import app.chalo.ridefeedback.data.dao.RideFeedbackOfflineQueueEntity;
import app.chalo.utils.ConcurrentMutableMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ridefeedback.domain.RideFeedbackSubmissionGate$releaseAll$2", f = "RideFeedbackSubmissionGate.kt", l = {24}, m = "invokeSuspend", v = 1)
final class RideFeedbackSubmissionGate$releaseAll$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<RideFeedbackOfflineQueueEntity> $claims;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ RideFeedbackSubmissionGate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideFeedbackSubmissionGate$releaseAll$2(List list, RideFeedbackSubmissionGate rideFeedbackSubmissionGate, Continuation continuation) {
        super(2, continuation);
        this.$claims = list;
        this.this$0 = rideFeedbackSubmissionGate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideFeedbackSubmissionGate$releaseAll$2(this.$claims, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RideFeedbackSubmissionGate$releaseAll$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RideFeedbackSubmissionGate rideFeedbackSubmissionGate;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            List<RideFeedbackOfflineQueueEntity> list = this.$claims;
            rideFeedbackSubmissionGate = this.this$0;
            it = list.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            rideFeedbackSubmissionGate = (RideFeedbackSubmissionGate) this.L$0;
            ResultKt.b(obj);
        }
        while (it.hasNext()) {
            RideFeedbackOfflineQueueEntity rideFeedbackOfflineQueueEntity = (RideFeedbackOfflineQueueEntity) it.next();
            String str = rideFeedbackOfflineQueueEntity.f9072a;
            String str2 = rideFeedbackOfflineQueueEntity.b;
            String str3 = rideFeedbackOfflineQueueEntity.c;
            this.L$0 = rideFeedbackSubmissionGate;
            this.L$1 = it;
            this.label = 1;
            ConcurrentMutableMap concurrentMutableMap = rideFeedbackSubmissionGate.f9088a;
            String lowerCase = str3.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            if (concurrentMutableMap.e(new RideFeedbackSubmissionGate.SubmissionKey(str, str2, lowerCase), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f17538a;
    }
}
