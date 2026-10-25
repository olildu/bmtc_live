package app.chalo.onboarding.cityselection.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.location.AppPermissionRequest;
import app.chalo.location.ChaloLocationManagerKt;
import app.chalo.permissions.models.AppPermission;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.cityselection.ui.CitySelectionComponent$checkLocationPermissionStatus$1", f = "CitySelectionComponent.kt", l = {251}, m = "invokeSuspend", v = 1)
final class CitySelectionComponent$checkLocationPermissionStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CitySelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CitySelectionComponent$checkLocationPermissionStatus$1(CitySelectionComponent citySelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = citySelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CitySelectionComponent$checkLocationPermissionStatus$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CitySelectionComponent$checkLocationPermissionStatus$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ArePermissionsGrantedUseCase arePermissionsGrantedUseCase = this.this$0.m;
            AppPermission[] appPermissionArr = {AppPermission.FINE_LOCATION};
            this.label = 1;
            arePermissionsGrantedUseCase.getClass();
            obj = arePermissionsGrantedUseCase.a(ArraysKt.h0(appPermissionArr), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        if (!ChaloLocationManagerKt.a((AppPermissionRequest) obj)) {
            AnalyticsContractImplKt.b(this.this$0.l, "permission_popup", Source.CITY_SELECTION_FRAGMENT, vo1.s("element", "tutorial_location"), false, 24);
        }
        return Unit.f17538a;
    }
}
