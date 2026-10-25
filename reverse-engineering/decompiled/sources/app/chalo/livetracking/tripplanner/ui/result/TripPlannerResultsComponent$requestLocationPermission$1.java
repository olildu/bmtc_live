package app.chalo.livetracking.tripplanner.ui.result;

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
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$requestLocationPermission$1", f = "TripPlannerResultsComponent.kt", l = {1466}, m = "invokeSuspend", v = 1)
final class TripPlannerResultsComponent$requestLocationPermission$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<AppPermission> $permissionList;
    int label;
    final /* synthetic */ TripPlannerResultsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsComponent$requestLocationPermission$1(TripPlannerResultsComponent tripPlannerResultsComponent, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerResultsComponent;
        this.$permissionList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerResultsComponent$requestLocationPermission$1(this.this$0, this.$permissionList, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerResultsComponent$requestLocationPermission$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PermissionHandler permissionHandlerC = this.this$0.D.c();
            if (permissionHandlerC != null) {
                Flow flowA = permissionHandlerC.a(this.$permissionList);
                final TripPlannerResultsComponent tripPlannerResultsComponent = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$requestLocationPermission$1.1

                    /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$requestLocationPermission$1$1$WhenMappings */
                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final /* synthetic */ class WhenMappings {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public static final /* synthetic */ int[] f4791a;

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
                            f4791a = iArr;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        TripPlannerResultsComponent tripPlannerResultsComponent2 = tripPlannerResultsComponent;
                        int i2 = WhenMappings.f4791a[tripPlannerResultsComponent2.F.a(Source.TRIP_PLANNER, MapsKt.q((List) obj2)).ordinal()];
                        if (i2 == 1) {
                            tripPlannerResultsComponent2.T0(TripPlannerResultIntent.LocationEnabledIntent.f4772a);
                            Job job = tripPlannerResultsComponent2.Y;
                            if (job != null) {
                                ((JobSupport) job).cancel(null);
                            }
                            Job job2 = tripPlannerResultsComponent2.X;
                            if (job2 != null) {
                                ((JobSupport) job2).cancel(null);
                            }
                        } else if (i2 == 2) {
                            List listR = CollectionsKt.R(AppPermission.FINE_LOCATION);
                            Job job3 = tripPlannerResultsComponent2.X;
                            if (job3 != null) {
                                ((JobSupport) job3).cancel(null);
                            }
                            tripPlannerResultsComponent2.X = BuildersKt.d(tripPlannerResultsComponent2.j, null, null, new TripPlannerResultsComponent$requestLocationPermission$1(tripPlannerResultsComponent2, listR, null), 3);
                        } else {
                            if (i2 != 3 && i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Job job4 = tripPlannerResultsComponent2.Y;
                            if (job4 != null) {
                                ((JobSupport) job4).cancel(null);
                            }
                            Job job5 = tripPlannerResultsComponent2.X;
                            if (job5 != null) {
                                ((JobSupport) job5).cancel(null);
                            }
                        }
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (flowA.collect(flowCollector, this) == coroutineSingletons) {
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
