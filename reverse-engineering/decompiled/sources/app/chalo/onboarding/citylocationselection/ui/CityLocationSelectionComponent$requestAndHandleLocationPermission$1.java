package app.chalo.onboarding.citylocationselection.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.models.AppPermission;
import app.chalo.permissions.models.PermissionState;
import app.chalo.utils.AppLocationPermissionState;
import app.chalo.utils.LocationPermissionCallbackHandler;
import defpackage.ko;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
@DebugMetadata(c = "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$requestAndHandleLocationPermission$1", f = "CityLocationSelectionComponent.kt", l = {918}, m = "invokeSuspend", v = 1)
final class CityLocationSelectionComponent$requestAndHandleLocationPermission$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PermissionHandler $permissionHandler;
    int label;
    final /* synthetic */ CityLocationSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityLocationSelectionComponent$requestAndHandleLocationPermission$1(PermissionHandler permissionHandler, CityLocationSelectionComponent cityLocationSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.$permissionHandler = permissionHandler;
        this.this$0 = cityLocationSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CityLocationSelectionComponent$requestAndHandleLocationPermission$1(this.$permissionHandler, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CityLocationSelectionComponent$requestAndHandleLocationPermission$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowA = this.$permissionHandler.a(CollectionsKt.S(AppPermission.FINE_LOCATION, AppPermission.COARSE_LOCATION));
            final CityLocationSelectionComponent cityLocationSelectionComponent = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$requestAndHandleLocationPermission$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    PermissionState permissionState;
                    CityLocationSelectionComponent cityLocationSelectionComponent2 = cityLocationSelectionComponent;
                    LocationPermissionCallbackHandler locationPermissionCallbackHandler = cityLocationSelectionComponent2.x;
                    Source source = Source.ONBOARDING_LOCATION_SHARING_SCREEN;
                    AppLocationPermissionState appLocationPermissionStateA = locationPermissionCallbackHandler.a(source, MapsKt.q((List) obj2));
                    AnalyticsContract analyticsContract = cityLocationSelectionComponent2.p;
                    LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("type", "FINE_LOCATION"), new Pair("locPermissionState", appLocationPermissionStateA.name()));
                    int[] iArr = CityLocationSelectionComponent.WhenMappings.c;
                    int i2 = iArr[appLocationPermissionStateA.ordinal()];
                    if (i2 == 1) {
                        permissionState = PermissionState.GRANTED;
                    } else if (i2 == 2) {
                        permissionState = null;
                    } else {
                        if (i2 != 3 && i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        permissionState = PermissionState.DENIED;
                    }
                    if (permissionState != null) {
                        linkedHashMapK.put("result", permissionState.name());
                    }
                    AnalyticsContractImplKt.b(analyticsContract, "permission result event", source, linkedHashMapK, false, 24);
                    int i3 = iArr[appLocationPermissionStateA.ordinal()];
                    if (i3 == 1) {
                        cityLocationSelectionComponent2.E0(new ko(15));
                        cityLocationSelectionComponent2.M0(CityLocationSelectionIntent.OnLocationPermissionGranted.f6591a);
                    } else if (i3 != 2) {
                        CityLocationSelectionIntent.UserRefusedLocationPermission userRefusedLocationPermission = CityLocationSelectionIntent.UserRefusedLocationPermission.f6595a;
                        if (i3 == 3) {
                            cityLocationSelectionComponent2.M0(userRefusedLocationPermission);
                            cityLocationSelectionComponent2.E0(new ko(15));
                        } else {
                            if (i3 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cityLocationSelectionComponent2.M0(userRefusedLocationPermission);
                            cityLocationSelectionComponent2.E0(new ko(12));
                        }
                    } else {
                        cityLocationSelectionComponent2.P0();
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
