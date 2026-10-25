package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/resultstatemanager/ResultStateData;", "Lapp/chalo/resultstatemanager/minprofileupdate/MinProfileUpdateResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$canProceed$2", f = "ConfirmSuperPassPurchaseViewModel.kt", l = {873}, m = "invokeSuspend", v = 1)
final class ConfirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$canProceed$2 extends SuspendLambda implements Function1<Continuation<? super ResultStateData<MinProfileUpdateResult>>, Object> {
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ ConfirmSuperPassPurchaseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$canProceed$2(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = confirmSuperPassPurchaseViewModel;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ConfirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$canProceed$2(this.this$0, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ConfirmSuperPassPurchaseViewModel$createSuperPassOrderWithMinProfileGate$canProceed$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel = this.this$0;
        Flow flowB = confirmSuperPassPurchaseViewModel.w.b(this.$requestId);
        this.label = 1;
        Object objV = confirmSuperPassPurchaseViewModel.b.v(flowB, this);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
