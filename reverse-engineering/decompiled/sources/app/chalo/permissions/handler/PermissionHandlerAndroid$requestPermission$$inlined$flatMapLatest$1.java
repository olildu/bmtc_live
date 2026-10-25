package app.chalo.permissions.handler;

import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.permissions.models.AppPermission;
import app.chalo.permissions.models.AppPermission_androidKt;
import app.chalo.permissions.models.PermissionState;
import app.chalo.permissions.models.PermissionStateKt;
import defpackage.eh0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.permissions.handler.PermissionHandlerAndroid$requestPermission$$inlined$flatMapLatest$1", f = "PermissionHandler.android.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 1)
public final class PermissionHandlerAndroid$requestPermission$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super PermissionState>, PermissionState, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppPermission $permission$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PermissionHandlerAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionHandlerAndroid$requestPermission$$inlined$flatMapLatest$1(PermissionHandlerAndroid permissionHandlerAndroid, AppPermission appPermission, Continuation continuation) {
        super(3, continuation);
        this.this$0 = permissionHandlerAndroid;
        this.$permission$inlined = appPermission;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PermissionHandlerAndroid$requestPermission$$inlined$flatMapLatest$1 permissionHandlerAndroid$requestPermission$$inlined$flatMapLatest$1 = new PermissionHandlerAndroid$requestPermission$$inlined$flatMapLatest$1(this.this$0, this.$permission$inlined, (Continuation) obj3);
        permissionHandlerAndroid$requestPermission$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        permissionHandlerAndroid$requestPermission$$inlined$flatMapLatest$1.L$1 = obj2;
        return permissionHandlerAndroid$requestPermission$$inlined$flatMapLatest$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flowM;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            if (PermissionStateKt.a((PermissionState) this.L$1)) {
                flowM = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(PermissionState.GRANTED);
            } else {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                eh0 eh0Var = this.this$0.c;
                AppPermission appPermission = this.$permission$inlined;
                Intrinsics.i(appPermission, "<this>");
                eh0Var.invoke(new String[]{AppPermission_androidKt.a(appPermission).f6834a});
                final MutableStateFlow mutableStateFlow = this.this$0.d;
                final AppPermission appPermission2 = this.$permission$inlined;
                final Flow flowM2 = FlowKt.m(new Flow<PermissionUpdateInfo>() { // from class: app.chalo.permissions.handler.PermissionHandlerAndroid$requestPermission$lambda$0$$inlined$mapNotNull$1

                    /* JADX INFO: renamed from: app.chalo.permissions.handler.PermissionHandlerAndroid$requestPermission$lambda$0$$inlined$mapNotNull$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ FlowCollector f6830a;
                        public final /* synthetic */ AppPermission b;
                        public final /* synthetic */ long c;

                        /* JADX INFO: renamed from: app.chalo.permissions.handler.PermissionHandlerAndroid$requestPermission$lambda$0$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "app.chalo.permissions.handler.PermissionHandlerAndroid$requestPermission$lambda$0$$inlined$mapNotNull$1$2", f = "PermissionHandler.android.kt", l = {56}, m = "emit", v = 1)
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

                        public AnonymousClass2(FlowCollector flowCollector, AppPermission appPermission, long j) {
                            this.f6830a = flowCollector;
                            this.b = appPermission;
                            this.c = j;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            Object next;
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
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    PermissionUpdateInfo permissionUpdateInfo = (PermissionUpdateInfo) next;
                                    if (permissionUpdateInfo.f6832a == this.b && permissionUpdateInfo.c >= this.c) {
                                        break;
                                    }
                                }
                                if (next != null) {
                                    anonymousClass1.label = 1;
                                    if (this.f6830a.emit(next, anonymousClass1) == coroutineSingletons) {
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
                        Object objCollect = mutableStateFlow.collect(new AnonymousClass2(flowCollector2, appPermission2, jCurrentTimeMillis), continuation);
                        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                    }
                });
                flowM = FlowKt.m(new Flow<PermissionState>() { // from class: app.chalo.permissions.handler.PermissionHandlerAndroid$requestPermission$lambda$0$$inlined$map$1

                    /* JADX INFO: renamed from: app.chalo.permissions.handler.PermissionHandlerAndroid$requestPermission$lambda$0$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ FlowCollector f6828a;

                        /* JADX INFO: renamed from: app.chalo.permissions.handler.PermissionHandlerAndroid$requestPermission$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "app.chalo.permissions.handler.PermissionHandlerAndroid$requestPermission$lambda$0$$inlined$map$1$2", f = "PermissionHandler.android.kt", l = {50}, m = "emit", v = 1)
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
                            this.f6828a = flowCollector;
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
                                PermissionState permissionState = ((PermissionUpdateInfo) obj).b;
                                anonymousClass1.label = 1;
                                if (this.f6828a.emit(permissionState, anonymousClass1) == coroutineSingletons) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                        Object objCollect = flowM2.collect(new AnonymousClass2(flowCollector2), continuation);
                        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                    }
                });
            }
            this.label = 1;
            if (FlowKt.r(flowCollector, flowM, this) == coroutineSingletons) {
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
