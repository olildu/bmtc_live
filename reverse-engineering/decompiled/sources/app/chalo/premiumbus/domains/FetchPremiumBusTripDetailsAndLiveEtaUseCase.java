package app.chalo.premiumbus.domains;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager;
import app.chalo.premiumbus.PremiumBusTripDetailsPollingHelper;
import app.chalo.premiumbus.PremiumBusTripLiveInfo;
import app.chalo.premiumbus.data.models.app.PremiumBusTripPollingResponseAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domains/FetchPremiumBusTripDetailsAndLiveEtaUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchPremiumBusTripDetailsAndLiveEtaUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusTripDetailsPollingHelper f7266a;
    public final LiveTrackingDataManager b;
    public final ProductsSyncContract c;
    public final AnalyticsContract d;
    public Flow e = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(new PremiumBusTripLiveInfo[0]);

    public FetchPremiumBusTripDetailsAndLiveEtaUseCase(PremiumBusTripDetailsPollingHelper premiumBusTripDetailsPollingHelper, LiveTrackingDataManager liveTrackingDataManager, ProductsSyncContract productsSyncContract, AnalyticsContract analyticsContract) {
        this.f7266a = premiumBusTripDetailsPollingHelper;
        this.b = liveTrackingDataManager;
        this.c = productsSyncContract;
        this.d = analyticsContract;
    }

    public final ChannelFlowTransformLatest a(PremiumTicketActivationStatus ticketActivationStatus, Source source) {
        Intrinsics.i(ticketActivationStatus, "ticketActivationStatus");
        Intrinsics.i(source, "source");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Flow flowI = FlowKt.I(this.f7266a.a(ticketActivationStatus.getF7272a()), new FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$1(3, null));
        return FlowKt.H(FlowKt.H(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new Flow<PremiumBusTripPollingResponseAppModel>() { // from class: app.chalo.premiumbus.domains.FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: app.chalo.premiumbus.domains.FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f7270a;

                /* JADX INFO: renamed from: app.chalo.premiumbus.domains.FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.premiumbus.domains.FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$$inlined$mapNotNull$1$2", f = "FetchPremiumBusTripDetailsAndLiveEtaUseCase.kt", l = {52}, m = "emit", v = 1)
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
                    this.f7270a = flowCollector;
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
                        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
                        ChaloUseCaseResult.Success success = chaloUseCaseResult instanceof ChaloUseCaseResult.Success ? (ChaloUseCaseResult.Success) chaloUseCaseResult : null;
                        PremiumBusTripPollingResponseAppModel premiumBusTripPollingResponseAppModel = success != null ? (PremiumBusTripPollingResponseAppModel) success.f10419a : null;
                        if (premiumBusTripPollingResponseAppModel != null) {
                            anonymousClass1.label = 1;
                            if (this.f7270a.emit(premiumBusTripPollingResponseAppModel, anonymousClass1) == coroutineSingletons) {
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
            public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
                Object objCollect = ((AbstractFlow) flowI).collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, new FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$3(this, null)), new FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$$inlined$flatMapLatest$1(null, this, objectRef, source, ticketActivationStatus)), new FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$$inlined$flatMapLatest$2(3, null));
    }
}
