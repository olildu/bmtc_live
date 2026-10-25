package app.chalo.premiumbus.ui.changestop;

import app.chalo.livetracking.routedetails.data.model.app.response.VehicleLiveGpsLocationResponseAppModel;
import defpackage.et0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopComponent$startLiveVehicleGpsTracking$1", f = "PremiumBusChangeStopComponent.kt", l = {438}, m = "invokeSuspend", v = 1)
final class PremiumBusChangeStopComponent$startLiveVehicleGpsTracking$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $agencyName;
    final /* synthetic */ String $vehicleNumber;
    int label;
    final /* synthetic */ PremiumBusChangeStopComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusChangeStopComponent$startLiveVehicleGpsTracking$1(PremiumBusChangeStopComponent premiumBusChangeStopComponent, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusChangeStopComponent;
        this.$vehicleNumber = str;
        this.$agencyName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusChangeStopComponent$startLiveVehicleGpsTracking$1(this.this$0, this.$vehicleNumber, this.$agencyName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusChangeStopComponent$startLiveVehicleGpsTracking$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowD = this.this$0.p.d(this.$vehicleNumber, this.$agencyName, null, null);
            final PremiumBusChangeStopComponent premiumBusChangeStopComponent = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopComponent$startLiveVehicleGpsTracking$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    premiumBusChangeStopComponent.E0(new et0((VehicleLiveGpsLocationResponseAppModel) obj2, 4));
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowD.collect(flowCollector, this) == coroutineSingletons) {
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
