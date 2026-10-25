package app.chalo.core;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.ax0;
import defpackage.i40;
import defpackage.lu0;
import defpackage.yw0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/core/Premium_reserve_trip_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetPremiumReserveTripDetailsForBookingIdQuery", "GetAllPremiumReserveTripDetailsForCityQuery", "GetAllPremiumReserveTripDetailsForBookingIdsForCityQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Premium_reserve_trip_tableQueries extends TransacterImpl {
    public final Premium_reserve_trip_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Premium_reserve_trip_tableQueries$GetAllPremiumReserveTripDetailsForBookingIdsForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllPremiumReserveTripDetailsForBookingIdsForCityQuery<T> extends Query<T> {
        public final String b;
        public final ArrayList c;
        public final /* synthetic */ Premium_reserve_trip_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllPremiumReserveTripDetailsForBookingIdsForCityQuery(Premium_reserve_trip_tableQueries premium_reserve_trip_tableQueries, String cityId, ArrayList arrayList, ax0 ax0Var) {
            super(ax0Var);
            Intrinsics.i(cityId, "cityId");
            this.d = premium_reserve_trip_tableQueries;
            this.b = cityId;
            this.c = arrayList;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            ArrayList arrayList = this.c;
            String strS = BaseTransacterImpl.S(arrayList.size());
            return this.d.f697a.P(null, StringsKt.y0("\n          |SELECT premium_reserve_trip_table.cityId, premium_reserve_trip_table.bookingId, premium_reserve_trip_table.tripId, premium_reserve_trip_table.tripStatus, premium_reserve_trip_table.userTripEnded FROM premium_reserve_trip_table \n          |WHERE cityId = ? \n          |AND bookingId IN " + strS + "\n          "), function1, arrayList.size() + 1, new b(this, 21));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"premium_reserve_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"premium_reserve_trip_table"}, listener);
        }

        public final String toString() {
            return "premium_reserve_trip_table.sq:getAllPremiumReserveTripDetailsForBookingIdsForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Premium_reserve_trip_tableQueries$GetAllPremiumReserveTripDetailsForCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllPremiumReserveTripDetailsForCityQuery<T> extends Query<T> {
        public final String b;

        public GetAllPremiumReserveTripDetailsForCityQuery(String str, ax0 ax0Var) {
            super(ax0Var);
            this.b = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return Premium_reserve_trip_tableQueries.this.f697a.P(795146899, "SELECT premium_reserve_trip_table.cityId, premium_reserve_trip_table.bookingId, premium_reserve_trip_table.tripId, premium_reserve_trip_table.tripStatus, premium_reserve_trip_table.userTripEnded FROM premium_reserve_trip_table WHERE cityId = ?", function1, 1, new b(this, 22));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            Premium_reserve_trip_tableQueries.this.f697a.h1(new String[]{"premium_reserve_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            Premium_reserve_trip_tableQueries.this.f697a.P0(new String[]{"premium_reserve_trip_table"}, listener);
        }

        public final String toString() {
            return "premium_reserve_trip_table.sq:getAllPremiumReserveTripDetailsForCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Premium_reserve_trip_tableQueries$GetPremiumReserveTripDetailsForBookingIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetPremiumReserveTripDetailsForBookingIdQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Premium_reserve_trip_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetPremiumReserveTripDetailsForBookingIdQuery(Premium_reserve_trip_tableQueries premium_reserve_trip_tableQueries, String bookingId, ax0 ax0Var) {
            super(ax0Var);
            Intrinsics.i(bookingId, "bookingId");
            this.c = premium_reserve_trip_tableQueries;
            this.b = bookingId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-1740454215, "SELECT premium_reserve_trip_table.cityId, premium_reserve_trip_table.bookingId, premium_reserve_trip_table.tripId, premium_reserve_trip_table.tripStatus, premium_reserve_trip_table.userTripEnded FROM premium_reserve_trip_table WHERE bookingId = ?", function1, 1, new b(this, 23));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"premium_reserve_trip_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"premium_reserve_trip_table"}, listener);
        }

        public final String toString() {
            return "premium_reserve_trip_table.sq:getPremiumReserveTripDetailsForBookingId";
        }
    }

    public Premium_reserve_trip_tableQueries(SqlDriver sqlDriver, Premium_reserve_trip_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String cityId, ArrayList arrayList, Function5 function5) {
        Intrinsics.i(cityId, "cityId");
        return new GetAllPremiumReserveTripDetailsForBookingIdsForCityQuery(this, cityId, arrayList, new ax0(function5, this, 0));
    }

    public final Query X(String str, Function5 function5) {
        return new GetAllPremiumReserveTripDetailsForCityQuery(str, new ax0(function5, this, 2));
    }

    public final Query Y(String bookingId, Function5 function5) {
        Intrinsics.i(bookingId, "bookingId");
        return new GetPremiumReserveTripDetailsForBookingIdQuery(this, bookingId, new ax0(function5, this, 1));
    }

    public final QueryResult Z(Premium_reserve_trip_table premium_reserve_trip_table) {
        QueryResult queryResultA0 = this.f697a.A0(1697092467, "INSERT OR REPLACE INTO premium_reserve_trip_table (cityId, bookingId, tripId, tripStatus, userTripEnded) VALUES (?, ?, ?, ?, ?)", new lu0(16, premium_reserve_trip_table, this));
        T(1697092467, new yw0(7));
        return queryResultA0;
    }
}
