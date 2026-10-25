package app.chalo.locationdisclaimer;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.location.LocationUpdateResult;
import app.chalo.permissions.models.AppPermission;
import app.chalo.scenes.ChaloNavigationManagerKt;
import defpackage.kf0;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.locationdisclaimer.LocationDisclaimerComponent$showLocationEnablePrompt$1", f = "LocationDisclaimerComponent.kt", l = {192, 192}, m = "invokeSuspend", v = 1)
final class LocationDisclaimerComponent$showLocationEnablePrompt$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LocationDisclaimerComponent this$0;

    /* JADX INFO: renamed from: app.chalo.locationdisclaimer.LocationDisclaimerComponent$showLocationEnablePrompt$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LocationDisclaimerComponent f5164a;

        public AnonymousClass1(LocationDisclaimerComponent locationDisclaimerComponent) {
            this.f5164a = locationDisclaimerComponent;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(LocationUpdateResult locationUpdateResult, Continuation continuation) {
            LocationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1 locationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1;
            AnalyticsContract analyticsContract;
            Source source;
            String str;
            if (continuation instanceof LocationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1) {
                locationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1 = (LocationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1) continuation;
                int i = locationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    locationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    locationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1 = new LocationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1(this, continuation);
                }
            } else {
                locationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1 = new LocationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1(this, continuation);
            }
            Object obj = locationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = locationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1.label;
            int i3 = 1;
            LocationDisclaimerComponent locationDisclaimerComponent = this.f5164a;
            if (i2 == 0) {
                ResultKt.b(obj);
                locationDisclaimerComponent.E0(new kf0(4));
                ContextScope contextScope = locationDisclaimerComponent.j;
                if (!Intrinsics.d(locationUpdateResult, LocationUpdateResult.Initiated.f5152a)) {
                    if ((locationUpdateResult instanceof LocationUpdateResult.GeneralException) || Intrinsics.d(locationUpdateResult, LocationUpdateResult.SettingsUnavailable.f5158a)) {
                        ChaloNavigationManagerKt.c(locationDisclaimerComponent.o);
                    } else if ((locationUpdateResult instanceof LocationUpdateResult.LocationFetchFailed) || Intrinsics.d(locationUpdateResult, LocationUpdateResult.NoValidLocation.f5155a) || (locationUpdateResult instanceof LocationUpdateResult.LocationReceived)) {
                        AnalyticsContract analyticsContract2 = locationDisclaimerComponent.k;
                        Source source2 = Source.LOCATION_DISCLAIMER_ACTIVITY;
                        locationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1.L$0 = analyticsContract2;
                        locationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1.L$1 = "location successfully enabled";
                        locationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1.L$2 = source2;
                        locationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1.label = 1;
                        Serializable serializableJ0 = locationDisclaimerComponent.J0(locationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1);
                        if (serializableJ0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        analyticsContract = analyticsContract2;
                        source = source2;
                        obj = serializableJ0;
                        str = "location successfully enabled";
                    } else if (locationUpdateResult instanceof LocationUpdateResult.RequestLocationPermission) {
                        List listS = CollectionsKt.S(AppPermission.COARSE_LOCATION, AppPermission.FINE_LOCATION);
                        Job job = locationDisclaimerComponent.w;
                        if (job != null) {
                            ((JobSupport) job).cancel(null);
                        }
                        locationDisclaimerComponent.w = BuildersKt.d(contextScope, null, null, new LocationDisclaimerComponent$requestLocationPermissions$1(locationDisclaimerComponent, listS, null), 3);
                    } else {
                        if (!(locationUpdateResult instanceof LocationUpdateResult.SettingsResolutionRequired)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        LocationUpdateResult.SettingsResolutionRequired settingsResolutionRequired = (LocationUpdateResult.SettingsResolutionRequired) locationUpdateResult;
                        Job job2 = locationDisclaimerComponent.x;
                        if (job2 != null) {
                            ((JobSupport) job2).cancel(null);
                        }
                        locationDisclaimerComponent.E0(new kf0(i3));
                        locationDisclaimerComponent.x = BuildersKt.d(contextScope, null, null, new LocationDisclaimerComponent$handleSettingsResolutionRequired$2(locationDisclaimerComponent, settingsResolutionRequired, null), 3);
                    }
                }
                return Unit.f17538a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Source source3 = (Source) locationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1.L$2;
            String str2 = (String) locationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1.L$1;
            AnalyticsContract analyticsContract3 = (AnalyticsContract) locationDisclaimerComponent$showLocationEnablePrompt$1$1$emit$1.L$0;
            ResultKt.b(obj);
            source = source3;
            analyticsContract = analyticsContract3;
            str = str2;
            AnalyticsContractImplKt.b(analyticsContract, str, source, (Map) obj, false, 24);
            ChaloNavigationManagerKt.c(locationDisclaimerComponent.o);
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationDisclaimerComponent$showLocationEnablePrompt$1(LocationDisclaimerComponent locationDisclaimerComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = locationDisclaimerComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationDisclaimerComponent$showLocationEnablePrompt$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationDisclaimerComponent$showLocationEnablePrompt$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r5).collect(r1, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r5)
            goto L3e
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlin.ResultKt.b(r5)
            goto L2c
        L1c:
            kotlin.ResultKt.b(r5)
            app.chalo.locationdisclaimer.LocationDisclaimerComponent r5 = r4.this$0
            app.chalo.location.ChaloLocationManager r5 = r5.n
            r4.label = r3
            java.lang.Object r5 = r5.d()
            if (r5 != r0) goto L2c
            goto L3d
        L2c:
            kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
            app.chalo.locationdisclaimer.LocationDisclaimerComponent$showLocationEnablePrompt$1$1 r1 = new app.chalo.locationdisclaimer.LocationDisclaimerComponent$showLocationEnablePrompt$1$1
            app.chalo.locationdisclaimer.LocationDisclaimerComponent r3 = r4.this$0
            r1.<init>(r3)
            r4.label = r2
            java.lang.Object r5 = r5.collect(r1, r4)
            if (r5 != r0) goto L3e
        L3d:
            return r0
        L3e:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.locationdisclaimer.LocationDisclaimerComponent$showLocationEnablePrompt$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
