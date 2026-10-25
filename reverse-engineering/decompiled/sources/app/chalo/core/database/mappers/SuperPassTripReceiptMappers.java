package app.chalo.core.database.mappers;

import app.chalo.core.Super_pass_trip_receipt_table;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.superpass.data.models.entities.SuperPassTripReceipt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/mappers/SuperPassTripReceiptMappers;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassTripReceiptMappers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassTripReceiptMappers f2110a = new SuperPassTripReceiptMappers();

    public static SuperPassTripReceipt a(String pass_id, String product_type, String product_sub_type, long j, long j2, String vehicle_no, String conductor_id, String start_stop_name, String end_stop_name, String route_name, List special_features_list, String str, RouteNamingSchemeType routeNamingScheme) {
        Intrinsics.i(pass_id, "pass_id");
        Intrinsics.i(product_type, "product_type");
        Intrinsics.i(product_sub_type, "product_sub_type");
        Intrinsics.i(vehicle_no, "vehicle_no");
        Intrinsics.i(conductor_id, "conductor_id");
        Intrinsics.i(start_stop_name, "start_stop_name");
        Intrinsics.i(end_stop_name, "end_stop_name");
        Intrinsics.i(route_name, "route_name");
        Intrinsics.i(special_features_list, "special_features_list");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        return new SuperPassTripReceipt(pass_id, product_type, product_sub_type, j, j2, vehicle_no, conductor_id, start_stop_name, end_stop_name, route_name, special_features_list, str, routeNamingScheme);
    }

    public static Super_pass_trip_receipt_table b(SuperPassTripReceipt superPassTripReceipt) {
        Intrinsics.i(superPassTripReceipt, "<this>");
        return new Super_pass_trip_receipt_table(superPassTripReceipt.f9577a, superPassTripReceipt.b, superPassTripReceipt.c, superPassTripReceipt.d, superPassTripReceipt.e, superPassTripReceipt.f, superPassTripReceipt.g, superPassTripReceipt.h, superPassTripReceipt.i, superPassTripReceipt.j, superPassTripReceipt.k, superPassTripReceipt.l, superPassTripReceipt.m);
    }
}
