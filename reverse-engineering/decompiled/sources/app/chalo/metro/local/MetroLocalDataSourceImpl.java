package app.chalo.metro.local;

import app.chalo.metro.dao.MetroTicketDao;
import app.chalo.metro.dao.MetroTicketEntity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/local/MetroLocalDataSourceImpl;", "Lapp/chalo/metro/local/MetroLocalDataSource;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MetroLocalDataSourceImpl implements MetroLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetroTicketDao f5451a;

    public MetroLocalDataSourceImpl(MetroTicketDao metroTicketDao) {
        this.f5451a = metroTicketDao;
    }

    @Override // app.chalo.metro.local.MetroLocalDataSource
    public final Object a(Continuation continuation) {
        Object objA = this.f5451a.a(continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.metro.local.MetroLocalDataSource
    public final Object b(String str, String str2, Continuation continuation) {
        return this.f5451a.b(str, str2, continuation);
    }

    @Override // app.chalo.metro.local.MetroLocalDataSource
    public final Flow c(String bookingId, String str) {
        Intrinsics.i(bookingId, "bookingId");
        return this.f5451a.c(bookingId, str);
    }

    @Override // app.chalo.metro.local.MetroLocalDataSource
    public final Flow d(String str, String str2) {
        return this.f5451a.d(str, str2);
    }

    @Override // app.chalo.metro.local.MetroLocalDataSource
    public final Object e(ArrayList arrayList, Continuation continuation) {
        Object objE = this.f5451a.e(arrayList, continuation);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : Unit.f17538a;
    }

    @Override // app.chalo.metro.local.MetroLocalDataSource
    public final Object f(MetroTicketEntity metroTicketEntity, Continuation continuation) {
        Object objF = this.f5451a.f(metroTicketEntity, continuation);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : Unit.f17538a;
    }

    @Override // app.chalo.metro.local.MetroLocalDataSource
    public final Object g(ArrayList arrayList, Continuation continuation) {
        Object objG = this.f5451a.g(arrayList, continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }
}
