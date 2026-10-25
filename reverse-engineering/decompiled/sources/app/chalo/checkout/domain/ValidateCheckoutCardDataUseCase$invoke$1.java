package app.chalo.checkout.domain;

import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/utils/ChaloUseCaseResult;", "", "Lapp/chalo/checkout/domain/CardFieldType;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.domain.ValidateCheckoutCardDataUseCase$invoke$1", f = "ValidateCheckoutCardDataUseCase.kt", l = {18, 22, 26, 31, 35}, m = "invokeSuspend", v = 1)
final class ValidateCheckoutCardDataUseCase$invoke$1 extends SuspendLambda implements Function2<FlowCollector<? super ChaloUseCaseResult<Boolean, CardFieldType>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ SelectedPaymentInstrumentData.CardData $cardData;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ValidateCheckoutCardDataUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateCheckoutCardDataUseCase$invoke$1(SelectedPaymentInstrumentData.CardData cardData, ValidateCheckoutCardDataUseCase validateCheckoutCardDataUseCase, Continuation continuation) {
        super(2, continuation);
        this.$cardData = cardData;
        this.this$0 = validateCheckoutCardDataUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ValidateCheckoutCardDataUseCase$invoke$1 validateCheckoutCardDataUseCase$invoke$1 = new ValidateCheckoutCardDataUseCase$invoke$1(this.$cardData, this.this$0, continuation);
        validateCheckoutCardDataUseCase$invoke$1.L$0 = obj;
        return validateCheckoutCardDataUseCase$invoke$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ValidateCheckoutCardDataUseCase$invoke$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0117  */
    /* JADX WARN: Code duplicated, block: B:45:0x013a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0147  */
    /* JADX WARN: Code duplicated, block: B:52:0x0164  */
    /* JADX WARN: Code duplicated, block: B:54:0x0168 A[PHI: r5 r14
      0x0168: PHI (r5v8 kotlin.jvm.internal.Ref$BooleanRef) = (r5v6 kotlin.jvm.internal.Ref$BooleanRef), (r5v9 kotlin.jvm.internal.Ref$BooleanRef) binds: [B:48:0x0145, B:53:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x0168: PHI (r14v7 kotlinx.coroutines.flow.FlowCollector) = (r14v5 kotlinx.coroutines.flow.FlowCollector), (r14v8 kotlinx.coroutines.flow.FlowCollector) binds: [B:48:0x0145, B:53:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x016c  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bb, code lost:
    
        if (r14.emit(r11, r16) == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0184, code lost:
    
        if (r14.emit(r2, r16) == r1) goto L58;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.domain.ValidateCheckoutCardDataUseCase$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
