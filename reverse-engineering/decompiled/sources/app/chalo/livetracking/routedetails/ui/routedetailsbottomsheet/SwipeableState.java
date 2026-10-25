package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import defpackage.cz;
import defpackage.g61;
import defpackage.i81;
import defpackage.l91;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/routedetails/ui/routedetailsbottomsheet/SwipeableState;", "T", "", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SwipeableState<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimationSpec f4455a;
    public final Function1 b;
    public final MutableState c;
    public final MutableState d;
    public final MutableState e;
    public final MutableState f;
    public final MutableState g;
    public final MutableState h;
    public final MutableState i;
    public final FlowKt__LimitKt$take$$inlined$unsafeFlow$1 j;
    public float k;
    public float l;
    public final MutableState m;
    public final MutableState n;
    public final MutableState o;
    public final DraggableState p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/ui/routedetailsbottomsheet/SwipeableState$Companion;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public SwipeableState(Enum r3, AnimationSpec animationSpec, Function1 function1) {
        Intrinsics.i(animationSpec, "animationSpec");
        this.f4455a = animationSpec;
        this.b = function1;
        this.c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r3, null, 2, null);
        this.d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        Float fValueOf = Float.valueOf(0.0f);
        this.e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.g = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.h = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.i = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.d(), null, 2, null);
        final Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new g61(this, 25));
        this.j = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(new Flow<Map<Float, Object>>() { // from class: app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SwipeableState$special$$inlined$filter$1

            /* JADX INFO: renamed from: app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f4459a;

                /* JADX INFO: renamed from: app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", l = {50}, m = "emit", v = 1)
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
                    this.f4459a = flowCollector;
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
                        if (!((Map) obj).isEmpty()) {
                            anonymousClass1.label = 1;
                            if (this.f4459a.emit(obj, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flowSnapshotFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        });
        this.k = Float.NEGATIVE_INFINITY;
        this.l = Float.POSITIVE_INFINITY;
        this.m = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new i81(11), null, 2, null);
        this.n = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.p = DraggableKt.DraggableState(new l91(this, 28));
    }

    public static Object b(SwipeableState swipeableState, Object obj, Continuation continuation) {
        Object objCollect = swipeableState.j.collect(new SwipeableState$animateTo$2(obj, swipeableState, swipeableState.f4455a), continuation);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
    }

    public final Object a(float f, AnimationSpec animationSpec, Continuation continuation) {
        Object objA = cz.a(this.p, null, new SwipeableState$animateInternalToOffset$2(this, f, animationSpec, null), continuation, 1, null);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    public final Map c() {
        return (Map) this.i.getValue();
    }

    public final Object d() {
        float fA;
        Float f = (Float) this.h.getValue();
        MutableState mutableState = this.c;
        if (f != null) {
            fA = f.floatValue();
        } else {
            MutableState mutableState2 = this.e;
            float fFloatValue = ((Number) mutableState2.getValue()).floatValue();
            Float fB = SwipeableKt.b(c(), mutableState.getValue());
            fA = SwipeableKt.a(fFloatValue, fB != null ? fB.floatValue() : ((Number) mutableState2.getValue()).floatValue(), c().keySet(), (Function2) this.m.getValue(), 0.0f, Float.POSITIVE_INFINITY);
        }
        Object obj = c().get(Float.valueOf(fA));
        return obj == null ? mutableState.getValue() : obj;
    }

    public final float e(float f) {
        MutableState mutableState = this.g;
        float fD = RangesKt.d(((Number) mutableState.getValue()).floatValue() + f, this.k, this.l) - ((Number) mutableState.getValue()).floatValue();
        if (Math.abs(fD) > 0.0f) {
            this.p.dispatchRawDelta(fD);
        }
        return fD;
    }

    public final Object f(final float f, ContinuationImpl continuationImpl) {
        Object objCollect = this.j.collect(new FlowCollector() { // from class: app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SwipeableState$performFling$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                Map map = (Map) obj;
                SwipeableState swipeableState = this.f4457a;
                Float fB = SwipeableKt.b(map, swipeableState.c.getValue());
                Intrinsics.f(fB);
                float fFloatValue = fB.floatValue();
                Object obj2 = map.get(new Float(SwipeableKt.a(((Number) swipeableState.e.getValue()).floatValue(), fFloatValue, map.keySet(), (Function2) swipeableState.m.getValue(), f, ((Number) swipeableState.n.getValue()).floatValue())));
                if (obj2 == null || !((Boolean) swipeableState.b.invoke(obj2)).booleanValue()) {
                    Object objA = swipeableState.a(fFloatValue, swipeableState.f4455a, continuation);
                    if (objA == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objA;
                    }
                } else {
                    Object objB = SwipeableState.b(swipeableState, obj2, continuation);
                    if (objB == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objB;
                    }
                }
                return Unit.f17538a;
            }
        }, continuationImpl);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c8, code lost:
    
        if (r14 == r0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0218, code lost:
    
        if (r14 == r0) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v61, types: [float] */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.Map r12, java.util.Map r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SwipeableState.g(java.util.Map, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void h(Object obj) {
        this.c.setValue(obj);
    }
}
