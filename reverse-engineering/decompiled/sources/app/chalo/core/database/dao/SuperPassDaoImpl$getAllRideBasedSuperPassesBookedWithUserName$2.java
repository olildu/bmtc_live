package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.SuperPassTableMappers;
import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.superpass.data.models.entities.PremiumBusMeta;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.userprofile.Gender;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/superpass/data/models/entities/RideBasedSuperPass;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.SuperPassDaoImpl$getAllRideBasedSuperPassesBookedWithUserName$2", f = "SuperPassDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class SuperPassDaoImpl$getAllRideBasedSuperPassesBookedWithUserName$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends RideBasedSuperPass>>, Object> {
    final /* synthetic */ List<String> $cityIdList;
    final /* synthetic */ String $userName;
    int label;
    final /* synthetic */ SuperPassDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.SuperPassDaoImpl$getAllRideBasedSuperPassesBookedWithUserName$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements FunctionN<RideBasedSuperPass> {
        @Override // kotlin.jvm.functions.FunctionN
        public final Object invoke(Object[] objArr) {
            if (objArr.length != 65) {
                throw new IllegalArgumentException("Expected 65 arguments");
            }
            long jLongValue = ((Number) objArr[0]).longValue();
            long jLongValue2 = ((Number) objArr[1]).longValue();
            SuperPassStatus p2 = (SuperPassStatus) objArr[2];
            long jLongValue3 = ((Number) objArr[3]).longValue();
            long jLongValue4 = ((Number) objArr[4]).longValue();
            long jLongValue5 = ((Number) objArr[5]).longValue();
            List p6 = (List) objArr[6];
            boolean zBooleanValue = ((Boolean) objArr[7]).booleanValue();
            long jLongValue6 = ((Number) objArr[8]).longValue();
            long jLongValue7 = ((Number) objArr[9]).longValue();
            long jLongValue8 = ((Number) objArr[10]).longValue();
            boolean zBooleanValue2 = ((Boolean) objArr[11]).booleanValue();
            boolean zBooleanValue3 = ((Boolean) objArr[12]).booleanValue();
            List p13 = (List) objArr[13];
            long jLongValue9 = ((Number) objArr[14]).longValue();
            double dDoubleValue = ((Number) objArr[15]).doubleValue();
            String p16 = (String) objArr[16];
            long jLongValue10 = ((Number) objArr[17]).longValue();
            List p18 = (List) objArr[18];
            Map p19 = (Map) objArr[19];
            long jLongValue11 = ((Number) objArr[20]).longValue();
            String p21 = (String) objArr[21];
            String p22 = (String) objArr[22];
            String p23 = (String) objArr[23];
            String p24 = (String) objArr[24];
            String p25 = (String) objArr[25];
            String p26 = (String) objArr[26];
            Gender p27 = (Gender) objArr[27];
            String p28 = (String) objArr[28];
            String p29 = (String) objArr[29];
            String p30 = (String) objArr[30];
            double dDoubleValue2 = ((Number) objArr[31]).doubleValue();
            double dDoubleValue3 = ((Number) objArr[32]).doubleValue();
            boolean zBooleanValue4 = ((Boolean) objArr[33]).booleanValue();
            double dDoubleValue4 = ((Number) objArr[34]).doubleValue();
            List p35 = (List) objArr[35];
            boolean zBooleanValue5 = ((Boolean) objArr[36]).booleanValue();
            long jLongValue12 = ((Number) objArr[37]).longValue();
            String p38 = (String) objArr[38];
            String str = (String) objArr[39];
            String p40 = (String) objArr[40];
            String p41 = (String) objArr[41];
            SuperPassSubType p42 = (SuperPassSubType) objArr[42];
            String p43 = (String) objArr[43];
            String p44 = (String) objArr[44];
            String p45 = (String) objArr[45];
            String p46 = (String) objArr[46];
            long jLongValue13 = ((Number) objArr[47]).longValue();
            long jLongValue14 = ((Number) objArr[48]).longValue();
            boolean zBooleanValue6 = ((Boolean) objArr[49]).booleanValue();
            boolean zBooleanValue7 = ((Boolean) objArr[50]).booleanValue();
            String p51 = (String) objArr[51];
            String p52 = (String) objArr[52];
            String str2 = (String) objArr[53];
            String str3 = (String) objArr[54];
            String str4 = (String) objArr[55];
            String str5 = (String) objArr[56];
            String str6 = (String) objArr[57];
            RefundInfoEntityModel refundInfoEntityModel = (RefundInfoEntityModel) objArr[58];
            PassTierType p59 = (PassTierType) objArr[59];
            Long l = (Long) objArr[60];
            Long l2 = (Long) objArr[61];
            Boolean bool = (Boolean) objArr[62];
            PremiumBusMeta premiumBusMeta = (PremiumBusMeta) objArr[63];
            Boolean bool2 = (Boolean) objArr[64];
            Intrinsics.i(p2, "p2");
            Intrinsics.i(p6, "p6");
            Intrinsics.i(p13, "p13");
            Intrinsics.i(p16, "p16");
            Intrinsics.i(p18, "p18");
            Intrinsics.i(p19, "p19");
            Intrinsics.i(p21, "p21");
            Intrinsics.i(p22, "p22");
            Intrinsics.i(p23, "p23");
            Intrinsics.i(p24, "p24");
            Intrinsics.i(p25, "p25");
            Intrinsics.i(p26, "p26");
            Intrinsics.i(p27, "p27");
            Intrinsics.i(p28, "p28");
            Intrinsics.i(p29, "p29");
            Intrinsics.i(p30, "p30");
            Intrinsics.i(p35, "p35");
            Intrinsics.i(p38, "p38");
            Intrinsics.i(p40, "p40");
            Intrinsics.i(p41, "p41");
            Intrinsics.i(p42, "p42");
            Intrinsics.i(p43, "p43");
            Intrinsics.i(p44, "p44");
            Intrinsics.i(p45, "p45");
            Intrinsics.i(p46, "p46");
            Intrinsics.i(p51, "p51");
            Intrinsics.i(p52, "p52");
            Intrinsics.i(p59, "p59");
            ((SuperPassTableMappers) this.receiver).getClass();
            return SuperPassTableMappers.b(jLongValue, jLongValue2, p2, jLongValue3, jLongValue4, jLongValue5, p6, zBooleanValue, jLongValue6, jLongValue7, jLongValue8, zBooleanValue2, zBooleanValue3, p13, jLongValue9, dDoubleValue, p16, jLongValue10, p18, p19, jLongValue11, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, dDoubleValue2, dDoubleValue3, zBooleanValue4, dDoubleValue4, p35, zBooleanValue5, jLongValue12, p38, str, p40, p41, p42, p43, p44, p45, p46, jLongValue13, jLongValue14, zBooleanValue6, zBooleanValue7, p51, p52, str2, str3, str4, str5, str6, refundInfoEntityModel, p59, l, l2, bool, premiumBusMeta, bool2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassDaoImpl$getAllRideBasedSuperPassesBookedWithUserName$2(SuperPassDaoImpl superPassDaoImpl, String str, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = superPassDaoImpl;
        this.$userName = str;
        this.$cityIdList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperPassDaoImpl$getAllRideBasedSuperPassesBookedWithUserName$2(this.this$0, this.$userName, this.$cityIdList, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((SuperPassDaoImpl$getAllRideBasedSuperPassesBookedWithUserName$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2082a.Z(this.$userName, this.$cityIdList, new AnonymousClass1(65, SuperPassTableMappers.f2109a, SuperPassTableMappers.class, "toEntity", "toEntity(JJLapp/chalo/features/productsync/constants/SuperPassStatus;JJJLjava/util/List;ZJJJZZLjava/util/List;JDLjava/lang/String;JLjava/util/List;Ljava/util/Map;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/userprofile/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDZDLjava/util/List;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/superpass/data/models/entities/SuperPassSubType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;Lapp/chalo/premiumbus/data/models/app/PassTierType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lapp/chalo/superpass/data/models/entities/PremiumBusMeta;Ljava/lang/Boolean;)Lapp/chalo/superpass/data/models/entities/RideBasedSuperPass;", 0)).b();
    }
}
