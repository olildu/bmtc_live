package app.chalo.home.ui.regularbus;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusUnifiedAdUiStateTracker;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RegularBusUnifiedAdUiStateTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3637a;
    public String b;
    public RegularBusUnifiedAdUiState c;

    public RegularBusUnifiedAdUiStateTracker(SnapshotStateMap shouldShowUnifiedAdDividerMap) {
        Intrinsics.i(shouldShowUnifiedAdDividerMap, "shouldShowUnifiedAdDividerMap");
        this.f3637a = shouldShowUnifiedAdDividerMap;
        this.c = new RegularBusUnifiedAdUiState(0, 0, false, false);
    }
}
