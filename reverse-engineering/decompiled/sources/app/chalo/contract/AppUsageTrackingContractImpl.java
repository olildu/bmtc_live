package app.chalo.contract;

import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.datastore.LocalDataStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/contract/AppUsageTrackingContractImpl;", "Lapp/chalo/contract/AppUsageTrackingContract;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppUsageTrackingContractImpl implements AppUsageTrackingContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f1941a;
    public final BasicInfoContract b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lapp/chalo/contract/AppUsageTrackingContractImpl$Companion;", "", "", "KEY_LAST_APP_OPEN_TIME", "Ljava/lang/String;", "", "TIME_ELAPSED_TO_CONSIDER_USER_CHURNED", "I", "APP_USAGE_TRACKING_DATA_STORE", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public AppUsageTrackingContractImpl(LocalDataStore localDataStore, BasicInfoContract basicInfoContract) {
        this.f1941a = localDataStore;
        this.b = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r4.g(r2, r8, r0) == r1) goto L22;
     */
    @Override // app.chalo.contract.AppUsageTrackingContract
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof app.chalo.contract.AppUsageTrackingContractImpl$markAppOpened$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.contract.AppUsageTrackingContractImpl$markAppOpened$1 r0 = (app.chalo.contract.AppUsageTrackingContractImpl$markAppOpened$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.contract.AppUsageTrackingContractImpl$markAppOpened$1 r0 = new app.chalo.contract.AppUsageTrackingContractImpl$markAppOpened$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            java.lang.Object r2 = r0.L$1
            androidx.datastore.preferences.core.Preferences$Key r2 = (androidx.datastore.preferences.core.Preferences.Key) r2
            java.lang.Object r4 = r0.L$0
            app.chalo.datastore.LocalDataStore r4 = (app.chalo.datastore.LocalDataStore) r4
            kotlin.ResultKt.b(r8)
            goto L5b
        L3e:
            kotlin.ResultKt.b(r8)
            java.lang.String r8 = "keyLastAppOpenedAtTime"
            androidx.datastore.preferences.core.Preferences$Key r2 = androidx.datastore.preferences.core.PreferencesKeys.longKey(r8)
            app.chalo.datastore.LocalDataStore r8 = r7.f1941a
            r0.L$0 = r8
            r0.L$1 = r2
            r0.label = r4
            app.chalo.contract.BasicInfoContract r4 = r7.b
            java.lang.Object r4 = r4.c(r0)
            if (r4 != r1) goto L58
            goto L68
        L58:
            r6 = r4
            r4 = r8
            r8 = r6
        L5b:
            r5 = 0
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = r4.g(r2, r8, r0)
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.contract.AppUsageTrackingContractImpl.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.contract.AppUsageTrackingContract
    public final Object b(ContinuationImpl continuationImpl) {
        AppUsageTrackingContractImpl$shouldRunBackgroundJobsBasedOnUserActivity$1 appUsageTrackingContractImpl$shouldRunBackgroundJobsBasedOnUserActivity$1;
        if (continuationImpl instanceof AppUsageTrackingContractImpl$shouldRunBackgroundJobsBasedOnUserActivity$1) {
            appUsageTrackingContractImpl$shouldRunBackgroundJobsBasedOnUserActivity$1 = (AppUsageTrackingContractImpl$shouldRunBackgroundJobsBasedOnUserActivity$1) continuationImpl;
            int i = appUsageTrackingContractImpl$shouldRunBackgroundJobsBasedOnUserActivity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                appUsageTrackingContractImpl$shouldRunBackgroundJobsBasedOnUserActivity$1.label = i - Integer.MIN_VALUE;
            } else {
                appUsageTrackingContractImpl$shouldRunBackgroundJobsBasedOnUserActivity$1 = new AppUsageTrackingContractImpl$shouldRunBackgroundJobsBasedOnUserActivity$1(this, continuationImpl);
            }
        } else {
            appUsageTrackingContractImpl$shouldRunBackgroundJobsBasedOnUserActivity$1 = new AppUsageTrackingContractImpl$shouldRunBackgroundJobsBasedOnUserActivity$1(this, continuationImpl);
        }
        Object objC = appUsageTrackingContractImpl$shouldRunBackgroundJobsBasedOnUserActivity$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = appUsageTrackingContractImpl$shouldRunBackgroundJobsBasedOnUserActivity$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            appUsageTrackingContractImpl$shouldRunBackgroundJobsBasedOnUserActivity$1.label = 1;
            objC = c(appUsageTrackingContractImpl$shouldRunBackgroundJobsBasedOnUserActivity$1);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        return Boolean.valueOf(!((Boolean) objC).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ContinuationImpl continuationImpl) {
        AppUsageTrackingContractImpl$isChurnedUser$1 appUsageTrackingContractImpl$isChurnedUser$1;
        long j;
        if (continuationImpl instanceof AppUsageTrackingContractImpl$isChurnedUser$1) {
            appUsageTrackingContractImpl$isChurnedUser$1 = (AppUsageTrackingContractImpl$isChurnedUser$1) continuationImpl;
            int i = appUsageTrackingContractImpl$isChurnedUser$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                appUsageTrackingContractImpl$isChurnedUser$1.label = i - Integer.MIN_VALUE;
            } else {
                appUsageTrackingContractImpl$isChurnedUser$1 = new AppUsageTrackingContractImpl$isChurnedUser$1(this, continuationImpl);
            }
        } else {
            appUsageTrackingContractImpl$isChurnedUser$1 = new AppUsageTrackingContractImpl$isChurnedUser$1(this, continuationImpl);
        }
        Object objV = appUsageTrackingContractImpl$isChurnedUser$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = appUsageTrackingContractImpl$isChurnedUser$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            appUsageTrackingContractImpl$isChurnedUser$1.label = 1;
            objV = FlowKt.v(this.f1941a.e(PreferencesKeys.longKey("keyLastAppOpenedAtTime")), appUsageTrackingContractImpl$isChurnedUser$1);
            if (objV != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objV);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = appUsageTrackingContractImpl$isChurnedUser$1.J$0;
            ResultKt.b(objV);
        }
        return Boolean.valueOf(((Number) objV).longValue() - j > 604800000);
        Long l = (Long) objV;
        if (l == null) {
            return Boolean.FALSE;
        }
        long jLongValue = l.longValue();
        appUsageTrackingContractImpl$isChurnedUser$1.J$0 = jLongValue;
        appUsageTrackingContractImpl$isChurnedUser$1.label = 2;
        objV = this.b.c(appUsageTrackingContractImpl$isChurnedUser$1);
        if (objV != coroutineSingletons) {
            j = jLongValue;
            return Boolean.valueOf(((Number) objV).longValue() - j > 604800000);
        }
        return coroutineSingletons;
    }
}
