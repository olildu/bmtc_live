package app.chalo.ridehailing.data.local;

import app.chalo.ridehailing.data.dao.RideBookingUserFeedbackDao;
import app.chalo.ridehailing.data.dao.RideBookingUserFeedbackEntity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/data/local/RideHailingLocalDataSourceImpl;", "Lapp/chalo/ridehailing/data/local/RideHailingLocalDataSource;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideHailingLocalDataSourceImpl implements RideHailingLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideBookingUserFeedbackDao f9124a;

    public RideHailingLocalDataSourceImpl(RideBookingUserFeedbackDao rideBookingUserFeedbackDao) {
        this.f9124a = rideBookingUserFeedbackDao;
    }

    @Override // app.chalo.ridehailing.data.local.RideHailingLocalDataSource
    public final Object a(Continuation continuation) {
        Object objA = this.f9124a.a(continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.ridehailing.data.local.RideHailingLocalDataSource
    public final Object b(ArrayList arrayList, Continuation continuation) {
        Object objB = this.f9124a.b(arrayList, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    @Override // app.chalo.ridehailing.data.local.RideHailingLocalDataSource
    public final Object c(String str, Continuation continuation) {
        return this.f9124a.c(str, continuation);
    }

    @Override // app.chalo.ridehailing.data.local.RideHailingLocalDataSource
    public final Object d(RideBookingUserFeedbackEntity rideBookingUserFeedbackEntity, ContinuationImpl continuationImpl) {
        Object objD = this.f9124a.d(rideBookingUserFeedbackEntity, continuationImpl);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }
}
