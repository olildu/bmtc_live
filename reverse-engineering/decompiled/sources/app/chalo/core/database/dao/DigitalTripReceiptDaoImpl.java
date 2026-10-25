package app.chalo.core.database.dao;

import app.cash.sqldelight.QueryKt;
import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.core.Product_activation_details_tableQueries;
import app.chalo.core.database.mappers.ProductActivationDetailsMappers;
import app.chalo.core.database.mappers.SuperPassTripReceiptMappers;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.superpass.data.dao.DigitalTripReceiptDao;
import app.chalo.superpass.data.models.entities.ProductActivationDetails;
import app.chalo.superpass.data.models.entities.SuperPassTripReceipt;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import defpackage.vw0;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/DigitalTripReceiptDaoImpl;", "Lapp/chalo/superpass/data/dao/DigitalTripReceiptDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DigitalTripReceiptDaoImpl implements DigitalTripReceiptDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Product_activation_details_tableQueries f2050a;
    public final CoroutineContextProvider b;

    public DigitalTripReceiptDaoImpl(Product_activation_details_tableQueries queries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(queries, "queries");
        this.f2050a = queries;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.superpass.data.dao.DigitalTripReceiptDao
    public final Object a(SuperPassTripReceipt superPassTripReceipt, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new DigitalTripReceiptDaoImpl$insertSuperPassTripReceipt$2(this, superPassTripReceipt, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.DigitalTripReceiptDao
    public final Object b(ArrayList arrayList, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new DigitalTripReceiptDaoImpl$deleteSelectActivationDetails$2(this, arrayList, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.DigitalTripReceiptDao
    public final List c() {
        DigitalTripReceiptDaoImpl$getAllProductActivationDetailsList$1 digitalTripReceiptDaoImpl$getAllProductActivationDetailsList$1 = new DigitalTripReceiptDaoImpl$getAllProductActivationDetailsList$1(7, ProductActivationDetailsMappers.f2097a, ProductActivationDetailsMappers.class, "mapper", "mapper(JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lapp/chalo/superpass/data/models/entities/ProductActivationDetails;", 0);
        Product_activation_details_tableQueries product_activation_details_tableQueries = this.f2050a;
        product_activation_details_tableQueries.getClass();
        return QueryKt.a(-2132360853, new String[]{"product_activation_details_table"}, product_activation_details_tableQueries.f697a, "product_activation_details_table.sq", "getAllProductActivationDetailsList", "SELECT product_activation_details_table.activation_time_stamp, product_activation_details_table.booking_id, product_activation_details_table.expiry_time, product_activation_details_table.product_type, product_activation_details_table.product_sub_type, product_activation_details_table.city_name, product_activation_details_table.agency_name FROM product_activation_details_table", new vw0(digitalTripReceiptDaoImpl$getAllProductActivationDetailsList$1, 7)).b();
    }

    @Override // app.chalo.superpass.data.dao.DigitalTripReceiptDao
    public final Object d(List list, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new DigitalTripReceiptDaoImpl$insertSuperPassTripReceiptsList$2(this, list, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.DigitalTripReceiptDao
    public final Object e(ProductActivationDetails productActivationDetails, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new DigitalTripReceiptDaoImpl$insertActivationDetails$2(this, productActivationDetails, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.DigitalTripReceiptDao
    public final FlowQuery$mapToList$$inlined$map$1 f(String str) {
        return FlowQuery.a(FlowQuery.c(this.f2050a.W(str, new DigitalTripReceiptDaoImpl$getAllSuperPassTripReceiptsList$1(13, SuperPassTripReceiptMappers.f2110a, SuperPassTripReceiptMappers.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lapp/chalo/providers/RouteNamingSchemeType;)Lapp/chalo/superpass/data/models/entities/SuperPassTripReceipt;", 0))), this.b.b());
    }

    @Override // app.chalo.superpass.data.dao.DigitalTripReceiptDao
    public final Object g(String str, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new DigitalTripReceiptDaoImpl$deleteSelectSuperPassTripReceipts$2(this, str, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }
}
