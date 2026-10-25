package app.chalo.locationdisclaimer;

import app.chalo.constants.Source;
import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.models.AppPermission;
import app.chalo.utils.AppLocationPermissionState;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.locationdisclaimer.LocationDisclaimerComponent$requestLocationPermissions$1", f = "LocationDisclaimerComponent.kt", l = {265}, m = "invokeSuspend", v = 1)
final class LocationDisclaimerComponent$requestLocationPermissions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<AppPermission> $permissionList;
    int label;
    final /* synthetic */ LocationDisclaimerComponent this$0;

    /* JADX INFO: renamed from: app.chalo.locationdisclaimer.LocationDisclaimerComponent$requestLocationPermissions$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LocationDisclaimerComponent f5162a;

        /* JADX INFO: renamed from: app.chalo.locationdisclaimer.LocationDisclaimerComponent$requestLocationPermissions$1$1$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5163a;

            static {
                int[] iArr = new int[AppLocationPermissionState.values().length];
                try {
                    iArr[AppLocationPermissionState.FINE_LOCATION_PROVIDED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AppLocationPermissionState.COARSE_LOCATION_PROVIDED_AND_UPGRADE_NOT_TRIGGERED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AppLocationPermissionState.COARSE_LOCATION_PROVIDED_AND_UPGRADE_DENIED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AppLocationPermissionState.NO_PERMISSION_GRANTED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f5163a = iArr;
            }
        }

        public AnonymousClass1(LocationDisclaimerComponent locationDisclaimerComponent) {
            this.f5162a = locationDisclaimerComponent;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List list, Continuation continuation) {
            LocationDisclaimerComponent$requestLocationPermissions$1$1$emit$1 locationDisclaimerComponent$requestLocationPermissions$1$1$emit$1;
            if (continuation instanceof LocationDisclaimerComponent$requestLocationPermissions$1$1$emit$1) {
                locationDisclaimerComponent$requestLocationPermissions$1$1$emit$1 = (LocationDisclaimerComponent$requestLocationPermissions$1$1$emit$1) continuation;
                int i = locationDisclaimerComponent$requestLocationPermissions$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    locationDisclaimerComponent$requestLocationPermissions$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    locationDisclaimerComponent$requestLocationPermissions$1$1$emit$1 = new LocationDisclaimerComponent$requestLocationPermissions$1$1$emit$1(this, continuation);
                }
            } else {
                locationDisclaimerComponent$requestLocationPermissions$1$1$emit$1 = new LocationDisclaimerComponent$requestLocationPermissions$1$1$emit$1(this, continuation);
            }
            Object obj = locationDisclaimerComponent$requestLocationPermissions$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = locationDisclaimerComponent$requestLocationPermissions$1$1$emit$1.label;
            LocationDisclaimerComponent locationDisclaimerComponent = this.f5162a;
            if (i2 == 0) {
                ResultKt.b(obj);
                locationDisclaimerComponent$requestLocationPermissions$1$1$emit$1.L$0 = list;
                locationDisclaimerComponent$requestLocationPermissions$1$1$emit$1.label = 1;
                if (LocationDisclaimerComponent.G0(locationDisclaimerComponent, locationDisclaimerComponent$requestLocationPermissions$1$1$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) locationDisclaimerComponent$requestLocationPermissions$1$1$emit$1.L$0;
                ResultKt.b(obj);
            }
            int i3 = WhenMappings.f5163a[locationDisclaimerComponent.q.a(Source.LOCATION_DISCLAIMER_ACTIVITY, MapsKt.q(list)).ordinal()];
            if (i3 == 1) {
                LocationDisclaimerComponent.H0(locationDisclaimerComponent);
            } else if (i3 == 2) {
                List listS = CollectionsKt.S(AppPermission.COARSE_LOCATION, AppPermission.FINE_LOCATION);
                Job job = locationDisclaimerComponent.w;
                if (job != null) {
                    ((JobSupport) job).cancel(null);
                }
                locationDisclaimerComponent.w = BuildersKt.d(locationDisclaimerComponent.j, null, null, new LocationDisclaimerComponent$requestLocationPermissions$1(locationDisclaimerComponent, listS, null), 3);
            } else {
                if (i3 != 3 && i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                locationDisclaimerComponent.s.b();
                Job job2 = locationDisclaimerComponent.w;
                if (job2 != null) {
                    ((JobSupport) job2).cancel(null);
                }
                Job job3 = locationDisclaimerComponent.v;
                if (job3 != null) {
                    ((JobSupport) job3).cancel(null);
                }
                Job job4 = locationDisclaimerComponent.y;
                if (job4 != null) {
                    ((JobSupport) job4).cancel(null);
                }
                Job job5 = locationDisclaimerComponent.x;
                if (job5 != null) {
                    ((JobSupport) job5).cancel(null);
                }
            }
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationDisclaimerComponent$requestLocationPermissions$1(LocationDisclaimerComponent locationDisclaimerComponent, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = locationDisclaimerComponent;
        this.$permissionList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationDisclaimerComponent$requestLocationPermissions$1(this.this$0, this.$permissionList, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationDisclaimerComponent$requestLocationPermissions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PermissionHandler permissionHandlerC = this.this$0.p.c();
            if (permissionHandlerC != null) {
                Flow flowA = permissionHandlerC.a(this.$permissionList);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                this.label = 1;
                if (flowA.collect(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
