package app.chalo.onboarding.cityprovider;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.datastore.LocalDataStore;
import app.chalo.utils.SystemHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityprovider/CityChangeOperationTracker;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CityChangeOperationTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f6605a;
    public final SystemHelper b;
    public final Preferences.Key c = PreferencesKeys.stringKey("city_change_progress_info");

    public CityChangeOperationTracker(LocalDataStore localDataStore, SystemHelper systemHelper) {
        this.f6605a = localDataStore;
        this.b = systemHelper;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r13 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
    
        if (r13 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00db, code lost:
    
        return r1;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00a5, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d9 -> B:37:0x00dc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.cityprovider.CityChangeOperationTracker.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
