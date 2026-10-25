package app.chalo.superpass.data.dao;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/dao/SuperPassBookingsDao;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SuperPassBookingsDao {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        
            if (r5.c(r6, r0) == r1) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object a(app.chalo.core.database.dao.SuperPassBookingsDaoImpl r5, java.util.ArrayList r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
            /*
                boolean r0 = r7 instanceof app.chalo.superpass.data.dao.SuperPassBookingsDao$updateSuperPassBookingsData$1
                if (r0 == 0) goto L13
                r0 = r7
                app.chalo.superpass.data.dao.SuperPassBookingsDao$updateSuperPassBookingsData$1 r0 = (app.chalo.superpass.data.dao.SuperPassBookingsDao$updateSuperPassBookingsData$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                app.chalo.superpass.data.dao.SuperPassBookingsDao$updateSuperPassBookingsData$1 r0 = new app.chalo.superpass.data.dao.SuperPassBookingsDao$updateSuperPassBookingsData$1
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3f
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                kotlin.ResultKt.b(r7)
                goto L5d
            L2a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L32:
                java.lang.Object r5 = r0.L$1
                r6 = r5
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r5 = r0.L$0
                app.chalo.superpass.data.dao.SuperPassBookingsDao r5 = (app.chalo.superpass.data.dao.SuperPassBookingsDao) r5
                kotlin.ResultKt.b(r7)
                goto L4f
            L3f:
                kotlin.ResultKt.b(r7)
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r4
                java.lang.Object r7 = r5.b(r0)
                if (r7 != r1) goto L4f
                goto L5c
            L4f:
                r7 = 0
                r0.L$0 = r7
                r0.L$1 = r7
                r0.label = r3
                java.lang.Object r5 = r5.c(r6, r0)
                if (r5 != r1) goto L5d
            L5c:
                return r1
            L5d:
                kotlin.Unit r5 = kotlin.Unit.f17538a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.superpass.data.dao.SuperPassBookingsDao.DefaultImpls.a(app.chalo.core.database.dao.SuperPassBookingsDaoImpl, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    Object a(ArrayList arrayList, Continuation continuation);

    Object b(ContinuationImpl continuationImpl);

    Object c(List list, Continuation continuation);

    FlowQuery$mapToList$$inlined$map$1 d();
}
