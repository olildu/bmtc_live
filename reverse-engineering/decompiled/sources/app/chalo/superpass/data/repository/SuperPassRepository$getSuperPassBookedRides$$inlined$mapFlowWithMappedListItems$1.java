package app.chalo.superpass.data.repository;

import app.chalo.features.productsync.model.app.RideType;
import app.chalo.models.products.SuperPassRideBookingAppModel;
import app.chalo.superpass.data.models.entities.SuperPassBookingEntity;
import java.util.ArrayList;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "app/chalo/extensions/FlowExtentionsKt$mapFlowWithMappedListItems$$inlined$map$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassRepository$getSuperPassBookedRides$$inlined$mapFlowWithMappedListItems$1 implements Flow<List<? extends SuperPassRideBookingAppModel>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow f9604a;

    /* JADX INFO: renamed from: app.chalo.superpass.data.repository.SuperPassRepository$getSuperPassBookedRides$$inlined$mapFlowWithMappedListItems$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FlowCollector f9605a;

        /* JADX INFO: renamed from: app.chalo.superpass.data.repository.SuperPassRepository$getSuperPassBookedRides$$inlined$mapFlowWithMappedListItems$1$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.superpass.data.repository.SuperPassRepository$getSuperPassBookedRides$$inlined$mapFlowWithMappedListItems$1$2", f = "SuperPassRepository.kt", l = {50}, m = "emit", v = 1)
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
            this.f9605a = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
            int i3 = 1;
            if (i2 == 0) {
                ResultKt.b(obj2);
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = ((List) obj).iterator();
                while (it.hasNext()) {
                    SuperPassBookingEntity superPassBookingEntity = (SuperPassBookingEntity) it.next();
                    Intrinsics.i(superPassBookingEntity, "<this>");
                    String str = superPassBookingEntity.f9565a;
                    RideType.Companion companion = RideType.INSTANCE;
                    String str2 = superPassBookingEntity.b;
                    companion.getClass();
                    arrayList.add(new SuperPassRideBookingAppModel(str, RideType.Companion.a(str2), superPassBookingEntity.c, superPassBookingEntity.d, superPassBookingEntity.e, superPassBookingEntity.f, superPassBookingEntity.g, superPassBookingEntity.h, superPassBookingEntity.i, superPassBookingEntity.j, superPassBookingEntity.k, superPassBookingEntity.l, superPassBookingEntity.m, superPassBookingEntity.n, superPassBookingEntity.o, superPassBookingEntity.p, superPassBookingEntity.q, superPassBookingEntity.r, superPassBookingEntity.s, superPassBookingEntity.t, superPassBookingEntity.u));
                    it = it;
                    i3 = 1;
                }
                anonymousClass1.label = i3;
                if (this.f9605a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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

    public SuperPassRepository$getSuperPassBookedRides$$inlined$mapFlowWithMappedListItems$1(Flow flow) {
        this.f9604a = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f9604a.collect(new AnonymousClass2(flowCollector), continuation);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
    }
}
