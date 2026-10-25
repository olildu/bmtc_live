package app.chalo.core.database.mappers;

import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.models.CardDetails;
import app.chalo.models.RecentPaymentMethod;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketConfiguration;
import app.chalo.models.mticketing.MTicketTripReceipt;
import app.chalo.models.userprofile.UserProfile;
import app.chalo.network.config.ChaloJson;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/mappers/TicketTableMapper;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketTableMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TicketTableMapper f2112a = new TicketTableMapper();

    public static MTicket a(String str, String str2, String str3, String str4, String str5, String str6, RouteStopsInfo routeStopsInfo, RouteStopsInfo routeStopsInfo2, Map map, long j, long j2, boolean z, long j3, boolean z2, Long l, UserProfile userProfile, String str7, String str8, MTicketConfiguration mTicketConfiguration, Boolean bool, boolean z3, String str9, String str10, String str11, String str12, String str13, String str14, MTicketTripReceipt mTicketTripReceipt) {
        List list;
        List list2 = null;
        if (str9 == null || str9.equals("null")) {
            list = null;
        } else {
            Json json = ChaloJson.b;
            json.getClass();
            list = (List) json.b(str9, new ArrayListSerializer(RecentPaymentMethod.INSTANCE.serializer()));
        }
        if (str10 != null && !str10.equals("null")) {
            Json json2 = ChaloJson.b;
            json2.getClass();
            list2 = (List) json2.b(str10, new ArrayListSerializer(CardDetails.INSTANCE.serializer()));
        }
        return new MTicket(str2, str3, str4, str5, str6, routeStopsInfo, routeStopsInfo2, map, j, j2, z, j3, z2, l, userProfile, str7, str8, mTicketConfiguration, bool, z3, list, list2, str11, str12, str13, str14, mTicketTripReceipt, 939524096);
    }
}
