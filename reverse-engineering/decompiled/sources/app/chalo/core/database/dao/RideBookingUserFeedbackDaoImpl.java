package app.chalo.core.database.dao;

import app.chalo.core.Ride_booking_user_feedback_tableQueries;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.ridehailing.data.dao.RideBookingUserFeedbackDao;
import app.chalo.ridehailing.data.dao.RideBookingUserFeedbackEntity;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/RideBookingUserFeedbackDaoImpl;", "Lapp/chalo/ridehailing/data/dao/RideBookingUserFeedbackDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideBookingUserFeedbackDaoImpl implements RideBookingUserFeedbackDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ride_booking_user_feedback_tableQueries f2077a;
    public final CoroutineContextProvider b;

    public RideBookingUserFeedbackDaoImpl(Ride_booking_user_feedback_tableQueries rideBookingUserFeedbackTableQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(rideBookingUserFeedbackTableQueries, "rideBookingUserFeedbackTableQueries");
        this.f2077a = rideBookingUserFeedbackTableQueries;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.ridehailing.data.dao.RideBookingUserFeedbackDao
    public final Object a(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RideBookingUserFeedbackDaoImpl$deleteAllFeedbackEntries$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.ridehailing.data.dao.RideBookingUserFeedbackDao
    public final Object b(ArrayList arrayList, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RideBookingUserFeedbackDaoImpl$deleteUserBookingFeedbackEntries$2(this, arrayList, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.ridehailing.data.dao.RideBookingUserFeedbackDao
    public final Object c(String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new RideBookingUserFeedbackDaoImpl$getAllFeedbackEntries$2(this, str, null), continuation);
    }

    @Override // app.chalo.ridehailing.data.dao.RideBookingUserFeedbackDao
    public final Object d(RideBookingUserFeedbackEntity rideBookingUserFeedbackEntity, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new RideBookingUserFeedbackDaoImpl$insertFeedback$2(this, rideBookingUserFeedbackEntity, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }
}
