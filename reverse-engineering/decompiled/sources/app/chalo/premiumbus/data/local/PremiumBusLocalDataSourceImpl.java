package app.chalo.premiumbus.data.local;

import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketReceiptEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/local/PremiumBusLocalDataSourceImpl;", "Lapp/chalo/premiumbus/data/local/PremiumBusLocalDataSource;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusLocalDataSourceImpl implements PremiumBusLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusDao f6980a;
    public final PremiumBusTripDao b;

    public PremiumBusLocalDataSourceImpl(PremiumBusDao premiumBusDao, PremiumBusTripDao premiumBusTripDao) {
        this.f6980a = premiumBusDao;
        this.b = premiumBusTripDao;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Flow a(long j, String str, String str2) {
        return this.f6980a.a(j, str, str2);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Object b(String str, List list, boolean z, Continuation continuation) {
        Object objB = this.f6980a.b(str, list, z, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Flow c(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        return this.f6980a.c(bookingId);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Object d(String str, ArrayList arrayList, Continuation continuation) {
        Object objD = this.f6980a.d(str, arrayList, continuation);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Object e(Continuation continuation) {
        Object objE = this.f6980a.e(continuation);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Object f(String str, String str2, PremiumReserveTicketAckType premiumReserveTicketAckType, Continuation continuation) {
        Object objF = this.f6980a.f(str, str2, premiumReserveTicketAckType, continuation);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Object g(String str, PremiumReserveTicketStatus premiumReserveTicketStatus, ContinuationImpl continuationImpl) {
        Object objG = this.f6980a.g(str, premiumReserveTicketStatus, continuationImpl);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Object h(String str, PremiumBusTripStatus premiumBusTripStatus, Continuation continuation) {
        Object objH = this.b.h(str, premiumBusTripStatus, continuation);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Flow i(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        return this.f6980a.i(bookingId);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Object j(String str, Continuation continuation) {
        return this.f6980a.j(str, continuation);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Flow k(String str, String str2, String str3) {
        return this.f6980a.k(str, str2, str3);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Object l(List list, Continuation continuation) {
        Object objL = this.f6980a.l(list, continuation);
        return objL == CoroutineSingletons.COROUTINE_SUSPENDED ? objL : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Object m(PremiumReserveTicketEntity premiumReserveTicketEntity, Continuation continuation) {
        Object objM = this.f6980a.m(premiumReserveTicketEntity, continuation);
        return objM == CoroutineSingletons.COROUTINE_SUSPENDED ? objM : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Object n(String str, Continuation continuation) {
        return this.f6980a.n(str, continuation);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Flow o(String userId, String str) {
        Intrinsics.i(userId, "userId");
        return this.f6980a.o(userId, str);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Object p(Continuation continuation) {
        return this.f6980a.p(continuation);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Object q(String str, Continuation continuation) {
        Object objO = this.b.o(str, continuation);
        return objO == CoroutineSingletons.COROUTINE_SUSPENDED ? objO : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Object r(String str, String str2, long j, long j2, Continuation continuation) {
        return this.f6980a.r(str, str2, j, j2, continuation);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Flow s(long j, long j2, String str, String str2) {
        return this.f6980a.u(j, j2, str, str2);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Object t(PremiumReserveTicketReceiptEntity premiumReserveTicketReceiptEntity, Continuation continuation) {
        Object objT = this.f6980a.t(premiumReserveTicketReceiptEntity, continuation);
        return objT == CoroutineSingletons.COROUTINE_SUSPENDED ? objT : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Flow u(String str) {
        return this.b.u(str);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Object v(ArrayList arrayList, Continuation continuation) {
        Object objM = this.b.m(arrayList, continuation);
        return objM == CoroutineSingletons.COROUTINE_SUSPENDED ? objM : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Object w(Continuation continuation) {
        return this.b.n(continuation);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Flow x(String str) {
        return this.f6980a.v(str);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusLocalDataSource
    public final Flow y(String cityId, ArrayList arrayList) {
        Intrinsics.i(cityId, "cityId");
        return this.b.k(cityId, arrayList);
    }
}
