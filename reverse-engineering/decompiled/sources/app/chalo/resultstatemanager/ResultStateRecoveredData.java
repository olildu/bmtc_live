package app.chalo.resultstatemanager;

import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/resultstatemanager/ResultStateRecoveredData;", "Lapp/chalo/resultstatemanager/ResultStateKeeperMeta;", "META", "T", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResultStateRecoveredData<META extends ResultStateKeeperMeta, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResultStateKeeperMeta f9052a;
    public final Flow b;

    public ResultStateRecoveredData(ResultStateKeeperMeta resultStateKeeperMeta, Flow flow) {
        this.f9052a = resultStateKeeperMeta;
        this.b = flow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultStateRecoveredData)) {
            return false;
        }
        ResultStateRecoveredData resultStateRecoveredData = (ResultStateRecoveredData) obj;
        return Intrinsics.d(this.f9052a, resultStateRecoveredData.f9052a) && Intrinsics.d(this.b, resultStateRecoveredData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9052a.hashCode() * 31);
    }

    public final String toString() {
        return "ResultStateRecoveredData(meta=" + this.f9052a + ", resultStateDataFlow=" + ("ResultStateDataFlow(flow=" + this.b + ")") + ")";
    }
}
