package app.chalo.ridefeedback.domain;

import app.chalo.utils.ConcurrentMutableMap;
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
@DebugMetadata(c = "app.chalo.ridefeedback.domain.RideFeedbackSubmissionGate$withClaim$2", f = "RideFeedbackSubmissionGate.kt", l = {33}, m = "invokeSuspend", v = 1)
final class RideFeedbackSubmissionGate$withClaim$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bookingId;
    final /* synthetic */ String $cityId;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ RideFeedbackSubmissionGate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideFeedbackSubmissionGate$withClaim$2(RideFeedbackSubmissionGate rideFeedbackSubmissionGate, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rideFeedbackSubmissionGate;
        this.$bookingId = str;
        this.$userId = str2;
        this.$cityId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideFeedbackSubmissionGate$withClaim$2(this.this$0, this.$bookingId, this.$userId, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RideFeedbackSubmissionGate$withClaim$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            RideFeedbackSubmissionGate rideFeedbackSubmissionGate = this.this$0;
            String str = this.$bookingId;
            String str2 = this.$userId;
            String str3 = this.$cityId;
            this.label = 1;
            ConcurrentMutableMap concurrentMutableMap = rideFeedbackSubmissionGate.f9088a;
            String lowerCase = str3.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            if (concurrentMutableMap.e(new RideFeedbackSubmissionGate.SubmissionKey(str, str2, lowerCase), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
