package app.chalo.titoridedetail.ui;

import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerStopEtaResult;
import app.chalo.livetracking.frameworklivetracking.domain.ProcessLiveStopEtaDataUseCase;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaAppModel;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaAppModelKt;
import app.chalo.titoridedetail.ui.compose.TitoRideDetailsScreenStopMarker;
import defpackage.qd;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.titoridedetail.ui.TitoRideDetailsComponent$fetchStopLiveEtaForMap$2", f = "TitoRideDetailComponent.kt", l = {684}, m = "invokeSuspend", v = 1)
final class TitoRideDetailsComponent$fetchStopLiveEtaForMap$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $routeId;
    final /* synthetic */ String $stopId;
    final /* synthetic */ String $vehicleNumber;
    int label;
    final /* synthetic */ TitoRideDetailsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.titoridedetail.ui.TitoRideDetailsComponent$fetchStopLiveEtaForMap$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TitoRideDetailsComponent f9706a;

        public AnonymousClass1(TitoRideDetailsComponent titoRideDetailsComponent) {
            this.f9706a = titoRideDetailsComponent;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(LiveTrackingDataManagerStopEtaResult.Success success, Continuation continuation) {
            TitoRideDetailsComponent$fetchStopLiveEtaForMap$2$1$emit$1 titoRideDetailsComponent$fetchStopLiveEtaForMap$2$1$emit$1;
            if (continuation instanceof TitoRideDetailsComponent$fetchStopLiveEtaForMap$2$1$emit$1) {
                titoRideDetailsComponent$fetchStopLiveEtaForMap$2$1$emit$1 = (TitoRideDetailsComponent$fetchStopLiveEtaForMap$2$1$emit$1) continuation;
                int i = titoRideDetailsComponent$fetchStopLiveEtaForMap$2$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    titoRideDetailsComponent$fetchStopLiveEtaForMap$2$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    titoRideDetailsComponent$fetchStopLiveEtaForMap$2$1$emit$1 = new TitoRideDetailsComponent$fetchStopLiveEtaForMap$2$1$emit$1(this, continuation);
                }
            } else {
                titoRideDetailsComponent$fetchStopLiveEtaForMap$2$1$emit$1 = new TitoRideDetailsComponent$fetchStopLiveEtaForMap$2$1$emit$1(this, continuation);
            }
            Object objB = titoRideDetailsComponent$fetchStopLiveEtaForMap$2$1$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = titoRideDetailsComponent$fetchStopLiveEtaForMap$2$1$emit$1.label;
            TitoRideDetailsComponent titoRideDetailsComponent = this.f9706a;
            if (i2 == 0) {
                ResultKt.b(objB);
                ProcessLiveStopEtaDataUseCase processLiveStopEtaDataUseCase = titoRideDetailsComponent.s;
                ArrayList arrayList = success.f4207a;
                titoRideDetailsComponent$fetchStopLiveEtaForMap$2$1$emit$1.label = 1;
                objB = processLiveStopEtaDataUseCase.b(arrayList, titoRideDetailsComponent$fetchStopLiveEtaForMap$2$1$emit$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objB);
            }
            StopLiveEtaAppModel stopLiveEtaAppModel = (StopLiveEtaAppModel) objB;
            List<TitoRideDetailsScreenStopMarker> list = ((TitoRideDetailsViewState) titoRideDetailsComponent.f.getValue()).f;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list, 10));
            for (TitoRideDetailsScreenStopMarker titoRideDetailsScreenStopMarkerF : list) {
                if (titoRideDetailsScreenStopMarkerF.g) {
                    titoRideDetailsScreenStopMarkerF = TitoRideDetailsScreenStopMarker.f(titoRideDetailsScreenStopMarkerF, StopLiveEtaAppModelKt.a(stopLiveEtaAppModel, titoRideDetailsComponent.A), false, 991);
                }
                arrayList2.add(titoRideDetailsScreenStopMarkerF);
            }
            titoRideDetailsComponent.E0(new qd(19, arrayList2));
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitoRideDetailsComponent$fetchStopLiveEtaForMap$2(TitoRideDetailsComponent titoRideDetailsComponent, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = titoRideDetailsComponent;
        this.$stopId = str;
        this.$routeId = str2;
        this.$vehicleNumber = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TitoRideDetailsComponent$fetchStopLiveEtaForMap$2(this.this$0, this.$stopId, this.$routeId, this.$vehicleNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TitoRideDetailsComponent$fetchStopLiveEtaForMap$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final Flow flowF = this.this$0.q.f(this.$stopId, this.$routeId, CollectionsKt.R(this.$vehicleNumber));
            Flow<Object> flow = new Flow<Object>() { // from class: app.chalo.titoridedetail.ui.TitoRideDetailsComponent$fetchStopLiveEtaForMap$2$invokeSuspend$$inlined$filterIsInstance$1

                /* JADX INFO: renamed from: app.chalo.titoridedetail.ui.TitoRideDetailsComponent$fetchStopLiveEtaForMap$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f9708a;

                    /* JADX INFO: renamed from: app.chalo.titoridedetail.ui.TitoRideDetailsComponent$fetchStopLiveEtaForMap$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.titoridedetail.ui.TitoRideDetailsComponent$fetchStopLiveEtaForMap$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "TitoRideDetailComponent.kt", l = {50}, m = "emit", v = 1)
                    public final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
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
                        this.f9708a = flowCollector;
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
                            if (obj instanceof LiveTrackingDataManagerStopEtaResult.Success) {
                                anonymousClass1.label = 1;
                                if (this.f9708a.emit(obj, anonymousClass1) == coroutineSingletons) {
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
                    Object objCollect = flowF.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
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
