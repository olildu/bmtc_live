package app.chalo.home.domain;

import androidx.compose.runtime.ComposerKt;
import app.chalo.models.mticketing.MTicket;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lapp/chalo/utils/ChaloUseCaseResult;", "Lapp/chalo/home/domain/ProductActivationSuccessRemarks;", "Lapp/chalo/home/domain/ProductActivationFailureReason;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.domain.ActivateProductIfRequiredUseCase$handleSingleJourneyTicketActivation$2", f = "ActivateProductIfRequiredUseCase.kt", l = {187, 191, 193, ComposerKt.providerValuesKey, 205, 210, 218, 220}, m = "invokeSuspend", v = 1)
final class ActivateProductIfRequiredUseCase$handleSingleJourneyTicketActivation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChaloUseCaseResult<ProductActivationSuccessRemarks, ProductActivationFailureReason>>, Object> {
    final /* synthetic */ MTicket $mTicket;
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ ActivateProductIfRequiredUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateProductIfRequiredUseCase$handleSingleJourneyTicketActivation$2(ActivateProductIfRequiredUseCase activateProductIfRequiredUseCase, MTicket mTicket, Continuation continuation) {
        super(2, continuation);
        this.this$0 = activateProductIfRequiredUseCase;
        this.$mTicket = mTicket;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ActivateProductIfRequiredUseCase$handleSingleJourneyTicketActivation$2(this.this$0, this.$mTicket, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ActivateProductIfRequiredUseCase$handleSingleJourneyTicketActivation$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x0085 A[PHI: r11
      0x0085: PHI (r11v11 java.lang.Object) = (r11v9 java.lang.Object), (r11v0 java.lang.Object) binds: [B:23:0x0081, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0 A[PHI: r11
      0x00a0: PHI (r11v17 java.lang.Object) = (r11v15 java.lang.Object), (r11v0 java.lang.Object) binds: [B:30:0x009c, B:12:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:40:0x0103  */
    /* JADX WARN: Code duplicated, block: B:43:0x0107  */
    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x012c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0132  */
    /* JADX WARN: Code duplicated, block: B:58:0x0151 A[PHI: r1
      0x0151: PHI (r1v20 app.chalo.models.mticketing.MTicket) = (r1v17 app.chalo.models.mticketing.MTicket), (r1v22 app.chalo.models.mticketing.MTicket) binds: [B:56:0x014e, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[PHI: r1 r3 r11
      0x0028: PHI (r1v17 app.chalo.models.mticketing.MTicket) = (r1v14 app.chalo.models.mticketing.MTicket), (r1v19 app.chalo.models.mticketing.MTicket) binds: [B:49:0x0125, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r3v10 long) = (r3v8 long), (r3v12 long) binds: [B:49:0x0125, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r11v34 java.lang.Object) = (r11v32 java.lang.Object), (r11v0 java.lang.Object) binds: [B:49:0x0125, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015e, code lost:
    
        if (app.chalo.home.domain.ActivateProductIfRequiredUseCase.a(r11, r1, r10) == r0) goto L60;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.ActivateProductIfRequiredUseCase$handleSingleJourneyTicketActivation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
