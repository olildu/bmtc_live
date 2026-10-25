package app.chalo.ridefeedback.data;

import app.chalo.ridefeedback.data.api.RideFeedbackRequestApiModel;
import app.chalo.ridefeedback.data.api.RideFeedbackResponseApiModel;
import app.chalo.ridefeedback.data.app.RideFeedbackFillStatus;
import app.chalo.ridefeedback.data.app.RideFeedbackRequestAppModel;
import app.chalo.ridefeedback.data.app.RideFeedbackResponseAppModel;
import app.chalo.ridefeedback.data.app.RideFeedbackTriggerType;
import app.chalo.ridefeedback.data.dao.PostRideFeedbackDao;
import app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity;
import app.chalo.ridefeedback.data.dao.RideFeedbackOfflineQueueDao;
import app.chalo.ridefeedback.data.dao.RideFeedbackOfflineQueueEntity;
import app.chalo.ridefeedback.data.remote.RideFeedbackRemoteDataSource;
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
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/data/RideFeedbackRepositoryImpl;", "Lapp/chalo/ridefeedback/data/RideFeedbackRepository;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideFeedbackRepositoryImpl implements RideFeedbackRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideFeedbackRemoteDataSource f9061a;
    public final PostRideFeedbackDao b;
    public final RideFeedbackOfflineQueueDao c;

    public RideFeedbackRepositoryImpl(RideFeedbackRemoteDataSource rideFeedbackRemoteDataSource, PostRideFeedbackDao postRideFeedbackDao, RideFeedbackOfflineQueueDao rideFeedbackOfflineQueueDao) {
        this.f9061a = rideFeedbackRemoteDataSource;
        this.b = postRideFeedbackDao;
        this.c = rideFeedbackOfflineQueueDao;
    }

    @Override // app.chalo.ridefeedback.data.RideFeedbackRepository
    public final Object a(Continuation continuation) {
        Object objA = this.b.a(continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.ridefeedback.data.RideFeedbackRepository
    public final Object b(RideFeedbackOfflineQueueEntity rideFeedbackOfflineQueueEntity, Continuation continuation) {
        String lowerCase = rideFeedbackOfflineQueueEntity.c.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        String bookingId = rideFeedbackOfflineQueueEntity.f9072a;
        String userId = rideFeedbackOfflineQueueEntity.b;
        String productType = rideFeedbackOfflineQueueEntity.d;
        String productSubType = rideFeedbackOfflineQueueEntity.e;
        Integer num = rideFeedbackOfflineQueueEntity.f;
        String str = rideFeedbackOfflineQueueEntity.g;
        List feedbackSubtag = rideFeedbackOfflineQueueEntity.h;
        String str2 = rideFeedbackOfflineQueueEntity.i;
        boolean z = rideFeedbackOfflineQueueEntity.j;
        long j = rideFeedbackOfflineQueueEntity.k;
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(feedbackSubtag, "feedbackSubtag");
        Object objB = this.c.b(new RideFeedbackOfflineQueueEntity(bookingId, userId, lowerCase, productType, productSubType, num, str, feedbackSubtag, str2, z, j), continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    @Override // app.chalo.ridefeedback.data.RideFeedbackRepository
    public final Object c(String str, RideFeedbackFillStatus rideFeedbackFillStatus, String str2, String str3, ContinuationImpl continuationImpl) {
        String lowerCase = str3.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        Object objC = this.b.c(str, rideFeedbackFillStatus, str2, lowerCase, continuationImpl);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    @Override // app.chalo.ridefeedback.data.RideFeedbackRepository
    public final Object d(long j, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        String lowerCase = str3.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        Object objD = this.b.d(j, str, str2, lowerCase, continuationImpl);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    @Override // app.chalo.ridefeedback.data.RideFeedbackRepository
    public final Flow e(String str, String str2) {
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return this.b.e(str, lowerCase);
    }

    @Override // app.chalo.ridefeedback.data.RideFeedbackRepository
    public final Object f(String str, String str2, Continuation continuation) {
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return this.b.f(str, lowerCase, continuation);
    }

    @Override // app.chalo.ridefeedback.data.RideFeedbackRepository
    public final Object g(Continuation continuation) {
        Object objG = this.c.g(continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.ridefeedback.data.RideFeedbackRepository
    public final Object h(List list, String str, String str2, Continuation continuation) {
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        Object objH = this.b.h(list, str, lowerCase, continuation);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : Unit.f17538a;
    }

    @Override // app.chalo.ridefeedback.data.RideFeedbackRepository
    public final Object i(List list, String str, String str2, SuspendLambda suspendLambda) {
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        Object objI = this.c.i(list, str, lowerCase, suspendLambda);
        return objI == CoroutineSingletons.COROUTINE_SUSPENDED ? objI : Unit.f17538a;
    }

    @Override // app.chalo.ridefeedback.data.RideFeedbackRepository
    public final Object j(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        return this.c.j(str, str2, str3, continuationImpl);
    }

    @Override // app.chalo.ridefeedback.data.RideFeedbackRepository
    public final Object k(PostRideFeedbackEntity postRideFeedbackEntity, Continuation continuation) {
        String lowerCase = postRideFeedbackEntity.c.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        String bookingId = postRideFeedbackEntity.f9071a;
        String userId = postRideFeedbackEntity.b;
        String tripId = postRideFeedbackEntity.d;
        String routeId = postRideFeedbackEntity.e;
        String fromStopName = postRideFeedbackEntity.f;
        String toStopName = postRideFeedbackEntity.g;
        long j = postRideFeedbackEntity.h;
        long j2 = postRideFeedbackEntity.i;
        RideFeedbackTriggerType triggerType = postRideFeedbackEntity.j;
        String productType = postRideFeedbackEntity.k;
        String productSubType = postRideFeedbackEntity.l;
        RideFeedbackFillStatus fillStatus = postRideFeedbackEntity.m;
        Long l = postRideFeedbackEntity.n;
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(fromStopName, "fromStopName");
        Intrinsics.i(toStopName, "toStopName");
        Intrinsics.i(triggerType, "triggerType");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(fillStatus, "fillStatus");
        Object objG = this.b.g(new PostRideFeedbackEntity(bookingId, userId, lowerCase, tripId, routeId, fromStopName, toStopName, j, j2, triggerType, productType, productSubType, fillStatus, l), continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.ridefeedback.data.RideFeedbackRepository
    public final Object l(String str, String str2, String str3, Continuation continuation) {
        String lowerCase = str3.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return this.b.b(str, str2, lowerCase, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.ridefeedback.data.RideFeedbackRepository
    public final Serializable m(List list, ContinuationImpl continuationImpl) {
        RideFeedbackRepositoryImpl$submitFeedback$1 rideFeedbackRepositoryImpl$submitFeedback$1;
        if (continuationImpl instanceof RideFeedbackRepositoryImpl$submitFeedback$1) {
            rideFeedbackRepositoryImpl$submitFeedback$1 = (RideFeedbackRepositoryImpl$submitFeedback$1) continuationImpl;
            int i = rideFeedbackRepositoryImpl$submitFeedback$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideFeedbackRepositoryImpl$submitFeedback$1.label = i - Integer.MIN_VALUE;
            } else {
                rideFeedbackRepositoryImpl$submitFeedback$1 = new RideFeedbackRepositoryImpl$submitFeedback$1(this, continuationImpl);
            }
        } else {
            rideFeedbackRepositoryImpl$submitFeedback$1 = new RideFeedbackRepositoryImpl$submitFeedback$1(this, continuationImpl);
        }
        Object objA = rideFeedbackRepositoryImpl$submitFeedback$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideFeedbackRepositoryImpl$submitFeedback$1.label;
        int i3 = 1;
        if (i2 == 0) {
            ResultKt.b(objA);
            List<RideFeedbackRequestAppModel> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            for (RideFeedbackRequestAppModel rideFeedbackRequestAppModel : list2) {
                rideFeedbackRequestAppModel.getClass();
                arrayList.add(new RideFeedbackRequestApiModel(rideFeedbackRequestAppModel.f9069a, rideFeedbackRequestAppModel.d, rideFeedbackRequestAppModel.e, rideFeedbackRequestAppModel.f, rideFeedbackRequestAppModel.g, rideFeedbackRequestAppModel.h, rideFeedbackRequestAppModel.i, rideFeedbackRequestAppModel.j, rideFeedbackRequestAppModel.k));
                i3 = 1;
            }
            rideFeedbackRepositoryImpl$submitFeedback$1.label = i3;
            objA = this.f9061a.a(arrayList, rideFeedbackRepositoryImpl$submitFeedback$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        Iterable<RideFeedbackResponseApiModel> iterable = (Iterable) objA;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(iterable, 10));
        for (RideFeedbackResponseApiModel rideFeedbackResponseApiModel : iterable) {
            Intrinsics.i(rideFeedbackResponseApiModel, "<this>");
            arrayList2.add(new RideFeedbackResponseAppModel(rideFeedbackResponseApiModel.f9064a, rideFeedbackResponseApiModel.b));
        }
        return arrayList2;
    }
}
