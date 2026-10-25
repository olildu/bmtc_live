package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1;
import app.chalo.core.Magic_super_pass_tableQueries;
import app.chalo.core.Pending_super_pass_tableQueries;
import app.chalo.core.Ride_based_super_pass_ride_details_tableQueries;
import app.chalo.core.Ride_based_super_pass_tableQueries;
import app.chalo.core.Super_pass_application_tableQueries;
import app.chalo.core.database.mappers.SuperPassTableMappers;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.superpass.data.dao.SuperPassDao;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPassRideDetailsRoom;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/SuperPassDaoImpl;", "Lapp/chalo/superpass/data/dao/SuperPassDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassDaoImpl implements SuperPassDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ride_based_super_pass_tableQueries f2082a;
    public final Magic_super_pass_tableQueries b;
    public final Super_pass_application_tableQueries c;
    public final Ride_based_super_pass_ride_details_tableQueries d;
    public final Pending_super_pass_tableQueries e;
    public final CoroutineContextProvider f;

    public SuperPassDaoImpl(Ride_based_super_pass_tableQueries rideBasedQueries, Magic_super_pass_tableQueries magicPassQueries, Super_pass_application_tableQueries passApplicationQueries, Ride_based_super_pass_ride_details_tableQueries rideDetailsQueries, Pending_super_pass_tableQueries pendingPassQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(rideBasedQueries, "rideBasedQueries");
        Intrinsics.i(magicPassQueries, "magicPassQueries");
        Intrinsics.i(passApplicationQueries, "passApplicationQueries");
        Intrinsics.i(rideDetailsQueries, "rideDetailsQueries");
        Intrinsics.i(pendingPassQueries, "pendingPassQueries");
        this.f2082a = rideBasedQueries;
        this.b = magicPassQueries;
        this.c = passApplicationQueries;
        this.d = rideDetailsQueries;
        this.e = pendingPassQueries;
        this.f = coroutineContextProvider;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object A(List list, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$insertSuperPassApplicationsList$2(this, list, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object B(List list, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$insertRideBasedSuperPassList$2(this, list, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object C(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$deleteAllRideBasedSuperPasses$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final FlowQuery$mapToOneOrNull$$inlined$map$1 D(String passId) {
        Intrinsics.i(passId, "passId");
        return FlowQuery.b(FlowQuery.c(this.b.c0(passId, new SuperPassDaoImpl$getMagicSuperPass$1(56, SuperPassTableMappers.f2109a, SuperPassTableMappers.class, "toEntity", "toEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/superpass/data/models/entities/SuperPassSubType;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/features/productsync/constants/SuperPassStatus;JJJJZLjava/util/List;JJLjava/util/List;Ljava/util/Map;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/userprofile/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDDZDLjava/util/List;ZLjava/lang/String;Ljava/lang/String;JJZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;Lapp/chalo/premiumbus/data/models/app/PassTierType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lapp/chalo/superpass/data/models/entities/PremiumBusMeta;Ljava/lang/Boolean;)Lapp/chalo/superpass/data/models/entities/MagicSuperPass;", 0))), this.f.b());
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object E(SuperPassApplication superPassApplication, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$insertSuperPassApplication$2(this, superPassApplication, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object F(List list, boolean z, String str, long j, long j2, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$updateRideBasedSuperPassRideDetails$2(this, list, z, j, j2, str, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final FlowQuery$mapToList$$inlined$map$1 G(List cityIdList) {
        Intrinsics.i(cityIdList, "cityIdList");
        SuperPassDaoImpl$getAllPendingSuperPassAsFlow$1 superPassDaoImpl$getAllPendingSuperPassAsFlow$1 = new SuperPassDaoImpl$getAllPendingSuperPassAsFlow$1(38, SuperPassTableMappers.f2109a, SuperPassTableMappers.class, "toEntity", "toEntity(Lapp/chalo/features/productsync/constants/SuperPassStatus;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/superpass/data/models/entities/SuperPassSubType;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;JLjava/util/List;Ljava/util/Map;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/userprofile/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDZDLjava/util/List;ZLjava/lang/String;Ljava/lang/String;JJJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;)Lapp/chalo/superpass/data/models/pendingSuperPass/PendingSuperPass;", 0);
        return FlowQuery.a(FlowQuery.c(this.e.W(cityIdList, superPassDaoImpl$getAllPendingSuperPassAsFlow$1)), this.f.b());
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object H(RideBasedSuperPassRideDetailsRoom rideBasedSuperPassRideDetailsRoom, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$insertRideBasedSuperPassRideDetails$2(this, rideBasedSuperPassRideDetailsRoom, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final FlowQuery$mapToOneOrNull$$inlined$map$1 I(String passId) {
        Intrinsics.i(passId, "passId");
        return FlowQuery.b(FlowQuery.c(this.f2082a.a0(passId, new SuperPassDaoImpl$getRideBasedSuperPass$1(65, SuperPassTableMappers.f2109a, SuperPassTableMappers.class, "toEntity", "toEntity(JJLapp/chalo/features/productsync/constants/SuperPassStatus;JJJLjava/util/List;ZJJJZZLjava/util/List;JDLjava/lang/String;JLjava/util/List;Ljava/util/Map;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/userprofile/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDZDLjava/util/List;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/superpass/data/models/entities/SuperPassSubType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;Lapp/chalo/premiumbus/data/models/app/PassTierType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lapp/chalo/superpass/data/models/entities/PremiumBusMeta;Ljava/lang/Boolean;)Lapp/chalo/superpass/data/models/entities/RideBasedSuperPass;", 0))), this.f.b());
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object J(String str, String str2, String str3, String str4, int i, List list, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$findRideBasedSuperPassInBookingHistoryFromSelectedConfiguration$2(this, str, str2, str3, str4, i, list, null), continuation);
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object a(String str, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$deleteAllPendingSuperPasses$2(this, str, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object b(String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$doesRideBasedSuperPassRideDetailsExist$2(this, str, null), continuation);
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object c(String str, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$deleteAllMagicSuperPassesForCity$2(this, str, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object d(List list, long j, String str, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$updateRideBasedSuperPass$2(this, list, j, str, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final FlowQuery$mapToList$$inlined$map$1 e(List cityIdList) {
        Intrinsics.i(cityIdList, "cityIdList");
        SuperPassDaoImpl$getAllRideBasedSuperPassesAsFlow$1 superPassDaoImpl$getAllRideBasedSuperPassesAsFlow$1 = new SuperPassDaoImpl$getAllRideBasedSuperPassesAsFlow$1(65, SuperPassTableMappers.f2109a, SuperPassTableMappers.class, "toEntity", "toEntity(JJLapp/chalo/features/productsync/constants/SuperPassStatus;JJJLjava/util/List;ZJJJZZLjava/util/List;JDLjava/lang/String;JLjava/util/List;Ljava/util/Map;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/userprofile/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDZDLjava/util/List;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/superpass/data/models/entities/SuperPassSubType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;Lapp/chalo/premiumbus/data/models/app/PassTierType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lapp/chalo/superpass/data/models/entities/PremiumBusMeta;Ljava/lang/Boolean;)Lapp/chalo/superpass/data/models/entities/RideBasedSuperPass;", 0);
        return FlowQuery.a(FlowQuery.c(this.f2082a.X(cityIdList, superPassDaoImpl$getAllRideBasedSuperPassesAsFlow$1)), this.f.b());
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object f(String str, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$deleteAllRideBasedSuperPassesForCity$2(this, str, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final FlowQuery$mapToList$$inlined$map$1 g(String str) {
        return FlowQuery.a(FlowQuery.c(this.b.Y(str, new SuperPassDaoImpl$getAllMagicSuperPasses$1(56, SuperPassTableMappers.f2109a, SuperPassTableMappers.class, "toEntity", "toEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/superpass/data/models/entities/SuperPassSubType;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/features/productsync/constants/SuperPassStatus;JJJJZLjava/util/List;JJLjava/util/List;Ljava/util/Map;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/userprofile/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDDZDLjava/util/List;ZLjava/lang/String;Ljava/lang/String;JJZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;Lapp/chalo/premiumbus/data/models/app/PassTierType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lapp/chalo/superpass/data/models/entities/PremiumBusMeta;Ljava/lang/Boolean;)Lapp/chalo/superpass/data/models/entities/MagicSuperPass;", 0))), this.f.b());
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object h(RideBasedSuperPass rideBasedSuperPass, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$insertRideBasedSuperPass$2(this, rideBasedSuperPass, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object i(String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$getRideBasedSuperPassRideDetails$2(this, str, null), continuation);
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object j(String str, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$deleteAllSuperPassApplicationsForCity$2(this, str, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object k(long j, String str, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$updateMagicSuperPassLastActivationTimeStamp$2(this, j, str, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object l(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$deleteAllSuperPassApplications$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object m(List list, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$insertMagicSuperPassList$2(this, list, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object n(List list, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$insertPendingSuperPassList$2(this, list, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object o(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$deleteAllMagicSuperPasses$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object p(String str, String str2, String str3, String str4, int i, List list, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$findMagicSuperPassInBookingHistoryFromSelectedConfiguration$2(this, str, str2, str3, str4, i, list, null), continuation);
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object q(String str, List list, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$getAllMagicSuperPassesBookedWithUserName$2(this, str, list, null), continuation);
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object r(List list, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$getAllRideBasedSuperPassesBookedWithDistinctUserNames$2(this, list, null), continuation);
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object s(String str, List list, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$getAllRideBasedSuperPassesBookedWithUserName$2(this, str, list, null), continuation);
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final FlowQuery$mapToList$$inlined$map$1 t(List cityIdList) {
        Intrinsics.i(cityIdList, "cityIdList");
        SuperPassDaoImpl$getAllSuperPassApplicationsAsFlow$1 superPassDaoImpl$getAllSuperPassApplicationsAsFlow$1 = new SuperPassDaoImpl$getAllSuperPassApplicationsAsFlow$1(26, SuperPassTableMappers.f2109a, SuperPassTableMappers.class, "toEntity", "toEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JJLapp/chalo/features/productsync/constants/SuperPassApplicationStatus;Ljava/util/Map;Lapp/chalo/superpass/data/models/entities/PassApplicationActionRequired;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/userprofile/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;)Lapp/chalo/superpass/data/models/entities/SuperPassApplication;", 0);
        return FlowQuery.a(FlowQuery.c(this.c.W(cityIdList, superPassDaoImpl$getAllSuperPassApplicationsAsFlow$1)), this.f.b());
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final FlowQuery$mapToList$$inlined$map$1 u(List cityIdList) {
        Intrinsics.i(cityIdList, "cityIdList");
        SuperPassDaoImpl$getAllMagicSuperPassesAsFlow$1 superPassDaoImpl$getAllMagicSuperPassesAsFlow$1 = new SuperPassDaoImpl$getAllMagicSuperPassesAsFlow$1(56, SuperPassTableMappers.f2109a, SuperPassTableMappers.class, "toEntity", "toEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/superpass/data/models/entities/SuperPassSubType;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/features/productsync/constants/SuperPassStatus;JJJJZLjava/util/List;JJLjava/util/List;Ljava/util/Map;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/userprofile/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDDZDLjava/util/List;ZLjava/lang/String;Ljava/lang/String;JJZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;Lapp/chalo/premiumbus/data/models/app/PassTierType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lapp/chalo/superpass/data/models/entities/PremiumBusMeta;Ljava/lang/Boolean;)Lapp/chalo/superpass/data/models/entities/MagicSuperPass;", 0);
        return FlowQuery.a(FlowQuery.c(this.b.Z(cityIdList, superPassDaoImpl$getAllMagicSuperPassesAsFlow$1)), this.f.b());
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object v(MagicSuperPass magicSuperPass, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$insertMagicSuperPass$2(this, magicSuperPass, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final FlowQuery$mapToOneOrNull$$inlined$map$1 w(String str) {
        return FlowQuery.b(FlowQuery.c(this.e.X(str, new SuperPassDaoImpl$getPendingSuperPass$1(38, SuperPassTableMappers.f2109a, SuperPassTableMappers.class, "toEntity", "toEntity(Lapp/chalo/features/productsync/constants/SuperPassStatus;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/superpass/data/models/entities/SuperPassSubType;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;JLjava/util/List;Ljava/util/Map;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/userprofile/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDZDLjava/util/List;ZLjava/lang/String;Ljava/lang/String;JJJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/productbooking/common/data/models/entity/RefundInfoEntityModel;)Lapp/chalo/superpass/data/models/pendingSuperPass/PendingSuperPass;", 0))), this.f.b());
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object x(List list, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$getAllMagicSuperPassesBookedWithDistinctUserNames$2(this, list, null), continuation);
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object y(String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$getMagicSuperPassCount$2(this, str, null), continuation);
    }

    @Override // app.chalo.superpass.data.dao.SuperPassDao
    public final Object z(String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.f, new SuperPassDaoImpl$getRideBasedSuperPassCount$2(this, str, null), continuation);
    }
}
