package app.chalo.onboarding.citylocationselection.ui;

import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.LocationAppModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$checkIfLocationAvailableAndFetchCity$1", f = "CityLocationSelectionComponent.kt", l = {673}, m = "invokeSuspend", v = 1)
final class CityLocationSelectionComponent$checkIfLocationAvailableAndFetchCity$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CityLocationSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityLocationSelectionComponent$checkIfLocationAvailableAndFetchCity$1(CityLocationSelectionComponent cityLocationSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cityLocationSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CityLocationSelectionComponent$checkIfLocationAvailableAndFetchCity$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CityLocationSelectionComponent$checkIfLocationAvailableAndFetchCity$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ChaloLocationManager chaloLocationManager = this.this$0.l;
            this.label = 1;
            obj = chaloLocationManager.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        LocationUpdateResult locationUpdateResult = (LocationUpdateResult) obj;
        if (locationUpdateResult instanceof LocationUpdateResult.LocationReceived) {
            CityLocationSelectionComponent cityLocationSelectionComponent = this.this$0;
            LocationAppModel locationAppModel = ((LocationUpdateResult.LocationReceived) locationUpdateResult).f5154a;
            Job job = cityLocationSelectionComponent.F;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            BuildersKt.d(cityLocationSelectionComponent.j, null, null, new CityLocationSelectionComponent$fetchCityIdAndNameFromLocation$1(cityLocationSelectionComponent, locationAppModel.a(), null), 3);
        } else {
            CityLocationSelectionComponent cityLocationSelectionComponent2 = this.this$0;
            Job job2 = cityLocationSelectionComponent2.F;
            if (job2 != null) {
                ((JobSupport) job2).cancel(null);
            }
            BuildersKt.d(cityLocationSelectionComponent2.j, null, null, new CityLocationSelectionComponent$startLocationUpdates$1(cityLocationSelectionComponent2, null), 3);
        }
        return Unit.f17538a;
    }
}
