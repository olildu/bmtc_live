package app.chalo.recent.database.repository.recent;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.recent.database.repository.recent.StopBasedTripRecentRepositoryImpl", f = "StopBasedTripRecentRepositoryImpl.kt", l = {73, 71}, m = "increaseAccessCountAndUpdateTime", v = 1)
final class StopBasedTripRecentRepositoryImpl$increaseAccessCountAndUpdateTime$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StopBasedTripRecentRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedTripRecentRepositoryImpl$increaseAccessCountAndUpdateTime$1(StopBasedTripRecentRepositoryImpl stopBasedTripRecentRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = stopBasedTripRecentRepositoryImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        if (r1.a(r11, r4, r8, r6) == r7) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r10.result = r11
            int r11 = r10.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r11 | r0
            r10.label = r11
            app.chalo.recent.database.repository.recent.StopBasedTripRecentRepositoryImpl r11 = r10.this$0
            r11.getClass()
            int r1 = r10.label
            r2 = r1 & r0
            if (r2 == 0) goto L19
            int r1 = r1 - r0
            r10.label = r1
            r6 = r10
            goto L1f
        L19:
            app.chalo.recent.database.repository.recent.StopBasedTripRecentRepositoryImpl$increaseAccessCountAndUpdateTime$1 r0 = new app.chalo.recent.database.repository.recent.StopBasedTripRecentRepositoryImpl$increaseAccessCountAndUpdateTime$1
            r0.<init>(r11, r10)
            r6 = r0
        L1f:
            java.lang.Object r0 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L4a
            if (r1 == r4) goto L3a
            if (r1 != r3) goto L32
            kotlin.ResultKt.b(r0)
            goto L7a
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3a:
            java.lang.Object r11 = r6.L$2
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r6.L$1
            app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSource r1 = (app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSource) r1
            java.lang.Object r4 = r6.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.ResultKt.b(r0)
            goto L62
        L4a:
            kotlin.ResultKt.b(r0)
            app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSource r1 = r11.f8957a
            app.chalo.contract.BasicInfoContract r11 = r11.b
            r6.L$0 = r2
            r6.L$1 = r1
            r6.L$2 = r2
            r6.label = r4
            java.lang.Object r0 = r11.c(r6)
            if (r0 != r7) goto L60
            goto L79
        L60:
            r11 = r2
            r4 = r11
        L62:
            java.lang.Number r0 = (java.lang.Number) r0
            long r8 = r0.longValue()
            r6.L$0 = r2
            r6.L$1 = r2
            r6.L$2 = r2
            r6.label = r3
            r2 = r11
            r3 = r4
            r4 = r8
            java.lang.Object r11 = r1.a(r2, r3, r4, r6)
            if (r11 != r7) goto L7a
        L79:
            return r7
        L7a:
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.recent.database.repository.recent.StopBasedTripRecentRepositoryImpl$increaseAccessCountAndUpdateTime$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
