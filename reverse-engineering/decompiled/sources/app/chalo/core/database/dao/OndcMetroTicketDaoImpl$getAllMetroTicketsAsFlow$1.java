package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.OndcMetroTicketEntityMapper;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.metro.dao.ondc.OndcMetroTicketEntity;
import app.chalo.ondc.model.app.MetroJourneyOverview;
import app.chalo.ondc.model.app.OndcMetroTicketStatus;
import app.chalo.productbooking.common.data.models.entity.PaymentInfoEntityModel;
import app.chalo.ticketvalidation.TicketValidationInfoEntity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class OndcMetroTicketDaoImpl$getAllMetroTicketsAsFlow$1 extends FunctionReferenceImpl implements Function20<String, String, Long, Long, OndcMetroTicketStatus, Long, String, String, List<? extends TicketValidationInfoEntity>, String, Long, Map<String, ? extends Integer>, String, String, String, RefundInfoAppModel, List<? extends MetroJourneyOverview>, PaymentInfoEntityModel, String, String, OndcMetroTicketEntity> {
    @Override // kotlin.jvm.functions.Function20
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        OndcMetroTicketStatus p4 = (OndcMetroTicketStatus) obj5;
        String p6 = (String) obj7;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p4, "p4");
        Intrinsics.i(p6, "p6");
        ((OndcMetroTicketEntityMapper) this.receiver).getClass();
        return OndcMetroTicketEntityMapper.a(p0, p1, ((Number) obj3).longValue(), ((Number) obj4).longValue(), p4, (Long) obj6, p6, (String) obj8, (List) obj9, (String) obj10, (Long) obj11, (Map) obj12, (String) obj13, (String) obj14, (String) obj15, (RefundInfoAppModel) obj16, (List) obj17, (PaymentInfoEntityModel) obj18, (String) obj19, (String) obj20);
    }
}
