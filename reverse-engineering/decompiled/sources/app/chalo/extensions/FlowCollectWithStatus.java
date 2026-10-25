package app.chalo.extensions;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/extensions/FlowCollectWithStatus;", "", "TimerStatus", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FlowCollectWithStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FlowCollectWithStatus f2615a = new FlowCollectWithStatus();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/extensions/FlowCollectWithStatus$TimerStatus;", "", "<init>", "(Ljava/lang/String;I)V", "STARTED", "CANCELLED", "TIME_UP", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum TimerStatus {
        STARTED,
        CANCELLED,
        TIME_UP;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<TimerStatus> getEntries() {
            return $ENTRIES;
        }
    }

    public static Object a(Flow flow, Function1 function1, final Function3 function3, ContinuationImpl continuationImpl) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Object objCollect = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flow, FlowKt.y(new FlowCollectWithStatus$collectWithFirstValidResultTimeout$timerFlow$1(booleanRef, 10000L, null)), new FlowCollectWithStatus$collectWithFirstValidResultTimeout$2(booleanRef, function1, null)).collect(new FlowCollector(function3) { // from class: app.chalo.extensions.FlowCollectWithStatus$collectWithFirstValidResultTimeout$3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SuspendLambda f2616a;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f2616a = (SuspendLambda) function3;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                Pair pair = (Pair) obj;
                Object objInvoke = this.f2616a.invoke(pair.d(), pair.e(), continuation);
                return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : Unit.f17538a;
            }
        }, continuationImpl);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
    }
}
