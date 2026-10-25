package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.SuperPassProductConfigurationProperties;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel$handleInitializationIntent$1", f = "ConfirmSuperPassPurchaseViewModel.kt", l = {235}, m = "invokeSuspend", v = 1)
final class ConfirmSuperPassPurchaseViewModel$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ConfirmSuperPassPurchaseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSuperPassPurchaseViewModel$handleInitializationIntent$1(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = confirmSuperPassPurchaseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmSuperPassPurchaseViewModel$handleInitializationIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmSuperPassPurchaseViewModel$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        SuperPassPurchaseSharedState superPassPurchaseSharedState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            SuperPassPurchaseSharedState superPassPurchaseSharedState2 = (SuperPassPurchaseSharedState) this.this$0.l.getF().getValue();
            ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel = this.this$0;
            this.L$0 = superPassPurchaseSharedState2;
            this.label = 1;
            Object objI = confirmSuperPassPurchaseViewModel.I(superPassPurchaseSharedState2, this);
            if (objI == coroutineSingletons) {
                return coroutineSingletons;
            }
            superPassPurchaseSharedState = superPassPurchaseSharedState2;
            obj = objI;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            superPassPurchaseSharedState = (SuperPassPurchaseSharedState) this.L$0;
            ResultKt.b(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        String str = superPassPurchaseSharedState.d;
        BookableSuperPassConfiguration bookableSuperPassConfiguration = superPassPurchaseSharedState.i;
        if (Intrinsics.d(str, "flowPaymentPostVerification") || Intrinsics.d(superPassPurchaseSharedState.d, "flowRenewPass")) {
            ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel2 = this.this$0;
            confirmSuperPassPurchaseViewModel2.getClass();
            confirmSuperPassPurchaseViewModel2.P("confirm payment screen open", new LinkedHashMap());
        } else if (bookableSuperPassConfiguration != null && !bookableSuperPassConfiguration.d()) {
            ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel3 = this.this$0;
            confirmSuperPassPurchaseViewModel3.getClass();
            confirmSuperPassPurchaseViewModel3.P("confirm payment screen open", new LinkedHashMap());
        }
        ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel4 = this.this$0;
        SuperPassProductConfigurationProperties superPassProductConfigurationProperties = bookableSuperPassConfiguration != null ? bookableSuperPassConfiguration.b : null;
        Job job = confirmSuperPassPurchaseViewModel4.J;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        confirmSuperPassPurchaseViewModel4.J = BuildersKt.d(confirmSuperPassPurchaseViewModel4.j, null, null, new ConfirmSuperPassPurchaseViewModel$updatePassStartDateRolloverBanner$1(confirmSuperPassPurchaseViewModel4, superPassProductConfigurationProperties, jLongValue, null), 3);
        return Unit.f17538a;
    }
}
