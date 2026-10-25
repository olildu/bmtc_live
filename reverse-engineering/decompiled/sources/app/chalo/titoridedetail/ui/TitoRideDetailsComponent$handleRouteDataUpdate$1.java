package app.chalo.titoridedetail.ui;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.components.chalomap.LatLngBoundsBuilder;
import app.chalo.compose.components.chalomap.LatLngBoundsUtils;
import app.chalo.location.AppPermissionRequest;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.ChaloLocationManagerKt;
import app.chalo.location.LatLng;
import app.chalo.location.LatLngBounds;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.LocationAppModel;
import app.chalo.permissions.models.AppPermission;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import defpackage.mf;
import defpackage.v21;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.titoridedetail.ui.TitoRideDetailsComponent$handleRouteDataUpdate$1", f = "TitoRideDetailComponent.kt", l = {305, 319}, m = "invokeSuspend", v = 1)
final class TitoRideDetailsComponent$handleRouteDataUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StopAppModel $dropOffStop;
    final /* synthetic */ RouteAppModel $routeModel;
    final /* synthetic */ StopAppModel $startStop;
    Object L$0;
    int label;
    final /* synthetic */ TitoRideDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitoRideDetailsComponent$handleRouteDataUpdate$1(TitoRideDetailsComponent titoRideDetailsComponent, StopAppModel stopAppModel, RouteAppModel routeAppModel, StopAppModel stopAppModel2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = titoRideDetailsComponent;
        this.$startStop = stopAppModel;
        this.$routeModel = routeAppModel;
        this.$dropOffStop = stopAppModel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TitoRideDetailsComponent$handleRouteDataUpdate$1(this.this$0, this.$startStop, this.$routeModel, this.$dropOffStop, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TitoRideDetailsComponent$handleRouteDataUpdate$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LatLngBounds latLngBounds;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ChaloLocationManager chaloLocationManager = this.this$0.o;
            this.label = 1;
            obj = chaloLocationManager.a(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LatLngBounds latLngBounds2 = (LatLngBounds) this.L$0;
            ResultKt.b(obj);
            latLngBounds = latLngBounds2;
        }
        boolean zA = ChaloLocationManagerKt.a((AppPermissionRequest) obj);
        TitoRideDetailsComponent titoRideDetailsComponent = this.this$0;
        titoRideDetailsComponent.E0(new mf(titoRideDetailsComponent, this.$routeModel, zA, latLngBounds, this.$dropOffStop, 7));
        return Unit.f17538a;
        LocationAppModel locationAppModelA = ((LocationUpdateResult) obj).a();
        LatLng latLngA = locationAppModelA != null ? locationAppModelA.a() : null;
        TitoRideDetailsComponent titoRideDetailsComponent2 = this.this$0;
        LatLngBoundsUtils latLngBoundsUtils = titoRideDetailsComponent2.y;
        v21 v21Var = new v21(this.$startStop, this.$routeModel, latLngA, titoRideDetailsComponent2, 5);
        Intrinsics.i(latLngBoundsUtils, "<this>");
        ArrayList arrayList = new ArrayList();
        v21Var.invoke(new LatLngBoundsBuilder(arrayList));
        LatLngBounds latLngBoundsA = latLngBoundsUtils.a(arrayList);
        ArePermissionsGrantedUseCase arePermissionsGrantedUseCase = this.this$0.u;
        AppPermission[] appPermissionArr = {AppPermission.FINE_LOCATION};
        this.L$0 = latLngBoundsA;
        this.label = 2;
        arePermissionsGrantedUseCase.getClass();
        Object objA = arePermissionsGrantedUseCase.a(ArraysKt.h0(appPermissionArr), this);
        if (objA != coroutineSingletons) {
            latLngBounds = latLngBoundsA;
            obj = objA;
            boolean zA2 = ChaloLocationManagerKt.a((AppPermissionRequest) obj);
            TitoRideDetailsComponent titoRideDetailsComponent3 = this.this$0;
            titoRideDetailsComponent3.E0(new mf(titoRideDetailsComponent3, this.$routeModel, zA2, latLngBounds, this.$dropOffStop, 7));
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
