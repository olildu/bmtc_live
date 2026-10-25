package app.chalo.locationdisclaimer;

import app.chalo.location.AppPermissionRequest;
import app.chalo.location.ChaloLocationManagerKt;
import app.chalo.permissions.models.AppPermission;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.locationdisclaimer.LocationDisclaimerComponent", f = "LocationDisclaimerComponent.kt", l = {328}, m = "isCoarsePermissionEnabled", v = 1)
final class LocationDisclaimerComponent$isCoarsePermissionEnabled$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocationDisclaimerComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationDisclaimerComponent$isCoarsePermissionEnabled$1(LocationDisclaimerComponent locationDisclaimerComponent, Continuation continuation) {
        super(continuation);
        this.this$0 = locationDisclaimerComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LocationDisclaimerComponent$isCoarsePermissionEnabled$1 locationDisclaimerComponent$isCoarsePermissionEnabled$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        LocationDisclaimerComponent locationDisclaimerComponent = this.this$0;
        locationDisclaimerComponent.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            locationDisclaimerComponent$isCoarsePermissionEnabled$1 = this;
        } else {
            locationDisclaimerComponent$isCoarsePermissionEnabled$1 = new LocationDisclaimerComponent$isCoarsePermissionEnabled$1(locationDisclaimerComponent, this);
        }
        Object objA = locationDisclaimerComponent$isCoarsePermissionEnabled$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = locationDisclaimerComponent$isCoarsePermissionEnabled$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ArePermissionsGrantedUseCase arePermissionsGrantedUseCase = locationDisclaimerComponent.m;
            AppPermission[] appPermissionArr = {AppPermission.COARSE_LOCATION};
            locationDisclaimerComponent$isCoarsePermissionEnabled$1.label = 1;
            arePermissionsGrantedUseCase.getClass();
            objA = arePermissionsGrantedUseCase.a(ArraysKt.h0(appPermissionArr), locationDisclaimerComponent$isCoarsePermissionEnabled$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(ChaloLocationManagerKt.a((AppPermissionRequest) objA));
    }
}
