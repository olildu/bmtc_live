package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.models.BookableSuperPassConfiguration;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel$handleSubmitBtnClickedIntent$1", f = "ConfirmSuperPassPurchaseViewModel.kt", l = {540, 553, 565}, m = "invokeSuspend", v = 1)
final class ConfirmSuperPassPurchaseViewModel$handleSubmitBtnClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConfirmSuperPassPurchaseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSuperPassPurchaseViewModel$handleSubmitBtnClickedIntent$1(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = confirmSuperPassPurchaseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmSuperPassPurchaseViewModel$handleSubmitBtnClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmSuperPassPurchaseViewModel$handleSubmitBtnClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0104 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
                return unit;
            }
            if (i == 2) {
                ResultKt.b(obj);
                return unit;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        SuperPassPurchaseSharedState superPassPurchaseSharedState = (SuperPassPurchaseSharedState) this.this$0.l.getF().getValue();
        BookableSuperPassConfiguration bookableSuperPassConfiguration = superPassPurchaseSharedState.i;
        String str = superPassPurchaseSharedState.d;
        if (bookableSuperPassConfiguration != null) {
            MutableStateFlow mutableStateFlow = this.this$0.e;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value, ConfirmSuperPassPurchaseDataState.a((ConfirmSuperPassPurchaseDataState) value, false, false, PassConfirmationDialogType.Loading.f8393a, null, null, null, null, null, null, null, 2043)));
            if (Intrinsics.d(str, "flowPaymentPostVerification") || Intrinsics.d(str, "flowRenewPass")) {
                ConfirmSuperPassPurchaseViewModel.t(this.this$0);
                ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel = this.this$0;
                this.label = 1;
                if (ConfirmSuperPassPurchaseViewModel.q(confirmSuperPassPurchaseViewModel, superPassPurchaseSharedState, bookableSuperPassConfiguration, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (bookableSuperPassConfiguration.d()) {
                ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel2 = this.this$0;
                confirmSuperPassPurchaseViewModel2.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                confirmSuperPassPurchaseViewModel2.u(linkedHashMap);
                confirmSuperPassPurchaseViewModel2.P("mPass proof submit button clicked", linkedHashMap);
                MutableStateFlow mutableStateFlow2 = this.this$0.e;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.c(value2, ConfirmSuperPassPurchaseDataState.a((ConfirmSuperPassPurchaseDataState) value2, false, true, null, null, null, null, null, null, null, null, 2045)));
                ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel3 = this.this$0;
                this.label = 3;
                if (ConfirmSuperPassPurchaseViewModel.q(confirmSuperPassPurchaseViewModel3, superPassPurchaseSharedState, bookableSuperPassConfiguration, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                ConfirmSuperPassPurchaseViewModel.t(this.this$0);
                MutableStateFlow mutableStateFlow3 = this.this$0.e;
                do {
                    value3 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.c(value3, ConfirmSuperPassPurchaseDataState.a((ConfirmSuperPassPurchaseDataState) value3, false, false, null, null, null, null, null, null, null, null, 2045)));
                ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel4 = this.this$0;
                this.label = 2;
                if (ConfirmSuperPassPurchaseViewModel.q(confirmSuperPassPurchaseViewModel4, superPassPurchaseSharedState, bookableSuperPassConfiguration, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return unit;
    }
}
