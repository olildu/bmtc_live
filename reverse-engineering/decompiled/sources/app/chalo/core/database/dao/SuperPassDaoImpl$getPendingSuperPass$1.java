package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.SuperPassTableMappers;
import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPass;
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
final /* synthetic */ class SuperPassDaoImpl$getPendingSuperPass$1 extends FunctionReferenceImpl implements FunctionN<PendingSuperPass> {
    @Override // kotlin.jvm.functions.FunctionN
    public final Object invoke(Object[] objArr) {
        if (objArr.length != 38) {
            throw new IllegalArgumentException("Expected 38 arguments");
        }
        SuperPassStatus p0 = (SuperPassStatus) objArr[0];
        String p1 = (String) objArr[1];
        String p2 = (String) objArr[2];
        SuperPassSubType p3 = (SuperPassSubType) objArr[3];
        String p4 = (String) objArr[4];
        String p5 = (String) objArr[5];
        double dDoubleValue = ((Number) objArr[6]).doubleValue();
        String str = (String) objArr[7];
        long jLongValue = ((Number) objArr[8]).longValue();
        List p9 = (List) objArr[9];
        Map p10 = (Map) objArr[10];
        long jLongValue2 = ((Number) objArr[11]).longValue();
        String p12 = (String) objArr[12];
        String p13 = (String) objArr[13];
        String p14 = (String) objArr[14];
        String p15 = (String) objArr[15];
        String p16 = (String) objArr[16];
        String p17 = (String) objArr[17];
        Gender p18 = (Gender) objArr[18];
        String p19 = (String) objArr[19];
        String p20 = (String) objArr[20];
        String p21 = (String) objArr[21];
        double dDoubleValue2 = ((Number) objArr[22]).doubleValue();
        double dDoubleValue3 = ((Number) objArr[23]).doubleValue();
        boolean zBooleanValue = ((Boolean) objArr[24]).booleanValue();
        double dDoubleValue4 = ((Number) objArr[25]).doubleValue();
        List p26 = (List) objArr[26];
        boolean zBooleanValue2 = ((Boolean) objArr[27]).booleanValue();
        String p28 = (String) objArr[28];
        String p29 = (String) objArr[29];
        long jLongValue3 = ((Number) objArr[30]).longValue();
        long jLongValue4 = ((Number) objArr[31]).longValue();
        long jLongValue5 = ((Number) objArr[32]).longValue();
        boolean zBooleanValue3 = ((Boolean) objArr[33]).booleanValue();
        String p34 = (String) objArr[34];
        String p35 = (String) objArr[35];
        String str2 = (String) objArr[36];
        RefundInfoEntityModel refundInfoEntityModel = (RefundInfoEntityModel) objArr[37];
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p3, "p3");
        Intrinsics.i(p4, "p4");
        Intrinsics.i(p5, "p5");
        Intrinsics.i(p9, "p9");
        Intrinsics.i(p10, "p10");
        Intrinsics.i(p12, "p12");
        Intrinsics.i(p13, "p13");
        Intrinsics.i(p14, "p14");
        Intrinsics.i(p15, "p15");
        Intrinsics.i(p16, "p16");
        Intrinsics.i(p17, "p17");
        Intrinsics.i(p18, "p18");
        Intrinsics.i(p19, "p19");
        Intrinsics.i(p20, "p20");
        Intrinsics.i(p21, "p21");
        Intrinsics.i(p26, "p26");
        Intrinsics.i(p28, "p28");
        Intrinsics.i(p29, "p29");
        Intrinsics.i(p34, "p34");
        Intrinsics.i(p35, "p35");
        ((SuperPassTableMappers) this.receiver).getClass();
        return SuperPassTableMappers.d(p0, p1, p2, p3, p4, p5, dDoubleValue, str, jLongValue, p9, p10, jLongValue2, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, dDoubleValue2, dDoubleValue3, zBooleanValue, dDoubleValue4, p26, zBooleanValue2, p28, p29, jLongValue3, jLongValue4, jLongValue5, zBooleanValue3, p34, p35, str2, refundInfoEntityModel);
    }
}
