package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.OndcTicketEntityMapper;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.ondc.dao.OndcTicketEntity;
import app.chalo.ondc.model.app.OndcTicketStatus;
import app.chalo.productbooking.common.data.models.entity.FareBreakupEntityModel;
import app.chalo.ticketvalidation.TicketValidationInfoEntity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class OndcTicketDaoImpl$getAllOndcTicketsAsFlow$1 extends FunctionReferenceImpl implements Function18<String, String, Long, Long, OndcTicketStatus, Long, String, String, String, Long, Map<String, ? extends Integer>, String, String, String, RefundInfoAppModel, List<? extends FareBreakupEntityModel>, List<? extends TicketValidationInfoEntity>, String, OndcTicketEntity> {
    @Override // kotlin.jvm.functions.Function18
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        OndcTicketStatus p4 = (OndcTicketStatus) obj5;
        String p6 = (String) obj7;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p4, "p4");
        Intrinsics.i(p6, "p6");
        ((OndcTicketEntityMapper) this.receiver).getClass();
        return OndcTicketEntityMapper.a(p0, p1, ((Number) obj3).longValue(), ((Number) obj4).longValue(), p4, (Long) obj6, p6, (String) obj8, (String) obj9, (Long) obj10, (Map) obj11, (String) obj12, (String) obj13, (String) obj14, (RefundInfoAppModel) obj15, (List) obj16, (List) obj17, (String) obj18);
    }
}
