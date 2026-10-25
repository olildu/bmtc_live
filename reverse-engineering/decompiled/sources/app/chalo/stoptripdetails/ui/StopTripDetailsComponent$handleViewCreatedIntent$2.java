package app.chalo.stoptripdetails.ui;

import app.chalo.location.LatLng;
import app.chalo.stoptripdetails.data.model.app.StopTripAppModel;
import app.chalo.usecase.FetchCurrentLocationUseCase;
import app.chalo.utils.GeometryUtils;
import app.chalo.utils.StopTripDetailsUtils;
import defpackage.g41;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.stoptripdetails.ui.StopTripDetailsComponent$handleViewCreatedIntent$2", f = "StopTripDetailsComponent.kt", l = {123}, m = "invokeSuspend", v = 1)
final class StopTripDetailsComponent$handleViewCreatedIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StopTripDetailsIntent.ViewCreatedIntentStop $intent;
    int label;
    final /* synthetic */ StopTripDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopTripDetailsComponent$handleViewCreatedIntent$2(StopTripDetailsComponent stopTripDetailsComponent, StopTripDetailsIntent.ViewCreatedIntentStop viewCreatedIntentStop, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopTripDetailsComponent;
        this.$intent = viewCreatedIntentStop;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopTripDetailsComponent$handleViewCreatedIntent$2(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopTripDetailsComponent$handleViewCreatedIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FetchCurrentLocationUseCase fetchCurrentLocationUseCase = this.this$0.n;
            this.label = 1;
            obj = fetchCurrentLocationUseCase.a(true, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        LatLng latLng = (LatLng) obj;
        LatLng latLng2 = this.$intent.f9515a.c;
        this.this$0.E0(new g41(18, this.$intent, (latLng == null || latLng2 == null) ? null : StopTripDetailsUtils.b(GeometryUtils.c(latLng, latLng2), this.this$0.t)));
        StopTripDetailsComponent stopTripDetailsComponent = this.this$0;
        StopTripDetailsIntent.ViewCreatedIntentStop viewCreatedIntentStop = this.$intent;
        StopTripAppModel stopTripAppModel = viewCreatedIntentStop.f9515a;
        String str = stopTripAppModel.f9499a;
        String str2 = stopTripAppModel.b;
        stopTripDetailsComponent.x = BuildersKt.d(stopTripDetailsComponent.j, null, null, new StopTripDetailsComponent$fetchAllDeparturesAndLiveInfo$1(stopTripDetailsComponent, str, viewCreatedIntentStop.b, stopTripAppModel.d, str2, null), 3);
        return Unit.f17538a;
    }
}
