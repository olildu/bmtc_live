package app.chalo.premiumbus;

import app.chalo.premiumbus.data.models.app.PremiumBusTripPollingResponseAppModel;
import app.chalo.premiumbus.domains.PremiumBusTripDetailsError;
import app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingDetails;
import app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusTripDetailsPollingHelper;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusTripDetailsPollingHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusBookingsTripPollingManager f6863a;

    public PremiumBusTripDetailsPollingHelper(PremiumBusBookingsTripPollingManager premiumBusBookingsTripPollingManager) {
        this.f6863a = premiumBusBookingsTripPollingManager;
    }

    public final FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 a(final String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        PremiumBusBookingsTripPollingManager premiumBusBookingsTripPollingManager = this.f6863a;
        premiumBusBookingsTripPollingManager.c(bookingId);
        final StateFlow stateFlow = premiumBusBookingsTripPollingManager.h;
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(new Flow<ChaloUseCaseResult<PremiumBusTripPollingResponseAppModel, PremiumBusTripDetailsError>>() { // from class: app.chalo.premiumbus.PremiumBusTripDetailsPollingHelper$getPollingDetailsFlowByBookingId$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: app.chalo.premiumbus.PremiumBusTripDetailsPollingHelper$getPollingDetailsFlowByBookingId$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f6865a;
                public final /* synthetic */ String b;

                /* JADX INFO: renamed from: app.chalo.premiumbus.PremiumBusTripDetailsPollingHelper$getPollingDetailsFlowByBookingId$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.premiumbus.PremiumBusTripDetailsPollingHelper$getPollingDetailsFlowByBookingId$$inlined$mapNotNull$1$2", f = "PremiumBusTripDetailsPollingHelper.kt", l = {54}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, String str) {
                    this.f6865a = flowCollector;
                    this.b = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    T next;
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
                        Iterator<T> it = ((List) obj).iterator();
                        do {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.d(((PremiumBusBookingsTripPollingDetails) next).f7281a, this.b));
                        PremiumBusBookingsTripPollingDetails premiumBusBookingsTripPollingDetails = next;
                        ChaloUseCaseResult chaloUseCaseResult = premiumBusBookingsTripPollingDetails != null ? premiumBusBookingsTripPollingDetails.b : null;
                        if (chaloUseCaseResult != null) {
                            anonymousClass1.label = 1;
                            if (this.f6865a.emit(chaloUseCaseResult, anonymousClass1) == coroutineSingletons) {
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
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector, bookingId), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, new PremiumBusTripDetailsPollingHelper$getPollingDetailsFlowByBookingId$2(this, bookingId, null));
    }
}
