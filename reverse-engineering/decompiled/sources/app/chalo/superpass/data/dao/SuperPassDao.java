package app.chalo.superpass.data.dao;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPassRideDetailsRoom;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/dao/SuperPassDao;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SuperPassDao {
    Object A(List list, ContinuationImpl continuationImpl);

    Object B(List list, ContinuationImpl continuationImpl);

    Object C(Continuation continuation);

    FlowQuery$mapToOneOrNull$$inlined$map$1 D(String str);

    Object E(SuperPassApplication superPassApplication, ContinuationImpl continuationImpl);

    Object F(List list, boolean z, String str, long j, long j2, ContinuationImpl continuationImpl);

    FlowQuery$mapToList$$inlined$map$1 G(List list);

    Object H(RideBasedSuperPassRideDetailsRoom rideBasedSuperPassRideDetailsRoom, ContinuationImpl continuationImpl);

    FlowQuery$mapToOneOrNull$$inlined$map$1 I(String str);

    Object J(String str, String str2, String str3, String str4, int i, List list, Continuation continuation);

    Object a(String str, ContinuationImpl continuationImpl);

    Object b(String str, Continuation continuation);

    Object c(String str, ContinuationImpl continuationImpl);

    Object d(List list, long j, String str, ContinuationImpl continuationImpl);

    FlowQuery$mapToList$$inlined$map$1 e(List list);

    Object f(String str, ContinuationImpl continuationImpl);

    FlowQuery$mapToList$$inlined$map$1 g(String str);

    Object h(RideBasedSuperPass rideBasedSuperPass, Continuation continuation);

    Object i(String str, Continuation continuation);

    Object j(String str, ContinuationImpl continuationImpl);

    Object k(long j, String str, Continuation continuation);

    Object l(Continuation continuation);

    Object m(List list, ContinuationImpl continuationImpl);

    Object n(List list, ContinuationImpl continuationImpl);

    Object o(Continuation continuation);

    Object p(String str, String str2, String str3, String str4, int i, List list, Continuation continuation);

    Object q(String str, List list, Continuation continuation);

    Object r(List list, Continuation continuation);

    Object s(String str, List list, Continuation continuation);

    FlowQuery$mapToList$$inlined$map$1 t(List list);

    FlowQuery$mapToList$$inlined$map$1 u(List list);

    Object v(MagicSuperPass magicSuperPass, Continuation continuation);

    FlowQuery$mapToOneOrNull$$inlined$map$1 w(String str);

    Object x(List list, Continuation continuation);

    Object y(String str, Continuation continuation);

    Object z(String str, Continuation continuation);
}
