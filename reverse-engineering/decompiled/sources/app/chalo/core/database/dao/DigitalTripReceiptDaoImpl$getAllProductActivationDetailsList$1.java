package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.ProductActivationDetailsMappers;
import app.chalo.superpass.data.models.entities.ProductActivationDetails;
import kotlin.Metadata;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class DigitalTripReceiptDaoImpl$getAllProductActivationDetailsList$1 extends FunctionReferenceImpl implements Function7<Long, String, Long, String, String, String, String, ProductActivationDetails> {
    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        long jLongValue = ((Number) obj).longValue();
        String p1 = (String) obj2;
        long jLongValue2 = ((Number) obj3).longValue();
        String p3 = (String) obj4;
        String p4 = (String) obj5;
        String p5 = (String) obj6;
        String p6 = (String) obj7;
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p3, "p3");
        Intrinsics.i(p4, "p4");
        Intrinsics.i(p5, "p5");
        Intrinsics.i(p6, "p6");
        ((ProductActivationDetailsMappers) this.receiver).getClass();
        return new ProductActivationDetails(jLongValue, p1, jLongValue2, p3, p4, p5, p6);
    }
}
