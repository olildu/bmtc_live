package app.chalo.superpass.data.models.entities;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/entities/RideBasedSuperPass;", "Lapp/chalo/superpass/data/models/entities/SuperPass;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideBasedSuperPass extends SuperPass {
    public final RideBasedSuperPassValidationProperties g;
    public final RideBasedSuperPassUIProperties h;
    public final SuperPassTripPreferences i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideBasedSuperPass(SuperPassProperties superPassProperties, RideBasedSuperPassValidationProperties superPassValidationProperties, RideBasedSuperPassUIProperties rideBasedSuperPassUIProperties, SuperPassRepurchaseProperties superPassRepurchaseProperties, SuperPassTransactionDetails superPassTransactionDetails, SuperPassTripPreferences superPassTripPreferences) {
        super(superPassProperties, superPassValidationProperties, rideBasedSuperPassUIProperties, superPassRepurchaseProperties, superPassTransactionDetails, superPassTripPreferences);
        Intrinsics.i(superPassProperties, "superPassProperties");
        Intrinsics.i(superPassValidationProperties, "superPassValidationProperties");
        this.g = superPassValidationProperties;
        this.h = rideBasedSuperPassUIProperties;
        this.i = superPassTripPreferences;
    }

    @Override // app.chalo.superpass.data.models.entities.SuperPass
    /* JADX INFO: renamed from: g, reason: from getter */
    public final SuperPassTripPreferences getF() {
        return this.i;
    }

    @Override // app.chalo.superpass.data.models.entities.SuperPass
    /* JADX INFO: renamed from: h */
    public final SuperPassUIProperties getC() {
        return this.h;
    }

    @Override // app.chalo.superpass.data.models.entities.SuperPass
    /* JADX INFO: renamed from: i */
    public final SuperPassValidationProperties getB() {
        return this.g;
    }

    public final int o() {
        RideBasedSuperPassValidationProperties rideBasedSuperPassValidationProperties = this.g;
        int i = rideBasedSuperPassValidationProperties.m;
        int i2 = rideBasedSuperPassValidationProperties.n;
        if (i2 == -1) {
            i2 = 0;
        }
        if (i == -1) {
            return i;
        }
        int size = (i - rideBasedSuperPassValidationProperties.o.c.size()) - i2;
        if (size > 0) {
            return size;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006a -> B:24:0x006d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object p(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof app.chalo.superpass.data.models.entities.RideBasedSuperPass$getRemainingTripsForToday$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.superpass.data.models.entities.RideBasedSuperPass$getRemainingTripsForToday$1 r0 = (app.chalo.superpass.data.models.entities.RideBasedSuperPass$getRemainingTripsForToday$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.superpass.data.models.entities.RideBasedSuperPass$getRemainingTripsForToday$1 r0 = new app.chalo.superpass.data.models.entities.RideBasedSuperPass$getRemainingTripsForToday$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$0
            java.util.Iterator r4 = (java.util.Iterator) r4
            kotlin.ResultKt.b(r8)
            goto L6d
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.ResultKt.b(r8)
            app.chalo.superpass.data.models.entities.RideBasedSuperPassValidationProperties r8 = r7.g
            int r2 = r8.l
            r4 = -1
            if (r2 != r4) goto L45
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r2)
            return r8
        L45:
            app.chalo.superpass.data.models.entities.RideBasedSuperPassRideDetails r8 = r8.o
            java.util.List r8 = r8.c
            java.util.Iterator r8 = r8.iterator()
            r4 = r8
        L4e:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L79
            java.lang.Object r8 = r4.next()
            java.lang.Number r8 = (java.lang.Number) r8
            long r5 = r8.longValue()
            app.chalo.utils.UtilsKT r8 = app.chalo.utils.UtilsKT.f10442a
            r0.L$0 = r4
            r0.I$0 = r2
            r0.label = r3
            java.lang.Object r8 = r8.b(r5, r0)
            if (r8 != r1) goto L6d
            return r1
        L6d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L4e
            int r2 = r2 + (-1)
            if (r2 != 0) goto L4e
        L79:
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.superpass.data.models.entities.RideBasedSuperPass.p(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final RideBasedSuperPassUIProperties getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final RideBasedSuperPassValidationProperties getG() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(ContinuationImpl continuationImpl) {
        RideBasedSuperPass$isRideAvailableToday$1 rideBasedSuperPass$isRideAvailableToday$1;
        if (continuationImpl instanceof RideBasedSuperPass$isRideAvailableToday$1) {
            rideBasedSuperPass$isRideAvailableToday$1 = (RideBasedSuperPass$isRideAvailableToday$1) continuationImpl;
            int i = rideBasedSuperPass$isRideAvailableToday$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideBasedSuperPass$isRideAvailableToday$1.label = i - Integer.MIN_VALUE;
            } else {
                rideBasedSuperPass$isRideAvailableToday$1 = new RideBasedSuperPass$isRideAvailableToday$1(this, continuationImpl);
            }
        } else {
            rideBasedSuperPass$isRideAvailableToday$1 = new RideBasedSuperPass$isRideAvailableToday$1(this, continuationImpl);
        }
        Object objP = rideBasedSuperPass$isRideAvailableToday$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideBasedSuperPass$isRideAvailableToday$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objP);
            rideBasedSuperPass$isRideAvailableToday$1.label = 1;
            objP = p(rideBasedSuperPass$isRideAvailableToday$1);
            if (objP == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objP);
        }
        int iIntValue = ((Number) objP).intValue();
        int iO = o();
        if ((iO <= 0 && iO != -1) || (iIntValue <= 0 && iIntValue != -1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
