package app.chalo.locationdisclaimer;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.location.LocationUpdateResult;
import app.chalo.permissions.gps.GpsRequestHandler;
import app.chalo.scenes.ChaloNavigationManagerKt;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
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
@DebugMetadata(c = "app.chalo.locationdisclaimer.LocationDisclaimerComponent$handleSettingsResolutionRequired$2", f = "LocationDisclaimerComponent.kt", l = {239}, m = "invokeSuspend", v = 1)
final class LocationDisclaimerComponent$handleSettingsResolutionRequired$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LocationUpdateResult.SettingsResolutionRequired $results;
    int label;
    final /* synthetic */ LocationDisclaimerComponent this$0;

    /* JADX INFO: renamed from: app.chalo.locationdisclaimer.LocationDisclaimerComponent$handleSettingsResolutionRequired$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LocationDisclaimerComponent f5161a;
        public final /* synthetic */ LocationUpdateResult.SettingsResolutionRequired b;

        public AnonymousClass1(LocationDisclaimerComponent locationDisclaimerComponent, LocationUpdateResult.SettingsResolutionRequired settingsResolutionRequired) {
            this.f5161a = locationDisclaimerComponent;
            this.b = settingsResolutionRequired;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(boolean z, Continuation continuation) {
            LocationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1 locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1;
            AnalyticsContract analyticsContract;
            Source source;
            String str;
            AnalyticsContract analyticsContract2;
            Source source2;
            String str2;
            if (continuation instanceof LocationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1) {
                locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1 = (LocationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1) continuation;
                int i = locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1 = new LocationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1(this, continuation);
                }
            } else {
                locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1 = new LocationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1(this, continuation);
            }
            Object obj = locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.label;
            LocationDisclaimerComponent locationDisclaimerComponent = this.f5161a;
            if (i2 == 0) {
                ResultKt.b(obj);
                if (z) {
                    AnalyticsContract analyticsContract3 = locationDisclaimerComponent.k;
                    Source source3 = Source.LOCATION_DISCLAIMER_ACTIVITY;
                    locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.L$0 = analyticsContract3;
                    locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.L$1 = "location successfully enabled";
                    locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.L$2 = source3;
                    locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.label = 1;
                    Serializable serializableJ0 = locationDisclaimerComponent.J0(locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1);
                    if (serializableJ0 != coroutineSingletons) {
                        analyticsContract2 = analyticsContract3;
                        source2 = source3;
                        obj = serializableJ0;
                        str2 = "location successfully enabled";
                        AnalyticsContractImplKt.b(analyticsContract2, str2, source2, (Map) obj, false, 24);
                        ChaloNavigationManagerKt.c(locationDisclaimerComponent.o);
                    }
                } else {
                    AnalyticsContract analyticsContract4 = locationDisclaimerComponent.k;
                    Source source4 = Source.LOCATION_DISCLAIMER_ACTIVITY;
                    locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.L$0 = analyticsContract4;
                    locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.L$1 = "location denied event";
                    locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.L$2 = source4;
                    locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.label = 2;
                    Serializable serializableJ1 = locationDisclaimerComponent.J0(locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1);
                    if (serializableJ1 != coroutineSingletons) {
                        analyticsContract = analyticsContract4;
                        source = source4;
                        obj = serializableJ1;
                        str = "location denied event";
                        AnalyticsContractImplKt.b(analyticsContract, str, source, MapsKt.l((Map) obj, MapsKt.h(new Pair("result denied", new Integer(this.b.f5157a.b)))), false, 24);
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                Source source5 = (Source) locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.L$2;
                String str3 = (String) locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.L$1;
                AnalyticsContract analyticsContract5 = (AnalyticsContract) locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.L$0;
                ResultKt.b(obj);
                source2 = source5;
                analyticsContract2 = analyticsContract5;
                str2 = str3;
                AnalyticsContractImplKt.b(analyticsContract2, str2, source2, (Map) obj, false, 24);
                ChaloNavigationManagerKt.c(locationDisclaimerComponent.o);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Source source6 = (Source) locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.L$2;
                String str4 = (String) locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.L$1;
                AnalyticsContract analyticsContract6 = (AnalyticsContract) locationDisclaimerComponent$handleSettingsResolutionRequired$2$1$emit$1.L$0;
                ResultKt.b(obj);
                source = source6;
                analyticsContract = analyticsContract6;
                str = str4;
                AnalyticsContractImplKt.b(analyticsContract, str, source, MapsKt.l((Map) obj, MapsKt.h(new Pair("result denied", new Integer(this.b.f5157a.b)))), false, 24);
            }
            return Unit.f17538a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return a(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationDisclaimerComponent$handleSettingsResolutionRequired$2(LocationDisclaimerComponent locationDisclaimerComponent, LocationUpdateResult.SettingsResolutionRequired settingsResolutionRequired, Continuation continuation) {
        super(2, continuation);
        this.this$0 = locationDisclaimerComponent;
        this.$results = settingsResolutionRequired;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationDisclaimerComponent$handleSettingsResolutionRequired$2(this.this$0, this.$results, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationDisclaimerComponent$handleSettingsResolutionRequired$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            GpsRequestHandler gpsRequestHandlerC = this.this$0.r.c();
            if (gpsRequestHandlerC != null) {
                Flow flowA = gpsRequestHandlerC.a(this.$results.f5157a);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$results);
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
