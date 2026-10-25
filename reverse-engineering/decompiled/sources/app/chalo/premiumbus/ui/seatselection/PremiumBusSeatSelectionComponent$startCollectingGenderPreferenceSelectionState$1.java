package app.chalo.premiumbus.ui.seatselection;

import app.chalo.premiumbus.data.GenderPreferenceSelectionStates;
import app.chalo.premiumbus.data.PremiumBusDataStoreWrapperImpl$getGenderPreferenceSelectionState$$inlined$map$1;
import defpackage.lu0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent$startCollectingGenderPreferenceSelectionState$1", f = "PremiumBusSeatSelectionComponent.kt", l = {1117}, m = "invokeSuspend", v = 1)
final class PremiumBusSeatSelectionComponent$startCollectingGenderPreferenceSelectionState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ PremiumBusSeatSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSeatSelectionComponent$startCollectingGenderPreferenceSelectionState$1(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSeatSelectionComponent;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSeatSelectionComponent$startCollectingGenderPreferenceSelectionState$1(this.this$0, this.$userId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSeatSelectionComponent$startCollectingGenderPreferenceSelectionState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PremiumBusDataStoreWrapperImpl$getGenderPreferenceSelectionState$$inlined$map$1 premiumBusDataStoreWrapperImpl$getGenderPreferenceSelectionState$$inlined$map$1J = this.this$0.v.j(this.$userId);
            final PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent$startCollectingGenderPreferenceSelectionState$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent2 = premiumBusSeatSelectionComponent;
                    premiumBusSeatSelectionComponent2.E0(new lu0(2, (GenderPreferenceSelectionStates) obj2, premiumBusSeatSelectionComponent2));
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (premiumBusDataStoreWrapperImpl$getGenderPreferenceSelectionState$$inlined$map$1J.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
