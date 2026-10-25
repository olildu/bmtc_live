package app.chalo.superpass.data.models.entities;

import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPass;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SuperPass {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassProperties f9560a;
    public final SuperPassValidationProperties b;
    public final SuperPassUIProperties c;
    public final SuperPassRepurchaseProperties d;
    public final SuperPassTransactionDetails e;
    public final SuperPassTripPreferences f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPass$Companion;", "", "", "PASS_SUB_TYPE_MAGIC_PASS", "Ljava/lang/String;", "PASS_SUB_TYPE_RIDE_PASS", "PASS_SUB_TYPE_ROUTE_PASS", "PASS_SUB_TYPE_SUPER_SAVER_PASS", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public SuperPass(SuperPassProperties superPassProperties, SuperPassValidationProperties superPassValidationProperties, SuperPassUIProperties superPassUIProperties, SuperPassRepurchaseProperties superPassRepurchaseProperties, SuperPassTransactionDetails superPassTransactionDetails, SuperPassTripPreferences superPassTripPreferences) {
        Intrinsics.i(superPassProperties, "superPassProperties");
        Intrinsics.i(superPassValidationProperties, "superPassValidationProperties");
        this.f9560a = superPassProperties;
        this.b = superPassValidationProperties;
        this.c = superPassUIProperties;
        this.d = superPassRepurchaseProperties;
        this.e = superPassTransactionDetails;
        this.f = superPassTripPreferences;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r8 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r6, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof app.chalo.superpass.data.models.entities.SuperPass$canActivate$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.superpass.data.models.entities.SuperPass$canActivate$1 r0 = (app.chalo.superpass.data.models.entities.SuperPass$canActivate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.superpass.data.models.entities.SuperPass$canActivate$1 r0 = new app.chalo.superpass.data.models.entities.SuperPass$canActivate$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r8)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            long r6 = r0.J$0
            kotlin.ResultKt.b(r8)
            goto L46
        L38:
            kotlin.ResultKt.b(r8)
            r0.J$0 = r6
            r0.label = r4
            java.lang.Boolean r8 = r5.j(r6)
            if (r8 != r1) goto L46
            goto L56
        L46:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L60
            r0.label = r3
            java.lang.Boolean r8 = r5.k(r6)
            if (r8 != r1) goto L57
        L56:
            return r1
        L57:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            if (r6 != 0) goto L60
            goto L61
        L60:
            r4 = 0
        L61:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.superpass.data.models.entities.SuperPass.a(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, ContinuationImpl continuationImpl) {
        SuperPass$canBookAgain$1 superPass$canBookAgain$1;
        if (continuationImpl instanceof SuperPass$canBookAgain$1) {
            superPass$canBookAgain$1 = (SuperPass$canBookAgain$1) continuationImpl;
            int i = superPass$canBookAgain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPass$canBookAgain$1.label = i - Integer.MIN_VALUE;
            } else {
                superPass$canBookAgain$1 = new SuperPass$canBookAgain$1(this, continuationImpl);
            }
        } else {
            superPass$canBookAgain$1 = new SuperPass$canBookAgain$1(this, continuationImpl);
        }
        Object objC = superPass$canBookAgain$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPass$canBookAgain$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            superPass$canBookAgain$1.label = 1;
            objC = c(j, superPass$canBookAgain$1);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        return Boolean.valueOf((((Boolean) objC).booleanValue() || !this.d.e) && getB().f9582a != SuperPassStatus.FAILED);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, ContinuationImpl continuationImpl) {
        SuperPass$canRenewSuperPass$1 superPass$canRenewSuperPass$1;
        if (continuationImpl instanceof SuperPass$canRenewSuperPass$1) {
            superPass$canRenewSuperPass$1 = (SuperPass$canRenewSuperPass$1) continuationImpl;
            int i = superPass$canRenewSuperPass$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPass$canRenewSuperPass$1.label = i - Integer.MIN_VALUE;
            } else {
                superPass$canRenewSuperPass$1 = new SuperPass$canRenewSuperPass$1(this, continuationImpl);
            }
        } else {
            superPass$canRenewSuperPass$1 = new SuperPass$canRenewSuperPass$1(this, continuationImpl);
        }
        Object objA = superPass$canRenewSuperPass$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPass$canRenewSuperPass$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            SuperPassRepurchaseProperties superPassRepurchaseProperties = this.d;
            if (superPassRepurchaseProperties.f) {
                int i3 = getC().f9578a;
                superPass$canRenewSuperPass$1.label = 1;
                objA = superPassRepurchaseProperties.a(i3, j);
                if (objA == obj) {
                    return obj;
                }
            }
            return Boolean.FALSE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objA);
        if (!((Boolean) objA).booleanValue() && getB().f9582a != SuperPassStatus.FAILED) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    public final Object d(Continuation continuation) {
        SuperPass$getLastActivationTimeStamp$1 superPass$getLastActivationTimeStamp$1;
        Long lT0;
        if (continuation instanceof SuperPass$getLastActivationTimeStamp$1) {
            superPass$getLastActivationTimeStamp$1 = (SuperPass$getLastActivationTimeStamp$1) continuation;
            int i = superPass$getLastActivationTimeStamp$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPass$getLastActivationTimeStamp$1.label = i - Integer.MIN_VALUE;
            } else {
                superPass$getLastActivationTimeStamp$1 = new SuperPass$getLastActivationTimeStamp$1(this, continuation);
            }
        } else {
            superPass$getLastActivationTimeStamp$1 = new SuperPass$getLastActivationTimeStamp$1(this, continuation);
        }
        Object objV = superPass$getLastActivationTimeStamp$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPass$getLastActivationTimeStamp$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1E = ((LocalDataStore) SuperPassActivationTimestampMapHelper.f9561a.getValue()).e(PreferencesKeys.stringKey(this.f9560a.f9566a));
            superPass$getLastActivationTimeStamp$1.label = 1;
            objV = FlowKt.v(localDataStore$getFlowFromLocalDataStore$$inlined$map$1E, superPass$getLastActivationTimeStamp$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        String str = (String) objV;
        return new Long((str == null || (lT0 = StringsKt.t0(str)) == null) ? -1L : lT0.longValue());
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final SuperPassProperties getF9560a() {
        return this.f9560a;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final SuperPassTransactionDetails getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public SuperPassTripPreferences getI() {
        return this.f;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public SuperPassUIProperties getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public SuperPassValidationProperties getB() {
        return this.b;
    }

    public final Boolean j(long j) {
        return Boolean.valueOf(j < getB().b);
    }

    public final Boolean k(long j) {
        return Boolean.valueOf(getB().f9582a == SuperPassStatus.EXPIRED || getB().f9582a == SuperPassStatus.CANCELLED || getB().f9582a == SuperPassStatus.FAILED || j > getB().c);
    }

    public final boolean l() {
        return getB().e.contains(ProductConfigServiceType.PREMIUM);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(long j, ContinuationImpl continuationImpl) {
        SuperPass$isSuperPassActivationValid$1 superPass$isSuperPassActivationValid$1;
        long j2;
        long j3;
        long j4;
        if (continuationImpl instanceof SuperPass$isSuperPassActivationValid$1) {
            superPass$isSuperPassActivationValid$1 = (SuperPass$isSuperPassActivationValid$1) continuationImpl;
            int i = superPass$isSuperPassActivationValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPass$isSuperPassActivationValid$1.label = i - Integer.MIN_VALUE;
            } else {
                superPass$isSuperPassActivationValid$1 = new SuperPass$isSuperPassActivationValid$1(this, continuationImpl);
            }
        } else {
            superPass$isSuperPassActivationValid$1 = new SuperPass$isSuperPassActivationValid$1(this, continuationImpl);
        }
        Object objD = superPass$isSuperPassActivationValid$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPass$isSuperPassActivationValid$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            superPass$isSuperPassActivationValid$1.J$0 = j;
            superPass$isSuperPassActivationValid$1.label = 1;
            objD = d(superPass$isSuperPassActivationValid$1);
            if (objD != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            j = superPass$isSuperPassActivationValid$1.J$0;
            ResultKt.b(objD);
        } else {
            if (i2 == 2) {
                j3 = superPass$isSuperPassActivationValid$1.J$1;
                j2 = superPass$isSuperPassActivationValid$1.J$0;
                ResultKt.b(objD);
                if (j3 > ((Number) objD).longValue()) {
                    return Boolean.FALSE;
                }
                superPass$isSuperPassActivationValid$1.J$0 = j2;
                superPass$isSuperPassActivationValid$1.label = 3;
                objD = d(superPass$isSuperPassActivationValid$1);
                if (objD != obj) {
                    j4 = j2;
                }
                return obj;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j4 = superPass$isSuperPassActivationValid$1.J$0;
            ResultKt.b(objD);
        }
        return Boolean.valueOf(j4 - ((Number) objD).longValue() < getB().d);
        if (((Number) objD).longValue() == -1) {
            return Boolean.FALSE;
        }
        long j5 = getB().getG().b;
        superPass$isSuperPassActivationValid$1.J$0 = j;
        superPass$isSuperPassActivationValid$1.J$1 = j5;
        superPass$isSuperPassActivationValid$1.label = 2;
        objD = d(superPass$isSuperPassActivationValid$1);
        if (objD != obj) {
            j2 = j;
            j3 = j5;
            if (j3 > ((Number) objD).longValue()) {
                return Boolean.FALSE;
            }
            superPass$isSuperPassActivationValid$1.J$0 = j2;
            superPass$isSuperPassActivationValid$1.label = 3;
            objD = d(superPass$isSuperPassActivationValid$1);
            if (objD != obj) {
                j4 = j2;
                return Boolean.valueOf(j4 - ((Number) objD).longValue() < getB().d);
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    public final Object n(long j, ContinuationImpl continuationImpl) {
        SuperPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1 superPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1;
        if (continuationImpl instanceof SuperPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1) {
            superPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1 = (SuperPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1) continuationImpl;
            int i = superPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1.label = i - Integer.MIN_VALUE;
            } else {
                superPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1 = new SuperPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1(this, continuationImpl);
            }
        } else {
            superPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1 = new SuperPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1(this, continuationImpl);
        }
        Object objD = superPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objD);
            superPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1.J$0 = j;
            superPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1.label = 1;
            objD = d(superPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1);
            if (objD != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
            return unit;
        }
        j = superPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1.J$0;
        ResultKt.b(objD);
        if (((Number) objD).longValue() / ((long) 1000) == j) {
            LocalDataStore localDataStore = (LocalDataStore) SuperPassActivationTimestampMapHelper.f9561a.getValue();
            List listR = CollectionsKt.R(PreferencesKeys.stringKey(this.f9560a.f9566a));
            superPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1.label = 2;
            if (localDataStore.c(listR, superPass$removeActivationBecauseTITOTapInDetectedOnConductorValidationIfNeeded$1) == obj) {
                return obj;
            }
        }
        return unit;
    }
}
