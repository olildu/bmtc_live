package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.location.LocationUpdateResult;
import app.chalo.permissions.gps.GpsRequestHandler;
import app.chalo.permissions.models.AppPermission;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$checkLocationPermission$1", f = "TripPlannerResultsComponent.kt", l = {1424, 1426}, m = "invokeSuspend", v = 1)
final class TripPlannerResultsComponent$checkLocationPermission$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TripPlannerResultsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$checkLocationPermission$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "locationUpdateResult", "Lapp/chalo/location/LocationUpdateResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$checkLocationPermission$1$1", f = "TripPlannerResultsComponent.kt", l = {1441}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<LocationUpdateResult, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TripPlannerResultsComponent this$0;

        /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$checkLocationPermission$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        final class C01221<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ TripPlannerResultsComponent f4788a;

            public C01221(TripPlannerResultsComponent tripPlannerResultsComponent) {
                this.f4788a = tripPlannerResultsComponent;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object a(boolean z, Continuation continuation) {
                TripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1 tripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1;
                KotlinToastManager kotlinToastManager;
                if (continuation instanceof TripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1) {
                    tripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1 = (TripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1) continuation;
                    int i = tripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        tripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1 = new TripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1(this, continuation);
                    }
                } else {
                    tripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1 = new TripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1(this, continuation);
                }
                Object objB = tripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = tripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1.label;
                TripPlannerResultsComponent tripPlannerResultsComponent = this.f4788a;
                if (i2 == 0) {
                    ResultKt.b(objB);
                    if (!z) {
                        kotlinToastManager = tripPlannerResultsComponent.B;
                        tripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1.L$0 = kotlinToastManager;
                        tripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1.label = 1;
                        objB = tripPlannerResultsComponent.o.b(StringEnum.GPS_NOT_AVAILABLE_TOAST, new Object[0], tripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1);
                        if (objB == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Unit.f17538a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinToastManager = (KotlinToastManager) tripPlannerResultsComponent$checkLocationPermission$1$1$1$emit$1.L$0;
                ResultKt.b(objB);
                KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                Job job = tripPlannerResultsComponent.Y;
                if (job != null) {
                    ((JobSupport) job).cancel(null);
                }
                return Unit.f17538a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TripPlannerResultsComponent tripPlannerResultsComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tripPlannerResultsComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((LocationUpdateResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                LocationUpdateResult locationUpdateResult = (LocationUpdateResult) this.L$0;
                if (locationUpdateResult instanceof LocationUpdateResult.LocationReceived) {
                    this.this$0.T0(TripPlannerResultIntent.LocationEnabledIntent.f4772a);
                    Job job = this.this$0.Y;
                    if (job != null) {
                        ((JobSupport) job).cancel(null);
                    }
                } else if (!Intrinsics.d(locationUpdateResult, LocationUpdateResult.Initiated.f5152a)) {
                    if (Intrinsics.d(locationUpdateResult, LocationUpdateResult.SettingsUnavailable.f5158a) || Intrinsics.d(locationUpdateResult, LocationUpdateResult.NoValidLocation.f5155a) || (locationUpdateResult instanceof LocationUpdateResult.LocationFetchFailed) || (locationUpdateResult instanceof LocationUpdateResult.GeneralException)) {
                        Job job2 = this.this$0.Y;
                        if (job2 != null) {
                            ((JobSupport) job2).cancel(null);
                        }
                    } else if (locationUpdateResult instanceof LocationUpdateResult.SettingsResolutionRequired) {
                        GpsRequestHandler gpsRequestHandlerC = this.this$0.G.c();
                        if (gpsRequestHandlerC != null) {
                            Flow flowA = gpsRequestHandlerC.a(((LocationUpdateResult.SettingsResolutionRequired) locationUpdateResult).f5157a);
                            C01221 c01221 = new C01221(this.this$0);
                            this.label = 1;
                            if (flowA.collect(c01221, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (!(locationUpdateResult instanceof LocationUpdateResult.RequestLocationPermission)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        TripPlannerResultsComponent tripPlannerResultsComponent = this.this$0;
                        List listS = CollectionsKt.S(AppPermission.FINE_LOCATION, AppPermission.COARSE_LOCATION);
                        Job job3 = tripPlannerResultsComponent.X;
                        if (job3 != null) {
                            ((JobSupport) job3).cancel(null);
                        }
                        tripPlannerResultsComponent.X = BuildersKt.d(tripPlannerResultsComponent.j, null, null, new TripPlannerResultsComponent$requestLocationPermission$1(tripPlannerResultsComponent, listS, null), 3);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsComponent$checkLocationPermission$1(TripPlannerResultsComponent tripPlannerResultsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerResultsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerResultsComponent$checkLocationPermission$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerResultsComponent$checkLocationPermission$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r1.o0(r7, r3, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r7)
            goto L4d
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.L$0
            app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent r1 = (app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent) r1
            kotlin.ResultKt.b(r7)
            goto L32
        L20:
            kotlin.ResultKt.b(r7)
            app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent r1 = r6.this$0
            app.chalo.location.ChaloLocationManager r7 = r1.H
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r7.d()
            if (r7 != r0) goto L32
            goto L4c
        L32:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.m(r7)
            app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$checkLocationPermission$1$1 r3 = new app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$checkLocationPermission$1$1
            app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent r4 = r6.this$0
            r5 = 0
            r3.<init>(r4, r5)
            r6.L$0 = r5
            r6.label = r2
            java.util.List r2 = app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent.Z
            java.lang.Object r7 = r1.o0(r7, r3, r6)
            if (r7 != r0) goto L4d
        L4c:
            return r0
        L4d:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$checkLocationPermission$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
