package app.chalo.superpass.data.repository;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.features.productsync.model.app.RideType;
import app.chalo.models.products.SuperPassRideBookingAppModel;
import app.chalo.superpass.data.dao.SuperPassBookingsDao;
import app.chalo.superpass.data.models.entities.SuperPassBookingEntity;
import app.chalo.superpass.data.parser.SuperPassJsonParser;
import app.chalo.usecase.SuperPassHistoryCallHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/repository/SuperPassHistoryCallHelperImpl;", "Lapp/chalo/usecase/SuperPassHistoryCallHelper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassHistoryCallHelperImpl implements SuperPassHistoryCallHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassRepository f9593a;

    public SuperPassHistoryCallHelperImpl(SuperPassRepository superPassRepository) {
        this.f9593a = superPassRepository;
    }

    @Override // app.chalo.usecase.SuperPassHistoryCallHelper
    public final Object a(JsonArray jsonArray, Continuation continuation) throws Throwable {
        Object objR = this.f9593a.r(jsonArray, (ContinuationImpl) continuation);
        return objR == CoroutineSingletons.COROUTINE_SUSPENDED ? objR : Unit.f17538a;
    }

    @Override // app.chalo.usecase.SuperPassHistoryCallHelper
    public final Object b(JsonArray jsonArray, Continuation continuation) {
        Object objS = this.f9593a.s(jsonArray, (ContinuationImpl) continuation);
        return objS == CoroutineSingletons.COROUTINE_SUSPENDED ? objS : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // app.chalo.usecase.SuperPassHistoryCallHelper
    public final Object c(JsonArray jsonArray, Continuation continuation) {
        ArrayList arrayList;
        Object objA;
        SuperPassBookingsDao superPassBookingsDao = this.f9593a.c;
        List list = jsonArray.f18186a;
        int size = list.size();
        Unit unit = Unit.f17538a;
        if (size == 0) {
            objA = superPassBookingsDao.b((ContinuationImpl) continuation);
            if (objA != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objA = unit;
            }
        } else {
            SuperPassJsonParser superPassJsonParser = SuperPassJsonParser.f9587a;
            int i = 0;
            try {
                arrayList = new ArrayList();
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    JsonObject jsonObjectF = JsonElementExtensionsKt.f(jsonArray, i2);
                    RideType.Companion companion = RideType.INSTANCE;
                    String strS = JsonElementExtensionsKt.s(jsonObjectF, "rideType", "");
                    companion.getClass();
                    if (RideType.Companion.a(strS) == RideType.SUPER_PASS_RIDE) {
                        arrayList.add(SuperPassJsonParser.l(jsonObjectF));
                    }
                }
            } catch (Exception e) {
                ((CrashlyticsLogger) SuperPassJsonParser.b.getValue()).i(e);
                arrayList = null;
            }
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
                int size3 = arrayList.size();
                while (i < size3) {
                    Object obj = arrayList.get(i);
                    i++;
                    SuperPassRideBookingAppModel superPassRideBookingAppModel = (SuperPassRideBookingAppModel) obj;
                    Intrinsics.i(superPassRideBookingAppModel, "<this>");
                    String str = superPassRideBookingAppModel.f5681a;
                    String rideType = superPassRideBookingAppModel.b.getRideType();
                    long j = superPassRideBookingAppModel.c;
                    long j2 = superPassRideBookingAppModel.d;
                    String str2 = superPassRideBookingAppModel.e;
                    String str3 = superPassRideBookingAppModel.f;
                    String str4 = superPassRideBookingAppModel.g;
                    String str5 = superPassRideBookingAppModel.h;
                    String str6 = superPassRideBookingAppModel.i;
                    List list2 = superPassRideBookingAppModel.j;
                    arrayList2.add(new SuperPassBookingEntity(j, j2, superPassRideBookingAppModel.l, superPassRideBookingAppModel.u, superPassRideBookingAppModel.t, str, rideType, str2, str3, str4, str5, str6, superPassRideBookingAppModel.k, superPassRideBookingAppModel.m, superPassRideBookingAppModel.n, superPassRideBookingAppModel.o, superPassRideBookingAppModel.p, superPassRideBookingAppModel.q, superPassRideBookingAppModel.r, superPassRideBookingAppModel.s, list2));
                }
                objA = superPassBookingsDao.a(arrayList2, continuation);
                if (objA != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objA = unit;
                }
            } else {
                objA = unit;
            }
        }
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : unit;
    }

    @Override // app.chalo.usecase.SuperPassHistoryCallHelper
    public final Object d(JsonArray jsonArray, Continuation continuation) {
        Object objT = this.f9593a.t(jsonArray, (ContinuationImpl) continuation);
        return objT == CoroutineSingletons.COROUTINE_SUSPENDED ? objT : Unit.f17538a;
    }
}
