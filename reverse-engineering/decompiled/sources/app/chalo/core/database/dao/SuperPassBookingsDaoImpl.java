package app.chalo.core.database.dao;

import app.cash.sqldelight.QueryKt;
import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.core.Super_pass_bookings_tableQueries;
import app.chalo.core.database.mappers.SuperPassBookingEntityMapper;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.superpass.data.dao.SuperPassBookingsDao;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import defpackage.pg1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/SuperPassBookingsDaoImpl;", "Lapp/chalo/superpass/data/dao/SuperPassBookingsDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassBookingsDaoImpl implements SuperPassBookingsDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Super_pass_bookings_tableQueries f2081a;
    public final CoroutineContextProvider b;

    public SuperPassBookingsDaoImpl(Super_pass_bookings_tableQueries superPassBookingTableQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(superPassBookingTableQueries, "superPassBookingTableQueries");
        this.f2081a = superPassBookingTableQueries;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassBookingsDao
    public final /* bridge */ Object a(ArrayList arrayList, Continuation continuation) {
        return SuperPassBookingsDao.DefaultImpls.a(this, arrayList, (ContinuationImpl) continuation);
    }

    @Override // app.chalo.superpass.data.dao.SuperPassBookingsDao
    public final Object b(ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new SuperPassBookingsDaoImpl$deleteAllSuperPassBookings$2(this, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassBookingsDao
    public final Object c(List list, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new SuperPassBookingsDaoImpl$insertSuperPassBookings$2(this, list, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassBookingsDao
    public final FlowQuery$mapToList$$inlined$map$1 d() {
        SuperPassBookingsDaoImpl$getSuperPassBookingsAsFlow$1 superPassBookingsDaoImpl$getSuperPassBookingsAsFlow$1 = new SuperPassBookingsDaoImpl$getSuperPassBookingsAsFlow$1(21, SuperPassBookingEntityMapper.f2108a, SuperPassBookingEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/providers/RouteNamingSchemeType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lapp/chalo/receipt/ReceiptFareDataAppModel;)Lapp/chalo/superpass/data/models/entities/SuperPassBookingEntity;", 0);
        Super_pass_bookings_tableQueries super_pass_bookings_tableQueries = this.f2081a;
        super_pass_bookings_tableQueries.getClass();
        return FlowQuery.a(FlowQuery.c(QueryKt.a(-1656844910, new String[]{"super_pass_bookings_table"}, super_pass_bookings_tableQueries.f697a, "super_pass_bookings_table.sq", "getSuperPassBookingsAsFlow", "SELECT super_pass_bookings_table.passId, super_pass_bookings_table.rideType, super_pass_bookings_table.activationTimeInSec, super_pass_bookings_table.punchTimeInMillis, super_pass_bookings_table.startStopName, super_pass_bookings_table.endStopName, super_pass_bookings_table.routeName, super_pass_bookings_table.vehicleNo, super_pass_bookings_table.conductorId, super_pass_bookings_table.via, super_pass_bookings_table.routeNamingScheme, super_pass_bookings_table.specialFeatures, super_pass_bookings_table.depotName, super_pass_bookings_table.printedTicketId, super_pass_bookings_table.scheduleNumber, super_pass_bookings_table.routeServiceType, super_pass_bookings_table.driverId, super_pass_bookings_table.waybillNo, super_pass_bookings_table.etimVersion, super_pass_bookings_table.amount, super_pass_bookings_table.fareData FROM super_pass_bookings_table", new pg1(0, superPassBookingsDaoImpl$getSuperPassBookingsAsFlow$1, super_pass_bookings_tableQueries))), this.b.b());
    }
}
