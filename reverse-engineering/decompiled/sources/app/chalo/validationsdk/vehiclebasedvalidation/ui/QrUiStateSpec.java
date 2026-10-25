package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QrUiStateSpec;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QrUiStateSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10734a;

    public QrUiStateSpec() {
        float f = ChaloThemeHelper.a().i;
        this.f10734a = new ChaloPadding(f, f, f, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QrUiStateSpec) && Intrinsics.d(this.f10734a, ((QrUiStateSpec) obj).f10734a);
    }

    public final int hashCode() {
        return this.f10734a.hashCode();
    }

    public final String toString() {
        return "QrUiStateSpec(contentPadding=" + this.f10734a + ")";
    }
}
