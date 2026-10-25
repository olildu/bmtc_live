package app.chalo.location;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.models.LocationAppModel;
import app.chalo.permissions.models.AppPermission;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.utils.chalologger.ChaloLog;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/location/ChaloLocationManagerImpl;", "Lapp/chalo/location/ChaloLocationManager;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloLocationManagerImpl implements ChaloLocationManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArePermissionsGrantedUseCase f5125a;
    public final BasicInfoContract b;
    public final ChaloLocationDelegate c;
    public final CrashlyticsLogger d;
    public final LastKnownLocationProvider e;
    public final SharedFlowImpl f;
    public final SharedFlowImpl g;

    /* JADX INFO: renamed from: app.chalo.location.ChaloLocationManagerImpl$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isAnyActiveSubscriberPresent", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.location.ChaloLocationManagerImpl$2", f = "ChaloLocationManagerImpl.kt", l = {55}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = ChaloLocationManagerImpl.this.new AnonymousClass2(continuation);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((AnonymousClass2) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Unit unit = Unit.f17538a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            ResultKt.b(obj);
            if (this.Z$0) {
                SharedFlowImpl sharedFlowImpl = ChaloLocationManagerImpl.this.g;
                this.label = 1;
                if (sharedFlowImpl.emit(unit, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return unit;
        }
    }

    /* JADX INFO: renamed from: app.chalo.location.ChaloLocationManagerImpl$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "locationUpdateResult", "Lapp/chalo/location/LocationUpdateResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.location.ChaloLocationManagerImpl$4", f = "ChaloLocationManagerImpl.kt", l = {65}, m = "invokeSuspend", v = 1)
    final class AnonymousClass4 extends SuspendLambda implements Function2<LocationUpdateResult, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass4 anonymousClass4 = ChaloLocationManagerImpl.this.new AnonymousClass4(continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((LocationUpdateResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                LocationUpdateResult locationUpdateResult = (LocationUpdateResult) this.L$0;
                SharedFlowImpl sharedFlowImpl = ChaloLocationManagerImpl.this.f;
                this.label = 1;
                if (sharedFlowImpl.emit(locationUpdateResult, this) == coroutineSingletons) {
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

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/location/ChaloLocationManagerImpl$Companion;", "", "", "DEFAULT_LOCATION_UPDATE_INTERVAL", "J", "BUFFER_TIME_TO_CONSIDER_SYSTEM_RECHECK_IN_MILLIS", "DEFAULT_STALE_LOCATION_UPDATE_CHECK_INTERVAL", "DEFAULT_SYSTEM_ALIVE_CHECK_INTERVAL", "", "TAG", "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ChaloLocationManagerImpl(ArePermissionsGrantedUseCase arePermissionsGrantedUseCase, BasicInfoContract basicInfoContract, CoroutineContextProvider coroutineContextProvider, ChaloLocationDelegate chaloLocationDelegate, CrashlyticsLogger crashlyticsLogger, LastKnownLocationProvider lastKnownLocationProvider) {
        this.f5125a = arePermissionsGrantedUseCase;
        this.b = basicInfoContract;
        this.c = chaloLocationDelegate;
        this.d = crashlyticsLogger;
        this.e = lastKnownLocationProvider;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.a());
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 0, null, 6);
        this.f = sharedFlowImplB;
        this.g = SharedFlowKt.b(1, 0, null, 6);
        final StateFlow stateFlowG = sharedFlowImplB.g();
        FlowKt.A(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(FlowKt.H(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(FlowKt.m(new Flow<Boolean>() { // from class: app.chalo.location.ChaloLocationManagerImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.location.ChaloLocationManagerImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f5131a;

                /* JADX INFO: renamed from: app.chalo.location.ChaloLocationManagerImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.location.ChaloLocationManagerImpl$special$$inlined$map$1$2", f = "ChaloLocationManagerImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f5131a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        Boolean boolValueOf = Boolean.valueOf(((Number) obj).intValue() >= 1);
                        anonymousClass1.label = 1;
                        if (this.f5131a.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = stateFlowG.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }), new AnonymousClass2(null)), new ChaloLocationManagerImpl$special$$inlined$flatMapLatest$1(this, null)), new AnonymousClass4(null)), contextScopeA);
    }

    public static LocationUpdateResult h(LocationManagerResult.LocationPreconditionsStatus locationPreconditionsStatus) {
        if (locationPreconditionsStatus instanceof LocationManagerResult.LocationPreconditionsStatus.GeneralException) {
            return new LocationUpdateResult.GeneralException(((LocationManagerResult.LocationPreconditionsStatus.GeneralException) locationPreconditionsStatus).f5141a);
        }
        if (locationPreconditionsStatus instanceof LocationManagerResult.LocationPreconditionsStatus.RequestLocationPermission) {
            LocationManagerResult.LocationPreconditionsStatus.RequestLocationPermission requestLocationPermission = (LocationManagerResult.LocationPreconditionsStatus.RequestLocationPermission) locationPreconditionsStatus;
            return new LocationUpdateResult.RequestLocationPermission(requestLocationPermission.f5143a, requestLocationPermission.b);
        }
        if (Intrinsics.d(locationPreconditionsStatus, LocationManagerResult.LocationPreconditionsStatus.ProcessCancelled.f5142a)) {
            return new LocationUpdateResult.GeneralException(null);
        }
        if (locationPreconditionsStatus instanceof LocationManagerResult.LocationPreconditionsStatus.SettingsResolutionRequired) {
            return new LocationUpdateResult.SettingsResolutionRequired(((LocationManagerResult.LocationPreconditionsStatus.SettingsResolutionRequired) locationPreconditionsStatus).f5144a);
        }
        if (Intrinsics.d(locationPreconditionsStatus, LocationManagerResult.LocationPreconditionsStatus.SettingsUnavailable.f5145a)) {
            return LocationUpdateResult.SettingsUnavailable.f5158a;
        }
        if (Intrinsics.d(locationPreconditionsStatus, LocationManagerResult.LocationPreconditionsStatus.CheckNotStarted.f5140a) || Intrinsics.d(locationPreconditionsStatus, LocationManagerResult.LocationPreconditionsStatus.CheckInProgress.f5139a) || Intrinsics.d(locationPreconditionsStatus, LocationManagerResult.LocationPreconditionsStatus.SystemConditionsSatisfied.f5146a)) {
            return LocationUpdateResult.Initiated.f5152a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static LocationUpdateResult i(LocationManagerResult.LocationUpdateStatus locationUpdateStatus) {
        if (Intrinsics.d(locationUpdateStatus, LocationManagerResult.LocationUpdateStatus.Initiated.f5147a)) {
            return LocationUpdateResult.Initiated.f5152a;
        }
        if (locationUpdateStatus instanceof LocationManagerResult.LocationUpdateStatus.Location) {
            return new LocationUpdateResult.LocationReceived(((LocationManagerResult.LocationUpdateStatus.Location) locationUpdateStatus).f5148a);
        }
        if (locationUpdateStatus instanceof LocationManagerResult.LocationUpdateStatus.LocationFetchFailed) {
            return new LocationUpdateResult.LocationFetchFailed(((LocationManagerResult.LocationUpdateStatus.LocationFetchFailed) locationUpdateStatus).f5149a);
        }
        if (Intrinsics.d(locationUpdateStatus, LocationManagerResult.LocationUpdateStatus.NoLocation.f5150a)) {
            return LocationUpdateResult.NoValidLocation.f5155a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.location.ChaloLocationManager
    public final Object a(Continuation continuation) throws Exception {
        ChaloLocationManagerImpl$getLastKnownLocation$1 chaloLocationManagerImpl$getLastKnownLocation$1;
        ChaloLocationManagerImpl chaloLocationManagerImpl;
        LocationManagerResult.LocationUpdateStatus locationUpdateStatus;
        Object objG;
        LocationManagerResult.LocationUpdateStatus locationUpdateStatus2;
        LatLng latLng;
        if (continuation instanceof ChaloLocationManagerImpl$getLastKnownLocation$1) {
            chaloLocationManagerImpl$getLastKnownLocation$1 = (ChaloLocationManagerImpl$getLastKnownLocation$1) continuation;
            int i = chaloLocationManagerImpl$getLastKnownLocation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloLocationManagerImpl$getLastKnownLocation$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloLocationManagerImpl$getLastKnownLocation$1 = new ChaloLocationManagerImpl$getLastKnownLocation$1(this, continuation);
            }
        } else {
            chaloLocationManagerImpl$getLastKnownLocation$1 = new ChaloLocationManagerImpl$getLastKnownLocation$1(this, continuation);
        }
        Object objA = chaloLocationManagerImpl$getLastKnownLocation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloLocationManagerImpl$getLastKnownLocation$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloLocationManagerImpl$getLastKnownLocation$1.L$0 = this;
            chaloLocationManagerImpl$getLastKnownLocation$1.label = 1;
            objA = this.c.a(chaloLocationManagerImpl$getLastKnownLocation$1);
            if (objA != coroutineSingletons) {
                chaloLocationManagerImpl = this;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            chaloLocationManagerImpl = (ChaloLocationManagerImpl) chaloLocationManagerImpl$getLastKnownLocation$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 == 2) {
                ResultKt.b(objA);
                locationUpdateStatus = (LocationManagerResult.LocationUpdateStatus) objA;
                if (locationUpdateStatus instanceof LocationManagerResult.LocationUpdateStatus.NoLocation) {
                    chaloLocationManagerImpl$getLastKnownLocation$1.L$0 = locationUpdateStatus;
                    chaloLocationManagerImpl$getLastKnownLocation$1.label = 3;
                    int i3 = LastKnownLocationProvider.e;
                    LastKnownLocationProvider lastKnownLocationProvider = this.e;
                    objG = BuildersKt.g(lastKnownLocationProvider.b, new LastKnownLocationProvider$getRawLatLng$2(lastKnownLocationProvider, 600000L, null), chaloLocationManagerImpl$getLastKnownLocation$1);
                    if (objG != coroutineSingletons) {
                        locationUpdateStatus2 = locationUpdateStatus;
                        objA = objG;
                    }
                    return coroutineSingletons;
                }
                return i(locationUpdateStatus);
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            locationUpdateStatus2 = (LocationManagerResult.LocationUpdateStatus) chaloLocationManagerImpl$getLastKnownLocation$1.L$0;
            ResultKt.b(objA);
        }
        latLng = (LatLng) objA;
        if (latLng == null) {
            locationUpdateStatus = locationUpdateStatus2;
            return i(locationUpdateStatus);
        }
        ChaloLog.b("ChaloLocationManager", "returning cached last known location");
        return i(new LocationManagerResult.LocationUpdateStatus.Location(new LocationAppModel(latLng.f5134a, latLng.b)));
        chaloLocationManagerImpl$getLastKnownLocation$1.L$0 = null;
        chaloLocationManagerImpl$getLastKnownLocation$1.label = 2;
        objA = chaloLocationManagerImpl.g((LatLng) objA, chaloLocationManagerImpl$getLastKnownLocation$1);
        if (objA != coroutineSingletons) {
            locationUpdateStatus = (LocationManagerResult.LocationUpdateStatus) objA;
            if (locationUpdateStatus instanceof LocationManagerResult.LocationUpdateStatus.NoLocation) {
                chaloLocationManagerImpl$getLastKnownLocation$1.L$0 = locationUpdateStatus;
                chaloLocationManagerImpl$getLastKnownLocation$1.label = 3;
                int i4 = LastKnownLocationProvider.e;
                LastKnownLocationProvider lastKnownLocationProvider2 = this.e;
                objG = BuildersKt.g(lastKnownLocationProvider2.b, new LastKnownLocationProvider$getRawLatLng$2(lastKnownLocationProvider2, 600000L, null), chaloLocationManagerImpl$getLastKnownLocation$1);
                if (objG != coroutineSingletons) {
                    locationUpdateStatus2 = locationUpdateStatus;
                    objA = objG;
                    latLng = (LatLng) objA;
                    if (latLng == null) {
                        ChaloLog.b("ChaloLocationManager", "returning cached last known location");
                        return i(new LocationManagerResult.LocationUpdateStatus.Location(new LocationAppModel(latLng.f5134a, latLng.b)));
                    }
                    locationUpdateStatus = locationUpdateStatus2;
                }
            }
            return i(locationUpdateStatus);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r7 == r1) goto L25;
     */
    @Override // app.chalo.location.ChaloLocationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum b(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof app.chalo.location.ChaloLocationManagerImpl$isGpsEnabled$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.location.ChaloLocationManagerImpl$isGpsEnabled$1 r0 = (app.chalo.location.ChaloLocationManagerImpl$isGpsEnabled$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.location.ChaloLocationManagerImpl$isGpsEnabled$1 r0 = new app.chalo.location.ChaloLocationManagerImpl$isGpsEnabled$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)
            goto L6d
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            kotlin.ResultKt.b(r7)
            goto L53
        L36:
            kotlin.ResultKt.b(r7)
            r0.label = r4
            app.chalo.permissions.models.AppPermission[] r7 = new app.chalo.permissions.models.AppPermission[r3]
            app.chalo.permissions.models.AppPermission r2 = app.chalo.permissions.models.AppPermission.COARSE_LOCATION
            r5 = 0
            r7[r5] = r2
            app.chalo.permissions.models.AppPermission r2 = app.chalo.permissions.models.AppPermission.FINE_LOCATION
            r7[r4] = r2
            java.util.List r7 = kotlin.collections.ArraysKt.h0(r7)
            app.chalo.usecase.ArePermissionsGrantedUseCase r2 = r6.f5125a
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 != r1) goto L53
            goto L6c
        L53:
            app.chalo.location.AppPermissionRequest r7 = (app.chalo.location.AppPermissionRequest) r7
            java.util.List r7 = r7.b
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L62
            app.chalo.location.GpsState r7 = app.chalo.location.GpsState.LOCATION_PERMISSION_NOT_GRANTED
            return r7
        L62:
            r0.label = r3
            app.chalo.location.ChaloLocationDelegate r7 = r6.c
            java.lang.Boolean r7 = r7.b()
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L78
            app.chalo.location.GpsState r7 = app.chalo.location.GpsState.ENABLED
            return r7
        L78:
            app.chalo.location.GpsState r7 = app.chalo.location.GpsState.DISABLED
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.location.ChaloLocationManagerImpl.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Enum");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.location.ChaloLocationManager
    public final Object c(ContinuationImpl continuationImpl) throws Exception {
        ChaloLocationManagerImpl$getCurrentLocation$1 chaloLocationManagerImpl$getCurrentLocation$1;
        ChaloLocationManagerImpl chaloLocationManagerImpl;
        ChaloLocationManagerImpl chaloLocationManagerImpl2;
        ChaloLocationManagerImpl chaloLocationManagerImpl3;
        if (continuationImpl instanceof ChaloLocationManagerImpl$getCurrentLocation$1) {
            chaloLocationManagerImpl$getCurrentLocation$1 = (ChaloLocationManagerImpl$getCurrentLocation$1) continuationImpl;
            int i = chaloLocationManagerImpl$getCurrentLocation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloLocationManagerImpl$getCurrentLocation$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloLocationManagerImpl$getCurrentLocation$1 = new ChaloLocationManagerImpl$getCurrentLocation$1(this, continuationImpl);
            }
        } else {
            chaloLocationManagerImpl$getCurrentLocation$1 = new ChaloLocationManagerImpl$getCurrentLocation$1(this, continuationImpl);
        }
        Object objF = chaloLocationManagerImpl$getCurrentLocation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloLocationManagerImpl$getCurrentLocation$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            chaloLocationManagerImpl$getCurrentLocation$1.label = 1;
            objF = f(chaloLocationManagerImpl$getCurrentLocation$1);
            if (objF != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objF);
        } else {
            if (i2 == 2) {
                chaloLocationManagerImpl = (ChaloLocationManagerImpl) chaloLocationManagerImpl$getCurrentLocation$1.L$1;
                chaloLocationManagerImpl2 = (ChaloLocationManagerImpl) chaloLocationManagerImpl$getCurrentLocation$1.L$0;
                ResultKt.b(objF);
                chaloLocationManagerImpl$getCurrentLocation$1.L$0 = chaloLocationManagerImpl2;
                chaloLocationManagerImpl$getCurrentLocation$1.L$1 = null;
                chaloLocationManagerImpl$getCurrentLocation$1.label = 3;
                objF = chaloLocationManagerImpl.g((LatLng) objF, chaloLocationManagerImpl$getCurrentLocation$1);
                if (objF != coroutineSingletons) {
                    chaloLocationManagerImpl3 = chaloLocationManagerImpl2;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloLocationManagerImpl3 = (ChaloLocationManagerImpl) chaloLocationManagerImpl$getCurrentLocation$1.L$0;
            ResultKt.b(objF);
        }
        chaloLocationManagerImpl3.getClass();
        return i((LocationManagerResult.LocationUpdateStatus) objF);
        LocationManagerResult.LocationPreconditionsStatus locationPreconditionsStatus = (LocationManagerResult.LocationPreconditionsStatus) objF;
        if (!Intrinsics.d(locationPreconditionsStatus, LocationManagerResult.LocationPreconditionsStatus.SystemConditionsSatisfied.f5146a)) {
            if (Intrinsics.d(locationPreconditionsStatus, LocationManagerResult.LocationPreconditionsStatus.CheckNotStarted.f5140a) || Intrinsics.d(locationPreconditionsStatus, LocationManagerResult.LocationPreconditionsStatus.CheckInProgress.f5139a) || (locationPreconditionsStatus instanceof LocationManagerResult.LocationPreconditionsStatus.GeneralException) || (locationPreconditionsStatus instanceof LocationManagerResult.LocationPreconditionsStatus.RequestLocationPermission) || Intrinsics.d(locationPreconditionsStatus, LocationManagerResult.LocationPreconditionsStatus.ProcessCancelled.f5142a) || (locationPreconditionsStatus instanceof LocationManagerResult.LocationPreconditionsStatus.SettingsResolutionRequired) || Intrinsics.d(locationPreconditionsStatus, LocationManagerResult.LocationPreconditionsStatus.SettingsUnavailable.f5145a)) {
                return h(locationPreconditionsStatus);
            }
            throw new NoWhenBranchMatchedException();
        }
        chaloLocationManagerImpl$getCurrentLocation$1.L$0 = this;
        chaloLocationManagerImpl$getCurrentLocation$1.L$1 = this;
        chaloLocationManagerImpl$getCurrentLocation$1.label = 2;
        objF = this.c.e(chaloLocationManagerImpl$getCurrentLocation$1);
        if (objF != coroutineSingletons) {
            chaloLocationManagerImpl = this;
            chaloLocationManagerImpl2 = chaloLocationManagerImpl;
            chaloLocationManagerImpl$getCurrentLocation$1.L$0 = chaloLocationManagerImpl2;
            chaloLocationManagerImpl$getCurrentLocation$1.L$1 = null;
            chaloLocationManagerImpl$getCurrentLocation$1.label = 3;
            objF = chaloLocationManagerImpl.g((LatLng) objF, chaloLocationManagerImpl$getCurrentLocation$1);
            if (objF != coroutineSingletons) {
                chaloLocationManagerImpl3 = chaloLocationManagerImpl2;
                chaloLocationManagerImpl3.getClass();
                return i((LocationManagerResult.LocationUpdateStatus) objF);
            }
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.location.ChaloLocationManager
    public final Object d() {
        return FlowKt.b(this.f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(LatLng latLng, ContinuationImpl continuationImpl) throws Exception {
        ChaloLocationManagerImpl$cacheLocation$1 chaloLocationManagerImpl$cacheLocation$1;
        if (continuationImpl instanceof ChaloLocationManagerImpl$cacheLocation$1) {
            chaloLocationManagerImpl$cacheLocation$1 = (ChaloLocationManagerImpl$cacheLocation$1) continuationImpl;
            int i = chaloLocationManagerImpl$cacheLocation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloLocationManagerImpl$cacheLocation$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloLocationManagerImpl$cacheLocation$1 = new ChaloLocationManagerImpl$cacheLocation$1(this, continuationImpl);
            }
        } else {
            chaloLocationManagerImpl$cacheLocation$1 = new ChaloLocationManagerImpl$cacheLocation$1(this, continuationImpl);
        }
        Object obj = chaloLocationManagerImpl$cacheLocation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloLocationManagerImpl$cacheLocation$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                LastKnownLocationProvider lastKnownLocationProvider = this.e;
                chaloLocationManagerImpl$cacheLocation$1.label = 1;
                if (LastKnownLocationProvider.c(lastKnownLocationProvider, latLng, chaloLocationManagerImpl$cacheLocation$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
            ChaloLog.c("ChaloLocationManager", "failed to cache last known location", e);
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ContinuationImpl continuationImpl) {
        ChaloLocationManagerImpl$checkSystemLocationSettings$1 chaloLocationManagerImpl$checkSystemLocationSettings$1;
        if (continuationImpl instanceof ChaloLocationManagerImpl$checkSystemLocationSettings$1) {
            chaloLocationManagerImpl$checkSystemLocationSettings$1 = (ChaloLocationManagerImpl$checkSystemLocationSettings$1) continuationImpl;
            int i = chaloLocationManagerImpl$checkSystemLocationSettings$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloLocationManagerImpl$checkSystemLocationSettings$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloLocationManagerImpl$checkSystemLocationSettings$1 = new ChaloLocationManagerImpl$checkSystemLocationSettings$1(this, continuationImpl);
            }
        } else {
            chaloLocationManagerImpl$checkSystemLocationSettings$1 = new ChaloLocationManagerImpl$checkSystemLocationSettings$1(this, continuationImpl);
        }
        Object objA = chaloLocationManagerImpl$checkSystemLocationSettings$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloLocationManagerImpl$checkSystemLocationSettings$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloLocationManagerImpl$checkSystemLocationSettings$1.label = 1;
            objA = this.f5125a.a(ArraysKt.h0(new AppPermission[]{AppPermission.COARSE_LOCATION, AppPermission.FINE_LOCATION}), chaloLocationManagerImpl$checkSystemLocationSettings$1);
            if (objA != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return objA;
        }
        ResultKt.b(objA);
        AppPermissionRequest appPermissionRequest = (AppPermissionRequest) objA;
        if (!appPermissionRequest.b.isEmpty()) {
            return new LocationManagerResult.LocationPreconditionsStatus.RequestLocationPermission(appPermissionRequest.f5114a, appPermissionRequest.b);
        }
        chaloLocationManagerImpl$checkSystemLocationSettings$1.label = 2;
        Object objC = this.c.c(chaloLocationManagerImpl$checkSystemLocationSettings$1);
        return objC == coroutineSingletons ? coroutineSingletons : objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(LatLng latLng, ContinuationImpl continuationImpl) throws Exception {
        ChaloLocationManagerImpl$getLocationUpdateStatus$1 chaloLocationManagerImpl$getLocationUpdateStatus$1;
        if (continuationImpl instanceof ChaloLocationManagerImpl$getLocationUpdateStatus$1) {
            chaloLocationManagerImpl$getLocationUpdateStatus$1 = (ChaloLocationManagerImpl$getLocationUpdateStatus$1) continuationImpl;
            int i = chaloLocationManagerImpl$getLocationUpdateStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloLocationManagerImpl$getLocationUpdateStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloLocationManagerImpl$getLocationUpdateStatus$1 = new ChaloLocationManagerImpl$getLocationUpdateStatus$1(this, continuationImpl);
            }
        } else {
            chaloLocationManagerImpl$getLocationUpdateStatus$1 = new ChaloLocationManagerImpl$getLocationUpdateStatus$1(this, continuationImpl);
        }
        Object obj = chaloLocationManagerImpl$getLocationUpdateStatus$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloLocationManagerImpl$getLocationUpdateStatus$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                if (latLng == null) {
                    return LocationManagerResult.LocationUpdateStatus.NoLocation.f5150a;
                }
                chaloLocationManagerImpl$getLocationUpdateStatus$1.L$0 = latLng;
                chaloLocationManagerImpl$getLocationUpdateStatus$1.label = 1;
                if (e(latLng, chaloLocationManagerImpl$getLocationUpdateStatus$1) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                latLng = (LatLng) chaloLocationManagerImpl$getLocationUpdateStatus$1.L$0;
                ResultKt.b(obj);
            }
            return new LocationManagerResult.LocationUpdateStatus.Location(new LocationAppModel(latLng.f5134a, latLng.b));
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
            this.d.i(e);
            return new LocationManagerResult.LocationUpdateStatus.LocationFetchFailed(e);
        }
    }
}
