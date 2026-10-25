package app.chalo.instantticket.domain;

import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.instantticket.config.models.FareInfo;
import app.chalo.instantticket.config.models.InstantTicketConfiguration;
import app.chalo.instantticket.ui.instantticketscreen.EnteredAmountState;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.domain.ValidateInstantTicketAmountUseCase", f = "ValidateInstantTicketAmountUseCase.kt", l = {17}, m = "validateAmountString", v = 1)
final class ValidateInstantTicketAmountUseCase$validateAmountString$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ValidateInstantTicketAmountUseCase this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        CurrencyFeature currencyFeature = this.this$0.f3904a;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) this.L$0;
        ResultKt.b(obj);
        InstantTicketConfiguration instantTicketConfiguration = (InstantTicketConfiguration) obj;
        if (instantTicketConfiguration == null) {
            return new ChaloUseCaseResult.Failure(EnteredAmountState.EXCEEDS_MAX_AMOUNT);
        }
        FareInfo fareInfo = instantTicketConfiguration.i;
        if (instantTicketConfiguration.equals(InstantTicketConfiguration.o)) {
            return new ChaloUseCaseResult.Failure(EnteredAmountState.EXCEEDS_MAX_AMOUNT);
        }
        try {
            long jB = currencyFeature.b(str);
            if (jB >= fareInfo.f3829a && !currencyFeature.c(StringsKt.u0(str).toString())) {
                return jB > fareInfo.b ? new ChaloUseCaseResult.Failure(EnteredAmountState.EXCEEDS_MAX_AMOUNT) : new ChaloUseCaseResult.Success(new Long(jB));
            }
            return new ChaloUseCaseResult.Failure(EnteredAmountState.INCORRECT_AMOUNT);
        } catch (Throwable unused) {
            return new ChaloUseCaseResult.Failure(EnteredAmountState.NO_AMOUNT_ENTERED);
        }
    }
}
