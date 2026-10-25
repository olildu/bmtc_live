package app.chalo.instantticket.data.localsource;

import app.chalo.instantticket.data.dao.InstantTicketDao;
import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.instantticket.data.model.InstantTicketReceipt;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/localsource/InstantTicketLocalDataSourceImpl;", "Lapp/chalo/instantticket/data/localsource/InstantTicketLocalDataSource;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstantTicketLocalDataSourceImpl implements InstantTicketLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstantTicketDao f3839a;

    public InstantTicketLocalDataSourceImpl(InstantTicketDao instantTicketDao) {
        this.f3839a = instantTicketDao;
    }

    @Override // app.chalo.instantticket.data.localsource.InstantTicketLocalDataSource
    public final Flow a(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        return this.f3839a.a(bookingId);
    }

    @Override // app.chalo.instantticket.data.localsource.InstantTicketLocalDataSource
    public final Object b(InstantTicketReceipt instantTicketReceipt, Continuation continuation) {
        Object objB = this.f3839a.b(instantTicketReceipt, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    @Override // app.chalo.instantticket.data.localsource.InstantTicketLocalDataSource
    public final Object c(long j, String str, Continuation continuation) {
        Object objC = this.f3839a.c(j, str, continuation);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    @Override // app.chalo.instantticket.data.localsource.InstantTicketLocalDataSource
    public final Object d(InstantTicketEntity instantTicketEntity, Continuation continuation) {
        Object objD = this.f3839a.d(instantTicketEntity, continuation);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    @Override // app.chalo.instantticket.data.localsource.InstantTicketLocalDataSource
    public final Object e(String str, List list, Continuation continuation) {
        return this.f3839a.e(str, list, continuation);
    }

    @Override // app.chalo.instantticket.data.localsource.InstantTicketLocalDataSource
    public final Object f(Continuation continuation) {
        Object objF = this.f3839a.f(continuation);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : Unit.f17538a;
    }

    @Override // app.chalo.instantticket.data.localsource.InstantTicketLocalDataSource
    public final Flow g(String str, List cityIdList) {
        Intrinsics.i(cityIdList, "cityIdList");
        return this.f3839a.g(str, cityIdList);
    }

    @Override // app.chalo.instantticket.data.localsource.InstantTicketLocalDataSource
    public final Object h(ArrayList arrayList, Continuation continuation) {
        Object objH = this.f3839a.h(arrayList, continuation);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : Unit.f17538a;
    }

    @Override // app.chalo.instantticket.data.localsource.InstantTicketLocalDataSource
    public final Flow i(String bookingId, String str) {
        Intrinsics.i(bookingId, "bookingId");
        return this.f3839a.i(bookingId, str);
    }

    @Override // app.chalo.instantticket.data.localsource.InstantTicketLocalDataSource
    public final Flow j(String str, List cityIdList) {
        Intrinsics.i(cityIdList, "cityIdList");
        return this.f3839a.j(str, cityIdList);
    }

    @Override // app.chalo.instantticket.data.localsource.InstantTicketLocalDataSource
    public final Object k(String str, String str2, ContinuationImpl continuationImpl) {
        return this.f3839a.k(str, str2, continuationImpl);
    }
}
