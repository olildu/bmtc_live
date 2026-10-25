package app.chalo.home.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.repository.SuperPassRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/GetPremiumPassExpiryEligibilityForPurchaseUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetPremiumPassExpiryEligibilityForPurchaseUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassRepository f3043a;
    public final BasicInfoContract b;

    public GetPremiumPassExpiryEligibilityForPurchaseUseCase(SuperPassRepository superPassRepository, BasicInfoContract basicInfoContract) {
        this.f3043a = superPassRepository;
        this.b = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Code duplicated, block: B:49:0x012b A[LOOP:3: B:47:0x0125->B:49:0x012b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0155 A[PHI: r6 r8 r13 r14
      0x0155: PHI (r6v9 long) = (r6v6 long), (r6v10 long) binds: [B:51:0x0152, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r8v9 long) = (r8v6 long), (r8v10 long) binds: [B:51:0x0152, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r13v13 java.util.List) = (r13v32 java.util.List), (r13v33 java.util.List) binds: [B:51:0x0152, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r14v26 java.lang.Object) = (r14v19 java.lang.Object), (r14v1 java.lang.Object) binds: [B:51:0x0152, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0181  */
    /* JADX WARN: Code duplicated, block: B:68:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c1 A[LOOP:0: B:69:0x01bb->B:71:0x01c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x020a  */
    /* JADX WARN: Code duplicated, block: B:90:0x022b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0235  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[LOOP:1: B:76:0x01e7->B:99:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        if (r14 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0104, code lost:
    
        if (r14 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0164, code lost:
    
        if (r14 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019b, code lost:
    
        if (r14 == r1) goto L64;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0104 -> B:43:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x019b -> B:65:0x019e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.models.SuperPassProductConfigurationProperties r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.GetPremiumPassExpiryEligibilityForPurchaseUseCase.a(app.chalo.models.SuperPassProductConfigurationProperties, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(SuperPass superPass, long j, ContinuationImpl continuationImpl) {
        GetPremiumPassExpiryEligibilityForPurchaseUseCase$isPassEligible$1 getPremiumPassExpiryEligibilityForPurchaseUseCase$isPassEligible$1;
        int iO;
        if (continuationImpl instanceof GetPremiumPassExpiryEligibilityForPurchaseUseCase$isPassEligible$1) {
            getPremiumPassExpiryEligibilityForPurchaseUseCase$isPassEligible$1 = (GetPremiumPassExpiryEligibilityForPurchaseUseCase$isPassEligible$1) continuationImpl;
            int i = getPremiumPassExpiryEligibilityForPurchaseUseCase$isPassEligible$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPremiumPassExpiryEligibilityForPurchaseUseCase$isPassEligible$1.label = i - Integer.MIN_VALUE;
            } else {
                getPremiumPassExpiryEligibilityForPurchaseUseCase$isPassEligible$1 = new GetPremiumPassExpiryEligibilityForPurchaseUseCase$isPassEligible$1(this, continuationImpl);
            }
        } else {
            getPremiumPassExpiryEligibilityForPurchaseUseCase$isPassEligible$1 = new GetPremiumPassExpiryEligibilityForPurchaseUseCase$isPassEligible$1(this, continuationImpl);
        }
        Object objK = getPremiumPassExpiryEligibilityForPurchaseUseCase$isPassEligible$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getPremiumPassExpiryEligibilityForPurchaseUseCase$isPassEligible$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objK);
            if (!superPass.l()) {
                return Boolean.FALSE;
            }
            getPremiumPassExpiryEligibilityForPurchaseUseCase$isPassEligible$1.L$0 = superPass;
            getPremiumPassExpiryEligibilityForPurchaseUseCase$isPassEligible$1.label = 1;
            objK = superPass.k(j);
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            superPass = (SuperPass) getPremiumPassExpiryEligibilityForPurchaseUseCase$isPassEligible$1.L$0;
            ResultKt.b(objK);
        }
        if (((Boolean) objK).booleanValue()) {
            return Boolean.FALSE;
        }
        if ((superPass instanceof RideBasedSuperPass) && (iO = ((RideBasedSuperPass) superPass).o()) <= 0 && iO != -1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
