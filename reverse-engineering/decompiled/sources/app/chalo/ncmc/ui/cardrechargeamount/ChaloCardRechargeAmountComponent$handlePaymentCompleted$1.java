package app.chalo.ncmc.ui.cardrechargeamount;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.models.CardRechargeConfiguration;
import app.chalo.models.CardRechargeConfigurationKt;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import defpackage.bj;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent$handlePaymentCompleted$1", f = "ChaloCardRechargeAmountComponent.kt", l = {TypedValues.CycleType.TYPE_WAVE_OFFSET}, m = "invokeSuspend", v = 1)
final class ChaloCardRechargeAmountComponent$handlePaymentCompleted$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $mode;
    int label;
    final /* synthetic */ ChaloCardRechargeAmountComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloCardRechargeAmountComponent$handlePaymentCompleted$1(ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloCardRechargeAmountComponent;
        this.$mode = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloCardRechargeAmountComponent$handlePaymentCompleted$1(this.this$0, this.$mode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloCardRechargeAmountComponent$handlePaymentCompleted$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel = ((ChaloCardRechargeAmountViewState) this.this$0.f.getValue()).b;
            if (chaloCardRechargeConfigAppModel != null) {
                CardRechargeConfiguration cardRechargeConfigurationA = CardRechargeConfigurationKt.a(chaloCardRechargeConfigAppModel);
                String str = ((ChaloCardRechargeAmountViewState) this.this$0.f.getValue()).r;
                ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent = this.this$0;
                AnalyticsContract analyticsContract = chaloCardRechargeAmountComponent.p;
                Source source = Source.CHALO_CARD_RECHARGE_ENTER_AMOUNT_SCREEN;
                ChaloCardRechargeAmountViewState chaloCardRechargeAmountViewState = (ChaloCardRechargeAmountViewState) chaloCardRechargeAmountComponent.f.getValue();
                Pair pair = new Pair("cardTransactionId", ((ChaloCardRechargeAmountViewState) this.this$0.f.getValue()).r);
                ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel2 = ((ChaloCardRechargeAmountViewState) this.this$0.f.getValue()).b;
                AnalyticsContractImplKt.b(analyticsContract, "ocr payment success activity open", source, ChaloCardRechargeAmountContractKt.a(chaloCardRechargeAmountViewState, MapsKt.i(pair, new Pair("ocr recharge delay copy", String.valueOf(chaloCardRechargeConfigAppModel2 != null ? chaloCardRechargeConfigAppModel2.m : null)))), false, 24);
                ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent2 = this.this$0;
                String str2 = ((ChaloCardRechargeAmountViewState) chaloCardRechargeAmountComponent2.f.getValue()).d;
                long j = ((ChaloCardRechargeAmountViewState) this.this$0.f.getValue()).g;
                String str3 = this.$mode;
                this.label = 1;
                if (ChaloCardRechargeAmountComponent.H0(chaloCardRechargeAmountComponent2, str2, str, j, cardRechargeConfigurationA, str3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return unit;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.this$0.E0(new bj(6));
        return unit;
    }
}
