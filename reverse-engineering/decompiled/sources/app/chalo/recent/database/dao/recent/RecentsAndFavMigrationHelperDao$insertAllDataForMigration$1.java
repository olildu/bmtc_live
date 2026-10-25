package app.chalo.recent.database.dao.recent;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.recent.database.dao.recent.RecentsAndFavMigrationHelperDao$DefaultImpls", f = "RecentsAndFavMigrationHelperDao.kt", l = {15, 16, 17}, m = "insertAllDataForMigration", v = 1)
final class RecentsAndFavMigrationHelperDao$insertAllDataForMigration$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r0.b() == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            r6.result = r7
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r6.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L5f
            r4 = 3
            r5 = 2
            if (r0 == r3) goto L30
            if (r0 == r5) goto L24
            if (r0 != r4) goto L1c
            kotlin.ResultKt.b(r7)
            goto L5c
        L1c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L24:
            java.lang.Object r0 = r6.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r6.L$0
            app.chalo.recent.database.dao.recent.RecentsAndFavMigrationHelperDao r0 = (app.chalo.recent.database.dao.recent.RecentsAndFavMigrationHelperDao) r0
            kotlin.ResultKt.b(r7)
            goto L4f
        L30:
            java.lang.Object r0 = r6.L$2
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r6.L$1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r6.L$0
            app.chalo.recent.database.dao.recent.RecentsAndFavMigrationHelperDao r3 = (app.chalo.recent.database.dao.recent.RecentsAndFavMigrationHelperDao) r3
            kotlin.ResultKt.b(r7)
            r6.L$0 = r3
            r6.L$1 = r0
            r6.L$2 = r2
            r6.label = r5
            java.lang.Object r7 = r3.a()
            if (r7 != r1) goto L4e
            goto L5b
        L4e:
            r0 = r3
        L4f:
            r6.L$0 = r2
            r6.L$1 = r2
            r6.label = r4
            java.lang.Object r7 = r0.b()
            if (r7 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        L5f:
            kotlin.ResultKt.b(r7)
            r6.L$0 = r2
            r6.L$1 = r2
            r6.L$2 = r2
            r6.label = r3
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.recent.database.dao.recent.RecentsAndFavMigrationHelperDao$insertAllDataForMigration$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
