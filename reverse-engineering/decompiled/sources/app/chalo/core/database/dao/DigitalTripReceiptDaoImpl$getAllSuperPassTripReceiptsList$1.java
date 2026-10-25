package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.SuperPassTripReceiptMappers;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.superpass.data.models.entities.SuperPassTripReceipt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class DigitalTripReceiptDaoImpl$getAllSuperPassTripReceiptsList$1 extends FunctionReferenceImpl implements Function13<String, String, String, Long, Long, String, String, String, String, String, List<? extends String>, String, RouteNamingSchemeType, SuperPassTripReceipt> {
    @Override // kotlin.jvm.functions.Function13
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        String p2 = (String) obj3;
        String p5 = (String) obj6;
        String p6 = (String) obj7;
        String p7 = (String) obj8;
        String p8 = (String) obj9;
        String p9 = (String) obj10;
        List p10 = (List) obj11;
        RouteNamingSchemeType p12 = (RouteNamingSchemeType) obj13;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p5, "p5");
        Intrinsics.i(p6, "p6");
        Intrinsics.i(p7, "p7");
        Intrinsics.i(p8, "p8");
        Intrinsics.i(p9, "p9");
        Intrinsics.i(p10, "p10");
        Intrinsics.i(p12, "p12");
        ((SuperPassTripReceiptMappers) this.receiver).getClass();
        return SuperPassTripReceiptMappers.a(p0, p1, p2, ((Number) obj4).longValue(), ((Number) obj5).longValue(), p5, p6, p7, p8, p9, p10, (String) obj12, p12);
    }
}
