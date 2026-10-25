package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.SuperPassTableMappers;
import app.chalo.features.productsync.constants.SuperPassApplicationStatus;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import app.chalo.userprofile.Gender;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class SuperPassDaoImpl$getAllSuperPassApplicationsAsFlow$1 extends FunctionReferenceImpl implements FunctionN<SuperPassApplication> {
    @Override // kotlin.jvm.functions.FunctionN
    public final Object invoke(Object[] objArr) {
        if (objArr.length != 26) {
            throw new IllegalArgumentException("Expected 26 arguments");
        }
        String p0 = (String) objArr[0];
        String p1 = (String) objArr[1];
        String p2 = (String) objArr[2];
        String p3 = (String) objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        String p5 = (String) objArr[5];
        String p6 = (String) objArr[6];
        long jLongValue2 = ((Number) objArr[7]).longValue();
        long jLongValue3 = ((Number) objArr[8]).longValue();
        SuperPassApplicationStatus p9 = (SuperPassApplicationStatus) objArr[9];
        Map p10 = (Map) objArr[10];
        PassApplicationActionRequired passApplicationActionRequired = (PassApplicationActionRequired) objArr[11];
        String p12 = (String) objArr[12];
        String p13 = (String) objArr[13];
        String p14 = (String) objArr[14];
        Gender p15 = (Gender) objArr[15];
        String p16 = (String) objArr[16];
        String p17 = (String) objArr[17];
        String p18 = (String) objArr[18];
        long jLongValue4 = ((Number) objArr[19]).longValue();
        Double d = (Double) objArr[20];
        String str = (String) objArr[21];
        List list = (List) objArr[22];
        List list2 = (List) objArr[23];
        List list3 = (List) objArr[24];
        RefundInfoEntityModel refundInfoEntityModel = (RefundInfoEntityModel) objArr[25];
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p3, "p3");
        Intrinsics.i(p5, "p5");
        Intrinsics.i(p6, "p6");
        Intrinsics.i(p9, "p9");
        Intrinsics.i(p10, "p10");
        Intrinsics.i(p12, "p12");
        Intrinsics.i(p13, "p13");
        Intrinsics.i(p14, "p14");
        Intrinsics.i(p15, "p15");
        Intrinsics.i(p16, "p16");
        Intrinsics.i(p17, "p17");
        Intrinsics.i(p18, "p18");
        ((SuperPassTableMappers) this.receiver).getClass();
        return SuperPassTableMappers.c(p0, p1, p2, p3, jLongValue, p5, p6, jLongValue2, jLongValue3, p9, p10, passApplicationActionRequired, p12, p13, p14, p15, p16, p17, p18, jLongValue4, d, str, list, list2, list3, refundInfoEntityModel);
    }
}
