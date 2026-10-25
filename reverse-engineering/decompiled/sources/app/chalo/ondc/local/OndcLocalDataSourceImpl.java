package app.chalo.ondc.local;

import app.chalo.metro.dao.ondc.OndcMetroTicketDao;
import app.chalo.metro.dao.ondc.OndcMetroTicketEntity;
import app.chalo.models.ondc.OndcTicketReceiptEntity;
import app.chalo.ondc.dao.OndcTicketDao;
import app.chalo.ondc.dao.OndcTicketEntity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/local/OndcLocalDataSourceImpl;", "Lapp/chalo/ondc/local/OndcLocalDataSource;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcLocalDataSourceImpl implements OndcLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OndcTicketDao f6721a;
    public final OndcMetroTicketDao b;

    public OndcLocalDataSourceImpl(OndcTicketDao ondcTicketDao, OndcMetroTicketDao ondcMetroTicketDao) {
        this.f6721a = ondcTicketDao;
        this.b = ondcMetroTicketDao;
    }

    @Override // app.chalo.ondc.local.OndcLocalDataSource
    public final Flow a(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        return this.f6721a.a(bookingId);
    }

    @Override // app.chalo.ondc.local.OndcLocalDataSource
    public final Flow b(String bookingId, String str) {
        Intrinsics.i(bookingId, "bookingId");
        return this.f6721a.b(bookingId, str);
    }

    @Override // app.chalo.ondc.local.OndcLocalDataSource
    public final Object c(OndcTicketReceiptEntity ondcTicketReceiptEntity, ContinuationImpl continuationImpl) {
        Object objC = this.f6721a.c(ondcTicketReceiptEntity, continuationImpl);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    @Override // app.chalo.ondc.local.OndcLocalDataSource
    public final Object d(String str, String str2, Continuation continuation) {
        return this.f6721a.d(str, str2, continuation);
    }

    @Override // app.chalo.ondc.local.OndcLocalDataSource
    public final Flow e(String str, String str2) {
        return this.f6721a.e(str, str2);
    }

    @Override // app.chalo.ondc.local.OndcLocalDataSource
    public final Object f(ArrayList arrayList, Continuation continuation) {
        Object objF = this.f6721a.f(arrayList, continuation);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : Unit.f17538a;
    }

    @Override // app.chalo.ondc.local.OndcLocalDataSource
    public final Object g(Continuation continuation) {
        Object objG = this.f6721a.g(continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.ondc.local.OndcLocalDataSource
    public final Object h(Continuation continuation) {
        Object objA = this.b.a(continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.ondc.local.OndcLocalDataSource
    public final Object i(String str, String str2, Continuation continuation) {
        return this.f6721a.i(str, str2, continuation);
    }

    @Override // app.chalo.ondc.local.OndcLocalDataSource
    public final Object j(OndcTicketEntity ondcTicketEntity, ContinuationImpl continuationImpl) {
        Object objJ = this.f6721a.j(ondcTicketEntity, continuationImpl);
        return objJ == CoroutineSingletons.COROUTINE_SUSPENDED ? objJ : Unit.f17538a;
    }

    @Override // app.chalo.ondc.local.OndcLocalDataSource
    public final Flow k(String str, String str2) {
        return this.b.d(str, str2);
    }

    @Override // app.chalo.ondc.local.OndcLocalDataSource
    public final Object l(OndcMetroTicketEntity ondcMetroTicketEntity, Continuation continuation) {
        Object objE = this.b.e(ondcMetroTicketEntity, continuation);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : Unit.f17538a;
    }

    @Override // app.chalo.ondc.local.OndcLocalDataSource
    public final Object m(ArrayList arrayList, Continuation continuation) {
        Object objF = this.b.f(arrayList, continuation);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : Unit.f17538a;
    }

    @Override // app.chalo.ondc.local.OndcLocalDataSource
    public final Object n(String str, String str2, Continuation continuation) {
        return this.b.b(str, str2, continuation);
    }

    @Override // app.chalo.ondc.local.OndcLocalDataSource
    public final Flow o(String bookingId, String str) {
        Intrinsics.i(bookingId, "bookingId");
        return this.b.c(bookingId, str);
    }
}
