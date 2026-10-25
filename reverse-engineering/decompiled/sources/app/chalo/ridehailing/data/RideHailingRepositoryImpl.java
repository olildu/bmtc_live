package app.chalo.ridehailing.data;

import app.chalo.ridehailing.data.api.request.RideHailingBookingFeedbackRequestApiModel;
import app.chalo.ridehailing.data.api.response.RideHailingBookingFeedbackResponseApiModel;
import app.chalo.ridehailing.data.api.response.RideHailingBookingFeedbackResultApiModel;
import app.chalo.ridehailing.data.app.RideBookingUserFeedbackAppModel;
import app.chalo.ridehailing.data.app.RideHailingBookingFeedbackRequestAppModel;
import app.chalo.ridehailing.data.app.RideHailingBookingFeedbackResponseAppModel;
import app.chalo.ridehailing.data.app.RideHailingBookingFeedbackResultAppModel;
import app.chalo.ridehailing.data.dao.RideBookingUserFeedbackEntity;
import app.chalo.ridehailing.data.local.RideHailingLocalDataSource;
import app.chalo.ridehailing.data.remote.RideHailingRemoteDataSource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/data/RideHailingRepositoryImpl;", "Lapp/chalo/ridehailing/data/RideHailingRepository;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideHailingRepositoryImpl implements RideHailingRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideHailingRemoteDataSource f9097a;
    public final RideHailingLocalDataSource b;

    public RideHailingRepositoryImpl(RideHailingRemoteDataSource rideHailingRemoteDataSource, RideHailingLocalDataSource rideHailingLocalDataSource) {
        this.f9097a = rideHailingRemoteDataSource;
        this.b = rideHailingLocalDataSource;
    }

    @Override // app.chalo.ridehailing.data.RideHailingRepository
    public final Object a(Continuation continuation) {
        Object objA = this.b.a(continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.ridehailing.data.RideHailingRepository
    public final Object b(ArrayList arrayList, Continuation continuation) {
        Object objB = this.b.b(arrayList, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ridehailing.data.RideHailingRepository
    public final Serializable c(String str, ContinuationImpl continuationImpl) {
        RideHailingRepositoryImpl$getAllFeedbackEntries$1 rideHailingRepositoryImpl$getAllFeedbackEntries$1;
        if (continuationImpl instanceof RideHailingRepositoryImpl$getAllFeedbackEntries$1) {
            rideHailingRepositoryImpl$getAllFeedbackEntries$1 = (RideHailingRepositoryImpl$getAllFeedbackEntries$1) continuationImpl;
            int i = rideHailingRepositoryImpl$getAllFeedbackEntries$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideHailingRepositoryImpl$getAllFeedbackEntries$1.label = i - Integer.MIN_VALUE;
            } else {
                rideHailingRepositoryImpl$getAllFeedbackEntries$1 = new RideHailingRepositoryImpl$getAllFeedbackEntries$1(this, continuationImpl);
            }
        } else {
            rideHailingRepositoryImpl$getAllFeedbackEntries$1 = new RideHailingRepositoryImpl$getAllFeedbackEntries$1(this, continuationImpl);
        }
        Object objC = rideHailingRepositoryImpl$getAllFeedbackEntries$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideHailingRepositoryImpl$getAllFeedbackEntries$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            rideHailingRepositoryImpl$getAllFeedbackEntries$1.label = 1;
            objC = this.b.c(lowerCase, rideHailingRepositoryImpl$getAllFeedbackEntries$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        List list = (List) objC;
        if (list == null) {
            return null;
        }
        List<RideBookingUserFeedbackEntity> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (RideBookingUserFeedbackEntity rideBookingUserFeedbackEntity : list2) {
            Intrinsics.i(rideBookingUserFeedbackEntity, "<this>");
            arrayList.add(new RideBookingUserFeedbackAppModel(rideBookingUserFeedbackEntity.c, rideBookingUserFeedbackEntity.f9123a, rideBookingUserFeedbackEntity.b, rideBookingUserFeedbackEntity.d, rideBookingUserFeedbackEntity.e, rideBookingUserFeedbackEntity.f));
        }
        return arrayList;
    }

    @Override // app.chalo.ridehailing.data.RideHailingRepository
    public final Object d(RideBookingUserFeedbackAppModel rideBookingUserFeedbackAppModel, ContinuationImpl continuationImpl) {
        String str = rideBookingUserFeedbackAppModel.f9106a;
        String lowerCase = rideBookingUserFeedbackAppModel.b.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        Object objD = this.b.d(new RideBookingUserFeedbackEntity(rideBookingUserFeedbackAppModel.c, str, lowerCase, rideBookingUserFeedbackAppModel.d, rideBookingUserFeedbackAppModel.e, rideBookingUserFeedbackAppModel.f), continuationImpl);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ridehailing.data.RideHailingRepository
    public final Object e(List list, ContinuationImpl continuationImpl) {
        RideHailingRepositoryImpl$submitBookingFeedback$1 rideHailingRepositoryImpl$submitBookingFeedback$1;
        if (continuationImpl instanceof RideHailingRepositoryImpl$submitBookingFeedback$1) {
            rideHailingRepositoryImpl$submitBookingFeedback$1 = (RideHailingRepositoryImpl$submitBookingFeedback$1) continuationImpl;
            int i = rideHailingRepositoryImpl$submitBookingFeedback$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideHailingRepositoryImpl$submitBookingFeedback$1.label = i - Integer.MIN_VALUE;
            } else {
                rideHailingRepositoryImpl$submitBookingFeedback$1 = new RideHailingRepositoryImpl$submitBookingFeedback$1(this, continuationImpl);
            }
        } else {
            rideHailingRepositoryImpl$submitBookingFeedback$1 = new RideHailingRepositoryImpl$submitBookingFeedback$1(this, continuationImpl);
        }
        Object objA = rideHailingRepositoryImpl$submitBookingFeedback$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideHailingRepositoryImpl$submitBookingFeedback$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            List<RideHailingBookingFeedbackRequestAppModel> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            for (RideHailingBookingFeedbackRequestAppModel rideHailingBookingFeedbackRequestAppModel : list2) {
                rideHailingBookingFeedbackRequestAppModel.getClass();
                arrayList.add(new RideHailingBookingFeedbackRequestApiModel(rideHailingBookingFeedbackRequestAppModel.b, rideHailingBookingFeedbackRequestAppModel.f9109a, rideHailingBookingFeedbackRequestAppModel.c, rideHailingBookingFeedbackRequestAppModel.d, rideHailingBookingFeedbackRequestAppModel.e));
            }
            rideHailingRepositoryImpl$submitBookingFeedback$1.label = 1;
            objA = this.f9097a.a(arrayList, rideHailingRepositoryImpl$submitBookingFeedback$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        List<RideHailingBookingFeedbackResultApiModel> list3 = ((RideHailingBookingFeedbackResponseApiModel) objA).f9100a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list3, 10));
        for (RideHailingBookingFeedbackResultApiModel rideHailingBookingFeedbackResultApiModel : list3) {
            arrayList2.add(new RideHailingBookingFeedbackResultAppModel(rideHailingBookingFeedbackResultApiModel.f9102a, rideHailingBookingFeedbackResultApiModel.b));
        }
        return new RideHailingBookingFeedbackResponseAppModel(arrayList2);
    }
}
