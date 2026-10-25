package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.SuperPassTableMappers;
import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.PremiumBusMeta;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/superpass/data/models/entities/MagicSuperPass;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.SuperPassDaoImpl$findMagicSuperPassInBookingHistoryFromSelectedConfiguration$2", f = "SuperPassDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class SuperPassDaoImpl$findMagicSuperPassInBookingHistoryFromSelectedConfiguration$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends MagicSuperPass>>, Object> {
    final /* synthetic */ String $categoryId;
    final /* synthetic */ List<String> $cityIdList;
    final /* synthetic */ String $configId;
    final /* synthetic */ String $dateOfBirth;
    final /* synthetic */ int $fareMappingId;
    final /* synthetic */ String $userName;
    int label;
    final /* synthetic */ SuperPassDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.SuperPassDaoImpl$findMagicSuperPassInBookingHistoryFromSelectedConfiguration$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements FunctionN<MagicSuperPass> {
        @Override // kotlin.jvm.functions.FunctionN
        public final Object invoke(Object[] objArr) {
            if (objArr.length != 56) {
                throw new IllegalArgumentException("Expected 56 arguments");
            }
            String p0 = (String) objArr[0];
            String str = (String) objArr[1];
            String p2 = (String) objArr[2];
            String p3 = (String) objArr[3];
            SuperPassSubType p4 = (SuperPassSubType) objArr[4];
            String p5 = (String) objArr[5];
            String p6 = (String) objArr[6];
            SuperPassStatus p7 = (SuperPassStatus) objArr[7];
            long jLongValue = ((Number) objArr[8]).longValue();
            long jLongValue2 = ((Number) objArr[9]).longValue();
            long jLongValue3 = ((Number) objArr[10]).longValue();
            long jLongValue4 = ((Number) objArr[11]).longValue();
            boolean zBooleanValue = ((Boolean) objArr[12]).booleanValue();
            List p13 = (List) objArr[13];
            long jLongValue5 = ((Number) objArr[14]).longValue();
            long jLongValue6 = ((Number) objArr[15]).longValue();
            List p16 = (List) objArr[16];
            Map p17 = (Map) objArr[17];
            long jLongValue7 = ((Number) objArr[18]).longValue();
            String p19 = (String) objArr[19];
            String p20 = (String) objArr[20];
            String p21 = (String) objArr[21];
            String p22 = (String) objArr[22];
            String p23 = (String) objArr[23];
            String p24 = (String) objArr[24];
            Gender p25 = (Gender) objArr[25];
            String p26 = (String) objArr[26];
            String p27 = (String) objArr[27];
            String p28 = (String) objArr[28];
            long jLongValue8 = ((Number) objArr[29]).longValue();
            double dDoubleValue = ((Number) objArr[30]).doubleValue();
            double dDoubleValue2 = ((Number) objArr[31]).doubleValue();
            boolean zBooleanValue2 = ((Boolean) objArr[32]).booleanValue();
            double dDoubleValue3 = ((Number) objArr[33]).doubleValue();
            List p34 = (List) objArr[34];
            boolean zBooleanValue3 = ((Boolean) objArr[35]).booleanValue();
            String p36 = (String) objArr[36];
            String p37 = (String) objArr[37];
            long jLongValue9 = ((Number) objArr[38]).longValue();
            long jLongValue10 = ((Number) objArr[39]).longValue();
            boolean zBooleanValue4 = ((Boolean) objArr[40]).booleanValue();
            boolean zBooleanValue5 = ((Boolean) objArr[41]).booleanValue();
            String p42 = (String) objArr[42];
            String p43 = (String) objArr[43];
            String str2 = (String) objArr[44];
            String str3 = (String) objArr[45];
            String str4 = (String) objArr[46];
            String str5 = (String) objArr[47];
            String str6 = (String) objArr[48];
            RefundInfoEntityModel refundInfoEntityModel = (RefundInfoEntityModel) objArr[49];
            PassTierType p50 = (PassTierType) objArr[50];
            Long l = (Long) objArr[51];
            Long l2 = (Long) objArr[52];
            Boolean bool = (Boolean) objArr[53];
            PremiumBusMeta premiumBusMeta = (PremiumBusMeta) objArr[54];
            Boolean bool2 = (Boolean) objArr[55];
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p2, "p2");
            Intrinsics.i(p3, "p3");
            Intrinsics.i(p4, "p4");
            Intrinsics.i(p5, "p5");
            Intrinsics.i(p6, "p6");
            Intrinsics.i(p7, "p7");
            Intrinsics.i(p13, "p13");
            Intrinsics.i(p16, "p16");
            Intrinsics.i(p17, "p17");
            Intrinsics.i(p19, "p19");
            Intrinsics.i(p20, "p20");
            Intrinsics.i(p21, "p21");
            Intrinsics.i(p22, "p22");
            Intrinsics.i(p23, "p23");
            Intrinsics.i(p24, "p24");
            Intrinsics.i(p25, "p25");
            Intrinsics.i(p26, "p26");
            Intrinsics.i(p27, "p27");
            Intrinsics.i(p28, "p28");
            Intrinsics.i(p34, "p34");
            Intrinsics.i(p36, "p36");
            Intrinsics.i(p37, "p37");
            Intrinsics.i(p42, "p42");
            Intrinsics.i(p43, "p43");
            Intrinsics.i(p50, "p50");
            ((SuperPassTableMappers) this.receiver).getClass();
            return SuperPassTableMappers.a(p0, str, p2, p3, p4, p5, p6, p7, jLongValue, jLongValue2, jLongValue3, jLongValue4, zBooleanValue, p13, jLongValue5, jLongValue6, p16, p17, jLongValue7, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, jLongValue8, dDoubleValue, dDoubleValue2, zBooleanValue2, dDoubleValue3, p34, zBooleanValue3, p36, p37, jLongValue9, jLongValue10, zBooleanValue4, zBooleanValue5, p42, p43, str2, str3, str4, str5, str6, refundInfoEntityModel, p50, l, l2, bool, premiumBusMeta, bool2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassDaoImpl$findMagicSuperPassInBookingHistoryFromSelectedConfiguration$2(SuperPassDaoImpl superPassDaoImpl, String str, String str2, String str3, String str4, int i, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = superPassDaoImpl;
        this.$userName = str;
        this.$dateOfBirth = str2;
        this.$configId = str3;
        this.$categoryId = str4;
        this.$fareMappingId = i;
        this.$cityIdList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperPassDaoImpl$findMagicSuperPassInBookingHistoryFromSelectedConfiguration$2(this.this$0, this.$userName, this.$dateOfBirth, this.$configId, this.$categoryId, this.$fareMappingId, this.$cityIdList, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((SuperPassDaoImpl$findMagicSuperPassInBookingHistoryFromSelectedConfiguration$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.b.X(this.$userName, this.$dateOfBirth, this.$configId, this.$categoryId, this.$fareMappingId, this.$cityIdList, new AnonymousClass1(56, SuperPassTableMappers.f2109a, SuperPassTableMappers.class, "toEntity", "toEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/superpass/data/models/entities/SuperPassSubType;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/features/productsync/constants/SuperPassStatus;JJJJZLjava/util/List;JJLjava/util/List;Ljava/util/Map;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/userprofile/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDDZDLjava/util/List;ZLjava/lang/String;Ljava/lang/String;JJZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;Lapp/chalo/premiumbus/data/models/app/PassTierType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lapp/chalo/superpass/data/models/entities/PremiumBusMeta;Ljava/lang/Boolean;)Lapp/chalo/superpass/data/models/entities/MagicSuperPass;", 0)).b();
    }
}
