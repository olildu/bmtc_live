package app.chalo.onboarding.citylocationselection.ui;

import app.chalo.onboarding.cityprovider.CityChangeProcessResult;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$updateCityAndNavigateToNextScreen$2", f = "CityLocationSelectionComponent.kt", l = {621}, m = "invokeSuspend", v = 1)
final class CityLocationSelectionComponent$updateCityAndNavigateToNextScreen$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CityAppModel $city;
    final /* synthetic */ long $minScreenTimeoutTimestamp;
    int label;
    final /* synthetic */ CityLocationSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityLocationSelectionComponent$updateCityAndNavigateToNextScreen$2(CityLocationSelectionComponent cityLocationSelectionComponent, CityAppModel cityAppModel, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cityLocationSelectionComponent;
        this.$city = cityAppModel;
        this.$minScreenTimeoutTimestamp = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CityLocationSelectionComponent$updateCityAndNavigateToNextScreen$2(this.this$0, this.$city, this.$minScreenTimeoutTimestamp, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CityLocationSelectionComponent$updateCityAndNavigateToNextScreen$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ChannelFlowTransformLatest channelFlowTransformLatestA = this.this$0.B.a(this.$city);
            final CityLocationSelectionComponent cityLocationSelectionComponent = this.this$0;
            final long j = this.$minScreenTimeoutTimestamp;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$updateCityAndNavigateToNextScreen$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    CityChangeProcessResult cityChangeProcessResult = (CityChangeProcessResult) obj2;
                    if (cityChangeProcessResult instanceof CityChangeProcessResult.CityUpdated) {
                        Object objK0 = cityLocationSelectionComponent.K0(j, continuation);
                        if (objK0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            return objK0;
                        }
                    } else if (!Intrinsics.d(cityChangeProcessResult, CityChangeProcessResult.InProgress.f6607a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (channelFlowTransformLatestA.collect(flowCollector, this) == coroutineSingletons) {
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
