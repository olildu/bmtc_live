package app.chalo.ridehailing.data;

import app.chalo.ridehailing.data.app.RideBookingUserFeedbackAppModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/data/RideHailingRepository;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RideHailingRepository {
    Object a(Continuation continuation);

    Object b(ArrayList arrayList, Continuation continuation);

    Serializable c(String str, ContinuationImpl continuationImpl);

    Object d(RideBookingUserFeedbackAppModel rideBookingUserFeedbackAppModel, ContinuationImpl continuationImpl);

    Object e(List list, ContinuationImpl continuationImpl);
}
