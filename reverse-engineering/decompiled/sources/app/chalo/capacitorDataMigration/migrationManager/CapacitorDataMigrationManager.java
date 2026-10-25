package app.chalo.capacitorDataMigration.migrationManager;

import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.capacitorDataMigration.models.MigrationResult;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/capacitorDataMigration/migrationManager/CapacitorDataMigrationManager;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CapacitorDataMigrationManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1189a = 0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lapp/chalo/capacitorDataMigration/migrationManager/CapacitorDataMigrationManager$Companion;", "", "", "TAG", "Ljava/lang/String;", "", "MIGRATION_ATTEMPT_THRESHOLD", "I", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "iosMigrationCompletedKey", "Landroidx/datastore/preferences/core/Preferences$Key;", "migrationAttemptCount", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        PreferencesKeys.booleanKey("ios_migration_completed");
        PreferencesKeys.intKey("ios_migration_attempt_count");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Boolean a(CapacitorDataMigrationManager capacitorDataMigrationManager, ContinuationImpl continuationImpl) {
        CapacitorDataMigrationManager$hasReachedAttemptCountThreshold$1 capacitorDataMigrationManager$hasReachedAttemptCountThreshold$1;
        capacitorDataMigrationManager.getClass();
        if (continuationImpl instanceof CapacitorDataMigrationManager$hasReachedAttemptCountThreshold$1) {
            capacitorDataMigrationManager$hasReachedAttemptCountThreshold$1 = (CapacitorDataMigrationManager$hasReachedAttemptCountThreshold$1) continuationImpl;
            int i = capacitorDataMigrationManager$hasReachedAttemptCountThreshold$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                capacitorDataMigrationManager$hasReachedAttemptCountThreshold$1.label = i - Integer.MIN_VALUE;
            } else {
                capacitorDataMigrationManager$hasReachedAttemptCountThreshold$1 = new CapacitorDataMigrationManager$hasReachedAttemptCountThreshold$1(capacitorDataMigrationManager, continuationImpl);
            }
        } else {
            capacitorDataMigrationManager$hasReachedAttemptCountThreshold$1 = new CapacitorDataMigrationManager$hasReachedAttemptCountThreshold$1(capacitorDataMigrationManager, continuationImpl);
        }
        Object obj = capacitorDataMigrationManager$hasReachedAttemptCountThreshold$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = capacitorDataMigrationManager$hasReachedAttemptCountThreshold$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Integer num = (Integer) obj;
        return Boolean.valueOf((num != null ? num.intValue() : 0) >= 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final void b(CapacitorDataMigrationManager capacitorDataMigrationManager, ContinuationImpl continuationImpl) {
        CapacitorDataMigrationManager$incrementMigrationAttemptCount$1 capacitorDataMigrationManager$incrementMigrationAttemptCount$1;
        capacitorDataMigrationManager.getClass();
        if (continuationImpl instanceof CapacitorDataMigrationManager$incrementMigrationAttemptCount$1) {
            capacitorDataMigrationManager$incrementMigrationAttemptCount$1 = (CapacitorDataMigrationManager$incrementMigrationAttemptCount$1) continuationImpl;
            int i = capacitorDataMigrationManager$incrementMigrationAttemptCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                capacitorDataMigrationManager$incrementMigrationAttemptCount$1.label = i - Integer.MIN_VALUE;
            } else {
                capacitorDataMigrationManager$incrementMigrationAttemptCount$1 = new CapacitorDataMigrationManager$incrementMigrationAttemptCount$1(capacitorDataMigrationManager, continuationImpl);
            }
        } else {
            capacitorDataMigrationManager$incrementMigrationAttemptCount$1 = new CapacitorDataMigrationManager$incrementMigrationAttemptCount$1(capacitorDataMigrationManager, continuationImpl);
        }
        Object obj = capacitorDataMigrationManager$incrementMigrationAttemptCount$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = capacitorDataMigrationManager$incrementMigrationAttemptCount$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        } else {
            ResultKt.b(obj);
            Integer num = (Integer) obj;
            new Integer((num != null ? num.intValue() : 0) + 1);
            capacitorDataMigrationManager$incrementMigrationAttemptCount$1.label = 2;
            throw null;
        }
    }

    public static final void c(CapacitorDataMigrationManager capacitorDataMigrationManager, Map map) {
        capacitorDataMigrationManager.getClass();
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            MigrationResult migrationResult = (MigrationResult) entry.getValue();
            String message = str + ":";
            Intrinsics.i(message, "message");
            migrationResult.getClass();
            CollectionsKt.O(null, ", ", null, null, null, 62);
            throw null;
        }
    }

    public static final void d(CapacitorDataMigrationManager capacitorDataMigrationManager, String str) {
        capacitorDataMigrationManager.getClass();
        AnalyticsContract.DefaultImpls.a(null, "ios capacitor migration required", "CapacitorDataMigrationManager", MapsKt.h(new Pair("reason", str)), null, false, 24);
        throw null;
    }
}
