package app.chalo.superpass.data.models.entities;

import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.superpass.utils.ChaloConfigUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/entities/RideBasedSuperPassValidationProperties;", "Lapp/chalo/superpass/data/models/entities/SuperPassValidationProperties;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideBasedSuperPassValidationProperties extends SuperPassValidationProperties {
    public final int l;
    public final int m;
    public final int n;
    public final RideBasedSuperPassRideDetails o;
    public final boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideBasedSuperPassValidationProperties(SuperPassStatus status, long j, long j2, long j3, List serviceType, boolean z, int i, int i2, int i3, RideBasedSuperPassRideDetails superPassRideDetails, PassTierType passTierType, Integer num, Integer num2, boolean z2) {
        super(status, j, j2, j3, serviceType, z, superPassRideDetails, passTierType, num, num2, z2);
        Intrinsics.i(status, "status");
        Intrinsics.i(serviceType, "serviceType");
        Intrinsics.i(superPassRideDetails, "superPassRideDetails");
        Intrinsics.i(passTierType, "passTierType");
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.o = superPassRideDetails;
        this.p = z2;
    }

    @Override // app.chalo.superpass.data.models.entities.SuperPassValidationProperties
    /* JADX INFO: renamed from: b */
    public final SuperPassRideDetails getG() {
        return this.o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        RideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1 rideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1;
        long j;
        if (continuationImpl instanceof RideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1) {
            rideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1 = (RideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1) continuationImpl;
            int i = rideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1.label = i - Integer.MIN_VALUE;
            } else {
                rideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1 = new RideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1(this, continuationImpl);
            }
        } else {
            rideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1 = new RideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1(this, continuationImpl);
        }
        Object objC = rideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            long j2 = this.o.e;
            ChaloConfigUtils chaloConfigUtils = ChaloConfigUtils.f9611a;
            rideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1.J$0 = j2;
            rideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1.label = 1;
            objC = chaloConfigUtils.c(str, rideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = j2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = rideBasedSuperPassValidationProperties$getTimeAtWhichRideWillGetReclaimed$1.J$0;
            ResultKt.b(objC);
        }
        return new Long(((Number) objC).longValue() + j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(long j, String str, ContinuationImpl continuationImpl) {
        RideBasedSuperPassValidationProperties$shouldSendIntoAppReclaimFlow$1 rideBasedSuperPassValidationProperties$shouldSendIntoAppReclaimFlow$1;
        if (continuationImpl instanceof RideBasedSuperPassValidationProperties$shouldSendIntoAppReclaimFlow$1) {
            rideBasedSuperPassValidationProperties$shouldSendIntoAppReclaimFlow$1 = (RideBasedSuperPassValidationProperties$shouldSendIntoAppReclaimFlow$1) continuationImpl;
            int i = rideBasedSuperPassValidationProperties$shouldSendIntoAppReclaimFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideBasedSuperPassValidationProperties$shouldSendIntoAppReclaimFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                rideBasedSuperPassValidationProperties$shouldSendIntoAppReclaimFlow$1 = new RideBasedSuperPassValidationProperties$shouldSendIntoAppReclaimFlow$1(this, continuationImpl);
            }
        } else {
            rideBasedSuperPassValidationProperties$shouldSendIntoAppReclaimFlow$1 = new RideBasedSuperPassValidationProperties$shouldSendIntoAppReclaimFlow$1(this, continuationImpl);
        }
        Object objA = rideBasedSuperPassValidationProperties$shouldSendIntoAppReclaimFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideBasedSuperPassValidationProperties$shouldSendIntoAppReclaimFlow$1.label;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.b(objA);
            RideBasedSuperPassRideDetails rideBasedSuperPassRideDetails = this.o;
            if (rideBasedSuperPassRideDetails.f && !rideBasedSuperPassRideDetails.d) {
                rideBasedSuperPassValidationProperties$shouldSendIntoAppReclaimFlow$1.label = 1;
                objA = rideBasedSuperPassRideDetails.a(j, str, rideBasedSuperPassValidationProperties$shouldSendIntoAppReclaimFlow$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objA);
        if (!((Boolean) objA).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
