package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.core.Premium_reserve_trip_tableQueries;
import app.chalo.core.database.mappers.PremiumBusMappers;
import app.chalo.premiumbus.data.local.PremiumBusTripDao;
import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/PremiumBusTripDaoImpl;", "Lapp/chalo/premiumbus/data/local/PremiumBusTripDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusTripDaoImpl implements PremiumBusTripDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Premium_reserve_trip_tableQueries f2070a;
    public final CoroutineContextProvider b;

    public PremiumBusTripDaoImpl(Premium_reserve_trip_tableQueries tripQuery, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(tripQuery, "tripQuery");
        this.f2070a = tripQuery;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusTripDao
    public final Object h(String str, PremiumBusTripStatus premiumBusTripStatus, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new PremiumBusTripDaoImpl$updatePremiumReserveTripStatus$2(this, premiumBusTripStatus, str, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusTripDao
    public final FlowQuery$mapToList$$inlined$map$1 k(String cityId, ArrayList arrayList) {
        Intrinsics.i(cityId, "cityId");
        return FlowQuery.a(FlowQuery.c(this.f2070a.W(cityId, arrayList, new PremiumBusTripDaoImpl$getAllPremiumReserveTripDetailsForBookingIdsForCityAsFlow$1(5, PremiumBusMappers.f2096a, PremiumBusMappers.class, "toEntity", "toEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/premiumbus/data/models/app/PremiumBusTripStatus;Z)Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTripEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusTripDao
    public final Object m(ArrayList arrayList, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new PremiumBusTripDaoImpl$insertPremiumReserveTripDetailsList$2(this, arrayList, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusTripDao
    public final Object n(Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new PremiumBusTripDaoImpl$getPremiumReserveTripDetailsForBookingId$2(this, null, null), continuation);
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusTripDao
    public final Object o(String str, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new PremiumBusTripDaoImpl$updateUserTripEndedStatus$2(this, true, str, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.local.PremiumBusTripDao
    public final FlowQuery$mapToList$$inlined$map$1 u(String str) {
        return FlowQuery.a(FlowQuery.c(this.f2070a.X(str, new PremiumBusTripDaoImpl$getAllPremiumReserveTripDetailsForCityAsFlow$1(5, PremiumBusMappers.f2096a, PremiumBusMappers.class, "toEntity", "toEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/premiumbus/data/models/app/PremiumBusTripStatus;Z)Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTripEntity;", 0))), this.b.b());
    }
}
