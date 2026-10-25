package app.chalo.premiumbus.domains;

import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerStopEtaResult;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketEtaResponseAppModel;
import app.chalo.premiumbus.PremiumBusTripLiveInfo;
import app.chalo.premiumbus.data.model.appmodel.PremiumBusRealtimeSocketResponseAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusTripPollingResponseAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.premiumbus.data.models.app.VehicleBreakdownAppResponseModel;
import app.chalo.premiumbus.prebookedtickets.data.model.appmodel.PremiumBusBookingTripTimeInfoAppModel;
import app.chalo.premiumbus.prebookedtickets.data.model.appmodel.PremiumBusBookingVehicleInfoAppModel;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.domains.FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$$inlined$flatMapLatest$1", f = "FetchPremiumBusTripDetailsAndLiveEtaUseCase.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 1)
public final class FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super PremiumBusTripLiveInfo>, PremiumBusTripPollingResponseAppModel, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef $lastPbTripPollingResponse$inlined;
    final /* synthetic */ Source $source$inlined;
    final /* synthetic */ PremiumTicketActivationStatus $ticketActivationStatus$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ FetchPremiumBusTripDetailsAndLiveEtaUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$$inlined$flatMapLatest$1(Continuation continuation, FetchPremiumBusTripDetailsAndLiveEtaUseCase fetchPremiumBusTripDetailsAndLiveEtaUseCase, Ref.ObjectRef objectRef, Source source, PremiumTicketActivationStatus premiumTicketActivationStatus) {
        super(3, continuation);
        this.this$0 = fetchPremiumBusTripDetailsAndLiveEtaUseCase;
        this.$lastPbTripPollingResponse$inlined = objectRef;
        this.$source$inlined = source;
        this.$ticketActivationStatus$inlined = premiumTicketActivationStatus;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$$inlined$flatMapLatest$1 fetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$$inlined$flatMapLatest$1 = new FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$lastPbTripPollingResponse$inlined, this.$source$inlined, this.$ticketActivationStatus$inlined);
        fetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        fetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$$inlined$flatMapLatest$1.L$1 = obj2;
        return fetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$$inlined$flatMapLatest$1.invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, app.chalo.premiumbus.data.models.app.PremiumBusTripPollingResponseAppModel] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        char c;
        int i2;
        Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
        Long lValueOf;
        Long lValueOf2;
        String str;
        String str2;
        String str3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final ?? r8 = (PremiumBusTripPollingResponseAppModel) this.L$1;
            FetchPremiumBusTripDetailsAndLiveEtaUseCase fetchPremiumBusTripDetailsAndLiveEtaUseCase = this.this$0;
            PremiumBusTripPollingResponseAppModel premiumBusTripPollingResponseAppModel = (PremiumBusTripPollingResponseAppModel) this.$lastPbTripPollingResponse$inlined.element;
            fetchPremiumBusTripDetailsAndLiveEtaUseCase.getClass();
            String str4 = premiumBusTripPollingResponseAppModel != null ? premiumBusTripPollingResponseAppModel.c : null;
            final String str5 = r8.c;
            String str6 = r8.f;
            String str7 = r8.g;
            if (Intrinsics.d(str4, str5)) {
                if (Intrinsics.d(premiumBusTripPollingResponseAppModel != null ? premiumBusTripPollingResponseAppModel.g : null, str7) && Intrinsics.d(premiumBusTripPollingResponseAppModel.f, str6)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            if (z) {
                AnalyticsContract analyticsContract = this.this$0.d;
                Source source = this.$source$inlined;
                PremiumBusTripPollingResponseAppModel premiumBusTripPollingResponseAppModel2 = (PremiumBusTripPollingResponseAppModel) this.$lastPbTripPollingResponse$inlined.element;
                String str8 = "";
                if (premiumBusTripPollingResponseAppModel2 == null || (str = premiumBusTripPollingResponseAppModel2.c) == null) {
                    str = "";
                }
                c = 0;
                i = 1;
                Pair pair = new Pair("lastAssignedVehicleNumber", str);
                i2 = 2;
                Pair pair2 = new Pair("newAssignedVehicleNumber", str5 == null ? "" : str5);
                if (premiumBusTripPollingResponseAppModel2 == null || (str2 = premiumBusTripPollingResponseAppModel2.g) == null) {
                    str2 = "";
                }
                Pair pair3 = new Pair("lastAssignedStopId", str2);
                Pair pair4 = new Pair("newAssignedStopId", str7);
                if (premiumBusTripPollingResponseAppModel2 != null && (str3 = premiumBusTripPollingResponseAppModel2.f) != null) {
                    str8 = str3;
                }
                AnalyticsContractImplKt.b(analyticsContract, "pb trip polling response change", source, MapsKt.i(pair, pair2, pair3, pair4, new Pair("lastAssignedRouteId", str8), new Pair("newAssignedRouteID", str6), new Pair("bookingId", this.$ticketActivationStatus$inlined.getF7272a())), false, 24);
            } else {
                i = 1;
                c = 0;
                i2 = 2;
            }
            this.$lastPbTripPollingResponse$inlined.element = r8;
            FetchPremiumBusTripDetailsAndLiveEtaUseCase fetchPremiumBusTripDetailsAndLiveEtaUseCase2 = this.this$0;
            if (str5 == null || r8.e != PremiumBusTripStatus.ACTIVE || r8.o != null) {
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(FetchPremiumBusTripDetailsAndLiveEtaUseCaseKt.a(r8));
            } else if (z) {
                FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$3 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(FetchPremiumBusTripDetailsAndLiveEtaUseCaseKt.a(r8));
                FetchPremiumBusTripDetailsAndLiveEtaUseCase fetchPremiumBusTripDetailsAndLiveEtaUseCase3 = this.this$0;
                PremiumTicketActivationStatus premiumTicketActivationStatus = this.$ticketActivationStatus$inlined;
                fetchPremiumBusTripDetailsAndLiveEtaUseCase3.getClass();
                boolean z2 = premiumTicketActivationStatus instanceof PremiumTicketActivationStatus.Post;
                if (z2) {
                    str7 = ((PremiumTicketActivationStatus.Post) premiumTicketActivationStatus).c;
                } else if (!(premiumTicketActivationStatus instanceof PremiumTicketActivationStatus.Pre)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z2) {
                    lValueOf = null;
                } else {
                    if (!(premiumTicketActivationStatus instanceof PremiumTicketActivationStatus.Pre)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lValueOf = Long.valueOf(r8.i);
                }
                if (z2) {
                    lValueOf2 = null;
                } else {
                    if (!(premiumTicketActivationStatus instanceof PremiumTicketActivationStatus.Pre)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lValueOf2 = Long.valueOf(r8.h);
                }
                final Flow flowF = fetchPremiumBusTripDetailsAndLiveEtaUseCase3.b.f(str7, str6, CollectionsKt.R(str5));
                final Long l = lValueOf2;
                final Long l2 = lValueOf;
                Flow<PremiumBusTripLiveInfo> flow = new Flow<PremiumBusTripLiveInfo>() { // from class: app.chalo.premiumbus.domains.FetchPremiumBusTripDetailsAndLiveEtaUseCase$getRealtimeSocketEtaFlow$$inlined$mapNotNull$1

                    /* JADX INFO: renamed from: app.chalo.premiumbus.domains.FetchPremiumBusTripDetailsAndLiveEtaUseCase$getRealtimeSocketEtaFlow$$inlined$mapNotNull$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ FlowCollector f7268a;
                        public final /* synthetic */ Long b;
                        public final /* synthetic */ PremiumBusTripPollingResponseAppModel c;
                        public final /* synthetic */ Long d;
                        public final /* synthetic */ String e;

                        /* JADX INFO: renamed from: app.chalo.premiumbus.domains.FetchPremiumBusTripDetailsAndLiveEtaUseCase$getRealtimeSocketEtaFlow$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "app.chalo.premiumbus.domains.FetchPremiumBusTripDetailsAndLiveEtaUseCase$getRealtimeSocketEtaFlow$$inlined$mapNotNull$1$2", f = "FetchPremiumBusTripDetailsAndLiveEtaUseCase.kt", l = {104}, m = "emit", v = 1)
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

                        public AnonymousClass2(FlowCollector flowCollector, Long l, PremiumBusTripPollingResponseAppModel premiumBusTripPollingResponseAppModel, Long l2, String str) {
                            this.f7268a = flowCollector;
                            this.b = l;
                            this.c = premiumBusTripPollingResponseAppModel;
                            this.d = l2;
                            this.e = str;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            PremiumBusTripLiveInfo premiumBusTripLiveInfo;
                            PremiumBusTripPollingResponseAppModel premiumBusTripPollingResponseAppModel;
                            Object next;
                            Long lValueOf;
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
                                LiveTrackingDataManagerStopEtaResult liveTrackingDataManagerStopEtaResult = (LiveTrackingDataManagerStopEtaResult) obj;
                                if (liveTrackingDataManagerStopEtaResult instanceof LiveTrackingDataManagerStopEtaResult.Success) {
                                    ArrayList arrayList = ((LiveTrackingDataManagerStopEtaResult.Success) liveTrackingDataManagerStopEtaResult).f4207a;
                                    ArrayList arrayList2 = new ArrayList();
                                    int size = arrayList.size();
                                    int i3 = 0;
                                    while (true) {
                                        premiumBusTripPollingResponseAppModel = this.c;
                                        if (i3 >= size) {
                                            break;
                                        }
                                        Object obj3 = arrayList.get(i3);
                                        i3++;
                                        if (Intrinsics.d(((RealtimeSocketEtaResponseAppModel) obj3).c, premiumBusTripPollingResponseAppModel.c)) {
                                            arrayList2.add(obj3);
                                        }
                                    }
                                    Iterator it = arrayList2.iterator();
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (it.hasNext()) {
                                            long j = ((RealtimeSocketEtaResponseAppModel) next).f;
                                            do {
                                                Object next2 = it.next();
                                                long j2 = ((RealtimeSocketEtaResponseAppModel) next2).f;
                                                if (j < j2) {
                                                    next = next2;
                                                    j = j2;
                                                }
                                            } while (it.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    RealtimeSocketEtaResponseAppModel realtimeSocketEtaResponseAppModel = (RealtimeSocketEtaResponseAppModel) next;
                                    if (realtimeSocketEtaResponseAppModel != null) {
                                        long jMax = realtimeSocketEtaResponseAppModel.b;
                                        if (jMax != -1) {
                                            jMax = Math.max(jMax, 60L);
                                        }
                                        long j3 = jMax;
                                        Long l = this.b;
                                        if (l != null) {
                                            long j4 = 1000;
                                            lValueOf = Long.valueOf((((j3 * j4) + realtimeSocketEtaResponseAppModel.f) - l.longValue()) / j4);
                                        } else {
                                            lValueOf = null;
                                        }
                                        String str = realtimeSocketEtaResponseAppModel.f4310a;
                                        String str2 = realtimeSocketEtaResponseAppModel.c;
                                        long j5 = realtimeSocketEtaResponseAppModel.f;
                                        Integer num = realtimeSocketEtaResponseAppModel.i;
                                        new PremiumBusRealtimeSocketResponseAppModel(str, j3, str2, lValueOf, j5, num);
                                        PremiumBusTripStatus premiumBusTripStatus = premiumBusTripPollingResponseAppModel.e;
                                        List assignedSeats = premiumBusTripPollingResponseAppModel.k;
                                        List tripCommunicationBanners = premiumBusTripPollingResponseAppModel.j;
                                        List seats = premiumBusTripPollingResponseAppModel.l;
                                        boolean z = premiumBusTripPollingResponseAppModel.n;
                                        VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel = premiumBusTripPollingResponseAppModel.o;
                                        Intrinsics.i(assignedSeats, "assignedSeats");
                                        Intrinsics.i(tripCommunicationBanners, "tripCommunicationBanners");
                                        Intrinsics.i(seats, "seats");
                                        premiumBusTripLiveInfo = new PremiumBusTripLiveInfo(new PremiumBusBookingVehicleInfoAppModel.VehicleAssigned(str2, premiumBusTripStatus, assignedSeats, seats), new PremiumBusBookingTripTimeInfoAppModel.LiveEta(j3, j3 == -1, j5, this.d, num, tripCommunicationBanners), tripCommunicationBanners, seats, z, vehicleBreakdownAppResponseModel);
                                    } else {
                                        premiumBusTripLiveInfo = new PremiumBusTripLiveInfo(new PremiumBusBookingVehicleInfoAppModel.VehicleAssigned(this.e, premiumBusTripPollingResponseAppModel.e, premiumBusTripPollingResponseAppModel.k, premiumBusTripPollingResponseAppModel.l), PremiumBusBookingTripTimeInfoAppModel.LiveEtaNotAvailable.f7289a, premiumBusTripPollingResponseAppModel.j, premiumBusTripPollingResponseAppModel.l, premiumBusTripPollingResponseAppModel.n, premiumBusTripPollingResponseAppModel.o);
                                    }
                                } else {
                                    if (!(liveTrackingDataManagerStopEtaResult instanceof LiveTrackingDataManagerStopEtaResult.Error)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    premiumBusTripLiveInfo = null;
                                }
                                if (premiumBusTripLiveInfo != null) {
                                    anonymousClass1.label = 1;
                                    if (this.f7268a.emit(premiumBusTripLiveInfo, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
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
                    public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                        Object objCollect = flowF.collect(new AnonymousClass2(flowCollector2, l2, r8, l, str5), continuation);
                        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                    }
                };
                Flow[] flowArr = new Flow[i2];
                flowArr[c] = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$3;
                flowArr[i] = flow;
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = FlowKt.B(flowArr);
            } else {
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = fetchPremiumBusTripDetailsAndLiveEtaUseCase2.e;
            }
            fetchPremiumBusTripDetailsAndLiveEtaUseCase2.e = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
            Flow flow2 = this.this$0.e;
            this.label = i;
            if (FlowKt.r(flowCollector, flow2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
