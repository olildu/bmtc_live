package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.MutableState;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SwipeableState$animateTo$2<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4456a;
    public final /* synthetic */ SwipeableState b;
    public final /* synthetic */ AnimationSpec c;

    public SwipeableState$animateTo$2(Object obj, SwipeableState swipeableState, AnimationSpec animationSpec) {
        this.f4456a = obj;
        this.b = swipeableState;
        this.c = animationSpec;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object emit(Map map, Continuation continuation) {
        SwipeableState$animateTo$2$emit$1 swipeableState$animateTo$2$emit$1;
        SwipeableState swipeableState = this.b;
        MutableState mutableState = swipeableState.c;
        MutableState mutableState2 = swipeableState.g;
        if (continuation instanceof SwipeableState$animateTo$2$emit$1) {
            swipeableState$animateTo$2$emit$1 = (SwipeableState$animateTo$2$emit$1) continuation;
            int i = swipeableState$animateTo$2$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                swipeableState$animateTo$2$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                swipeableState$animateTo$2$emit$1 = new SwipeableState$animateTo$2$emit$1(this, continuation);
            }
        } else {
            swipeableState$animateTo$2$emit$1 = new SwipeableState$animateTo$2$emit$1(this, continuation);
        }
        Object obj = swipeableState$animateTo$2$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = swipeableState$animateTo$2$emit$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                Float fB = SwipeableKt.b(map, this.f4456a);
                if (fB == null) {
                    throw new IllegalArgumentException("The target value must have an associated anchor.");
                }
                float fFloatValue = fB.floatValue();
                AnimationSpec animationSpec = this.c;
                swipeableState$animateTo$2$emit$1.L$0 = map;
                swipeableState$animateTo$2$emit$1.label = 1;
                if (swipeableState.a(fFloatValue, animationSpec, swipeableState$animateTo$2$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map) swipeableState$animateTo$2$emit$1.L$0;
                ResultKt.b(obj);
            }
            float fFloatValue2 = ((Number) mutableState2.getValue()).floatValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (Math.abs(((Number) entry.getKey()).floatValue() - fFloatValue2) < 0.5f) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Object objG = CollectionsKt.G(linkedHashMap.values());
            if (objG == null) {
                objG = mutableState.getValue();
            }
            swipeableState.h(objG);
            return Unit.f17538a;
        } catch (Throwable th) {
            float fFloatValue3 = ((Number) mutableState2.getValue()).floatValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : map.entrySet()) {
                if (Math.abs(((Number) entry2.getKey()).floatValue() - fFloatValue3) < 0.5f) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            Object objG2 = CollectionsKt.G(linkedHashMap2.values());
            if (objG2 == null) {
                objG2 = mutableState.getValue();
            }
            swipeableState.h(objG2);
            throw th;
        }
    }
}
