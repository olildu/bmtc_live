package app.chalo.titoridedetail.manager;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.constants.Source;
import app.chalo.helper.CoroutineScopeHelper;
import app.chalo.livetracking.provider.tracking.RouteDetailsResult;
import app.chalo.livetracking.provider.tracking.RouteTrackingDataProvider;
import app.chalo.livetracking.provider.tracking.TrackingDataState;
import app.chalo.titoridedetail.data.app.TITOValidationAppModel;
import app.chalo.titoridedetail.data.app.TapInDetailAppModel;
import app.chalo.titoridedetail.data.app.TitoRideDataAppModel;
import app.chalo.titoridedetail.data.app.TitoRouteData;
import app.chalo.titoridedetail.data.app.TitoVehicleAndEtaData;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$fetchActiveTitoRideData$1", f = "TitoRideDataManagerImpl.kt", l = {83, 88}, m = "invokeSuspend", v = 1)
final class TitoRideDataManagerImpl$fetchActiveTitoRideData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Source $previousScreenSource;
    final /* synthetic */ Source $source;
    final /* synthetic */ String $tapId;
    int label;
    final /* synthetic */ TitoRideDataManagerImpl this$0;

    /* JADX INFO: renamed from: app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$fetchActiveTitoRideData$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TitoRideDataManagerImpl f9695a;
        public final /* synthetic */ Source b;
        public final /* synthetic */ Source c;

        public AnonymousClass2(TitoRideDataManagerImpl titoRideDataManagerImpl, Source source, Source source2) {
            this.f9695a = titoRideDataManagerImpl;
            this.b = source;
            this.c = source2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineSingletons emit(TITOValidationAppModel tITOValidationAppModel, Continuation continuation) {
            TitoRideDataManagerImpl$fetchActiveTitoRideData$1$2$emit$1 titoRideDataManagerImpl$fetchActiveTitoRideData$1$2$emit$1;
            Object value;
            TitoRideDataAppModel titoRideDataAppModel;
            if (continuation instanceof TitoRideDataManagerImpl$fetchActiveTitoRideData$1$2$emit$1) {
                titoRideDataManagerImpl$fetchActiveTitoRideData$1$2$emit$1 = (TitoRideDataManagerImpl$fetchActiveTitoRideData$1$2$emit$1) continuation;
                int i = titoRideDataManagerImpl$fetchActiveTitoRideData$1$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    titoRideDataManagerImpl$fetchActiveTitoRideData$1$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    titoRideDataManagerImpl$fetchActiveTitoRideData$1$2$emit$1 = new TitoRideDataManagerImpl$fetchActiveTitoRideData$1$2$emit$1(this, continuation);
                }
            } else {
                titoRideDataManagerImpl$fetchActiveTitoRideData$1$2$emit$1 = new TitoRideDataManagerImpl$fetchActiveTitoRideData$1$2$emit$1(this, continuation);
            }
            Object obj = titoRideDataManagerImpl$fetchActiveTitoRideData$1$2$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = titoRideDataManagerImpl$fetchActiveTitoRideData$1$2$emit$1.label;
            if (i2 == 0) {
                ResultKt.b(obj);
                TitoRideDataManagerImpl titoRideDataManagerImpl = this.f9695a;
                MutableStateFlow mutableStateFlow = titoRideDataManagerImpl.j;
                RouteTrackingDataProvider routeTrackingDataProvider = titoRideDataManagerImpl.c;
                do {
                    value = mutableStateFlow.getValue();
                    titoRideDataAppModel = (TitoRideDataAppModel) value;
                } while (!mutableStateFlow.c(value, titoRideDataAppModel != null ? TitoRideDataAppModel.a(titoRideDataAppModel, tITOValidationAppModel, null, null, 6) : new TitoRideDataAppModel(tITOValidationAppModel, TitoRouteData.Fetching.f9680a, TitoVehicleAndEtaData.Fetching.f9686a)));
                routeTrackingDataProvider.b(tITOValidationAppModel.f9672a.f);
                routeTrackingDataProvider.a(false);
                StateFlow stateFlowC = routeTrackingDataProvider.c();
                FlowCollector flowCollector = new FlowCollector(tITOValidationAppModel, this.b, this.c) { // from class: app.chalo.titoridedetail.manager.TitoRideDataManagerImpl.fetchActiveTitoRideData.1.2.2
                    public final /* synthetic */ TITOValidationAppModel b;
                    public final /* synthetic */ Source c;

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation2) {
                        Object value2;
                        TitoRideDataAppModel titoRideDataAppModel2;
                        Object value3;
                        TitoRideDataAppModel titoRideDataAppModel3;
                        TitoRideDataAppModel titoRideDataAppModelA;
                        String str;
                        Job jobD;
                        Job job;
                        int i3;
                        TitoRideDataAppModel titoRideDataAppModelA2;
                        TitoVehicleAndEtaData titoVehicleAndEtaData;
                        TITOValidationAppModel tITOValidationAppModelA;
                        RouteDetailsResult routeDetailsResult = ((TrackingDataState) obj2).f4362a;
                        if (routeDetailsResult != null) {
                            TitoRideDataManagerImpl titoRideDataManagerImpl2 = this.f9696a;
                            MutableStateFlow mutableStateFlow2 = titoRideDataManagerImpl2.j;
                            AnalyticsContract analyticsContract = titoRideDataManagerImpl2.g;
                            boolean z = routeDetailsResult instanceof RouteDetailsResult.Success;
                            TITOValidationAppModel tITOValidationAppModel2 = this.b;
                            Source source = this.c;
                            boolean z2 = true;
                            if (z) {
                                RouteDetailsResult.Success success = (RouteDetailsResult.Success) routeDetailsResult;
                                RouteAppModel routeAppModel = success.f4346a;
                                String sourceName = source.getSourceName();
                                TapInDetailAppModel tapInDetailAppModel = tITOValidationAppModel2.f9672a;
                                String str2 = tapInDetailAppModel.f9673a;
                                int i4 = 3;
                                String str3 = tapInDetailAppModel.k;
                                String str4 = tapInDetailAppModel.j;
                                RouteAppModel routeAppModel2 = routeAppModel;
                                AnalyticsContract.DefaultImpls.a(analyticsContract, "tito ride detail route result success", sourceName, MapsKt.i(new Pair("tap id", str2), new Pair("route id", routeAppModel.b), new Pair("vehicleNo", str4), new Pair("drop off stop id", String.valueOf(str3))), null, false, 24);
                                StopAppModel stopAppModelA = routeAppModel2.a(tapInDetailAppModel.g);
                                if (str3 == null) {
                                    str3 = "";
                                }
                                StopAppModel stopAppModelA2 = routeAppModel2.a(str3);
                                while (true) {
                                    Object value4 = mutableStateFlow2.getValue();
                                    TitoRideDataAppModel titoRideDataAppModel4 = (TitoRideDataAppModel) value4;
                                    if (titoRideDataAppModel4 != null) {
                                        TitoRouteData.RouteData routeData = new TitoRouteData.RouteData(routeAppModel2, stopAppModelA, stopAppModelA2, str4);
                                        TITOValidationAppModel tITOValidationAppModel3 = titoRideDataAppModel4.f9677a;
                                        if (tITOValidationAppModel3 != null) {
                                            TapInDetailAppModel tapInDetailAppModel2 = tITOValidationAppModel3.f9672a;
                                            String str5 = stopAppModelA != null ? stopAppModelA.b : null;
                                            String tapId = tapInDetailAppModel2.f9673a;
                                            long j = tapInDetailAppModel2.b;
                                            long j2 = tapInDetailAppModel2.c;
                                            String conductorValidationStaticPayload = tapInDetailAppModel2.d;
                                            long j3 = tapInDetailAppModel2.e;
                                            String tapInRouteId = tapInDetailAppModel2.f;
                                            String tapInStopId = tapInDetailAppModel2.g;
                                            String tapInTripNo = tapInDetailAppModel2.h;
                                            long j4 = tapInDetailAppModel2.i;
                                            String vehicleNo = tapInDetailAppModel2.j;
                                            String str6 = tapInDetailAppModel2.k;
                                            Intrinsics.i(tapId, "tapId");
                                            Intrinsics.i(conductorValidationStaticPayload, "conductorValidationStaticPayload");
                                            Intrinsics.i(tapInRouteId, "tapInRouteId");
                                            Intrinsics.i(tapInStopId, "tapInStopId");
                                            Intrinsics.i(tapInTripNo, "tapInTripNo");
                                            Intrinsics.i(vehicleNo, "vehicleNo");
                                            TapInDetailAppModel tapInDetailAppModel3 = new TapInDetailAppModel(tapId, j, j2, conductorValidationStaticPayload, j3, tapInRouteId, tapInStopId, tapInTripNo, j4, vehicleNo, str6, str5);
                                            titoVehicleAndEtaData = null;
                                            tITOValidationAppModelA = TITOValidationAppModel.a(tITOValidationAppModel3, tapInDetailAppModel3, null, null, 30);
                                        } else {
                                            titoVehicleAndEtaData = null;
                                            tITOValidationAppModelA = null;
                                        }
                                        titoRideDataAppModelA = TitoRideDataAppModel.a(titoRideDataAppModel4, tITOValidationAppModelA, routeData, titoVehicleAndEtaData, 4);
                                    } else {
                                        routeAppModel2 = routeAppModel2;
                                        analyticsContract = analyticsContract;
                                        stopAppModelA = stopAppModelA;
                                        stopAppModelA2 = stopAppModelA2;
                                        str4 = str4;
                                        source = source;
                                        titoRideDataAppModelA = null;
                                    }
                                    if (mutableStateFlow2.c(value4, titoRideDataAppModelA)) {
                                        break;
                                    }
                                    analyticsContract = analyticsContract;
                                    stopAppModelA = stopAppModelA;
                                    stopAppModelA2 = stopAppModelA2;
                                    routeAppModel2 = routeAppModel2;
                                    source = source;
                                    str4 = str4;
                                    z2 = true;
                                    i4 = 3;
                                }
                                RouteAppModel routeAppModel3 = success.f4346a;
                                CoroutineScopeHelper coroutineScopeHelper = titoRideDataManagerImpl2.f9694a;
                                if (str4.length() == 0) {
                                    AnalyticsContract.DefaultImpls.a(analyticsContract, "tito ride detail vehicle no unavailable", source.getSourceName(), null, null, false, 28);
                                    while (true) {
                                        Object value5 = mutableStateFlow2.getValue();
                                        TitoRideDataAppModel titoRideDataAppModel5 = (TitoRideDataAppModel) value5;
                                        if (titoRideDataAppModel5 != null) {
                                            i3 = i4;
                                            titoRideDataAppModelA2 = TitoRideDataAppModel.a(titoRideDataAppModel5, null, null, TitoVehicleAndEtaData.DataFetchError.VehicleNotAvailable.f9685a, i3);
                                        } else {
                                            i3 = i4;
                                            titoRideDataAppModelA2 = null;
                                        }
                                        if (mutableStateFlow2.c(value5, titoRideDataAppModelA2)) {
                                            break;
                                        }
                                        i4 = i3;
                                    }
                                } else {
                                    int i5 = i4;
                                    CoroutineScope coroutineScopeA = coroutineScopeHelper.a();
                                    if (coroutineScopeA != null) {
                                        str = str4;
                                        jobD = BuildersKt.d(coroutineScopeA, null, null, new TitoRideDataManagerImpl$startUpdatesForNextStop$1(titoRideDataManagerImpl2, str, routeAppModel3, null), i5);
                                    } else {
                                        str = str4;
                                        jobD = null;
                                    }
                                    titoRideDataManagerImpl2.m = jobD;
                                    if (stopAppModelA2 != null && ((job = titoRideDataManagerImpl2.l) == null || ((AbstractCoroutine) job).isActive() != z2)) {
                                        CoroutineScope coroutineScopeA2 = coroutineScopeHelper.a();
                                        titoRideDataManagerImpl2.l = coroutineScopeA2 != null ? BuildersKt.d(coroutineScopeA2, null, null, new TitoRideDataManagerImpl$startUpdatesForDropOffStop$1(titoRideDataManagerImpl2, stopAppModelA2, routeAppModel3, str, null), 3) : null;
                                    }
                                }
                            } else if (routeDetailsResult instanceof RouteDetailsResult.Error) {
                                String sourceName2 = source.getSourceName();
                                TapInDetailAppModel tapInDetailAppModel4 = tITOValidationAppModel2.f9672a;
                                String str7 = tapInDetailAppModel4.f9673a;
                                AnalyticsContract.DefaultImpls.a(analyticsContract, "tito ride detail route result failure", sourceName2, MapsKt.i(new Pair("tap id", str7), new Pair("tap id", str7), new Pair("route id", tapInDetailAppModel4.f), new Pair("vehicleNo", tapInDetailAppModel4.j), new Pair("drop off stop id", String.valueOf(tapInDetailAppModel4.k))), null, false, 24);
                                do {
                                    value3 = mutableStateFlow2.getValue();
                                    titoRideDataAppModel3 = (TitoRideDataAppModel) value3;
                                } while (!mutableStateFlow2.c(value3, titoRideDataAppModel3 != null ? TitoRideDataAppModel.a(titoRideDataAppModel3, null, TitoRouteData.DataFetchError.RouteDataNotAvailable.f9679a, null, 5) : null));
                            } else {
                                if (!routeDetailsResult.equals(RouteDetailsResult.FetchInProgress.f4345a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                do {
                                    value2 = mutableStateFlow2.getValue();
                                    titoRideDataAppModel2 = (TitoRideDataAppModel) value2;
                                } while (!mutableStateFlow2.c(value2, titoRideDataAppModel2 != null ? TitoRideDataAppModel.a(titoRideDataAppModel2, null, TitoRouteData.Fetching.f9680a, null, 5) : null));
                            }
                        }
                        return Unit.f17538a;
                    }
                };
                titoRideDataManagerImpl$fetchActiveTitoRideData$1$2$emit$1.label = 1;
                if (stateFlowC.collect(flowCollector, titoRideDataManagerImpl$fetchActiveTitoRideData$1$2$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitoRideDataManagerImpl$fetchActiveTitoRideData$1(TitoRideDataManagerImpl titoRideDataManagerImpl, String str, Source source, Source source2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = titoRideDataManagerImpl;
        this.$tapId = str;
        this.$source = source;
        this.$previousScreenSource = source2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TitoRideDataManagerImpl$fetchActiveTitoRideData$1(this.this$0, this.$tapId, this.$source, this.$previousScreenSource, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TitoRideDataManagerImpl$fetchActiveTitoRideData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r7.collect(r1, r6) == r0) goto L15;
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
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r7)
            goto L4e
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            kotlin.ResultKt.b(r7)
            goto L2e
        L1c:
            kotlin.ResultKt.b(r7)
            app.chalo.titoridedetail.manager.TitoRideDataManagerImpl r7 = r6.this$0
            app.chalo.tito.data.TITOValidationDataRepository r7 = r7.f
            java.lang.String r1 = r6.$tapId
            r6.label = r3
            java.lang.Object r7 = r7.c(r1, r6)
            if (r7 != r0) goto L2e
            goto L4d
        L2e:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 r1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1
            r1.<init>(r7)
            app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$fetchActiveTitoRideData$1$invokeSuspend$$inlined$filter$1 r7 = new app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$fetchActiveTitoRideData$1$invokeSuspend$$inlined$filter$1
            r7.<init>()
            app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$fetchActiveTitoRideData$1$2 r1 = new app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$fetchActiveTitoRideData$1$2
            app.chalo.titoridedetail.manager.TitoRideDataManagerImpl r3 = r6.this$0
            app.chalo.constants.Source r4 = r6.$source
            app.chalo.constants.Source r5 = r6.$previousScreenSource
            r1.<init>(r3, r4, r5)
            r6.label = r2
            java.lang.Object r7 = r7.collect(r1, r6)
            if (r7 != r0) goto L4e
        L4d:
            return r0
        L4e:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.titoridedetail.manager.TitoRideDataManagerImpl$fetchActiveTitoRideData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
