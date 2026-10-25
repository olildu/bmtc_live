package app.chalo.permissions.handler;

import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.permissions.models.AppPermission;
import app.chalo.permissions.models.AppPermission_androidKt;
import app.chalo.permissions.models.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.permissions.handler.PermissionHandlerAndroid$requestMultiplePermission$$inlined$flatMapLatest$1", f = "PermissionHandler.android.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 1)
public final class PermissionHandlerAndroid$requestMultiplePermission$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends Pair<? extends AppPermission, ? extends PermissionState>>>, Pair<? extends Set<? extends AppPermission>, ? extends Set<? extends AppPermission>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $permissionRequestedAt$inlined;
    final /* synthetic */ Set $permissionsSet$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PermissionHandlerAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionHandlerAndroid$requestMultiplePermission$$inlined$flatMapLatest$1(Continuation continuation, Set set, PermissionHandlerAndroid permissionHandlerAndroid, long j) {
        super(3, continuation);
        this.$permissionsSet$inlined = set;
        this.this$0 = permissionHandlerAndroid;
        this.$permissionRequestedAt$inlined = j;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PermissionHandlerAndroid$requestMultiplePermission$$inlined$flatMapLatest$1 permissionHandlerAndroid$requestMultiplePermission$$inlined$flatMapLatest$1 = new PermissionHandlerAndroid$requestMultiplePermission$$inlined$flatMapLatest$1((Continuation) obj3, this.$permissionsSet$inlined, this.this$0, this.$permissionRequestedAt$inlined);
        permissionHandlerAndroid$requestMultiplePermission$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        permissionHandlerAndroid$requestMultiplePermission$$inlined$flatMapLatest$1.L$1 = obj2;
        return permissionHandlerAndroid$requestMultiplePermission$$inlined$flatMapLatest$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Pair pair = (Pair) this.L$1;
            if (((Set) pair.e()).isEmpty()) {
                Set set = this.$permissionsSet$inlined;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Pair((AppPermission) it.next(), PermissionState.GRANTED));
                }
                flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(arrayList);
            } else {
                Iterable<AppPermission> iterable = (Iterable) pair.e();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(iterable, 10));
                for (AppPermission appPermission : iterable) {
                    Intrinsics.i(appPermission, "<this>");
                    arrayList2.add(AppPermission_androidKt.a(appPermission).f6834a);
                }
                this.this$0.c.invoke((String[]) arrayList2.toArray(new String[0]));
                PermissionHandlerAndroid permissionHandlerAndroid = this.this$0;
                Set set2 = (Set) pair.d();
                permissionHandlerAndroid.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                Set set3 = set2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.v(set3, 10));
                Iterator it2 = set3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new PermissionUpdateInfo((AppPermission) it2.next(), PermissionState.GRANTED, jCurrentTimeMillis));
                }
                FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(arrayList3);
                PermissionHandlerAndroid permissionHandlerAndroid2 = this.this$0;
                final Set set4 = (Set) pair.e();
                final long j = this.$permissionRequestedAt$inlined;
                final MutableStateFlow mutableStateFlow = permissionHandlerAndroid2.d;
                flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2, FlowKt.m(new Flow<List<? extends PermissionUpdateInfo>>() { // from class: app.chalo.permissions.handler.PermissionHandlerAndroid$permissionsToRequestFlow$$inlined$mapNotNull$1

                    /* JADX INFO: renamed from: app.chalo.permissions.handler.PermissionHandlerAndroid$permissionsToRequestFlow$$inlined$mapNotNull$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ FlowCollector f6826a;
                        public final /* synthetic */ Set b;
                        public final /* synthetic */ long c;

                        /* JADX INFO: renamed from: app.chalo.permissions.handler.PermissionHandlerAndroid$permissionsToRequestFlow$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "app.chalo.permissions.handler.PermissionHandlerAndroid$permissionsToRequestFlow$$inlined$mapNotNull$1$2", f = "PermissionHandler.android.kt", l = {66}, m = "emit", v = 1)
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

                        public AnonymousClass2(FlowCollector flowCollector, Set set, long j) {
                            this.f6826a = flowCollector;
                            this.b = set;
                            this.c = j;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            Set set;
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
                                ArrayList arrayList = new ArrayList();
                                Iterator<T> it = ((List) obj).iterator();
                                while (true) {
                                    boolean zHasNext = it.hasNext();
                                    set = this.b;
                                    if (!zHasNext) {
                                        break;
                                    }
                                    T next = it.next();
                                    PermissionUpdateInfo permissionUpdateInfo = (PermissionUpdateInfo) next;
                                    if (set.contains(permissionUpdateInfo.f6832a) && permissionUpdateInfo.c >= this.c) {
                                        arrayList.add(next);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
                                int size = arrayList.size();
                                int i3 = 0;
                                while (i3 < size) {
                                    Object obj3 = arrayList.get(i3);
                                    i3++;
                                    arrayList2.add(((PermissionUpdateInfo) obj3).f6832a);
                                }
                                if (!Intrinsics.d(set, CollectionsKt.G0(arrayList2))) {
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    anonymousClass1.label = 1;
                                    if (this.f6826a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                        Object objCollect = mutableStateFlow.collect(new AnonymousClass2(flowCollector2, set4, j), continuation);
                        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                    }
                }), new PermissionHandlerAndroid$requestMultiplePermission$2$2(3, null));
            }
            this.label = 1;
            if (FlowKt.r(flowCollector, flowKt__ZipKt$combine$$inlined$unsafeFlow$1, this) == coroutineSingletons) {
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
