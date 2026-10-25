package app.chalo.appmigrationpreconditions;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AppMigrationPreconditionsDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f954a;
    public final boolean b;

    public AppMigrationPreconditionsDataState(boolean z, boolean z2) {
        this.f954a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppMigrationPreconditionsDataState)) {
            return false;
        }
        AppMigrationPreconditionsDataState appMigrationPreconditionsDataState = (AppMigrationPreconditionsDataState) obj;
        return this.f954a == appMigrationPreconditionsDataState.f954a && this.b == appMigrationPreconditionsDataState.b;
    }

    public final int hashCode() {
        return ((this.f954a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "AppMigrationPreconditionsDataState(isLoading=" + this.f954a + ", showError=" + this.b + ")";
    }
}
