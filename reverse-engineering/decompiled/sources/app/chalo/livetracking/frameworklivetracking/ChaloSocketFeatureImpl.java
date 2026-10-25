package app.chalo.livetracking.frameworklivetracking;

import app.chalo.livetracking.frameworklivetracking.chalosocket.KSocketOptions;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketRequest;
import app.chalo.providers.CoroutineContextProvider;
import defpackage.qv0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/ChaloSocketFeatureImpl;", "Lapp/chalo/livetracking/frameworklivetracking/ChaloSocketFeature;", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloSocketFeatureImpl implements ChaloSocketFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloSocketClient f4178a;
    public final CoroutineContextProvider b;
    public final ContextScope c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/ChaloSocketFeatureImpl$Companion;", "", "", "SubscriptionMaxRetryRequiredErrorMsg", "Ljava/lang/String;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ChaloSocketFeatureImpl(ChaloSocketClient chaloSocketClient, CoroutineContextProvider coroutineContextProvider) {
        this.f4178a = chaloSocketClient;
        this.b = coroutineContextProvider;
        this.c = CoroutineScopeKt.a(coroutineContextProvider.b());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:13:0x0031, B:21:0x004f, B:23:0x0059, B:27:0x008d, B:18:0x0048), top: B:33:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(r5, r0) == r1) goto L29;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a1 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl r12, app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketRequest r13, kotlin.jvm.functions.Function0 r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r12.getClass()
            boolean r0 = r15 instanceof app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$sendPollingEvent$1
            if (r0 == 0) goto L16
            r0 = r15
            app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$sendPollingEvent$1 r0 = (app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$sendPollingEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$sendPollingEvent$1 r0 = new app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$sendPollingEvent$1
            r0.<init>(r12, r15)
        L1b:
            java.lang.Object r15 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r13 = r0.L$1
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            java.lang.Object r14 = r0.L$0
            app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketRequest r14 = (app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketRequest) r14
            kotlin.ResultKt.b(r15)     // Catch: java.lang.Exception -> La4
        L34:
            r11 = r14
            r14 = r13
            r13 = r11
            goto L4f
        L38:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L40:
            java.lang.Object r13 = r0.L$1
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            java.lang.Object r14 = r0.L$0
            app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketRequest r14 = (app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketRequest) r14
            kotlin.ResultKt.b(r15)     // Catch: java.lang.Exception -> La4
            goto L8d
        L4c:
            kotlin.ResultKt.b(r15)
        L4f:
            kotlin.coroutines.CoroutineContext r15 = r0.getContext()     // Catch: java.lang.Exception -> La4
            boolean r15 = kotlinx.coroutines.JobKt.h(r15)     // Catch: java.lang.Exception -> La4
            if (r15 == 0) goto La4
            app.chalo.livetracking.frameworklivetracking.ChaloSocketClient r6 = r12.f4178a     // Catch: java.lang.Exception -> La4
            app.chalo.livetracking.frameworklivetracking.chalosocket.model.SocketEvent r8 = app.chalo.livetracking.frameworklivetracking.chalosocket.model.SocketEvent.Once     // Catch: java.lang.Exception -> La4
            kotlinx.serialization.json.Json r15 = app.chalo.network.config.ChaloJson.b     // Catch: java.lang.Exception -> La4
            r15.getClass()     // Catch: java.lang.Exception -> La4
            app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketRequest$Companion r2 = app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketRequest.INSTANCE     // Catch: java.lang.Exception -> La4
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch: java.lang.Exception -> La4
            kotlinx.serialization.SerializationStrategy r2 = (kotlinx.serialization.SerializationStrategy) r2     // Catch: java.lang.Exception -> La4
            java.lang.String r15 = r15.a(r2, r13)     // Catch: java.lang.Exception -> La4
            java.lang.String[] r7 = new java.lang.String[]{r15}     // Catch: java.lang.Exception -> La4
            r0.L$0 = r13     // Catch: java.lang.Exception -> La4
            r0.L$1 = r14     // Catch: java.lang.Exception -> La4
            r0.label = r4     // Catch: java.lang.Exception -> La4
            kotlin.coroutines.CoroutineContext r15 = r0.getContext()     // Catch: java.lang.Exception -> La4
            app.chalo.livetracking.frameworklivetracking.ChaloSocketClient$sendMessage$2 r5 = new app.chalo.livetracking.frameworklivetracking.ChaloSocketClient$sendMessage$2     // Catch: java.lang.Exception -> La4
            r10 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> La4
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.g(r15, r5, r0)     // Catch: java.lang.Exception -> La4
            if (r15 != r1) goto L8a
            goto La3
        L8a:
            r11 = r14
            r14 = r13
            r13 = r11
        L8d:
            java.lang.Object r15 = r13.invoke()     // Catch: java.lang.Exception -> La4
            java.lang.Number r15 = (java.lang.Number) r15     // Catch: java.lang.Exception -> La4
            long r5 = r15.longValue()     // Catch: java.lang.Exception -> La4
            r0.L$0 = r14     // Catch: java.lang.Exception -> La4
            r0.L$1 = r13     // Catch: java.lang.Exception -> La4
            r0.label = r3     // Catch: java.lang.Exception -> La4
            java.lang.Object r15 = kotlinx.coroutines.DelayKt.b(r5, r0)     // Catch: java.lang.Exception -> La4
            if (r15 != r1) goto L34
        La3:
            return r1
        La4:
            kotlin.Unit r12 = kotlin.Unit.f17538a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl.g(app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl, app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketRequest, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.livetracking.frameworklivetracking.ChaloSocketFeature
    public final Object a(Continuation continuation) throws Throwable {
        Object objG = BuildersKt.g(continuation.getContext(), new ChaloSocketClient$clearSocket$2(this.f4178a, null), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Unit unit = Unit.f17538a;
        if (objG != coroutineSingletons) {
            objG = unit;
        }
        return objG == coroutineSingletons ? objG : unit;
    }

    @Override // app.chalo.livetracking.frameworklivetracking.ChaloSocketFeature
    public final Object b(Continuation continuation) throws Throwable {
        Object objG = BuildersKt.g(continuation.getContext(), new ChaloSocketClient$connect$2(this.f4178a, null), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Unit unit = Unit.f17538a;
        if (objG != coroutineSingletons) {
            objG = unit;
        }
        return objG == coroutineSingletons ? objG : unit;
    }

    @Override // app.chalo.livetracking.frameworklivetracking.ChaloSocketFeature
    public final Object c(ContinuationImpl continuationImpl) throws Throwable {
        Object objG = BuildersKt.g(continuationImpl.getContext(), new ChaloSocketClient$disconnect$2(this.f4178a, null), continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Unit unit = Unit.f17538a;
        if (objG != coroutineSingletons) {
            objG = unit;
        }
        return objG == coroutineSingletons ? objG : unit;
    }

    @Override // app.chalo.livetracking.frameworklivetracking.ChaloSocketFeature
    public final Object d(String str, KSocketOptions kSocketOptions, Continuation continuation) throws Throwable {
        Object objG = BuildersKt.g(continuation.getContext(), new ChaloSocketClient$setupSocket$2(this.f4178a, str, kSocketOptions, null), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Unit unit = Unit.f17538a;
        if (objG != coroutineSingletons) {
            objG = unit;
        }
        return objG == coroutineSingletons ? objG : unit;
    }

    @Override // app.chalo.livetracking.frameworklivetracking.ChaloSocketFeature
    public final Flow e(ChaloSocketRequest chaloSocketRequest, int i, qv0 qv0Var) {
        if (i > 0) {
            return FlowKt.z(new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(FlowKt.h(new ChaloSocketFeatureImpl$startSubscription$2(i, this, chaloSocketRequest, null, qv0Var)), new ChaloSocketFeatureImpl$startSubscription$3(i, this, chaloSocketRequest, null, qv0Var)), this.b.b());
        }
        throw new IllegalArgumentException("maxRetryAllowed should be greater than 0");
    }

    @Override // app.chalo.livetracking.frameworklivetracking.ChaloSocketFeature
    public final Flow f(ChaloSocketRequest chaloSocketRequest, Function0 function0) {
        return FlowKt.z(FlowKt.h(new ChaloSocketFeatureImpl$startPolling$1(this, chaloSocketRequest, function0, null)), this.b.b());
    }

    public final void h(ChaloSocketRequest chaloSocketRequest, Function0 function0, int i) {
        String message = "unsubscribed with new socket: " + chaloSocketRequest;
        Intrinsics.i(message, "message");
        BuildersKt.d(this.c, null, null, new ChaloSocketFeatureImpl$unsubscribeRequest$2(i, this, chaloSocketRequest, null, function0), 3);
    }
}
