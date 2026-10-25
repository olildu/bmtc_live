package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.SuperPassBookingEntityMapper;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.receipt.ReceiptFareDataAppModel;
import app.chalo.superpass.data.models.entities.SuperPassBookingEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class SuperPassBookingsDaoImpl$getSuperPassBookingsAsFlow$1 extends FunctionReferenceImpl implements Function21<String, String, Long, Long, String, String, String, String, String, String, RouteNamingSchemeType, List<? extends String>, String, String, String, String, String, String, String, Long, ReceiptFareDataAppModel, SuperPassBookingEntity> {
    @Override // kotlin.jvm.functions.Function21
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        RouteNamingSchemeType p10 = (RouteNamingSchemeType) obj11;
        String str = (String) obj13;
        String str2 = (String) obj14;
        String str3 = (String) obj15;
        String str4 = (String) obj16;
        String str5 = (String) obj17;
        String str6 = (String) obj18;
        String str7 = (String) obj19;
        Long l = (Long) obj20;
        ReceiptFareDataAppModel receiptFareDataAppModel = (ReceiptFareDataAppModel) obj21;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p10, "p10");
        ((SuperPassBookingEntityMapper) this.receiver).getClass();
        return new SuperPassBookingEntity(((Number) obj3).longValue(), ((Number) obj4).longValue(), p10, receiptFareDataAppModel, l, p0, p1, (String) obj5, (String) obj6, (String) obj7, (String) obj8, (String) obj9, (String) obj10, str, str2, str3, str4, str5, str6, str7, (List) obj12);
    }
}
