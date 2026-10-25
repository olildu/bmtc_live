package app.chalo.vault.mapper;

import app.chalo.network.config.ChaloJson;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.receipt.ReceiptFareDataAppModel;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayReceipt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/mapper/QuickPayReceiptMapper;", "", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickPayReceiptMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final QuickPayReceiptMapper f10762a = new QuickPayReceiptMapper();

    /* JADX WARN: Multi-variable type inference failed */
    public static QuickPayReceipt a(String transactionId, String orderId, long j, long j2, String vehicleNo, String conductorId, String startStop, String endStop, String routeName, String endStopId, String str, String str2, String routeNamingScheme, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Object objB;
        Map map;
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(startStop, "startStop");
        Intrinsics.i(endStop, "endStop");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        Object objB2 = null;
        if (str != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(new LinkedHashMapSerializer(StringSerializer.f18170a, IntSerializer.f18146a)));
            } catch (Exception unused) {
                objB = null;
            }
            map = (Map) objB;
        } else {
            map = null;
        }
        RouteNamingSchemeType.INSTANCE.getClass();
        RouteNamingSchemeType routeNamingSchemeTypeA = RouteNamingSchemeType.Companion.a(routeNamingScheme);
        if (str10 != null) {
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB2 = json2.b(str10, ReceiptFareDataAppModel.INSTANCE.serializer());
            } catch (Exception unused2) {
            }
            objB2 = (ReceiptFareDataAppModel) objB2;
        }
        return new QuickPayReceipt(transactionId, orderId, j, j2, vehicleNo, conductorId, startStop, endStop, routeName, endStopId, map, str2, routeNamingSchemeTypeA, str3, str4, str5, str6, str7, str8, str9, objB2);
    }
}
