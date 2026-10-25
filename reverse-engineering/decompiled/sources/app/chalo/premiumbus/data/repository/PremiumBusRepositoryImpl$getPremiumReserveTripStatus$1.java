package app.chalo.premiumbus.data.repository;

import app.chalo.premiumbus.data.models.app.PremiumReserveTripAppModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl", f = "PremiumBusRepositoryImpl.kt", l = {523}, m = "getPremiumReserveTripStatus", v = 1)
final class PremiumBusRepositoryImpl$getPremiumReserveTripStatus$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PremiumBusRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusRepositoryImpl$getPremiumReserveTripStatus$1(PremiumBusRepositoryImpl premiumBusRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = premiumBusRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PremiumBusRepositoryImpl$getPremiumReserveTripStatus$1 premiumBusRepositoryImpl$getPremiumReserveTripStatus$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        PremiumBusRepositoryImpl premiumBusRepositoryImpl = this.this$0;
        premiumBusRepositoryImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            premiumBusRepositoryImpl$getPremiumReserveTripStatus$1 = this;
        } else {
            premiumBusRepositoryImpl$getPremiumReserveTripStatus$1 = new PremiumBusRepositoryImpl$getPremiumReserveTripStatus$1(premiumBusRepositoryImpl, this);
        }
        Object objS = premiumBusRepositoryImpl$getPremiumReserveTripStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRepositoryImpl$getPremiumReserveTripStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(objS);
            premiumBusRepositoryImpl$getPremiumReserveTripStatus$1.label = 1;
            objS = premiumBusRepositoryImpl.S(premiumBusRepositoryImpl$getPremiumReserveTripStatus$1);
            if (objS == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objS);
        }
        PremiumReserveTripAppModel premiumReserveTripAppModel = (PremiumReserveTripAppModel) objS;
        if (premiumReserveTripAppModel != null) {
            return premiumReserveTripAppModel.d;
        }
        return null;
    }
}
