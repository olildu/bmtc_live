package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.InstantTicketEntityMapper;
import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.instantticket.data.model.InstantTicketPassengerDetailsEntity;
import app.chalo.instantticket.data.model.InstantTicketStatus;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class InstantTicketDaoImpl$getInstantTicketAsFlow$1 extends FunctionReferenceImpl implements Function19<String, String, String, Long, Long, InstantTicketStatus, Long, String, String, String, Long, String, String, String, String, String, String, List<? extends InstantTicketPassengerDetailsEntity>, RefundInfoEntityModel, InstantTicketEntity> {
    @Override // kotlin.jvm.functions.Function19
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        String p2 = (String) obj3;
        InstantTicketStatus p5 = (InstantTicketStatus) obj6;
        String p7 = (String) obj8;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p5, "p5");
        Intrinsics.i(p7, "p7");
        ((InstantTicketEntityMapper) this.receiver).getClass();
        return InstantTicketEntityMapper.a(p0, p1, p2, ((Number) obj4).longValue(), ((Number) obj5).longValue(), p5, (Long) obj7, p7, (String) obj9, (String) obj10, (Long) obj11, (String) obj12, (String) obj13, (String) obj14, (String) obj15, (String) obj16, (String) obj17, (List) obj18, (RefundInfoEntityModel) obj19);
    }
}
