package app.chalo.superpass.data.models.entities;

import app.chalo.contract.BasicInfoContract;
import app.chalo.superpass.utils.ChaloConfigUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/superpass/data/models/entities/RideBasedSuperPassRideDetails;", "Lapp/chalo/superpass/data/models/entities/SuperPassRideDetails;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class RideBasedSuperPassRideDetails extends SuperPassRideDetails {
    public static final Companion g = new Companion();
    public List c;
    public final boolean d;
    public final long e;
    public final boolean f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/entities/RideBasedSuperPassRideDetails$Companion;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(BasicInfoContract basicInfoContract, ContinuationImpl continuationImpl) {
            RideBasedSuperPassRideDetails$Companion$getRideBasedSuperPassRideDetailsForFreshPurchase$1 rideBasedSuperPassRideDetails$Companion$getRideBasedSuperPassRideDetailsForFreshPurchase$1;
            if (continuationImpl instanceof RideBasedSuperPassRideDetails$Companion$getRideBasedSuperPassRideDetailsForFreshPurchase$1) {
                rideBasedSuperPassRideDetails$Companion$getRideBasedSuperPassRideDetailsForFreshPurchase$1 = (RideBasedSuperPassRideDetails$Companion$getRideBasedSuperPassRideDetailsForFreshPurchase$1) continuationImpl;
                int i = rideBasedSuperPassRideDetails$Companion$getRideBasedSuperPassRideDetailsForFreshPurchase$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    rideBasedSuperPassRideDetails$Companion$getRideBasedSuperPassRideDetailsForFreshPurchase$1.label = i - Integer.MIN_VALUE;
                } else {
                    rideBasedSuperPassRideDetails$Companion$getRideBasedSuperPassRideDetailsForFreshPurchase$1 = new RideBasedSuperPassRideDetails$Companion$getRideBasedSuperPassRideDetailsForFreshPurchase$1(this, continuationImpl);
                }
            } else {
                rideBasedSuperPassRideDetails$Companion$getRideBasedSuperPassRideDetailsForFreshPurchase$1 = new RideBasedSuperPassRideDetails$Companion$getRideBasedSuperPassRideDetailsForFreshPurchase$1(this, continuationImpl);
            }
            Object objC = rideBasedSuperPassRideDetails$Companion$getRideBasedSuperPassRideDetailsForFreshPurchase$1.result;
            Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = rideBasedSuperPassRideDetails$Companion$getRideBasedSuperPassRideDetailsForFreshPurchase$1.label;
            if (i2 == 0) {
                ResultKt.b(objC);
                rideBasedSuperPassRideDetails$Companion$getRideBasedSuperPassRideDetailsForFreshPurchase$1.label = 1;
                objC = basicInfoContract.c(rideBasedSuperPassRideDetails$Companion$getRideBasedSuperPassRideDetailsForFreshPurchase$1);
                if (objC == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC);
            }
            return new RideBasedSuperPassRideDetails(new ArrayList(), true, ((Number) objC).longValue(), true, -1L, -1L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideBasedSuperPassRideDetails(List previousRideTimeStamps, boolean z, long j, boolean z2, long j2, long j3) {
        super(j2, j3);
        Intrinsics.i(previousRideTimeStamps, "previousRideTimeStamps");
        this.c = previousRideTimeStamps;
        this.d = z;
        this.e = j;
        this.f = z2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, String str, ContinuationImpl continuationImpl) {
        RideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1 rideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1;
        long j2;
        long j3;
        if (continuationImpl instanceof RideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1) {
            rideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1 = (RideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1) continuationImpl;
            int i = rideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1.label = i - Integer.MIN_VALUE;
            } else {
                rideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1 = new RideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1(this, continuationImpl);
            }
        } else {
            rideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1 = new RideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1(this, continuationImpl);
        }
        Object objC = rideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            ChaloConfigUtils chaloConfigUtils = ChaloConfigUtils.f9611a;
            rideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1.J$0 = j;
            long j4 = this.e;
            rideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1.J$1 = j4;
            rideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1.label = 1;
            objC = chaloConfigUtils.c(str, rideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            j2 = j;
            j3 = j4;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = rideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1.J$1;
            j2 = rideBasedSuperPassRideDetails$isOldestHistoryCallTimeStampExpired$1.J$0;
            ResultKt.b(objC);
        }
        return Boolean.valueOf(((Number) objC).longValue() + j3 < j2);
    }
}
