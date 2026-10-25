package app.chalo.premiumbus.prebookedtickets.validation;

import androidx.compose.runtime.ComposerKt;
import app.chalo.contract.ProductsSyncContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig", f = "PremiumReserveTicketValidationConfig.kt", l = {ComposerKt.compositionLocalMapKey, ComposerKt.providerValuesKey}, m = "onPunchDataReceivedOverBle", v = 1)
final class PremiumReserveTicketValidationConfig$onPunchDataReceivedOverBle$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PremiumReserveTicketValidationConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumReserveTicketValidationConfig$onPunchDataReceivedOverBle$1(PremiumReserveTicketValidationConfig premiumReserveTicketValidationConfig, Continuation continuation) {
        super(continuation);
        this.this$0 = premiumReserveTicketValidationConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PremiumReserveTicketValidationConfig$onPunchDataReceivedOverBle$1 premiumReserveTicketValidationConfig$onPunchDataReceivedOverBle$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        PremiumReserveTicketValidationConfig premiumReserveTicketValidationConfig = this.this$0;
        premiumReserveTicketValidationConfig.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            premiumReserveTicketValidationConfig$onPunchDataReceivedOverBle$1 = this;
        } else {
            premiumReserveTicketValidationConfig$onPunchDataReceivedOverBle$1 = new PremiumReserveTicketValidationConfig$onPunchDataReceivedOverBle$1(premiumReserveTicketValidationConfig, this);
        }
        Object obj2 = premiumReserveTicketValidationConfig$onPunchDataReceivedOverBle$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketValidationConfig$onPunchDataReceivedOverBle$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            throw new NoWhenBranchMatchedException();
        }
        if (i2 == 1) {
            ResultKt.b(obj2);
            ProductsSyncContract productsSyncContract = premiumReserveTicketValidationConfig.j;
            premiumReserveTicketValidationConfig$onPunchDataReceivedOverBle$1.label = 2;
            if (productsSyncContract.b(premiumReserveTicketValidationConfig$onPunchDataReceivedOverBle$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
        }
        return Boolean.TRUE;
    }
}
