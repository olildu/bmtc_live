package app.chalo.home.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.data.PassPurchaseConfigsApplicableForRollover;
import app.chalo.data.PassRollOverRidesConfig;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.models.entities.SuperPassRepurchaseProperties;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/FetchChaloBusPassEligibleForRideRollOverUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchChaloBusPassEligibleForRideRollOverUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetMiscellaneousCityWiseFlagsConfigUseCase f2992a;
    public final SuperPassRepository b;
    public final BasicInfoContract c;

    public FetchChaloBusPassEligibleForRideRollOverUseCase(GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase, SuperPassRepository superPassRepository, BasicInfoContract basicInfoContract) {
        this.f2992a = getMiscellaneousCityWiseFlagsConfigUseCase;
        this.b = superPassRepository;
        this.c = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9 A[PHI: r9
      0x00b9: PHI (r9v3 app.chalo.superpass.data.models.entities.SuperPass) = 
      (r9v0 app.chalo.superpass.data.models.entities.SuperPass)
      (r9v0 app.chalo.superpass.data.models.entities.SuperPass)
      (r9v0 app.chalo.superpass.data.models.entities.SuperPass)
      (r9v8 app.chalo.superpass.data.models.entities.SuperPass)
     binds: [B:17:0x004d, B:52:0x00b9, B:21:0x005e, B:39:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(SuperPass superPass, PassRollOverRidesConfig passRollOverRidesConfig, ContinuationImpl continuationImpl) {
        FetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1 fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1;
        SuperPass superPass2;
        boolean z;
        if (continuationImpl instanceof FetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1) {
            fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1 = (FetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1) continuationImpl;
            int i = fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1 = new FetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1(this, continuationImpl);
            }
        } else {
            fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1 = new FetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1(this, continuationImpl);
        }
        Object objC = fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1.label;
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 == 1) {
                superPass = (SuperPass) fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1.L$1;
                superPass2 = (SuperPass) fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1.L$0;
                ResultKt.b(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                superPass = (SuperPass) fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1.L$0;
                ResultKt.b(objC);
            }
            if (((Boolean) objC).booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            if ((superPass instanceof RideBasedSuperPass) ? z : !(!z || ((RideBasedSuperPass) superPass).o() <= 0)) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
        ResultKt.b(objC);
        boolean zL = superPass.l();
        SuperPassRepurchaseProperties superPassRepurchaseProperties = superPass.d;
        if (zL) {
            List list = passRollOverRidesConfig.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        PassPurchaseConfigsApplicableForRollover passPurchaseConfigsApplicableForRollover = (PassPurchaseConfigsApplicableForRollover) it.next();
                        if (Intrinsics.d(superPassRepurchaseProperties.f9569a, passPurchaseConfigsApplicableForRollover.f2365a) && passPurchaseConfigsApplicableForRollover.b.contains(new Integer(superPassRepurchaseProperties.c))) {
                            fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1.L$0 = superPass;
                            fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1.L$1 = superPass;
                            fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1.label = 1;
                            objC = this.c.c(fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1);
                            if (objC != coroutineSingletons) {
                                superPass2 = superPass;
                            }
                            return coroutineSingletons;
                        }
                    }
                }
            }
        }
        z = false;
        if (superPass instanceof RideBasedSuperPass) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
        long jLongValue = ((Number) objC).longValue();
        fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1.L$0 = superPass2;
        fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1.L$1 = null;
        fetchChaloBusPassEligibleForRideRollOverUseCase$isPassEligible$1.label = 2;
        objC = superPass.j(jLongValue);
        if (objC != coroutineSingletons) {
            superPass = superPass2;
            if (((Boolean) objC).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (superPass instanceof RideBasedSuperPass) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
        return coroutineSingletons;
    }
}
