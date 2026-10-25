package app.chalo.productpurchase.passpurchase.ui.passengerselection;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.superpass.data.repository.SuperPassRepository;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionViewModel$handleInitializationIntent$1", f = "SuperPassPassengerSelectionViewModel.kt", l = {98}, m = "invokeSuspend", v = 1)
final class SuperPassPassengerSelectionViewModel$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SuperPassPassengerSelectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassPassengerSelectionViewModel$handleInitializationIntent$1(SuperPassPassengerSelectionViewModel superPassPassengerSelectionViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superPassPassengerSelectionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassPassengerSelectionViewModel$handleInitializationIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassPassengerSelectionViewModel$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List passengersList;
        MutableStateFlow mutableStateFlow;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            SuperPassPassengerSelectionViewModel superPassPassengerSelectionViewModel = this.this$0;
            SuperPassPassengerSelectionDataState superPassPassengerSelectionDataState = superPassPassengerSelectionViewModel.r;
            if (superPassPassengerSelectionDataState == null || (passengersList = superPassPassengerSelectionDataState.f8444a) == null) {
                SuperPassRepository superPassRepository = superPassPassengerSelectionViewModel.l;
                this.label = 1;
                obj = superPassRepository.i(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            mutableStateFlow = this.this$0.e;
            do {
                value = mutableStateFlow.getValue();
                ((SuperPassPassengerSelectionDataState) value).getClass();
                Intrinsics.i(passengersList, "passengersList");
            } while (!mutableStateFlow.c(value, new SuperPassPassengerSelectionDataState(passengersList)));
            AnalyticsContract.DefaultImpls.a(this.this$0.m, "smart passenger selection screen open", "", MapsKt.h(new Pair("smartPassengerList size", Integer.valueOf(passengersList.size()))), null, false, 24);
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        passengersList = (List) obj;
        mutableStateFlow = this.this$0.e;
        do {
            value = mutableStateFlow.getValue();
            ((SuperPassPassengerSelectionDataState) value).getClass();
            Intrinsics.i(passengersList, "passengersList");
        } while (!mutableStateFlow.c(value, new SuperPassPassengerSelectionDataState(passengersList)));
        AnalyticsContract.DefaultImpls.a(this.this$0.m, "smart passenger selection screen open", "", MapsKt.h(new Pair("smartPassengerList size", Integer.valueOf(passengersList.size()))), null, false, 24);
        return Unit.f17538a;
    }
}
