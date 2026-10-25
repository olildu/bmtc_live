package app.chalo.onboarding.citylocationselection.ui;

import app.chalo.location.SettingsResolutionException;
import app.chalo.permissions.gps.GpsRequestHandler;
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
@DebugMetadata(c = "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$requestGps$1", f = "CityLocationSelectionComponent.kt", l = {884}, m = "invokeSuspend", v = 1)
final class CityLocationSelectionComponent$requestGps$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SettingsResolutionException $exception;
    final /* synthetic */ GpsRequestHandler $gpsRequestHandler;
    int label;
    final /* synthetic */ CityLocationSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityLocationSelectionComponent$requestGps$1(GpsRequestHandler gpsRequestHandler, SettingsResolutionException settingsResolutionException, CityLocationSelectionComponent cityLocationSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.$gpsRequestHandler = gpsRequestHandler;
        this.$exception = settingsResolutionException;
        this.this$0 = cityLocationSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CityLocationSelectionComponent$requestGps$1(this.$gpsRequestHandler, this.$exception, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CityLocationSelectionComponent$requestGps$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowA = this.$gpsRequestHandler.a(this.$exception);
            final CityLocationSelectionComponent cityLocationSelectionComponent = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$requestGps$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    CityLocationSelectionComponent cityLocationSelectionComponent2 = cityLocationSelectionComponent;
                    if (zBooleanValue) {
                        cityLocationSelectionComponent2.M0(CityLocationSelectionIntent.OnGpsEnabled.f6589a);
                    } else {
                        cityLocationSelectionComponent2.M0(CityLocationSelectionIntent.OnGpsRequestDenied.f6590a);
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowA.collect(flowCollector, this) == coroutineSingletons) {
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
