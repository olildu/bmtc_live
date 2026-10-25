package app.chalo.ncmc.ui.ncmconlinerecharge;

import app.chalo.models.CardRechargeFareInfo;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeViewState;
import app.chalo.usecase.LoadMoneyAmountValidationUseCase;
import app.chalo.usecase.LoadMoneyFailureReason;
import app.chalo.usecase.LoadMoneyValidationFailureType;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.xa;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.ncmconlinerecharge.NcmcOnlineRechargeComponent$handleAmountEnteredIntent$1", f = "NCMCOnlineRechargeComponent.kt", l = {218}, m = "invokeSuspend", v = 1)
final class NcmcOnlineRechargeComponent$handleAmountEnteredIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $enteredAmountString;
    long J$0;
    int label;
    final /* synthetic */ NcmcOnlineRechargeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NcmcOnlineRechargeComponent$handleAmountEnteredIntent$1(NcmcOnlineRechargeComponent ncmcOnlineRechargeComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ncmcOnlineRechargeComponent;
        this.$enteredAmountString = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NcmcOnlineRechargeComponent$handleAmountEnteredIntent$1(this.this$0, this.$enteredAmountString, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NcmcOnlineRechargeComponent$handleAmountEnteredIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NcmcOnlineRechargeComponent$handleAmountEnteredIntent$1 ncmcOnlineRechargeComponent$handleAmountEnteredIntent$1;
        final long j;
        CardRechargeFareInfo cardRechargeFareInfo;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            long jB = this.this$0.p.b(this.$enteredAmountString);
            NcmcOnlineRechargeComponent ncmcOnlineRechargeComponent = this.this$0;
            LoadMoneyAmountValidationUseCase loadMoneyAmountValidationUseCase = ncmcOnlineRechargeComponent.l;
            String str = this.$enteredAmountString;
            NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel = ncmcOnlineRechargeComponent.v;
            long j2 = (ncmcCardRechargeConfigAppModel == null || (cardRechargeFareInfo = ncmcCardRechargeConfigAppModel.g) == null) ? 1000L : cardRechargeFareInfo.f5577a;
            long j3 = ((NCMCOnlineRechargeViewState) ncmcOnlineRechargeComponent.f.getValue()).l;
            this.J$0 = jB;
            this.label = 1;
            ncmcOnlineRechargeComponent$handleAmountEnteredIntent$1 = this;
            obj = loadMoneyAmountValidationUseCase.a(str, j2, j3, ncmcOnlineRechargeComponent$handleAmountEnteredIntent$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = jB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j4 = this.J$0;
            ResultKt.b(obj);
            ncmcOnlineRechargeComponent$handleAmountEnteredIntent$1 = this;
            j = j4;
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            ncmcOnlineRechargeComponent$handleAmountEnteredIntent$1.this$0.E0(new xa(ncmcOnlineRechargeComponent$handleAmountEnteredIntent$1.$enteredAmountString, j, 4));
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            final ChaloUseCaseResult.Failure failure = (ChaloUseCaseResult.Failure) chaloUseCaseResult;
            final boolean z = ((LoadMoneyFailureReason) failure.f10418a).f10214a != LoadMoneyValidationFailureType.ENTERED_AMOUNT_LESS_THAN_MIN_AMOUNT;
            NcmcOnlineRechargeComponent ncmcOnlineRechargeComponent2 = ncmcOnlineRechargeComponent$handleAmountEnteredIntent$1.this$0;
            final String str2 = ncmcOnlineRechargeComponent$handleAmountEnteredIntent$1.$enteredAmountString;
            ncmcOnlineRechargeComponent2.E0(new Function1() { // from class: jm0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return NCMCOnlineRechargeViewState.a((NCMCOnlineRechargeViewState) obj2, null, false, false, str2, z ? ((LoadMoneyFailureReason) failure.f10418a).b : null, null, null, Long.valueOf(j), null, null, 0L, null, null, null, 130915);
                }
            });
        }
        return Unit.f17538a;
    }
}
